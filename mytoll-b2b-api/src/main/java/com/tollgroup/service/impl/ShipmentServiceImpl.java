package com.tollgroup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tollgroup.dto.ShipmentDto;
import com.tollgroup.model.Shipment;
import com.tollgroup.repository.ShipmentRepository;
import com.tollgroup.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService{
	
	@Autowired
	private ShipmentRepository shipmentRepository;

	@Override
	public ShipmentDto createShipment() {
		return null;
	}

	@Override
	public Shipment getShipment() {
		return null;
	}

	@Override
	public String getShipmentNumber(){
		return shipmentRepository.getShipmentNumber();
	}
}
