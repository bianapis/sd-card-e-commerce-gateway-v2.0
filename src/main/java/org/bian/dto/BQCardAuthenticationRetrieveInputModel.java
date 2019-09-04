package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceAnalysis;
import org.bian.dto.BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCardAuthenticationRetrieveInputModel
 */
public class BQCardAuthenticationRetrieveInputModel   {
  private Object cardAuthenticationRetrieveActionTaskRecord = null;

  private String cardAuthenticationRetrieveActionRequest = null;

  private BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceReport cardAuthenticationInstanceReport = null;

  private BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceAnalysis cardAuthenticationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardAuthenticationRetrieveActionTaskRecord
  **/

  public Object getCardAuthenticationRetrieveActionTaskRecord() {
    return cardAuthenticationRetrieveActionTaskRecord;
  }

  public void setCardAuthenticationRetrieveActionTaskRecord(Object cardAuthenticationRetrieveActionTaskRecord) {
    this.cardAuthenticationRetrieveActionTaskRecord = cardAuthenticationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardAuthenticationRetrieveActionRequest
  **/

  public String getCardAuthenticationRetrieveActionRequest() {
    return cardAuthenticationRetrieveActionRequest;
  }

  public void setCardAuthenticationRetrieveActionRequest(String cardAuthenticationRetrieveActionRequest) {
    this.cardAuthenticationRetrieveActionRequest = cardAuthenticationRetrieveActionRequest;
  }


  /**
   * Get cardAuthenticationInstanceReport
   * @return cardAuthenticationInstanceReport
  **/

  public BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceReport getCardAuthenticationInstanceReport() {
    return cardAuthenticationInstanceReport;
  }

  public void setCardAuthenticationInstanceReport(BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceReport cardAuthenticationInstanceReport) {
    this.cardAuthenticationInstanceReport = cardAuthenticationInstanceReport;
  }


  /**
   * Get cardAuthenticationInstanceAnalysis
   * @return cardAuthenticationInstanceAnalysis
  **/

  public BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceAnalysis getCardAuthenticationInstanceAnalysis() {
    return cardAuthenticationInstanceAnalysis;
  }

  public void setCardAuthenticationInstanceAnalysis(BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceAnalysis cardAuthenticationInstanceAnalysis) {
    this.cardAuthenticationInstanceAnalysis = cardAuthenticationInstanceAnalysis;
  }


}

