package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardTransactionRetrieveInputModelCardTransactionInstanceAnalysis;
import org.bian.dto.BQCardTransactionRetrieveInputModelCardTransactionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveInputModel
 */
public class BQCardTransactionRetrieveInputModel   {
  private Object cardTransactionRetrieveActionTaskRecord = null;

  private String cardTransactionRetrieveActionRequest = null;

  private BQCardTransactionRetrieveInputModelCardTransactionInstanceReport cardTransactionInstanceReport = null;

  private BQCardTransactionRetrieveInputModelCardTransactionInstanceAnalysis cardTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardTransactionRetrieveActionTaskRecord
  **/

  public Object getCardTransactionRetrieveActionTaskRecord() {
    return cardTransactionRetrieveActionTaskRecord;
  }

  public void setCardTransactionRetrieveActionTaskRecord(Object cardTransactionRetrieveActionTaskRecord) {
    this.cardTransactionRetrieveActionTaskRecord = cardTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardTransactionRetrieveActionRequest
  **/

  public String getCardTransactionRetrieveActionRequest() {
    return cardTransactionRetrieveActionRequest;
  }

  public void setCardTransactionRetrieveActionRequest(String cardTransactionRetrieveActionRequest) {
    this.cardTransactionRetrieveActionRequest = cardTransactionRetrieveActionRequest;
  }


  /**
   * Get cardTransactionInstanceReport
   * @return cardTransactionInstanceReport
  **/

  public BQCardTransactionRetrieveInputModelCardTransactionInstanceReport getCardTransactionInstanceReport() {
    return cardTransactionInstanceReport;
  }

  public void setCardTransactionInstanceReport(BQCardTransactionRetrieveInputModelCardTransactionInstanceReport cardTransactionInstanceReport) {
    this.cardTransactionInstanceReport = cardTransactionInstanceReport;
  }


  /**
   * Get cardTransactionInstanceAnalysis
   * @return cardTransactionInstanceAnalysis
  **/

  public BQCardTransactionRetrieveInputModelCardTransactionInstanceAnalysis getCardTransactionInstanceAnalysis() {
    return cardTransactionInstanceAnalysis;
  }

  public void setCardTransactionInstanceAnalysis(BQCardTransactionRetrieveInputModelCardTransactionInstanceAnalysis cardTransactionInstanceAnalysis) {
    this.cardTransactionInstanceAnalysis = cardTransactionInstanceAnalysis;
  }


}

