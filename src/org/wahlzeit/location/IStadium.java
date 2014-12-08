package org.wahlzeit.location;

public interface IStadium {
 
	/**
	 * sets the stadium name for the actual game
	 * some significant rugby stadiums are predefined in HakaStadium enum
	 * @param stadium
	 */
	void setStadiumName(HakaStadium stadium);
 
	/**
	 * @returns stadium name for the actual game as string value
	 */
	String getStadiumName();
}
