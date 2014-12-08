package org.wahlzeit.location;

public interface AbstractGame {

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
