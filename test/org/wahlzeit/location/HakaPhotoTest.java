package org.wahlzeit.location;

import org.vulpe.myadap.HakaPhoto;
import org.wahlzeit.model.PhotoFactory;

import junit.framework.TestCase;

public class HakaPhotoTest extends TestCase{

	public HakaPhotoTest(String name)  {
	super(name);
	}
	
	public static void main(final String[] args) {
		junit.textui.TestRunner.run(HakaPhotoTest.class);
	}
	
	public void testHakaPhoto() {
		HakaPhoto HakaPhoto = (HakaPhoto) PhotoFactory.getInstance()
				.createPhoto();

		TestCase.assertTrue(HakaPhoto.getLocation() != null);

		TestCase.assertTrue(HakaPhoto.captain != null);
		TestCase.assertTrue(HakaPhoto.leader != null);
		TestCase.assertTrue(HakaPhoto.nickname != null);
		TestCase.assertTrue(HakaPhoto.stadium != null);
		TestCase.assertTrue(HakaPhoto.opponent != null);
	}
}
