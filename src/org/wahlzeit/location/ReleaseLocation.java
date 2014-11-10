/**
 * 
 */
/**
 * @author Vulpe Vladimir
 *
 */
package org.wahlzeit.location;

import com.mapcode.Point;
import com.mapcode.UnknownTerritoryException;

public class ReleaseLocation {

	public static String LOCATIONCODE = "";

	public static String getLocationCode() {
		return LOCATIONCODE;
	}

	public void setLocationCode(String locationCode) {
		this.LOCATIONCODE = locationCode;
	}

	// do nothing
	public void ReleaseLocation() {

	}

	// convert and return GPSCode or MapCode
	public ReleaseLocation(final String loc) {

		GPSCode gps = new GPSCode();
		MapCode mc = new MapCode();

		if (gps.locationCodeType(loc)) {
			setLocationCode(gps.mapcodeDecode(loc).toString());
		} else {
			gps.setLatitude(Double.parseDouble(loc.split(",")[0]));
			gps.setLongitude(Double.parseDouble(loc.split(",")[1]));

			setLocationCode(mc.mapcodeEncode(gps.LATITUDE, gps.LONGITUDE));
		}
	}

	public static void main(final String[] args)
			throws com.mapcode.UnknownTerritoryException {

//		System.out.println(new ReleaseLocation("ZAF 9K.QHP").getLocationCode());
//		System.out.println(new ReleaseLocation("-33.928277, 18.522426")
//				.getLocationCode());
	}
}
