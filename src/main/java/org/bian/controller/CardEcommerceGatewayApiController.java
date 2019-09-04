/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CardEcommerceGatewayApiController {

	@Autowired
	CardEcommerceGatewayApiService service;
	
	@Operate.Activate
	public BianResponse<SDCardECommerceGatewayActivateOutputModel> activate(@RequestBody BianRequest<SDCardECommerceGatewayActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDCardECommerceGatewayConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardECommerceGatewayConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CReCommerceGatewayOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CReCommerceGatewayOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDCardECommerceGatewayFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardECommerceGatewayFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("cardauthentication")
	@Operate.Initiate
	public BianResponse<BQCardAuthenticationInitiateOutputModel> initiateCardauthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCardAuthenticationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCardauthentication(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cardtransaction")
	@Operate.Initiate
	public BianResponse<BQCardTransactionInitiateOutputModel> initiateCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCardTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCardtransaction(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionauthorization")
	@Operate.Initiate
	public BianResponse<BQTransactionAuthorizationInitiateOutputModel> initiateTransactionauthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionAuthorizationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactionauthorization(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionbatch")
	@Operate.Initiate
	public BianResponse<BQTransactionBatchInitiateOutputModel> initiateTransactionbatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionBatchInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactionbatch(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CReCommerceGatewayOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDCardECommerceGatewayRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@BQ("cardauthentication")
	@Operate.Retrieve
	public BianResponse<BQCardAuthenticationRetrieveOutputModel> retrieveCardauthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCardauthentication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("cardtransaction")
	@Operate.Retrieve
	public BianResponse<BQCardTransactionRetrieveOutputModel> retrieveCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCardtransaction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("transactionauthorization")
	@Operate.Retrieve
	public BianResponse<BQTransactionAuthorizationRetrieveOutputModel> retrieveTransactionauthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionauthorization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("transactionbatch")
	@Operate.Retrieve
	public BianResponse<BQTransactionBatchRetrieveOutputModel> retrieveTransactionbatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionbatch(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("cardauthentication")
	@Operate.Update
	public BianResponse<BQCardAuthenticationUpdateOutputModel> updateCardauthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCardAuthenticationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCardauthentication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("cardtransaction")
	@Operate.Update
	public BianResponse<BQCardTransactionUpdateOutputModel> updateCardtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCardTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCardtransaction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionauthorization")
	@Operate.Update
	public BianResponse<BQTransactionAuthorizationUpdateOutputModel> updateTransactionauthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionAuthorizationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactionauthorization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionbatch")
	@Operate.Update
	public BianResponse<BQTransactionBatchUpdateOutputModel> updateTransactionbatch(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionBatchUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactionbatch(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
