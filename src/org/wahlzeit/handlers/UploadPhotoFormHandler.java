/*
 * Copyright (c) 2006-2009 by Dirk Riehle, http://dirkriehle.com
 *
 * This file is part of the Wahlzeit photo rating application.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.wahlzeit.handlers;

import java.util.*;
import java.io.*;

import org.wahlzeit.location.GPSLocation;
import org.wahlzeit.location.HakaPhoto;
import org.wahlzeit.location.HakaStadium;
import org.wahlzeit.location.HakaTeamMembers;
import org.wahlzeit.location.HakaVersion;
import org.wahlzeit.location.Location;
import org.wahlzeit.location.MapCodeLocation;
import org.wahlzeit.model.*;
import org.wahlzeit.services.*;
import org.wahlzeit.utils.*;
import org.wahlzeit.webparts.*;

/**
 * 
 * @author dirkriehle
 *
 */
public class UploadPhotoFormHandler extends AbstractWebFormHandler {

	/**
	 *
	 */
	public UploadPhotoFormHandler() {
		initialize(PartUtil.UPLOAD_PHOTO_FORM_FILE, AccessRights.USER);
	}

	/**
	 * 
	 */
	protected void doMakeWebPart(UserSession us, WebPart part) {
		Map<String, Object> args = us.getSavedArgs();
		part.addStringFromArgs(args, UserSession.MESSAGE);

		part.maskAndAddStringFromArgs(args, Photo.TAGS);

		part.maskAndAddStringFromArgs(args, Photo.LOCATION);

		String hakaVersion = "";
		String teamMembers = "";
		String hakaStadium = "";

		try{
				
		for (String version : HakaVersion.toArray()) {
			hakaVersion += "<option " +"value=\"" + version + "\"" +" selected" +">" +version +"</option>";
		}
		
		for (String teammember : HakaTeamMembers.toArray()) {
			teamMembers += "<option " +"value=\"" + teammember + "\"" +" selected" +">" +teammember +"</option>";
		}
		
		for (String stadium : HakaStadium.toArray()) {
			hakaStadium += "<option " +"value=\"" + stadium + "\"" +" selected" +">" +stadium +"</option>";
		}
		

		part.addString("version", hakaVersion);
		part.addString("leader", teamMembers);
		part.addString("captain", teamMembers);
		part.addString("stadium", hakaStadium);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("");
		} catch (IllegalStateException e) {
			throw new IllegalStateException("");
		} catch (AssertionError e) {
			throw new AssertionError("");
		}
	}

	/**
	 * 
	 */
	protected String doHandlePost(UserSession us, Map args) {
		String tags = us.getAndSaveAsString(args, Photo.TAGS);

		String locationCode = us.getAndSaveAsString(args, "locationID");
		String hakaVersion = us.getAndSaveAsString(args, "versionID");
		String leader = us.getAndSaveAsString(args, "leaderID");
		String captain = us.getAndSaveAsString(args, "captainID");
		String stadium = us.getAndSaveAsString(args, "stadiumID");

		if (!StringUtil.isLegalTagsString(tags)) {
			us.setMessage(us.cfg().getInputIsInvalid());
			return PartUtil.UPLOAD_PHOTO_PAGE_NAME;
		}

		try {
			PhotoManager pm = PhotoManager.getInstance();
			String sourceFileName = us.getAsString(args, "fileName");
			File file = new File(sourceFileName);
			HakaPhoto photo = (HakaPhoto) pm.createPhoto(file);

			String targetFileName = SysConfig.getBackupDir().asString()
					+ photo.getId().asString();
			createBackup(sourceFileName, targetFileName);

			User user = (User) us.getClient();
			user.addPhoto(photo);

			photo.setTags(new Tags(tags));

			photo.setLocationCode(locationCode);
			photo.setHakaVersion(hakaVersion);
			photo.setLeader(leader);
			photo.setCaptain(captain);
			photo.setStadium(stadium);

			doHandleHakaPhoto(photo, us, args);
			pm.savePhoto(photo);

			StringBuffer sb = UserLog.createActionEntry("UploadPhoto");
			UserLog.addCreatedObject(sb, "Photo", photo.getId().asString());
			UserLog.log(sb);

			us.setTwoLineMessage(us.cfg().getPhotoUploadSucceeded(), us.cfg()
					.getKeepGoing());
		} catch (Exception ex) {
			SysLog.logThrowable(ex);
			us.setMessage(us.cfg().getPhotoUploadFailed());
		}

		return PartUtil.UPLOAD_PHOTO_PAGE_NAME;
	}

	/**
	 * 
	 */
	protected void createBackup(String sourceName, String targetName) {
		try {
			File sourceFile = new File(sourceName);
			InputStream inputStream = new FileInputStream(sourceFile);
			File targetFile = new File(targetName);
			OutputStream outputStream = new FileOutputStream(targetFile);
			// @FIXME IO.copy(inputStream, outputStream);
		} catch (Exception ex) {
			SysLog.logSysInfo("could not create backup file of photo");
			SysLog.logThrowable(ex);
		}
	}

	private void doHandleHakaPhoto(Photo photo, UserSession us, Map args) {

	}
}
