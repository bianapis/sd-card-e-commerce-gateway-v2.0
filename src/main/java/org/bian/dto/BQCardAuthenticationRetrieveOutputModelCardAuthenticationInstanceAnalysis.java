package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceAnalysis
 */
public class BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceAnalysis   {
  private Object cardAuthenticationInstanceAnalysisRecord = null;

  private String cardAuthenticationInstanceAnalysisReportType = null;

  private String cardAuthenticationInstanceAnalysisParameters = null;

  private Object cardAuthenticationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardAuthenticationInstanceAnalysisRecord
  **/

  public Object getCardAuthenticationInstanceAnalysisRecord() {
    return cardAuthenticationInstanceAnalysisRecord;
  }

  public void setCardAuthenticationInstanceAnalysisRecord(Object cardAuthenticationInstanceAnalysisRecord) {
    this.cardAuthenticationInstanceAnalysisRecord = cardAuthenticationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardAuthenticationInstanceAnalysisReportType
  **/

  public String getCardAuthenticationInstanceAnalysisReportType() {
    return cardAuthenticationInstanceAnalysisReportType;
  }

  public void setCardAuthenticationInstanceAnalysisReportType(String cardAuthenticationInstanceAnalysisReportType) {
    this.cardAuthenticationInstanceAnalysisReportType = cardAuthenticationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardAuthenticationInstanceAnalysisParameters
  **/

  public String getCardAuthenticationInstanceAnalysisParameters() {
    return cardAuthenticationInstanceAnalysisParameters;
  }

  public void setCardAuthenticationInstanceAnalysisParameters(String cardAuthenticationInstanceAnalysisParameters) {
    this.cardAuthenticationInstanceAnalysisParameters = cardAuthenticationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardAuthenticationInstanceAnalysisReport
  **/

  public Object getCardAuthenticationInstanceAnalysisReport() {
    return cardAuthenticationInstanceAnalysisReport;
  }

  public void setCardAuthenticationInstanceAnalysisReport(Object cardAuthenticationInstanceAnalysisReport) {
    this.cardAuthenticationInstanceAnalysisReport = cardAuthenticationInstanceAnalysisReport;
  }


}

