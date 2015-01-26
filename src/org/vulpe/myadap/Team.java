package org.vulpe.myadap;

/**
 * @author Vladimir Vulpe
 *
 */
public class Team implements ITeam {

	private static String ALL_PLAYERS;
	private static String CAPTAIN;
	private static String LEADER;

	/**
	 * sets actual captains and leaders name
	 */
	public Team() {
		this(HakaTeamMembers.Member30, HakaTeamMembers.Member34);
	}

	/**
	 * @param captain
	 * @param leader
	 */
	public Team(HakaTeamMembers captain, HakaTeamMembers leader) {
		setCaptain(captain);
		setLeader(leader);
		setAllPlayers();
	}

	private void setAllPlayers() throws ArrayIndexOutOfBoundsException {
		ALL_PLAYERS = "";
		for (String member : HakaTeamMembers.toArray()) {
			if (member != null) {
				ALL_PLAYERS += member + ",";
			}
		}
	}

	@Override
	public String getAllPlayers() {
		assert Team.ALL_PLAYERS != null : "Players names must not be emtpy!";

		return Team.ALL_PLAYERS;
	}

	@Override
	public String getCaptain() {
		assert Team.CAPTAIN != null : "Captain name must not be emtpy!";

		return Team.CAPTAIN;
	}

	@Override
	public String getLeader() {
		assert Team.LEADER != null : "Haka leader name must not be emtpy!";

		return Team.LEADER;
	}

	@Override
	public void addNewPlayer(HakaTeamMembers player) {
		assert player.toString() != null : "Player name must not be emtpy!";

		Team.ALL_PLAYERS += ", " + player.toString();
	}

	@Override
	public void setCaptain(HakaTeamMembers captain) {
		assert captain.toString() != null : "Captain name must not be emtpy!";

		Team.CAPTAIN = captain.toString();
	}

	@Override
	public void setLeader(HakaTeamMembers leader) {
		assert leader.toString() != null : "Haka leader name must not be emtpy!";

		Team.LEADER = leader.toString();
	}
}
