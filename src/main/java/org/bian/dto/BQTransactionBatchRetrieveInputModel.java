package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionBatchRetrieveInputModelTransactionBatchInstanceAnalysis;
import org.bian.dto.BQTransactionBatchRetrieveInputModelTransactionBatchInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionBatchRetrieveInputModel
 */
public class BQTransactionBatchRetrieveInputModel   {
  private Object transactionBatchRetrieveActionTaskRecord = null;

  private String transactionBatchRetrieveActionRequest = null;

  private BQTransactionBatchRetrieveInputModelTransactionBatchInstanceReport transactionBatchInstanceReport = null;

  private BQTransactionBatchRetrieveInputModelTransactionBatchInstanceAnalysis transactionBatchInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionBatchRetrieveActionTaskRecord
  **/

  public Object getTransactionBatchRetrieveActionTaskRecord() {
    return transactionBatchRetrieveActionTaskRecord;
  }

  public void setTransactionBatchRetrieveActionTaskRecord(Object transactionBatchRetrieveActionTaskRecord) {
    this.transactionBatchRetrieveActionTaskRecord = transactionBatchRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionBatchRetrieveActionRequest
  **/

  public String getTransactionBatchRetrieveActionRequest() {
    return transactionBatchRetrieveActionRequest;
  }

  public void setTransactionBatchRetrieveActionRequest(String transactionBatchRetrieveActionRequest) {
    this.transactionBatchRetrieveActionRequest = transactionBatchRetrieveActionRequest;
  }


  /**
   * Get transactionBatchInstanceReport
   * @return transactionBatchInstanceReport
  **/

  public BQTransactionBatchRetrieveInputModelTransactionBatchInstanceReport getTransactionBatchInstanceReport() {
    return transactionBatchInstanceReport;
  }

  public void setTransactionBatchInstanceReport(BQTransactionBatchRetrieveInputModelTransactionBatchInstanceReport transactionBatchInstanceReport) {
    this.transactionBatchInstanceReport = transactionBatchInstanceReport;
  }


  /**
   * Get transactionBatchInstanceAnalysis
   * @return transactionBatchInstanceAnalysis
  **/

  public BQTransactionBatchRetrieveInputModelTransactionBatchInstanceAnalysis getTransactionBatchInstanceAnalysis() {
    return transactionBatchInstanceAnalysis;
  }

  public void setTransactionBatchInstanceAnalysis(BQTransactionBatchRetrieveInputModelTransactionBatchInstanceAnalysis transactionBatchInstanceAnalysis) {
    this.transactionBatchInstanceAnalysis = transactionBatchInstanceAnalysis;
  }


}

