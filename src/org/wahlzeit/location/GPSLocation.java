/**
 * 
 */
/**
 * @author Vulpe Vladimir
 *
 */
package org.wahlzeit.location;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;

public class GPSLocation extends LocationAbstract {

	private double LATITUDE = 0.0;
	private double LONGITUDE = 0.0;

	/**
	 * set GPSLocation coordinates to (0,0)
	 */
	public GPSLocation() {
		this(0, 0);
	}

	/**
	 * set the GPSLocation on the basis of parameters latitude and longitude
	 * 
	 * @param latitude
	 * @param longitude
	 */
	public GPSLocation(double latitude, double longitude) {
		doSetLocation(latitude, longitude);
	}

	public double doGetLatitude() {
		return this.LATITUDE;
	}

	/**
	 * @param latitude
	 */
	private void doSetLatitude(double latitude) {
		this.LATITUDE = latitude;
	}

	public double doGetLongitude() {
		return this.LONGITUDE;
	}

	/**
	 * @param longitude
	 */
	private void doSetLongitude(double longitude) {
		this.LONGITUDE = longitude;
	}

	@Override
	protected void doSetLocation(double latitude, double longitude) {
		doSetLatitude(latitude);
		doSetLongitude(longitude);
	}

	@Override
	protected void doSetLocation(String mapCode)
			throws IllegalArgumentException, UnknownMapcodeException {

		Point GPSCoordinates = MapcodeCodec.decode(mapCode);
		doSetLatitude(GPSCoordinates.getLatDeg());
		doSetLongitude(GPSCoordinates.getLonDeg());
		

	}

	@Override
	protected String doGetMapCode() {
		Mapcode mapCodeElement = MapcodeCodec.encode(doGetLatitude(),
				doGetLongitude()).get(0);

		return mapCodeElement.getTerritory().toString() + " "
				+ mapCodeElement.getMapcode().toString();
	}

	@Override
	protected String doGetAsString() {

		return "(" + String.valueOf(doGetLatitude()) + ";"
				+ String.valueOf(doGetLongitude()) + ")";
	}

}
