package org.wahlzeit.location;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

/**
 * @author Vladimir Vulpe
 *
 */
public class HakaPhoto extends Photo {

	/**
	 * HakaVersion version, HakaTeamMembers members, HakaStadium stadium, String
	 * opponent, HakaTeamMembers captain, HakaTeamMembers leader
	 */
	HakaCategory hc = new HakaCharacteristics(HakaVersion.Ka_Mate,
			HakaTeamMembers.Member1, HakaStadium.Stadium1, "Springbok",
			HakaTeamMembers.Member21, HakaTeamMembers.Member11, getLocation());
	
<<<<<<< HEAD
	/**
	 *TO DO 
	 *TO DO 
	 *TO DO
	 * 
	 */
	Player player  =  Player.getInstance(04, "Jimmy", "Cowan", false, false);
	

	public static final String VERSION = "version"; // "Ka Mate", "Kapa o Pango"
	public static final String NICKNAME = "nickname"; // All Blacks
	public static final String STADIUM = "stadium"; // Eden Park, Westpack
													// Stadium, Jade Stadium
	public static final String LEADER = "leader"; // Liam Messam, Richie McCaw
	public static final String CAPTAIN = "captain"; // Richie McCaw
	public static final String TEAMMEMBERS = "teammembers";
	public static final String OPPONENT = "opponent";
	public static final String WORDS = "words"; // Kapa o Pango kia whakawhenua

	protected String version = hc.getVersionAndContent()[0];
	protected String nickname = hc.getTeamNickname();
	protected String stadium = hc.getStadium();
	protected String leader = hc.getLeader();
	protected String captain = hc.getCaptain();
	protected String teammembers = hc.getTeamMembers();
	protected String opponent = hc.getOpponent();
	protected String words = hc.getVersionAndContent()[1];

	/**
	 * 
	 */
	public HakaPhoto() {
		super();
	}

	/**
	 * @param id
	 */
	public HakaPhoto(PhotoId id) {
		super(id);
	}

	/**
	 * @param rset
	 * @throws SQLException
	 */
	public HakaPhoto(ResultSet rset) throws SQLException {
		super(rset);
	}

	public void readFrom(ResultSet rset) throws SQLException {

		super.readFrom(rset);

		version = rset.getString(VERSION);
		nickname = rset.getString(NICKNAME);
		stadium = rset.getString(STADIUM);
		leader = rset.getString(LEADER);
		captain = rset.getString(CAPTAIN);
		teammembers = rset.getString(TEAMMEMBERS);
		opponent = rset.getString(OPPONENT);
		words = rset.getString(WORDS);
	}

	public void writeOn(ResultSet rset) throws SQLException {

		super.writeOn(rset);

		rset.updateString(VERSION, version);
		rset.updateString(NICKNAME, nickname);
		rset.updateString(STADIUM, stadium);
		rset.updateString(LEADER, leader);
		rset.updateString(CAPTAIN, captain);
		rset.updateString(TEAMMEMBERS, teammembers);
		rset.updateString(OPPONENT, opponent);
		rset.updateString(WORDS, words);
	}
	
	/**
	 * Vorlesung
	 * SetFrog()
	 * incWriteCount(); --> dirty bit, hiermit wird festgestellt welches element in der DB abgespeichert/aktualisiert werden soll --> setFrog(), nicht getFrog() 
	 * persistenz protocol --> readOn, writeOn
	 *
	 */
=======

	public static final String VERSION = "version"; // "Ka Mate", "Kapa o Pango"
	public static final String NICKNAME = "nickname"; // All Blacks
	public static final String STADIUM = "stadium"; // Eden Park, Westpack
													// Stadium, Jade Stadium
	public static final String LEADER = "leader"; // Liam Messam, Richie McCaw
	public static final String CAPTAIN = "captain"; // Richie McCaw
	public static final String TEAMMEMBERS = "teammembers";
	public static final String OPPONENT = "opponent";
	public static final String WORDS = "words"; // Kapa o Pango kia whakawhenua

	protected String version = hc.getVersionAndContent()[0];
	protected String nickname = hc.getTeamNickname();
	protected String stadium = hc.getStadium();
	protected String leader = hc.getLeader();
	protected String captain = hc.getCaptain();
	protected String teammembers = hc.getTeamMembers();
	protected String opponent = hc.getOpponent();
	protected String words = hc.getVersionAndContent()[1];

	/**
	 * 
	 */
	public HakaPhoto() {
		super();
	}

	/**
	 * @param id
	 */
	public HakaPhoto(PhotoId id) {
		super(id);
	}

	/**
	 * @param rset
	 * @throws SQLException
	 */
	public HakaPhoto(ResultSet rset) throws SQLException {
		super(rset);
	}

	public void readFrom(ResultSet rset) throws SQLException {

		super.readFrom(rset);

		version = rset.getString(VERSION);
		nickname = rset.getString(NICKNAME);
		stadium = rset.getString(STADIUM);
		leader = rset.getString(LEADER);
		captain = rset.getString(CAPTAIN);
		teammembers = rset.getString(TEAMMEMBERS);
		opponent = rset.getString(OPPONENT);
		words = rset.getString(WORDS);
	}

	public void writeOn(ResultSet rset) throws SQLException {

		super.writeOn(rset);

		rset.updateString(VERSION, version);
		rset.updateString(NICKNAME, nickname);
		rset.updateString(STADIUM, stadium);
		rset.updateString(LEADER, leader);
		rset.updateString(CAPTAIN, captain);
		rset.updateString(TEAMMEMBERS, teammembers);
		rset.updateString(OPPONENT, opponent);
		rset.updateString(WORDS, words);
	}
>>>>>>> branch 'master' of https://github.com/VladimirVulpe/haka
}
