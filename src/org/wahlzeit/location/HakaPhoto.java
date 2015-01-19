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

	GameFactory abstractgame = new Game(new GameType(HakaVersion.Ka_Mate,
			HakaTeamMembers.Member30, HakaTeamMembers.Member11,
			HakaStadium.Stadium2, "Australia"));

	IHaka IHaka = abstractgame.createHaka();
	IStadium IStadium = abstractgame.createStadium();
	IOpponent IOpponent = abstractgame.createOpponent();
	ITeam ITeam = abstractgame.createTeam();

	public static final String VERSION = "version";
	public static final String NICKNAME = "nickname";
	public static final String STADIUM = "stadium";
	public static final String LEADER = "leader";
	public static final String CAPTAIN = "captain";
	public static final String TEAMMEMBERS = "teammembers";
	public static final String OPPONENT = "opponent";
	public static final String WORDS = "words";

	protected String nickname = "AllBlacks";
	protected String version = IHaka.getHakaVersion();
	protected String words = IHaka.getHakaContent();
	protected String stadium = IStadium.getStadiumName();
	protected String leader = ITeam.getLeader();
	protected String captain = ITeam.getCaptain();
	protected String teammembers = ITeam.getAllPlayers();
	protected String opponent = IOpponent.getOpponent();

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

	public void setHakaVersion(String hakaVersion)
			throws StringIndexOutOfBoundsException, IllegalArgumentException {
		this.version = hakaVersion;
	}

	public String getHakaVersion() {
		return this.version;
	}

	public void setCaptain(String captain)
			throws StringIndexOutOfBoundsException, IllegalArgumentException {
		this.captain = captain;
	}

	public String getCaptain() {
		return this.captain;
	}

	public void setLeader(String leader)
			throws StringIndexOutOfBoundsException, IllegalArgumentException {
		this.leader = leader;
	}

	public String getLeader() {
		return this.leader;
	}

	public void setStadium(String stadium)
			throws StringIndexOutOfBoundsException, IllegalArgumentException {
		this.stadium = stadium;
	}

	public String getStadium() {
		return this.stadium;
	}
}
