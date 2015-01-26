/**
 * @author Vulpe Vladimir
 *
 */
package org.vulpe.myadap;

import com.mapcode.Mapcode;
import com.mapcode.MapcodeCodec;
import com.mapcode.UnknownMapcodeException;


public class MapCodeLocation extends LocationAbstract {

	private String MAPCODE = "";

	
	/**
	 * @param mapCode
	 */
	public void MapCode(String mapCode) {
		doSetMapCode(mapCode);
	}

	/**
	 * @param latitude
	 * @param longitude
	 */
	public void MapCode(double latitude, double longitude) {
		doSetLocation(latitude, longitude);
	}

	@Override
	protected void doSetLocation(double latitude, double longitude)  {
		
		Mapcode mapCodeElement = MapcodeCodec.encode(latitude, longitude)
				.get(0);
		doSetMapCode(mapCodeElement.getTerritory().toString() + " "
				+ mapCodeElement.getMapcode().toString());
	}

	@Override
	protected void doSetLocation(String mapCode) {
		doSetMapCode(mapCode);
	}

	@Override
	protected double doGetLatitude() throws IllegalArgumentException,
			UnknownMapcodeException {
		return MapcodeCodec.decode(doGetMapCode()).getLatDeg();
	}

	@Override
	protected double doGetLongitude() throws IllegalArgumentException,
			UnknownMapcodeException {
		return MapcodeCodec.decode(doGetMapCode()).getLonDeg();
	}

	private void doSetMapCode(String mapCode) {
		this.MAPCODE = mapCode;
	}

	@Override
	protected String doGetMapCode() {
		return MAPCODE;
	}

	@Override
	protected String doGetAsString() {
		return doGetMapCode();
	}

}
