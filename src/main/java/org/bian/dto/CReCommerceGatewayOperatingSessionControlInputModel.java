package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CReCommerceGatewayOperatingSessionControlInputModelECommerceGatewayOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionControlInputModel
 */
public class CReCommerceGatewayOperatingSessionControlInputModel   {
  private String cardeCommerceGatewayServicingSessionReference = null;

  private String eCommerceGatewayOperatingSessionInstanceReference = null;

  private Object eCommerceGatewayOperatingSessionControlActionTaskRecord = null;

  private CReCommerceGatewayOperatingSessionControlInputModelECommerceGatewayOperatingSessionControlActionRequest eCommerceGatewayOperatingSessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardeCommerceGatewayServicingSessionReference
  **/

  public String getCardeCommerceGatewayServicingSessionReference() {
    return cardeCommerceGatewayServicingSessionReference;
  }

  public void setCardeCommerceGatewayServicingSessionReference(String cardeCommerceGatewayServicingSessionReference) {
    this.cardeCommerceGatewayServicingSessionReference = cardeCommerceGatewayServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the eCommerce Gateway Operating Session instance 
   * @return eCommerceGatewayOperatingSessionInstanceReference
  **/

  public String getECommerceGatewayOperatingSessionInstanceReference() {
    return eCommerceGatewayOperatingSessionInstanceReference;
  }

  public void setECommerceGatewayOperatingSessionInstanceReference(String eCommerceGatewayOperatingSessionInstanceReference) {
    this.eCommerceGatewayOperatingSessionInstanceReference = eCommerceGatewayOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return eCommerceGatewayOperatingSessionControlActionTaskRecord
  **/

  public Object getECommerceGatewayOperatingSessionControlActionTaskRecord() {
    return eCommerceGatewayOperatingSessionControlActionTaskRecord;
  }

  public void setECommerceGatewayOperatingSessionControlActionTaskRecord(Object eCommerceGatewayOperatingSessionControlActionTaskRecord) {
    this.eCommerceGatewayOperatingSessionControlActionTaskRecord = eCommerceGatewayOperatingSessionControlActionTaskRecord;
  }


  /**
   * Get eCommerceGatewayOperatingSessionControlActionRequest
   * @return eCommerceGatewayOperatingSessionControlActionRequest
  **/

  public CReCommerceGatewayOperatingSessionControlInputModelECommerceGatewayOperatingSessionControlActionRequest getECommerceGatewayOperatingSessionControlActionRequest() {
    return eCommerceGatewayOperatingSessionControlActionRequest;
  }

  public void setECommerceGatewayOperatingSessionControlActionRequest(CReCommerceGatewayOperatingSessionControlInputModelECommerceGatewayOperatingSessionControlActionRequest eCommerceGatewayOperatingSessionControlActionRequest) {
    this.eCommerceGatewayOperatingSessionControlActionRequest = eCommerceGatewayOperatingSessionControlActionRequest;
  }


}

