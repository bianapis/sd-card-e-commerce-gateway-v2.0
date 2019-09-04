package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceReportRecord
 */
public class CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceReportRecord   {
  private String eCommerceGatewayOperatingSessionInstanceReportData = null;

  private String eCommerceGatewayOperatingSessionInstanceReportType = null;

  private Object eCommerceGatewayOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return eCommerceGatewayOperatingSessionInstanceReportData
  **/

  public String getECommerceGatewayOperatingSessionInstanceReportData() {
    return eCommerceGatewayOperatingSessionInstanceReportData;
  }
  
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceReportData")
  public void setECommerceGatewayOperatingSessionInstanceReportData(String eCommerceGatewayOperatingSessionInstanceReportData) {
    this.eCommerceGatewayOperatingSessionInstanceReportData = eCommerceGatewayOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eCommerceGatewayOperatingSessionInstanceReportType
  **/

  public String getECommerceGatewayOperatingSessionInstanceReportType() {
    return eCommerceGatewayOperatingSessionInstanceReportType;
  }
  
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceReportType")
  public void setECommerceGatewayOperatingSessionInstanceReportType(String eCommerceGatewayOperatingSessionInstanceReportType) {
    this.eCommerceGatewayOperatingSessionInstanceReportType = eCommerceGatewayOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return eCommerceGatewayOperatingSessionInstanceReport
  **/

  public Object getECommerceGatewayOperatingSessionInstanceReport() {
    return eCommerceGatewayOperatingSessionInstanceReport;
  }
  
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceReport")
  public void setECommerceGatewayOperatingSessionInstanceReport(Object eCommerceGatewayOperatingSessionInstanceReport) {
    this.eCommerceGatewayOperatingSessionInstanceReport = eCommerceGatewayOperatingSessionInstanceReport;
  }


}

