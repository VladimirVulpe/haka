package org.wahlzeit.location;

/**
 * @author Vladimir Vulpe
 *
 */
public interface HakaCategory {

	/**
	 * @param location
	 */
	void setStadiumLocation();
	void setStadiumLocation(String location);

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
