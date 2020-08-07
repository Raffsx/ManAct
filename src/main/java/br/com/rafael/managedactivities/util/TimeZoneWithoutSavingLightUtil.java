package br.com.rafael.managedactivities.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneWithoutSavingLightUtil {

	public static ZonedDateTime returnCurrentTime() {
		Instant instant = Instant.now(); // UTC, always.
		ZoneId zoneId = ZoneId.of( "America/Sao_Paulo" );
		return ZonedDateTime.ofInstant( instant, zoneId );
	}

}
