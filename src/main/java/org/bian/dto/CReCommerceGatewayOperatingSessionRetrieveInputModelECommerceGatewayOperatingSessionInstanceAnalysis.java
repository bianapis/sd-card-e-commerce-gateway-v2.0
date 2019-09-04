package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceAnalysis
 */
public class CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceAnalysis   {
  private String eCommerceGatewayOperatingSessionInstanceAnalysisReference = null;

  private String eCommerceGatewayOperatingSessionInstanceAnalysisReportType = null;

  private String eCommerceGatewayOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return eCommerceGatewayOperatingSessionInstanceAnalysisReference
  **/

  public String getECommerceGatewayOperatingSessionInstanceAnalysisReference() {
    return eCommerceGatewayOperatingSessionInstanceAnalysisReference;
  }

  public void setECommerceGatewayOperatingSessionInstanceAnalysisReference(String eCommerceGatewayOperatingSessionInstanceAnalysisReference) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysisReference = eCommerceGatewayOperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eCommerceGatewayOperatingSessionInstanceAnalysisReportType
  **/

  public String getECommerceGatewayOperatingSessionInstanceAnalysisReportType() {
    return eCommerceGatewayOperatingSessionInstanceAnalysisReportType;
  }

  public void setECommerceGatewayOperatingSessionInstanceAnalysisReportType(String eCommerceGatewayOperatingSessionInstanceAnalysisReportType) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysisReportType = eCommerceGatewayOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return eCommerceGatewayOperatingSessionInstanceAnalysisParameters
  **/

  public String getECommerceGatewayOperatingSessionInstanceAnalysisParameters() {
    return eCommerceGatewayOperatingSessionInstanceAnalysisParameters;
  }

  public void setECommerceGatewayOperatingSessionInstanceAnalysisParameters(String eCommerceGatewayOperatingSessionInstanceAnalysisParameters) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysisParameters = eCommerceGatewayOperatingSessionInstanceAnalysisParameters;
  }


}

