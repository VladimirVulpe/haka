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

public class MapCode extends LocationCode {

	// do nothing
	public void MapCode() {
	}

	public void MapCode(double lat, double lon) {
		mapcodeEncode(lat, lon);
	}

	// encode a lat/lon point into a Mapcode
	//
	final String mapcodeEncode(double lat, double lon) {

		Mapcode mapCodeElement = MapcodeCodec.encode(lat, lon).get(0);

		return mapCodeElement.getTerritory().toString() + " "
				+ mapCodeElement.getMapcode().toString();
	}

	@Override
	Point mapcodeDecode(String mapcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
