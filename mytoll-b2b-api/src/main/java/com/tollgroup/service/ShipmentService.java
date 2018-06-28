package com.tollgroup.service;

import com.tollgroup.dto.ShipmentDto;
import com.tollgroup.model.Shipment;

public interface ShipmentService {
	ShipmentDto createShipment();
	Shipment getShipment();
	String getShipmentNumber();
}
