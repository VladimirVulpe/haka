package org.vulpe.myadap;

public interface IHaka {

	/**
	 * set the haka version for the current game
	 * all haka versions are predefined in HakaVersion enum
	 * @param version
	 */
	void setHakaVersion(HakaVersion version);
	
	/**
	 * determine the haka content from the haka version
	 * @param content
	 */
	void setHakaContent(HakaVersion content);
	
	/**
	 * @returns haka version as string value 
	 */
	String getHakaVersion();
	
	/**
	 * @returns haka content as string value
	 */
	String getHakaContent();
}
