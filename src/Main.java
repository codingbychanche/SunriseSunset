/**
 * Demo class.
 * 
 * @author Berthold
 *
 */
import org.berthold.sunrisesunset.*;

public class Main {
	
	private static final int DAY_OF_YEAR=270;
	private static final double LAT=49.2;
	private static final double LONG=8.12;
	private static final int TIME_ZONE=1;

	public static void main(String args[]){
		// Test
		double dec=SunsetSunrise.getSunDeclinationIn_Rad(DAY_OF_YEAR);
		System.out.println("Declination:"+SunsetSunrise.toGrad(dec));
		System.out.println("Sunrise:"+SunsetSunrise.getSunriseTimeAtObserversLocationIn_h(LONG, LAT, DAY_OF_YEAR, TIME_ZONE));
		System.out.println("Sunset:"+SunsetSunrise.getSunsetTimeAtObserversLocationIn_h(LONG, LAT, DAY_OF_YEAR, TIME_ZONE));
	}
}
