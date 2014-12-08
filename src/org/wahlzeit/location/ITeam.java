package org.wahlzeit.location;

/**
 * @author Vladimir Vulpe
 *
 */
public interface ITeam {

	/**
	 * @returns all players first name and last name as a string value
	 */
	String getAllPlayers();
	
	/**
	 * @returns captains first name and last name
	 */
	String getCaptain();
	
	/**
	 * @returns haka leaders name, is usually different from captains name
	 */
	String getLeader();
	
	/**
	 * add new haka team member
	 * all actual haka team members/players are predefined in HakaTeamMembers enum
	 * @param player
	 */
	void addNewPlayer(HakaTeamMembers player);
	
	/**
	 * set the captain for the current game
	 * all actual haka team members/players are predefined in HakaTeamMembers enum
	 * @param captain
	 */
	void setCaptain(HakaTeamMembers captain);
	
	/**
	 * set the leader for the current game, each game has typically different leaders
	 * all actual haka team members/players are predefined in HakaTeamMembers enum
	 * @param leader
	 */
	void setLeader(HakaTeamMembers leader);
}
