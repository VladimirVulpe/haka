/**
 * 
 */
/**
 * @author Vulpe Vladimir
 *
 */
package org.wahlzeit.location;

import com.mapcode.MapcodeCodec;
import com.mapcode.Point;
import com.mapcode.UnknownMapcodeException;
import com.mapcode.UnknownTerritoryException;

public class GPSCode extends LocationCode {

	public static double LATITUDE = 0.0;
	public static double LONGITUDE = 0.0;

	public static double getLatitude() {
		return LATITUDE;
	}

	public static void setLatitude(double latitude) {
		LATITUDE = latitude;
	}

	public static double getLongitude() {
		return LONGITUDE;
	}

	public static void setLongitude(double longitude) {
		LONGITUDE = longitude;
	}

	// do nothing
	public void GPSCode() {
	}


	// decode a Mapcode to a point, which already includes a territory name
	//
	Point mapcodeDecode(final String mapcode) {

		try {
			return MapcodeCodec.decode(mapcode);
		} catch (final UnknownMapcodeException ignored) {
			System.out
					.println("This should never happen in this example as the Mapcode is valid.");
		}

		return null;
	}

	@Override
	String mapcodeEncode(double lat, double lon) {
		// TODO Auto-generated method stub
		return null;
	}
}
