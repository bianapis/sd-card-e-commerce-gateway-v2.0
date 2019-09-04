package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionInitiateOutputModel
 */
public class BQCardTransactionInitiateOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private String cardTransactionInstanceReference = null;

  private String cardTransactionInitiateActionReference = null;

  private Object cardTransactionInitiateActionRecord = null;

  private String cardTransactionInstanceStatus = null;

  private Object cardTransactionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardTransactionInitiateActionReference
  **/

  public String getCardTransactionInitiateActionReference() {
    return cardTransactionInitiateActionReference;
  }

  public void setCardTransactionInitiateActionReference(String cardTransactionInitiateActionReference) {
    this.cardTransactionInitiateActionReference = cardTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardTransactionInitiateActionRecord
  **/

  public Object getCardTransactionInitiateActionRecord() {
    return cardTransactionInitiateActionRecord;
  }

  public void setCardTransactionInitiateActionRecord(Object cardTransactionInitiateActionRecord) {
    this.cardTransactionInitiateActionRecord = cardTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Transaction instance (e.g. initialised, pending, active) 
   * @return cardTransactionInstanceStatus
  **/

  public String getCardTransactionInstanceStatus() {
    return cardTransactionInstanceStatus;
  }

  public void setCardTransactionInstanceStatus(String cardTransactionInstanceStatus) {
    this.cardTransactionInstanceStatus = cardTransactionInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Capturing a card transaction 
   * @return cardTransactionInstanceRecord
  **/

  public Object getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(Object cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


}

