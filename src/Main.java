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
		int dayOfYear=SunriseSunsetTimeDateFormat.getDayOfCurrentYear();
		System.out.println("Day of year:"+dayOfYear);
		
		System.out.println("Timezone:"+SunriseSunsetTimeDateFormat.getCurrentTimezoneName());
		System.out.println("Timezone:"+SunriseSunsetTimeDateFormat.getCurrentTimezoneOffset());
		System.out.println("Timezone GMT +"+SunriseSunsetTimeDateFormat.getTimeZoneOffsetIn_h());
		
		
		double dec=SunsetSunrise.getSunDeclinationIn_Rad(DAY_OF_YEAR);
		System.out.println("Declination:"+SunsetSunrise.toGrad(dec));
		
		double timeOfSunrise=SunsetSunrise.getSunriseTimeAtObserversLocationIn_h(LONG, LAT, dayOfYear, TIME_ZONE);
		System.out.println("Sunrise:"+timeOfSunrise);
		System.out.println("Sunrise:"+SunriseSunsetTimeDateFormat.getTimeInTwentyFourHourFormat(timeOfSunrise));
		
		double timeOfSunset=SunsetSunrise.getSunsetTimeAtObserversLocationIn_h(LONG, LAT, dayOfYear, TIME_ZONE);
		System.out.println("Sunrise:"+timeOfSunset);
		System.out.println("Sunset:"+SunriseSunsetTimeDateFormat.getTimeInTwentyFourHourFormat(timeOfSunset));
		
	}
}
