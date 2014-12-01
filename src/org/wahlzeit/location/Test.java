package org.wahlzeit.location;

<<<<<<< HEAD
public class Test {

	private int c = 0; 
	
	public synchronized void increment (){
		c++;
	}
	
	public synchronized void decrement (){
		c--;
	}
	
	public synchronized int value(){
		return c; 
	}
	
	public static void main(final String[] args){
		Test test = new Test(); 
		
		test.increment();
		
		System.out.println(test.value());
		
		test.decrement();
		
		System.out.println(test.value());
	}
=======
import com.mapcode.UnknownMapcodeException;

/**
 * @author Vladimir Vulpe
 *
 */
public class Test {

	static String location = "-25.461352, 30.929683";

	// static String location = "MOZ 23DD.4Z4";

	public static void main(final String[] args)
			throws IllegalArgumentException, UnknownMapcodeException {
		// System.out.println( getLocation());

		// HakaVersion version = null;
		// HakaTeamMembers teammembers = null;
		// HakaStadion stadion = null;
		// HakaCharacteristics members = new
		// HakaCharacteristics(version.Ka_Mate, teammembers, stadion.Stadion1,
		// "Springbok", teammembers.Member1, teammembers.Member11);
		//
		// System.out.println(version.Ka_Mate.name().replace('_', ' '));
		// System.out.println(version.Kapa_o_Pango.name().replace('_', ' '));
		//
		// System.out.println(members.getTeamMembers());
		// System.out.println(members.getCaptain());
		// System.out.println(members.getLeader());
		// System.out.println(members.getOpponent());
		// System.out.println(members.getStadion());
		// System.out.println(members.getVersionAndContent()[0] +
		// members.getVersionAndContent()[1] );

		String teammembers = "";

		assert (teammembers.equals("")) : "Teammembers empty!";

		System.out.println("Sqrt(10-2)=" + subAndSqrt(10, 2));
		System.out.println("Sqrt(2-10)=" + subAndSqrt(2, 10));
	}

	public static double subAndSqrt(double a, double b) {
		double result = Math.sqrt(a - b);


		return result;
	}
	
	

	// public static String getLocation() throws IllegalArgumentException,
	// UnknownMapcodeException {

	// Location gpsLoc = new GPSLocation();
	// Location mapcLoc = new MapCodeLocation();
	//
	// System.out.println(gpsLoc.doGetLocationType(location));
	//
	// if(gpsLoc.doGetLocationType(location)) {
	// gpsLoc.setLocation(location);
	//
	// return "(" +String.valueOf(gpsLoc.getLatitude()) + ","
	// +String.valueOf(gpsLoc.getLongitude()) + ")";
	// } else {
	// mapcLoc.setLocation(Double.parseDouble(location.split(",")[0]),
	// Double.parseDouble(location.split(",")[1]));
	// return mapcLoc.getMapCode();
	//
	// }

	// }
>>>>>>> branch 'master' of https://github.com/VladimirVulpe/haka
}
