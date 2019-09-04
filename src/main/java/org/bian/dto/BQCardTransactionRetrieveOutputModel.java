package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis;
import org.bian.dto.BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveOutputModel
 */
public class BQCardTransactionRetrieveOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private Object cardTransactionInstanceRecord = null;

  private String cardTransactionRetrieveActionTaskReference = null;

  private Object cardTransactionRetrieveActionTaskRecord = null;

  private String cardTransactionRetrieveActionResponse = null;

  private BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport cardTransactionInstanceReport = null;

  private BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis cardTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Capturing a card transaction productInstanceReference:  type: string  example: \"782920\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to the card product identifier/number customerReference:  type: string  example: \"797832\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The card holder as detailed on the plastic cardexpirationdate:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: As detailed on the plastic/token cardCVV:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: As detailed on the plastic/token cardIssuingBankReference:  type: string  example: \"760401\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the card holder's issuing bank merchantAcquiringBankReference:  type: string  example: \"726782\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant's acquiring bank eCommerceTransactionType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The type of transaction (purchase, cash advance, etc.) eCommerceTransactionCurrency:  type: string  example: USD  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency    general-info: The currency that the transaction is made in eCommerceTransactionAmountType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up) eCommerceTransactionAmount:  type: string  example: USD 250  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount    general-info: The amount corresponding to the type eCommerceTransactionMerchantReference:  type: string  example: \"732972\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant initiating the transaction eCommerceTransactionLocationReference:  type: string  example: \"753547\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the point of sale location eCommerceTransactionProductServiceReference:  type: string  example: \"727716\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Details of the transaction (e.g. purchased service/product, purpose) eCommerceTransactionDateTime:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: Significant dates and times associated with the transaction 
   * @return cardTransactionInstanceRecord
  **/

  public Object getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(Object cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Card Transaction instance retrieve service call 
   * @return cardTransactionRetrieveActionTaskReference
  **/

  public String getCardTransactionRetrieveActionTaskReference() {
    return cardTransactionRetrieveActionTaskReference;
  }

  public void setCardTransactionRetrieveActionTaskReference(String cardTransactionRetrieveActionTaskReference) {
    this.cardTransactionRetrieveActionTaskReference = cardTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardTransactionRetrieveActionTaskRecord
  **/

  public Object getCardTransactionRetrieveActionTaskRecord() {
    return cardTransactionRetrieveActionTaskRecord;
  }

  public void setCardTransactionRetrieveActionTaskRecord(Object cardTransactionRetrieveActionTaskRecord) {
    this.cardTransactionRetrieveActionTaskRecord = cardTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardTransactionRetrieveActionResponse
  **/

  public String getCardTransactionRetrieveActionResponse() {
    return cardTransactionRetrieveActionResponse;
  }

  public void setCardTransactionRetrieveActionResponse(String cardTransactionRetrieveActionResponse) {
    this.cardTransactionRetrieveActionResponse = cardTransactionRetrieveActionResponse;
  }


  /**
   * Get cardTransactionInstanceReport
   * @return cardTransactionInstanceReport
  **/

  public BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport getCardTransactionInstanceReport() {
    return cardTransactionInstanceReport;
  }

  public void setCardTransactionInstanceReport(BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport cardTransactionInstanceReport) {
    this.cardTransactionInstanceReport = cardTransactionInstanceReport;
  }


  /**
   * Get cardTransactionInstanceAnalysis
   * @return cardTransactionInstanceAnalysis
  **/

  public BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis getCardTransactionInstanceAnalysis() {
    return cardTransactionInstanceAnalysis;
  }

  public void setCardTransactionInstanceAnalysis(BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis cardTransactionInstanceAnalysis) {
    this.cardTransactionInstanceAnalysis = cardTransactionInstanceAnalysis;
  }


}

