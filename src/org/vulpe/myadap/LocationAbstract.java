/**
 * @author Vulpe Vladimir
 *
 */
package org.vulpe.myadap;

import com.mapcode.UnknownMapcodeException;

public abstract class LocationAbstract implements Location {

	/**
	 * sets the GPS location
	 * 
	 * @param double latitude
	 * @param double longitude
	 * @throws ClassNotFoundException 
	 */
	protected abstract void doSetLocation(double latitude, double longitude);

	/**
	 * sets the GPS location
	 * 
	 * @param double latitude
	 * @param double longitude
	 * @throws ClassNotFoundException 
	 */
	public final void setLocation(double latitude, double longitude) {

		doSetLocation(latitude, longitude);
	}

	/**
	 * encode a latitude/longitude point into a Mapcode
	 * 
	 * @param String
	 *            mapCode
	 * @throws UnknownMapcodeException
	 * @throws IllegalArgumentException
	 * @throws Exception 
	 */
	protected abstract void doSetLocation(String mapCode)
			throws IllegalArgumentException, Exception;

	/**
	 * sets the location as MapCode
	 * 
	 * @param String
	 *            mapCode
	 * @throws UnknownMapcodeException
	 * @throws IllegalArgumentException
	 */
	public final void setLocation(String mapCode)
			throws IllegalArgumentException, Exception {

		doSetLocation(mapCode);
	}

	/**
	 * @throws UnknownMapcodeException
	 * @throws IllegalArgumentException
	 * @returns the GPS latitude coordinate as double data type
	 */
	protected abstract double doGetLatitude() throws IllegalArgumentException,
			UnknownMapcodeException;

	/**
	 * @throws UnknownMapcodeException
	 * @throws IllegalArgumentException
	 * @returns the GPS latitude coordinate as double data type
	 */
	public final double getLatitude() throws IllegalArgumentException,
			UnknownMapcodeException {

		return doGetLatitude();
	}

	/**
	 * @throws UnknownMapcodeException
	 * @throws IllegalArgumentException
	 * @returns the GPS longitude coordinate as double data type
	 */
	protected abstract double doGetLongitude() throws IllegalArgumentException,
			UnknownMapcodeException;

	/**
	 * @throws UnknownMapcodeException
	 * @throws IllegalArgumentException
	 * @returns the GPS longitude coordinate as double data type
	 */
	public final double getLongitude() throws IllegalArgumentException,
			UnknownMapcodeException {

		return doGetLongitude();
	}

	public final String getMapCode() {
		return doGetMapCode();
	}

	/**
	 * @returns the MapCode data
	 */
	protected abstract String doGetMapCode();

	public final String asString() {
		return doGetAsString();
	}

	/**
	 * @return GPSKoordinates as String data type
	 */
	protected abstract String doGetAsString();

	/**
	 * true: MapCodeLocation; false: GPSLocation
	 * 
	 * @param location
	 * @returns the location type as boolean data type 
	 */
	public final boolean doGetLocationType(final String location) {

		for (final char char_El : location.toCharArray()) {
			return ((char_El > 64 && char_El < 91) || (char_El > 96 && char_El < 123)) ? true
					: false;
		}

		return false;
	}
	
}