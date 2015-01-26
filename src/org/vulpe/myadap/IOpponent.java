package org.vulpe.myadap;

public interface IOpponent {
	
	/**
	 * sets the actual game opponent team name or country
	 * 
	 * @param opponent
	 */
	void setOpponent(String opponent);

	/**
	 * gets the actual game opponent team name or country as string value
	 * @return
	 */
	String getOpponent();
}
