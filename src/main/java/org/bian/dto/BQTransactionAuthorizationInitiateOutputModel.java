package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationInitiateOutputModel
 */
public class BQTransactionAuthorizationInitiateOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private Object cardTransactionInstanceRecord = null;

  private String transactionAuthorizationInstanceReference = null;

  private String transactionAuthorizationInitiateActionReference = null;

  private Object transactionAuthorizationInitiateActionRecord = null;

  private String transactionAuthorizationInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Capturing a card transaction 
   * @return cardTransactionInstanceRecord
  **/

  public Object getCardTransactionInstanceRecord() {
    return cardTransactionInstanceRecord;
  }

  public void setCardTransactionInstanceRecord(Object cardTransactionInstanceRecord) {
    this.cardTransactionInstanceRecord = cardTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Authorization instance 
   * @return transactionAuthorizationInstanceReference
  **/

  public String getTransactionAuthorizationInstanceReference() {
    return transactionAuthorizationInstanceReference;
  }

  public void setTransactionAuthorizationInstanceReference(String transactionAuthorizationInstanceReference) {
    this.transactionAuthorizationInstanceReference = transactionAuthorizationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionAuthorizationInitiateActionReference
  **/

  public String getTransactionAuthorizationInitiateActionReference() {
    return transactionAuthorizationInitiateActionReference;
  }

  public void setTransactionAuthorizationInitiateActionReference(String transactionAuthorizationInitiateActionReference) {
    this.transactionAuthorizationInitiateActionReference = transactionAuthorizationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionAuthorizationInitiateActionRecord
  **/

  public Object getTransactionAuthorizationInitiateActionRecord() {
    return transactionAuthorizationInitiateActionRecord;
  }

  public void setTransactionAuthorizationInitiateActionRecord(Object transactionAuthorizationInitiateActionRecord) {
    this.transactionAuthorizationInitiateActionRecord = transactionAuthorizationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Authorization instance (e.g. initialised, pending, active) 
   * @return transactionAuthorizationInstanceStatus
  **/

  public String getTransactionAuthorizationInstanceStatus() {
    return transactionAuthorizationInstanceStatus;
  }

  public void setTransactionAuthorizationInstanceStatus(String transactionAuthorizationInstanceStatus) {
    this.transactionAuthorizationInstanceStatus = transactionAuthorizationInstanceStatus;
  }


}

