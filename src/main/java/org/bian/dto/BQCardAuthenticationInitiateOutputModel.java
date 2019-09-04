package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardAuthenticationInitiateOutputModel
 */
public class BQCardAuthenticationInitiateOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private Object cardTransactionInstanceRecord = null;

  private String cardAuthenticationInstanceReference = null;

  private String cardAuthenticationInitiateActionReference = null;

  private Object cardAuthenticationInitiateActionRecord = null;

  private String cardAuthenticationInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Card Authentication instance 
   * @return cardAuthenticationInstanceReference
  **/

  public String getCardAuthenticationInstanceReference() {
    return cardAuthenticationInstanceReference;
  }

  public void setCardAuthenticationInstanceReference(String cardAuthenticationInstanceReference) {
    this.cardAuthenticationInstanceReference = cardAuthenticationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return cardAuthenticationInitiateActionReference
  **/

  public String getCardAuthenticationInitiateActionReference() {
    return cardAuthenticationInitiateActionReference;
  }

  public void setCardAuthenticationInitiateActionReference(String cardAuthenticationInitiateActionReference) {
    this.cardAuthenticationInitiateActionReference = cardAuthenticationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return cardAuthenticationInitiateActionRecord
  **/

  public Object getCardAuthenticationInitiateActionRecord() {
    return cardAuthenticationInitiateActionRecord;
  }

  public void setCardAuthenticationInitiateActionRecord(Object cardAuthenticationInitiateActionRecord) {
    this.cardAuthenticationInitiateActionRecord = cardAuthenticationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Card Authentication instance (e.g. initialised, pending, active) 
   * @return cardAuthenticationInstanceStatus
  **/

  public String getCardAuthenticationInstanceStatus() {
    return cardAuthenticationInstanceStatus;
  }

  public void setCardAuthenticationInstanceStatus(String cardAuthenticationInstanceStatus) {
    this.cardAuthenticationInstanceStatus = cardAuthenticationInstanceStatus;
  }


}

