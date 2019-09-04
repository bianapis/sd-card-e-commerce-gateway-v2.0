package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceAnalysis
 */
public class BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceAnalysis   {
  private Object transactionBatchInstanceAnalysisRecord = null;

  private String transactionBatchInstanceAnalysisReportType = null;

  private String transactionBatchInstanceAnalysisParameters = null;

  private Object transactionBatchInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionBatchInstanceAnalysisRecord
  **/

  public Object getTransactionBatchInstanceAnalysisRecord() {
    return transactionBatchInstanceAnalysisRecord;
  }

  public void setTransactionBatchInstanceAnalysisRecord(Object transactionBatchInstanceAnalysisRecord) {
    this.transactionBatchInstanceAnalysisRecord = transactionBatchInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionBatchInstanceAnalysisReportType
  **/

  public String getTransactionBatchInstanceAnalysisReportType() {
    return transactionBatchInstanceAnalysisReportType;
  }

  public void setTransactionBatchInstanceAnalysisReportType(String transactionBatchInstanceAnalysisReportType) {
    this.transactionBatchInstanceAnalysisReportType = transactionBatchInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionBatchInstanceAnalysisParameters
  **/

  public String getTransactionBatchInstanceAnalysisParameters() {
    return transactionBatchInstanceAnalysisParameters;
  }

  public void setTransactionBatchInstanceAnalysisParameters(String transactionBatchInstanceAnalysisParameters) {
    this.transactionBatchInstanceAnalysisParameters = transactionBatchInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return transactionBatchInstanceAnalysisReport
  **/

  public Object getTransactionBatchInstanceAnalysisReport() {
    return transactionBatchInstanceAnalysisReport;
  }

  public void setTransactionBatchInstanceAnalysisReport(Object transactionBatchInstanceAnalysisReport) {
    this.transactionBatchInstanceAnalysisReport = transactionBatchInstanceAnalysisReport;
  }


}

