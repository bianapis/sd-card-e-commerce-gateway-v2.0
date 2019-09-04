package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionUpdateInputModel
 */
public class BQCardTransactionUpdateInputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private String eCommerceGatewayOperatingSessionInstanceReference = null;

  private String cardTransactionInstanceReference = null;

  private Object cardTransactionInstanceRecord = null;

  private Object cardTransactionUpdateActionTaskRecord = null;

  private String cardTransactionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The eCommerce Gateway operational service session 
   * @return eCommerceGatewayOperatingSessionInstanceRecord
  **/

  public Object getECommerceGatewayOperatingSessionInstanceRecord() {
    return eCommerceGatewayOperatingSessionInstanceRecord;
  }

  public void setECommerceGatewayOperatingSessionInstanceRecord(Object eCommerceGatewayOperatingSessionInstanceRecord) {
    this.eCommerceGatewayOperatingSessionInstanceRecord = eCommerceGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent eCommerce Gateway Operating Session instance 
   * @return eCommerceGatewayOperatingSessionInstanceReference
  **/

  public String getECommerceGatewayOperatingSessionInstanceReference() {
    return eCommerceGatewayOperatingSessionInstanceReference;
  }

  public void setECommerceGatewayOperatingSessionInstanceReference(String eCommerceGatewayOperatingSessionInstanceReference) {
    this.eCommerceGatewayOperatingSessionInstanceReference = eCommerceGatewayOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Transaction instance 
   * @return cardTransactionInstanceReference
  **/

  public String getCardTransactionInstanceReference() {
    return cardTransactionInstanceReference;
  }

  public void setCardTransactionInstanceReference(String cardTransactionInstanceReference) {
    this.cardTransactionInstanceReference = cardTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Capturing a card transaction productInstanceReference:  type: string  example: \"748460\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to the card product identifier/number customerReference:  type: string  example: \"703916\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The card holder as detailed on the plastic cardexpirationdate:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: As detailed on the plastic/token cardCVV:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: As detailed on the plastic/token cardIssuingBankReference:  type: string  example: \"742120\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the card holder's issuing bank merchantAcquiringBankReference:  type: string  example: \"795325\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant's acquiring bank eCommerceTransactionType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The type of transaction (purchase, cash advance, etc.) eCommerceTransactionCurrency:  type: string  example: USD  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency    general-info: The currency that the transaction is made in eCommerceTransactionAmountType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up) eCommerceTransactionAmount:  type: string  example: USD 250  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount    general-info: The amount corresponding to the type eCommerceTransactionMerchantReference:  type: string  example: \"753910\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant initiating the transaction eCommerceTransactionLocationReference:  type: string  example: \"762235\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the point of sale location eCommerceTransactionProductServiceReference:  type: string  example: \"716029\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Details of the transaction (e.g. purchased service/product, purpose) eCommerceTransactionDateTime:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: Significant dates and times associated with the transaction 
   * @return cardTransactionInstanceRecord
  **/

  public Object getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(Object cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cardTransactionUpdateActionTaskRecord
  **/

  public Object getCardTransactionUpdateActionTaskRecord() {
    return cardTransactionUpdateActionTaskRecord;
  }

  public void setCardTransactionUpdateActionTaskRecord(Object cardTransactionUpdateActionTaskRecord) {
    this.cardTransactionUpdateActionTaskRecord = cardTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return cardTransactionUpdateActionRequest
  **/

  public String getCardTransactionUpdateActionRequest() {
    return cardTransactionUpdateActionRequest;
  }

  public void setCardTransactionUpdateActionRequest(String cardTransactionUpdateActionRequest) {
    this.cardTransactionUpdateActionRequest = cardTransactionUpdateActionRequest;
  }


}

