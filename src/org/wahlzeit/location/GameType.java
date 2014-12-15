package org.wahlzeit.location;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Vladimir Vulpe
 *
 */
public class GameType {

	private HakaVersion hakaversion;
	private HakaTeamMembers captain, leader;
	private HakaStadium stadium;
	private String opponent;

	private Map<String, GameType> propertyGameType;
	public static final GameType VOID_TYPE = new GameType(HakaVersion.Ka_Mate,
			HakaTeamMembers.Member30, HakaTeamMembers.Member16,
			HakaStadium.Stadium3, "Springbok");

	
	/**
	 * @param hakaversion
	 * @param captain
	 * @param leader
	 * @param stadium
	 * @param opponent
	 */
	public GameType(HakaVersion hakaversion, HakaTeamMembers captain,
			HakaTeamMembers leader, HakaStadium stadium, String opponent) {
		this.hakaversion = hakaversion;
		this.captain = captain;
		this.leader = leader;
		this.stadium = stadium;
		this.opponent = opponent;
		this.propertyGameType = new Hashtable<String, GameType>();
	}

	/**
	 * @return
	 */
	public HakaVersion getHakaVersion() {
		return this.hakaversion;
	}

	public HakaTeamMembers getCaptain() {
		return this.captain;
	}

	public HakaTeamMembers getLeader() {
		return this.leader;
	}

	public HakaStadium getStadium() {
		return this.stadium;
	}

	public String getOpponent() {
		return this.opponent;
	}

	/**
	 * @param name
	 * @param gametype
	 */
	public void put(String opponent, GameType gametype) {
		this.propertyGameType.put(opponent, gametype);
	}

	/**
	 * @param name
	 * @return
	 */
	public GameType get(String opponent) {
		return this.propertyGameType.get(opponent);
	}

	/**
	 * @return
	 */
	public Game makeGameInstance() {
		return new Game(this);
	}
}
