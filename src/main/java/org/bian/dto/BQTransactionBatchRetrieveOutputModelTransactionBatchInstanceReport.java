package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceReport
 */
public class BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceReport   {
  private Object transactionBatchInstanceReportRecord = null;

  private String transactionBatchInstanceReportType = null;

  private String transactionBatchInstanceReportParameters = null;

  private Object transactionBatchInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionBatchInstanceReportRecord
  **/

  public Object getTransactionBatchInstanceReportRecord() {
    return transactionBatchInstanceReportRecord;
  }

  public void setTransactionBatchInstanceReportRecord(Object transactionBatchInstanceReportRecord) {
    this.transactionBatchInstanceReportRecord = transactionBatchInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionBatchInstanceReportType
  **/

  public String getTransactionBatchInstanceReportType() {
    return transactionBatchInstanceReportType;
  }

  public void setTransactionBatchInstanceReportType(String transactionBatchInstanceReportType) {
    this.transactionBatchInstanceReportType = transactionBatchInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionBatchInstanceReportParameters
  **/

  public String getTransactionBatchInstanceReportParameters() {
    return transactionBatchInstanceReportParameters;
  }

  public void setTransactionBatchInstanceReportParameters(String transactionBatchInstanceReportParameters) {
    this.transactionBatchInstanceReportParameters = transactionBatchInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionBatchInstanceReport
  **/

  public Object getTransactionBatchInstanceReport() {
    return transactionBatchInstanceReport;
  }

  public void setTransactionBatchInstanceReport(Object transactionBatchInstanceReport) {
    this.transactionBatchInstanceReport = transactionBatchInstanceReport;
  }


}

