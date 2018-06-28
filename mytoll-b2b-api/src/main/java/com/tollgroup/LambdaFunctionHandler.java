package com.tollgroup;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.tollgroup.dto.ManifestRequest;
import com.tollgroup.service.ShipmentService;
import com.tollgroup.service.impl.ShipmentServiceImpl;

/**
 * The Controller Class LambdaFunctionHandler. Its handle all the request of lambda.

 */
public class LambdaFunctionHandler implements RequestHandler<ManifestRequest, Object> {

    /** The Constant applicationContext. */
    private static final AnnotationConfigApplicationContext applicationContext;

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LogManager.getLogger(LambdaFunctionHandler.class);
    
    static {
        applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    }
    
    /** The request operation service. */
    private final ShipmentService shipmentService = applicationContext.getBean(ShipmentServiceImpl.class);

	public Object handleRequest(ManifestRequest input, Context context) {
		return shipmentService.getShipmentNumber();
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//		String json = "{\"headers\":{\"callId\":\"1\",\"channel\":\"WEB\",\"x-mytoll-identity\":\"COPTEAM\"},\"methodType\":\"POST\",\"shipments\":[{\"shipmentLines\":[{\"lineItemDescription\":\"PALLET\",\"seqNo\":1,\"perPallet\":false,\"perPalletQty\":0,\"senderReference\":\"\",\"receiverReference\":\"\",\"createdByTemplate\":true,\"status\":\"O\",\"templateId\":\"\",\"itemCount\":\"1\",\"billingtypeDescription\":\"General Freight\",\"billingCode\":\"0\",\"containsDangerousGoods\":false,\"itemType\":\"Items\",\"miscUnitsCount\":0,\"dimensions\":{\"length\":\"10\",\"width\":\"10\",\"height\":\"10\",\"lwhUom\":\"cm\",\"totalVolume\":\"0.001\",\"totalVolumeUom\":\"\",\"totalWeight\":\"100\",\"totalWeightUom\":\"kg\",\"totalCubicVolume\":0},\"shipmentLinesDangerousGoods\":[]}],\"references\":[{\"referenceSeq\":1,\"referenceType\":\"PO\",\"referenceValue\":\"test\"}],\"palletTransactions\":null,\"totalVolume\":0.001,\"totalQuantity\":1,\"totalWeight\":100,\"tollCarrierCode\":\"TTAS\",\"tollCarrierName\":\"Toll Tasmania\",\"tempRangeFrom\":\"\",\"tempRangeTo\":\"\",\"temperatureUom\":\"DEGREE\",\"dispatchDate\":\"2018-03-12\",\"serviceCode\":\"E\",\"serviceName\":\"Express\",\"mode\":\"ROAD\",\"chargeTo\":\"S\",\"accountCode\":\"100464\",\"senderAddress\":{\"addressId\":\"263\",\"companyName\":\"ABC  11\",\"contactName\":\"Avnish 1\",\"workPhoneNumber\":\"61-412543887\",\"mobileNumber\":\"61-412543887\",\"addressLine1\":\"Brandon Lodge1\",\"addressLine2\":\"27 Barbet\",\"postCode\":\"4822\",\"suburb\":\"BURLEIGH\",\"state\":\"QLD\",\"city\":\"\",\"countryCode\":\"AU\",\"accountCode\":\"\",\"addressType\":\"\",\"dgContactName\":\"\",\"dgContactNumber\":\"\",\"email\":\"\",\"addressNote\":\"\",\"latitude\":\"\",\"longitude\":\"\",\"dpId\":\"\",\"gnafPid\":\"\",\"avsConfidenceLevel\":\"\"},\"receiverAddress\":{\"addressId\":\"91\",\"companyName\":\"Anil Rec 11\",\"contactName\":\"Anil Rec\",\"workPhoneNumber\":\"61-412567456\",\"mobileNumber\":\"61-412567456\",\"addressLine1\":\"Australian Defence Force Academy\",\"addressLine2\":\"2 Academy Cl\",\"postCode\":\"2612\",\"suburb\":\"CAMPBELL\",\"state\":\"ACT\",\"city\":\"\",\"countryCode\":\"AU\",\"accountCode\":\"\",\"addressType\":\"\",\"dgContactName\":\"\",\"dgContactNumber\":\"\",\"email\":\"\",\"addressNote\":\"\",\"latitude\":\"\",\"longitude\":\"\",\"dpId\":\"\",\"gnafPid\":\"\",\"avsConfidenceLevel\":\"\"},\"isPalletsTransactions\":false,\"typeOfExport\":\"\",\"declaredValueCurrencyCode\":\"\",\"declaredValue\":\"\",\"harmonisedCommodityCode\":\"\",\"taxPayer\":\"\",\"extraServiceValue\":\"\",\"extraServiceCurrency\":\"\",\"specialInstructions\":\"\",\"smsNotify\":false,\"smsNotifyMobile\":\"\",\"extraServiceRequired\":false,\"containsFood\":false,\"authorityToLeave\":false,\"securityCheckRequired\":false,\"alternateDelivery\":false,\"status\":\"O\"}]}";
		String json = "{\"headers\":{\"callId\":\"1\",\"channel\":\"WEB\",\"x-mytoll-identity\":\"COPTEAM\"},\"methodType\":\"POST\",\"shipments\":[{\"shipmentLines\":[{\"lineItemDescription\":\"PALLET\",\"seqNo\":1,\"perPallet\":false,\"perPalletQty\":0,\"senderReference\":\"\",\"receiverReference\":\"\",\"createdByTemplate\":true,\"status\":\"O\",\"templateId\":\"\",\"itemCount\":\"1\",\"billingtypeDescription\":\"General Freight\",\"billingCode\":\"0\",\"containsDangerousGoods\":false,\"itemType\":\"Items\",\"miscUnitsCount\":0,\"dimensions\":{\"length\":\"10\",\"width\":\"10\",\"height\":\"10\",\"lwhUom\":\"cm\",\"totalVolume\":\"0.001\",\"totalVolumeUom\":\"\",\"totalWeight\":\"100\",\"totalWeightUom\":\"kg\",\"totalCubicVolume\":0},\"shipmentLinesDangerousGoods\":[]}],\"references\":[{\"referenceSeq\":1,\"referenceType\":\"PO\",\"referenceValue\":\"test\"}],\"palletTransactions\":null,\"totalVolume\":0.001,\"totalQuantity\":1,\"totalWeight\":100,\"tollCarrierCode\":\"TTAS\",\"tollCarrierName\":\"Toll Tasmania\",\"tempRangeFrom\":\"\",\"tempRangeTo\":\"\",\"temperatureUom\":\"DEGREE\",\"serviceCode\":\"E\",\"serviceName\":\"Express\",\"mode\":\"ROAD\",\"chargeTo\":\"S\",\"accountCode\":\"100464\",\"senderAddress\":{\"addressId\":\"263\",\"companyName\":\"ABC  11\",\"contactName\":\"Avnish 1\",\"workPhoneNumber\":\"61-412543887\",\"mobileNumber\":\"61-412543887\",\"addressLine1\":\"Brandon Lodge1\",\"addressLine2\":\"27 Barbet\",\"postCode\":\"4822\",\"suburb\":\"BURLEIGH\",\"state\":\"QLD\",\"city\":\"\",\"countryCode\":\"AU\",\"accountCode\":\"\",\"addressType\":\"\",\"dgContactName\":\"\",\"dgContactNumber\":\"\",\"email\":\"\",\"addressNote\":\"\",\"latitude\":\"\",\"longitude\":\"\",\"dpId\":\"\",\"gnafPid\":\"\",\"avsConfidenceLevel\":\"\"},\"receiverAddress\":{\"addressId\":\"91\",\"companyName\":\"Anil Rec 11\",\"contactName\":\"Anil Rec\",\"workPhoneNumber\":\"61-412567456\",\"mobileNumber\":\"61-412567456\",\"addressLine1\":\"Australian Defence Force Academy\",\"addressLine2\":\"2 Academy Cl\",\"postCode\":\"2612\",\"suburb\":\"CAMPBELL\",\"state\":\"ACT\",\"city\":\"\",\"countryCode\":\"AU\",\"accountCode\":\"\",\"addressType\":\"\",\"dgContactName\":\"\",\"dgContactNumber\":\"\",\"email\":\"\",\"addressNote\":\"\",\"latitude\":\"\",\"longitude\":\"\",\"dpId\":\"\",\"gnafPid\":\"\",\"avsConfidenceLevel\":\"\"},\"isPalletsTransactions\":false,\"typeOfExport\":\"\",\"declaredValueCurrencyCode\":\"\",\"declaredValue\":\"\",\"harmonisedCommodityCode\":\"\",\"taxPayer\":\"\",\"extraServiceValue\":\"\",\"extraServiceCurrency\":\"\",\"specialInstructions\":\"\",\"smsNotify\":false,\"smsNotifyMobile\":\"\",\"extraServiceRequired\":false,\"containsFood\":false,\"authorityToLeave\":false,\"securityCheckRequired\":false,\"alternateDelivery\":false,\"status\":\"O\"}]}";
		com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
		ManifestRequest shipmentRequest = mapper.readValue(json, ManifestRequest.class);
		LambdaFunctionHandler handler = new LambdaFunctionHandler();
		Object obj = handler.handleRequest(shipmentRequest, null);
		System.out.println(obj);
	}
    
}
