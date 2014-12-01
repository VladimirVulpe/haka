package org.wahlzeit.location;

/**
 * @author Vladimir Vulpe
 *
 */
public interface HakaCategory {

	/**
	 * @param location
	 */
<<<<<<< HEAD
	void setStadiumLocation();
=======
	void setStadiumLocation(String location);
>>>>>>> branch 'master' of https://github.com/VladimirVulpe/haka

	/**
	 * @return
	 */
	String getStadiumLocation();
	
	/**
	 * @return
	 */
	String getTeamMembers();
	
	
	/**
	 * 
	 */
	void setCaptain(); 
	
	/**
	 * @return
	 */
	String getCaptain(); 
	
	
	/**
	 * 
	 */
	void setOpponent();
	
	/**
	 * @return
	 */
	String getOpponent(); 
	
	/**
	 * 
	 */
	void setLeader(); 
	
	/**
	 * @return
	 */
	String getLeader(); 
	
	/**
	 * 
	 */
	void setStadium(); 
	
	/**
	 * @return
	 */
	String getStadium(); 
	
	/**
	 * 
	 */
	void setVersionAndContent(); 
	
	
	/**
	 * @return
	 */
	String[] getVersionAndContent(); 
	
	/**
	 * @return
	 */
	String getTeamNickname();
	
}
