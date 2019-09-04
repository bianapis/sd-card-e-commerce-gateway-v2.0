package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceReportRecord
 */
public class CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceReportRecord   {
  private String eCommerceGatewayOperatingSessionInstanceReportReference = null;

  private String eCommerceGatewayOperatingSessionInstanceReportType = null;

  private String eCommerceGatewayOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return eCommerceGatewayOperatingSessionInstanceReportReference
  **/

  public String getECommerceGatewayOperatingSessionInstanceReportReference() {
    return eCommerceGatewayOperatingSessionInstanceReportReference;
  }

  public void setECommerceGatewayOperatingSessionInstanceReportReference(String eCommerceGatewayOperatingSessionInstanceReportReference) {
    this.eCommerceGatewayOperatingSessionInstanceReportReference = eCommerceGatewayOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eCommerceGatewayOperatingSessionInstanceReportType
  **/

  public String getECommerceGatewayOperatingSessionInstanceReportType() {
    return eCommerceGatewayOperatingSessionInstanceReportType;
  }

  public void setECommerceGatewayOperatingSessionInstanceReportType(String eCommerceGatewayOperatingSessionInstanceReportType) {
    this.eCommerceGatewayOperatingSessionInstanceReportType = eCommerceGatewayOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return eCommerceGatewayOperatingSessionInstanceReportParameters
  **/

  public String getECommerceGatewayOperatingSessionInstanceReportParameters() {
    return eCommerceGatewayOperatingSessionInstanceReportParameters;
  }

  public void setECommerceGatewayOperatingSessionInstanceReportParameters(String eCommerceGatewayOperatingSessionInstanceReportParameters) {
    this.eCommerceGatewayOperatingSessionInstanceReportParameters = eCommerceGatewayOperatingSessionInstanceReportParameters;
  }


}

