package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceAnalysis;
import org.bian.dto.BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationRetrieveInputModel
 */
public class BQTransactionAuthorizationRetrieveInputModel   {
  private Object transactionAuthorizationRetrieveActionTaskRecord = null;

  private String transactionAuthorizationRetrieveActionRequest = null;

  private BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceReport transactionAuthorizationInstanceReport = null;

  private BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceAnalysis transactionAuthorizationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionAuthorizationRetrieveActionTaskRecord
  **/

  public Object getTransactionAuthorizationRetrieveActionTaskRecord() {
    return transactionAuthorizationRetrieveActionTaskRecord;
  }

  public void setTransactionAuthorizationRetrieveActionTaskRecord(Object transactionAuthorizationRetrieveActionTaskRecord) {
    this.transactionAuthorizationRetrieveActionTaskRecord = transactionAuthorizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionAuthorizationRetrieveActionRequest
  **/

  public String getTransactionAuthorizationRetrieveActionRequest() {
    return transactionAuthorizationRetrieveActionRequest;
  }

  public void setTransactionAuthorizationRetrieveActionRequest(String transactionAuthorizationRetrieveActionRequest) {
    this.transactionAuthorizationRetrieveActionRequest = transactionAuthorizationRetrieveActionRequest;
  }


  /**
   * Get transactionAuthorizationInstanceReport
   * @return transactionAuthorizationInstanceReport
  **/

  public BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceReport getTransactionAuthorizationInstanceReport() {
    return transactionAuthorizationInstanceReport;
  }

  public void setTransactionAuthorizationInstanceReport(BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceReport transactionAuthorizationInstanceReport) {
    this.transactionAuthorizationInstanceReport = transactionAuthorizationInstanceReport;
  }


  /**
   * Get transactionAuthorizationInstanceAnalysis
   * @return transactionAuthorizationInstanceAnalysis
  **/

  public BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceAnalysis getTransactionAuthorizationInstanceAnalysis() {
    return transactionAuthorizationInstanceAnalysis;
  }

  public void setTransactionAuthorizationInstanceAnalysis(BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceAnalysis transactionAuthorizationInstanceAnalysis) {
    this.transactionAuthorizationInstanceAnalysis = transactionAuthorizationInstanceAnalysis;
  }


}

