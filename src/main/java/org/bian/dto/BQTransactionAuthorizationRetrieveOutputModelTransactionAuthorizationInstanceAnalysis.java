package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis
 */
public class BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis   {
  private Object transactionAuthorizationInstanceAnalysisRecord = null;

  private String transactionAuthorizationInstanceAnalysisReportType = null;

  private String transactionAuthorizationInstanceAnalysisParameters = null;

  private Object transactionAuthorizationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionAuthorizationInstanceAnalysisRecord
  **/

  public Object getTransactionAuthorizationInstanceAnalysisRecord() {
    return transactionAuthorizationInstanceAnalysisRecord;
  }

  public void setTransactionAuthorizationInstanceAnalysisRecord(Object transactionAuthorizationInstanceAnalysisRecord) {
    this.transactionAuthorizationInstanceAnalysisRecord = transactionAuthorizationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionAuthorizationInstanceAnalysisReportType
  **/

  public String getTransactionAuthorizationInstanceAnalysisReportType() {
    return transactionAuthorizationInstanceAnalysisReportType;
  }

  public void setTransactionAuthorizationInstanceAnalysisReportType(String transactionAuthorizationInstanceAnalysisReportType) {
    this.transactionAuthorizationInstanceAnalysisReportType = transactionAuthorizationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionAuthorizationInstanceAnalysisParameters
  **/

  public String getTransactionAuthorizationInstanceAnalysisParameters() {
    return transactionAuthorizationInstanceAnalysisParameters;
  }

  public void setTransactionAuthorizationInstanceAnalysisParameters(String transactionAuthorizationInstanceAnalysisParameters) {
    this.transactionAuthorizationInstanceAnalysisParameters = transactionAuthorizationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return transactionAuthorizationInstanceAnalysisReport
  **/

  public Object getTransactionAuthorizationInstanceAnalysisReport() {
    return transactionAuthorizationInstanceAnalysisReport;
  }

  public void setTransactionAuthorizationInstanceAnalysisReport(Object transactionAuthorizationInstanceAnalysisReport) {
    this.transactionAuthorizationInstanceAnalysisReport = transactionAuthorizationInstanceAnalysisReport;
  }


}

