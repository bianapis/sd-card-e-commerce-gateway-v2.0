/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardEcommerceGatewayApiServiceImpl implements CardEcommerceGatewayApiService {

	public SDCardECommerceGatewayActivateOutputModel activate(SDCardECommerceGatewayActivateInputModel request){
		return JsonReader.read("activate-SDCardECommerceGatewayActivateOutputModel.json",new TypeReference<SDCardECommerceGatewayActivateOutputModel>(){});
	}
	
	public SDCardECommerceGatewayConfigureOutputModel configure(String sdReferenceId, SDCardECommerceGatewayConfigureInputModel request){
		return JsonReader.read("configure-SDCardECommerceGatewayConfigureOutputModel.json",new TypeReference<SDCardECommerceGatewayConfigureOutputModel>(){});
	}
	
	public CReCommerceGatewayOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CReCommerceGatewayOperatingSessionControlInputModel request){
		return JsonReader.read("control-CReCommerceGatewayOperatingSessionControlOutputModel.json",new TypeReference<CReCommerceGatewayOperatingSessionControlOutputModel>(){});
	}
	
	public SDCardECommerceGatewayFeedbackOutputModel feedback(String sdReferenceId, SDCardECommerceGatewayFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardECommerceGatewayFeedbackOutputModel.json",new TypeReference<SDCardECommerceGatewayFeedbackOutputModel>(){});
	}
	
	public BQCardAuthenticationInitiateOutputModel initiateCardauthentication(String sdReferenceId, String crReferenceId, BQCardAuthenticationInitiateInputModel request){
		return JsonReader.read("initiate-BQCardAuthenticationInitiateOutputModel.json",new TypeReference<BQCardAuthenticationInitiateOutputModel>(){});
	}
	
	public BQCardTransactionInitiateOutputModel initiateCardtransaction(String sdReferenceId, String crReferenceId, BQCardTransactionInitiateInputModel request){
		return JsonReader.read("initiate-BQCardTransactionInitiateOutputModel.json",new TypeReference<BQCardTransactionInitiateOutputModel>(){});
	}
	
	public BQTransactionAuthorizationInitiateOutputModel initiateTransactionauthorization(String sdReferenceId, String crReferenceId, BQTransactionAuthorizationInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionAuthorizationInitiateOutputModel.json",new TypeReference<BQTransactionAuthorizationInitiateOutputModel>(){});
	}
	
	public BQTransactionBatchInitiateOutputModel initiateTransactionbatch(String sdReferenceId, String crReferenceId, BQTransactionBatchInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionBatchInitiateOutputModel.json",new TypeReference<BQTransactionBatchInitiateOutputModel>(){});
	}
	
	public CReCommerceGatewayOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CReCommerceGatewayOperatingSessionRetrieveOutputModel.json",new TypeReference<CReCommerceGatewayOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardECommerceGatewayRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardECommerceGatewayRetrieveOutputModel.json",new TypeReference<SDCardECommerceGatewayRetrieveOutputModel>(){});
	}
	
	public BQCardAuthenticationRetrieveOutputModel retrieveCardauthentication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCardAuthenticationRetrieveOutputModel.json",new TypeReference<BQCardAuthenticationRetrieveOutputModel>(){});
	}
	
	public BQCardTransactionRetrieveOutputModel retrieveCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCardTransactionRetrieveOutputModel.json",new TypeReference<BQCardTransactionRetrieveOutputModel>(){});
	}
	
	public BQTransactionAuthorizationRetrieveOutputModel retrieveTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionAuthorizationRetrieveOutputModel.json",new TypeReference<BQTransactionAuthorizationRetrieveOutputModel>(){});
	}
	
	public BQTransactionBatchRetrieveOutputModel retrieveTransactionbatch(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionBatchRetrieveOutputModel.json",new TypeReference<BQTransactionBatchRetrieveOutputModel>(){});
	}
	
	public BQCardAuthenticationUpdateOutputModel updateCardauthentication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardAuthenticationUpdateInputModel request){
		return JsonReader.read("update-BQCardAuthenticationUpdateOutputModel.json",new TypeReference<BQCardAuthenticationUpdateOutputModel>(){});
	}
	
	public BQCardTransactionUpdateOutputModel updateCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionUpdateInputModel request){
		return JsonReader.read("update-BQCardTransactionUpdateOutputModel.json",new TypeReference<BQCardTransactionUpdateOutputModel>(){});
	}
	
	public BQTransactionAuthorizationUpdateOutputModel updateTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAuthorizationUpdateInputModel request){
		return JsonReader.read("update-BQTransactionAuthorizationUpdateOutputModel.json",new TypeReference<BQTransactionAuthorizationUpdateOutputModel>(){});
	}
	
	public BQTransactionBatchUpdateOutputModel updateTransactionbatch(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionBatchUpdateInputModel request){
		return JsonReader.read("update-BQTransactionBatchUpdateOutputModel.json",new TypeReference<BQTransactionBatchUpdateOutputModel>(){});
	}
	
}
