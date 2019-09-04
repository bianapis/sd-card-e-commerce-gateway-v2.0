package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport
 */
public class BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport   {
  private Object transactionAuthorizationInstanceReportRecord = null;

  private String transactionAuthorizationInstanceReportType = null;

  private String transactionAuthorizationInstanceReportParameters = null;

  private Object transactionAuthorizationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionAuthorizationInstanceReportRecord
  **/

  public Object getTransactionAuthorizationInstanceReportRecord() {
    return transactionAuthorizationInstanceReportRecord;
  }

  public void setTransactionAuthorizationInstanceReportRecord(Object transactionAuthorizationInstanceReportRecord) {
    this.transactionAuthorizationInstanceReportRecord = transactionAuthorizationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionAuthorizationInstanceReportType
  **/

  public String getTransactionAuthorizationInstanceReportType() {
    return transactionAuthorizationInstanceReportType;
  }

  public void setTransactionAuthorizationInstanceReportType(String transactionAuthorizationInstanceReportType) {
    this.transactionAuthorizationInstanceReportType = transactionAuthorizationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionAuthorizationInstanceReportParameters
  **/

  public String getTransactionAuthorizationInstanceReportParameters() {
    return transactionAuthorizationInstanceReportParameters;
  }

  public void setTransactionAuthorizationInstanceReportParameters(String transactionAuthorizationInstanceReportParameters) {
    this.transactionAuthorizationInstanceReportParameters = transactionAuthorizationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionAuthorizationInstanceReport
  **/

  public Object getTransactionAuthorizationInstanceReport() {
    return transactionAuthorizationInstanceReport;
  }

  public void setTransactionAuthorizationInstanceReport(Object transactionAuthorizationInstanceReport) {
    this.transactionAuthorizationInstanceReport = transactionAuthorizationInstanceReport;
  }


}

