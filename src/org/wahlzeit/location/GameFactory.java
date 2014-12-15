package org.wahlzeit.location;


/**
 * @author Vladimir Vulpe
 * 
 */
public interface GameFactory { 

	/**
	 * @returns Haka Version and Content
	 */
	public IHaka createHaka();

	/**
	 * @returns all players, captain and leaders names
	 */
	public ITeam createTeam();

	/**
	 * @returns actual stadium where the haka demonstration take place
	 */
	public IStadium createStadium();

	/**
	 * @returns actual opponent (country or nickname, i.e. Suedafrika or
	 *          Springbok)
	 */
	public IOpponent createOpponent();
}
