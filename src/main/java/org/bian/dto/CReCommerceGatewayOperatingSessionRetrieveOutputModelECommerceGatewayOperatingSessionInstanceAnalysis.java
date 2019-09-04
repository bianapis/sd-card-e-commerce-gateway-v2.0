package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceAnalysis
 */
public class CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceAnalysis   {
  private String eCommerceGatewayOperatingSessionInstanceAnalysisData = null;

  private String eCommerceGatewayOperatingSessionInstanceAnalysisReportType = null;

  private Object eCommerceGatewayOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return eCommerceGatewayOperatingSessionInstanceAnalysisData
  **/

  public String getECommerceGatewayOperatingSessionInstanceAnalysisData() {
    return eCommerceGatewayOperatingSessionInstanceAnalysisData;
  }
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceAnalysisData")
  public void setECommerceGatewayOperatingSessionInstanceAnalysisData(String eCommerceGatewayOperatingSessionInstanceAnalysisData) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysisData = eCommerceGatewayOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eCommerceGatewayOperatingSessionInstanceAnalysisReportType
  **/

  public String getECommerceGatewayOperatingSessionInstanceAnalysisReportType() {
    return eCommerceGatewayOperatingSessionInstanceAnalysisReportType;
  }
  
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceAnalysisReportType")
  public void setECommerceGatewayOperatingSessionInstanceAnalysisReportType(String eCommerceGatewayOperatingSessionInstanceAnalysisReportType) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysisReportType = eCommerceGatewayOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return eCommerceGatewayOperatingSessionInstanceAnalysisReport
  **/

  public Object getECommerceGatewayOperatingSessionInstanceAnalysisReport() {
    return eCommerceGatewayOperatingSessionInstanceAnalysisReport;
  }
  
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceAnalysisReport")
  public void setECommerceGatewayOperatingSessionInstanceAnalysisReport(Object eCommerceGatewayOperatingSessionInstanceAnalysisReport) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysisReport = eCommerceGatewayOperatingSessionInstanceAnalysisReport;
  }


}

