/**
 * 
 */
package org.wahlzeit.location;

import com.mapcode.UnknownMapcodeException;

/**
 * @author Vladimir Vulpe
 *
 */
public interface Location {

	
	/**
	 * sets the GPS location
	 * @param double latitude 
	 * @param double longitude 
	 */
	void setLocation(double latitude, double longitude);
		
	
	
	/**
	 * sets the location as MapCode
	 * @param String mapCode
	 * @throws UnknownMapcodeException 
	 * @throws IllegalArgumentException 
	 */
	void setLocation (String mapCode) throws IllegalArgumentException, UnknownMapcodeException;
	
	
	
	/**
	 * @throws UnknownMapcodeException 
	 * @throws IllegalArgumentException 
	 * @returns the GPS latitude coordinate as double data type
	 */
	double getLatitude() throws IllegalArgumentException, UnknownMapcodeException;
	
	
	
	/**
	 * @throws UnknownMapcodeException 
	 * @throws IllegalArgumentException 
	 * @returns the GPS longitude coordinate as double data type
	 */
	double getLongitude() throws IllegalArgumentException, UnknownMapcodeException;
	
	
	
	/**
	 * @returns the MapCode data
	 */
	String getMapCode();
	
	
	/**
	 * @get asString (GPSPoint to String)
	 */
	String asString();
	
	
	/**
	 * @returns the data type of the location string value from the database
	 */
	boolean doGetLocationType(String location);
	
}
