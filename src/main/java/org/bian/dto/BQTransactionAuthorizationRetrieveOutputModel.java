package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis;
import org.bian.dto.BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationRetrieveOutputModel
 */
public class BQTransactionAuthorizationRetrieveOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private Object cardTransactionInstanceRecord = null;

  private String transactionAuthorizationRetrieveActionTaskReference = null;

  private Object transactionAuthorizationRetrieveActionTaskRecord = null;

  private String transactionAuthorizationRetrieveActionResponse = null;

  private BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport transactionAuthorizationInstanceReport = null;

  private BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis transactionAuthorizationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The eCommerce Gateway operational service session 
   * @return eCommerceGatewayOperatingSessionInstanceRecord
  **/

  public Object getECommerceGatewayOperatingSessionInstanceRecord() {
    return eCommerceGatewayOperatingSessionInstanceRecord;
  }
 @JsonProperty("eCommerceGatewayOperatingSessionInstanceRecord")
  public void setECommerceGatewayOperatingSessionInstanceRecord(Object eCommerceGatewayOperatingSessionInstanceRecord) {
    this.eCommerceGatewayOperatingSessionInstanceRecord = eCommerceGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Capturing a card transaction productInstanceReference:  type: string  example: \"727349\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to the card product identifier/number customerReference:  type: string  example: \"751003\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The card holder as detailed on the plastic cardexpirationdate:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: As detailed on the plastic/token cardCVV:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: As detailed on the plastic/token cardIssuingBankReference:  type: string  example: \"710697\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the card holder's issuing bank merchantAcquiringBankReference:  type: string  example: \"727747\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant's acquiring bank eCommerceTransactionType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The type of transaction (purchase, cash advance, etc.) eCommerceTransactionCurrency:  type: string  example: USD  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency    general-info: The currency that the transaction is made in eCommerceTransactionAmountType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up) eCommerceTransactionAmount:  type: string  example: USD 250  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount    general-info: The amount corresponding to the type eCommerceTransactionMerchantReference:  type: string  example: \"767737\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant initiating the transaction eCommerceTransactionLocationReference:  type: string  example: \"705737\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the point of sale location eCommerceTransactionProductServiceReference:  type: string  example: \"722620\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Details of the transaction (e.g. purchased service/product, purpose) eCommerceTransactionDateTime:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: Significant dates and times associated with the transaction 
   * @return cardTransactionInstanceRecord
  **/

  public Object getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(Object cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Authorization instance retrieve service call 
   * @return transactionAuthorizationRetrieveActionTaskReference
  **/

  public String getTransactionAuthorizationRetrieveActionTaskReference() {
    return transactionAuthorizationRetrieveActionTaskReference;
  }

  public void setTransactionAuthorizationRetrieveActionTaskReference(String transactionAuthorizationRetrieveActionTaskReference) {
    this.transactionAuthorizationRetrieveActionTaskReference = transactionAuthorizationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionAuthorizationRetrieveActionTaskRecord
  **/

  public Object getTransactionAuthorizationRetrieveActionTaskRecord() {
    return transactionAuthorizationRetrieveActionTaskRecord;
  }

  public void setTransactionAuthorizationRetrieveActionTaskRecord(Object transactionAuthorizationRetrieveActionTaskRecord) {
    this.transactionAuthorizationRetrieveActionTaskRecord = transactionAuthorizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionAuthorizationRetrieveActionResponse
  **/

  public String getTransactionAuthorizationRetrieveActionResponse() {
    return transactionAuthorizationRetrieveActionResponse;
  }

  public void setTransactionAuthorizationRetrieveActionResponse(String transactionAuthorizationRetrieveActionResponse) {
    this.transactionAuthorizationRetrieveActionResponse = transactionAuthorizationRetrieveActionResponse;
  }


  /**
   * Get transactionAuthorizationInstanceReport
   * @return transactionAuthorizationInstanceReport
  **/

  public BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport getTransactionAuthorizationInstanceReport() {
    return transactionAuthorizationInstanceReport;
  }

  public void setTransactionAuthorizationInstanceReport(BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport transactionAuthorizationInstanceReport) {
    this.transactionAuthorizationInstanceReport = transactionAuthorizationInstanceReport;
  }


  /**
   * Get transactionAuthorizationInstanceAnalysis
   * @return transactionAuthorizationInstanceAnalysis
  **/

  public BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis getTransactionAuthorizationInstanceAnalysis() {
    return transactionAuthorizationInstanceAnalysis;
  }

  public void setTransactionAuthorizationInstanceAnalysis(BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis transactionAuthorizationInstanceAnalysis) {
    this.transactionAuthorizationInstanceAnalysis = transactionAuthorizationInstanceAnalysis;
  }


}

