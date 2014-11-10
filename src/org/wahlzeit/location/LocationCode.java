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
import com.mapcode.ParentTerritory;
import com.mapcode.Point;
import com.mapcode.Territory;
import com.mapcode.UnknownMapcodeException;
import com.mapcode.UnknownTerritoryException;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;

public abstract class LocationCode {

	// do nothing
	//
	protected LocationCode() {
	}

	//return location type
	// true: Mapcode
	// false: GPSCode
	//
	protected LocationCode(final String loc) {
		locationCodeType(loc);
	}

	abstract String mapcodeEncode(double lat, double lon); // public static
															// final String

	abstract Point mapcodeDecode(final String mapcode); // public static Point
														// mapcodeDecode(final
	// String mapcode)

	// true: Mapcode
	// false: GPSCode
	//
	public static final boolean locationCodeType(final String loc) {

		char[] loc_Chars = loc.toCharArray();

		for (final char loc_Char : loc_Chars) {
			if ((loc_Char > 64 && loc_Char < 91)
					|| (loc_Char > 96 && loc_Char < 123)) {
				return true;
			}
		}

		return false;
	}
}