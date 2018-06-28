package com.tollgroup.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

import com.tollgroup.dto.ManifestDto;
import com.tollgroup.dto.ShipmentDto;

@Component
public class ShipmentFieldValidator {

	public static void manifestBasicCheck(ManifestDto manifestDto) {
		//Validating all dispatch dates are equal.
//		Set<LocalDate> setOfDispatchDate = new HashSet<>();
		
		Set<LocalDate> setOfDispatchDate = manifestDto.getShipments().stream()
				.map(shipment -> shipment.getDispatchDate()).collect(Collectors.toSet());
		
		//Manifest date within 7 days.
		
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
		
		manifestBasicCheck(test);
	}
}
