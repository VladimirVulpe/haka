package org.wahlzeit.location;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author Vladimir Vulpe
 *
 */
 public final class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String fullname = "";
	private static int shirtnumber = -1;
	private static boolean captain = false;
	private static boolean leader = false;

	private Player() {
	}

	/**
	 * @param shirtnumber
	 * @param fullname
	 * @param captain
	 * @param leader
	 */
	private Player(int shirtnumber, String fullname, boolean captain,
			boolean leader) {
		Player.shirtnumber = shirtnumber;
		Player.fullname = fullname;
		Player.captain = captain;
		Player.leader = leader;
	}

	/**
	 * internal private class will be initialized in Player.getInstance()
	 */
	private static final class InstanceHolder {
		public static final Player INSTANCE = new Player(shirtnumber, fullname,
				captain, leader);
	}

	/**
	 * @param forename
	 * @param lastname
	 * @param shirtnumber
	 * @param captain
	 * @param leader
	 * @return
	 */
	public static Player getInstance(int shirtnumber, String forename,
			String lastname, boolean captain, boolean leader) {

		return InstanceHolder.INSTANCE;
	}

	/**
	 * gets player fullname
	 */
	public String getFullname() {
		return Player.fullname;
	}

	/**
	 * gets player ShirtNr
	 */
	public int getShirtNumber() {
		return Player.shirtnumber;
	}

	/**
	 * gets a reply if the chosen player is a squad captain
	 */
	public boolean isCaptain() {
		return Player.captain;
	}

	/**
	 * gets a reply if the chosen player is a haka leader
	 */
	public boolean isLeader() {
		return Player.leader;
	}

	/**
	 * proof for distinction/equality
	 * 
	 * @param otherPlayer
	 */
	public boolean equals(Player otherPlayer) {
		return (this.hashCode() == otherPlayer.hashCode());
	}
}
