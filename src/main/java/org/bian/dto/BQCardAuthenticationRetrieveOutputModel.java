package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceAnalysis;
import org.bian.dto.BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCardAuthenticationRetrieveOutputModel
 */
public class BQCardAuthenticationRetrieveOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private Object cardTransactionInstanceRecord = null;

  private Object cardAuthenticationInstanceRecord = null;

  private String cardAuthenticationRetrieveActionTaskReference = null;

  private Object cardAuthenticationRetrieveActionTaskRecord = null;

  private String cardAuthenticationRetrieveActionResponse = null;

  private BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceReport cardAuthenticationInstanceReport = null;

  private BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceAnalysis cardAuthenticationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Capturing a card transaction productInstanceReference:  type: string  example: \"794399\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to the card product identifier/number customerReference:  type: string  example: \"709424\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The card holder as detailed on the plastic cardexpirationdate:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: As detailed on the plastic/token cardCVV:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: As detailed on the plastic/token cardIssuingBankReference:  type: string  example: \"775813\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the card holder's issuing bank merchantAcquiringBankReference:  type: string  example: \"786217\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant's acquiring bank eCommerceTransactionType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The type of transaction (purchase, cash advance, etc.) eCommerceTransactionCurrency:  type: string  example: USD  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency    general-info: The currency that the transaction is made in eCommerceTransactionAmountType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up) eCommerceTransactionAmount:  type: string  example: USD 250  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount    general-info: The amount corresponding to the type eCommerceTransactionMerchantReference:  type: string  example: \"735229\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant initiating the transaction eCommerceTransactionLocationReference:  type: string  example: \"721020\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the point of sale location eCommerceTransactionProductServiceReference:  type: string  example: \"737162\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Details of the transaction (e.g. purchased service/product, purpose) eCommerceTransactionDateTime:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: Significant dates and times associated with the transaction 
   * @return cardTransactionInstanceRecord
  **/

  public Object getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(Object cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Authentication of a card member based on information provided - routed to the card issuer for response eCommerceTransactionInstanceReference:  type: string  example: \"773157\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the card transaction that is being authenticated - note all fields may not be required eCommerceTransactionAuthenticationResponse:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The result of the card authentication request 
   * @return cardAuthenticationInstanceRecord
  **/

  public Object getCardAuthenticationInstanceRecord() {
    return cardAuthenticationInstanceRecord;
  }

  public void setCardAuthenticationInstanceRecord(Object cardAuthenticationInstanceRecord) {
    this.cardAuthenticationInstanceRecord = cardAuthenticationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Authentication instance retrieve service call 
   * @return cardAuthenticationRetrieveActionTaskReference
  **/

  public String getCardAuthenticationRetrieveActionTaskReference() {
    return cardAuthenticationRetrieveActionTaskReference;
  }

  public void setCardAuthenticationRetrieveActionTaskReference(String cardAuthenticationRetrieveActionTaskReference) {
    this.cardAuthenticationRetrieveActionTaskReference = cardAuthenticationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardAuthenticationRetrieveActionTaskRecord
  **/

  public Object getCardAuthenticationRetrieveActionTaskRecord() {
    return cardAuthenticationRetrieveActionTaskRecord;
  }

  public void setCardAuthenticationRetrieveActionTaskRecord(Object cardAuthenticationRetrieveActionTaskRecord) {
    this.cardAuthenticationRetrieveActionTaskRecord = cardAuthenticationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardAuthenticationRetrieveActionResponse
  **/

  public String getCardAuthenticationRetrieveActionResponse() {
    return cardAuthenticationRetrieveActionResponse;
  }

  public void setCardAuthenticationRetrieveActionResponse(String cardAuthenticationRetrieveActionResponse) {
    this.cardAuthenticationRetrieveActionResponse = cardAuthenticationRetrieveActionResponse;
  }


  /**
   * Get cardAuthenticationInstanceReport
   * @return cardAuthenticationInstanceReport
  **/

  public BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceReport getCardAuthenticationInstanceReport() {
    return cardAuthenticationInstanceReport;
  }

  public void setCardAuthenticationInstanceReport(BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceReport cardAuthenticationInstanceReport) {
    this.cardAuthenticationInstanceReport = cardAuthenticationInstanceReport;
  }


  /**
   * Get cardAuthenticationInstanceAnalysis
   * @return cardAuthenticationInstanceAnalysis
  **/

  public BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceAnalysis getCardAuthenticationInstanceAnalysis() {
    return cardAuthenticationInstanceAnalysis;
  }

  public void setCardAuthenticationInstanceAnalysis(BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceAnalysis cardAuthenticationInstanceAnalysis) {
    this.cardAuthenticationInstanceAnalysis = cardAuthenticationInstanceAnalysis;
  }


}

