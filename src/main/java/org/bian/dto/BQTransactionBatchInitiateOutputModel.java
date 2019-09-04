package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionBatchInitiateOutputModel
 */
public class BQTransactionBatchInitiateOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private String transactionBatchInstanceReference = null;

  private String transactionBatchInitiateActionReference = null;

  private Object transactionBatchInitiateActionRecord = null;

  private String transactionBatchInstanceStatus = null;

  private Object transactionBatchInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Batch instance 
   * @return transactionBatchInstanceReference
  **/

  public String getTransactionBatchInstanceReference() {
    return transactionBatchInstanceReference;
  }

  public void setTransactionBatchInstanceReference(String transactionBatchInstanceReference) {
    this.transactionBatchInstanceReference = transactionBatchInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionBatchInitiateActionReference
  **/

  public String getTransactionBatchInitiateActionReference() {
    return transactionBatchInitiateActionReference;
  }

  public void setTransactionBatchInitiateActionReference(String transactionBatchInitiateActionReference) {
    this.transactionBatchInitiateActionReference = transactionBatchInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionBatchInitiateActionRecord
  **/

  public Object getTransactionBatchInitiateActionRecord() {
    return transactionBatchInitiateActionRecord;
  }

  public void setTransactionBatchInitiateActionRecord(Object transactionBatchInitiateActionRecord) {
    this.transactionBatchInitiateActionRecord = transactionBatchInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Batch instance (e.g. initialised, pending, active) 
   * @return transactionBatchInstanceStatus
  **/

  public String getTransactionBatchInstanceStatus() {
    return transactionBatchInstanceStatus;
  }

  public void setTransactionBatchInstanceStatus(String transactionBatchInstanceStatus) {
    this.transactionBatchInstanceStatus = transactionBatchInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Handling data items for a batch/collection of transactions submitted for a merchant 
   * @return transactionBatchInstanceRecord
  **/

  public Object getTransactionBatchInstanceRecord() {
    return transactionBatchInstanceRecord;
  }

  public void setTransactionBatchInstanceRecord(Object transactionBatchInstanceRecord) {
    this.transactionBatchInstanceRecord = transactionBatchInstanceRecord;
  }


}

