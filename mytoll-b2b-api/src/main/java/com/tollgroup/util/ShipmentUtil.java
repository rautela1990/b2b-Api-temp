package com.tollgroup.util;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class ShipmentUtil {
	private TimeZone timeZone;
	
	@PostConstruct
	public void initializeBean() {
		Calendar now = Calendar.getInstance();
		timeZone = now.getTimeZone();
	}
	
	public ZonedDateTime convertLocalDatetoZonedDateTime(LocalDate localDate) {
		if (null != localDate) {
			return ZonedDateTime.of(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth(), 0, 0, 0,
					0, ZoneId.of(timeZone.getID(), ZoneId.SHORT_IDS));
		}
		return null;
	}
}
