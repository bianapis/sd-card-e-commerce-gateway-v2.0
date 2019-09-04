package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionControlOutputModel
 */
public class CReCommerceGatewayOperatingSessionControlOutputModel   {
  private String eCommerceGatewayOperatingSessionControlActionTaskReference = null;

  private Object eCommerceGatewayOperatingSessionControlActionTaskRecord = null;

  private String eCommerceGatewayOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a eCommerce Gateway Operating Session instance control processing service call 
   * @return eCommerceGatewayOperatingSessionControlActionTaskReference
  **/

  public String getECommerceGatewayOperatingSessionControlActionTaskReference() {
    return eCommerceGatewayOperatingSessionControlActionTaskReference;
  }
  @JsonProperty("eCommerceGatewayOperatingSessionControlActionTaskReference")
  public void setECommerceGatewayOperatingSessionControlActionTaskReference(String eCommerceGatewayOperatingSessionControlActionTaskReference) {
    this.eCommerceGatewayOperatingSessionControlActionTaskReference = eCommerceGatewayOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return eCommerceGatewayOperatingSessionControlActionTaskRecord
  **/

  public Object getECommerceGatewayOperatingSessionControlActionTaskRecord() {
    return eCommerceGatewayOperatingSessionControlActionTaskRecord;
  }
  @JsonProperty("eCommerceGatewayOperatingSessionControlActionTaskRecord")
  public void setECommerceGatewayOperatingSessionControlActionTaskRecord(Object eCommerceGatewayOperatingSessionControlActionTaskRecord) {
    this.eCommerceGatewayOperatingSessionControlActionTaskRecord = eCommerceGatewayOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return eCommerceGatewayOperatingSessionControlActionResponse
  **/

  public String getECommerceGatewayOperatingSessionControlActionResponse() {
    return eCommerceGatewayOperatingSessionControlActionResponse;
  }
  
  @JsonProperty("eCommerceGatewayOperatingSessionControlActionResponse")
  public void setECommerceGatewayOperatingSessionControlActionResponse(String eCommerceGatewayOperatingSessionControlActionResponse) {
    this.eCommerceGatewayOperatingSessionControlActionResponse = eCommerceGatewayOperatingSessionControlActionResponse;
  }


}

