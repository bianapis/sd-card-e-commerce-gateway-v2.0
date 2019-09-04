/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardEcommerceGatewayApiService {

	SDCardECommerceGatewayActivateOutputModel activate(SDCardECommerceGatewayActivateInputModel request);
	
	SDCardECommerceGatewayConfigureOutputModel configure(String sdReferenceId, SDCardECommerceGatewayConfigureInputModel request);
	
	CReCommerceGatewayOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CReCommerceGatewayOperatingSessionControlInputModel request);
	
	SDCardECommerceGatewayFeedbackOutputModel feedback(String sdReferenceId, SDCardECommerceGatewayFeedbackInputModel request);
	
	BQCardAuthenticationInitiateOutputModel initiateCardauthentication(String sdReferenceId, String crReferenceId, BQCardAuthenticationInitiateInputModel request);
	
	BQCardTransactionInitiateOutputModel initiateCardtransaction(String sdReferenceId, String crReferenceId, BQCardTransactionInitiateInputModel request);
	
	BQTransactionAuthorizationInitiateOutputModel initiateTransactionauthorization(String sdReferenceId, String crReferenceId, BQTransactionAuthorizationInitiateInputModel request);
	
	BQTransactionBatchInitiateOutputModel initiateTransactionbatch(String sdReferenceId, String crReferenceId, BQTransactionBatchInitiateInputModel request);
	
	CReCommerceGatewayOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardECommerceGatewayRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQCardAuthenticationRetrieveOutputModel retrieveCardauthentication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCardTransactionRetrieveOutputModel retrieveCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransactionAuthorizationRetrieveOutputModel retrieveTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransactionBatchRetrieveOutputModel retrieveTransactionbatch(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCardAuthenticationUpdateOutputModel updateCardauthentication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardAuthenticationUpdateInputModel request);
	
	BQCardTransactionUpdateOutputModel updateCardtransaction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCardTransactionUpdateInputModel request);
	
	BQTransactionAuthorizationUpdateOutputModel updateTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAuthorizationUpdateInputModel request);
	
	BQTransactionBatchUpdateOutputModel updateTransactionbatch(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionBatchUpdateInputModel request);
	
}
