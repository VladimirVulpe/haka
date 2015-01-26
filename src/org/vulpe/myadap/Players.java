package org.vulpe.myadap;

import java.io.Serializable;

/**
 * @author Vladimir Vulpe
 *
 */
 public final class Players implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String fullname = "";
	private static int shirtnumber = -1;
	private static boolean captain = false;
	private static boolean leader = false;

	private Players() {
	}

	/**
	 * @param shirtnumber
	 * @param fullname
	 * @param captain
	 * @param leader
	 */
	private Players(int shirtnumber, String fullname, boolean captain,
			boolean leader) throws IllegalArgumentException,
			StringIndexOutOfBoundsException {
		Players.shirtnumber = shirtnumber;
		Players.fullname = fullname;
		Players.captain = captain;
		Players.leader = leader;
	}

	/**
	 * internal private class will be initialized in Player.getInstance()
	 */
	private static final class InstanceHolder {
		public static final Players INSTANCE = new Players(shirtnumber, fullname,
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
	public static Players getInstance(int shirtnumber, String forename,
			String lastname, boolean captain, boolean leader) {

		return InstanceHolder.INSTANCE;
	}

	/**
	 * gets player fullname
	 */
	public String getFullname() {
		return Players.fullname;
	}

	/**
	 * gets player ShirtNr
	 */
	public int getShirtNumber() {
		return Players.shirtnumber;
	}

	/**
	 * gets a reply if the chosen player is a squad captain
	 */
	public boolean isCaptain() {
		return Players.captain;
	}

	/**
	 * gets a reply if the chosen player is a haka leader
	 */
	public boolean isLeader()  {
		return Players.leader;
	}

	/**
	 * proof for distinction/equality
	 * 
	 * @param otherPlayer
	 */
	public boolean equals(Players otherPlayer) throws IllegalArgumentException {
		return (this.hashCode() == otherPlayer.hashCode());
	}
}
