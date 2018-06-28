package com.tollgroup.validator;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mytoll.tollgroup.dispatch.shipment.validator.ErrorCode;
import com.tollgroup.dto.ManifestDto;
import com.tollgroup.dto.ShipmentDto;
import com.tollgroup.util.ShipmentUtil;

@Component
public class ShipmentFieldValidator {
	
	@Autowired
	private ShipmentUtil shipmentUtil;

	public void manifestBasicCheck(ManifestDto manifestDto, List<String> errorList, List<String> warningList) {
		//Validating all dispatch dates are equal.
//		Set<LocalDate> setOfDispatchDate = new HashSet<>();
		
		Set<LocalDate> setOfDispatchDate = manifestDto.getShipments().stream()
				.map(shipment -> shipment.getDispatchDate()).collect(Collectors.toSet());
		
		//Manifest date within 7 days.
		ZonedDateTime dispatchDate;
		if (null != manifestDto.getDispatchDate()) {
			dispatchDate = shipmentUtil.convertLocalDatetoZonedDateTime(manifestDto.getDispatchDate());
			ZonedDateTime today = ZonedDateTime.now().truncatedTo(ChronoUnit.DAYS);
			ZonedDateTime afterSevenDays = today.plusDays(6);
			if (dispatchDate.isBefore(today) || dispatchDate.isAfter(afterSevenDays)) {
				errorList.add("Dispatch date should be with in 7 days from current date.");
			}
		} else {
			errorList.add("Dispatch date should not be null.");
		}
		
		System.out.println(setOfDispatchDate);
	}
	
	public static void main(String[] args) {
		System.out.println("Test");
		ManifestDto test = new ManifestDto();
		List<ShipmentDto> shipments = new ArrayList<>();
		ShipmentDto shipmentDto = new ShipmentDto();
		shipmentDto.setDispatchDate(new LocalDate("2017-06-27"));
		ShipmentDto shipmentDto1 = new ShipmentDto();
		shipmentDto1.setDispatchDate(new LocalDate());
		shipments.add(shipmentDto );
		shipments.add(shipmentDto1 );
		test.setShipments(shipments);
		
		//manifestBasicCheck(test);
	}
}
