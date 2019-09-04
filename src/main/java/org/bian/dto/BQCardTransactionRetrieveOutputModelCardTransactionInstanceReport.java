package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport
 */
public class BQCardTransactionRetrieveOutputModelCardTransactionInstanceReport   {
  private Object cardTransactionInstanceReportRecord = null;

  private String cardTransactionInstanceReportType = null;

  private String cardTransactionInstanceReportParameters = null;

  private Object cardTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardTransactionInstanceReportRecord
  **/

  public Object getCardTransactionInstanceReportRecord() {
    return cardTransactionInstanceReportRecord;
  }

  public void setCardTransactionInstanceReportRecord(Object cardTransactionInstanceReportRecord) {
    this.cardTransactionInstanceReportRecord = cardTransactionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardTransactionInstanceReportType
  **/

  public String getCardTransactionInstanceReportType() {
    return cardTransactionInstanceReportType;
  }

  public void setCardTransactionInstanceReportType(String cardTransactionInstanceReportType) {
    this.cardTransactionInstanceReportType = cardTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardTransactionInstanceReportParameters
  **/

  public String getCardTransactionInstanceReportParameters() {
    return cardTransactionInstanceReportParameters;
  }

  public void setCardTransactionInstanceReportParameters(String cardTransactionInstanceReportParameters) {
    this.cardTransactionInstanceReportParameters = cardTransactionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardTransactionInstanceReport
  **/

  public Object getCardTransactionInstanceReport() {
    return cardTransactionInstanceReport;
  }

  public void setCardTransactionInstanceReport(Object cardTransactionInstanceReport) {
    this.cardTransactionInstanceReport = cardTransactionInstanceReport;
  }


}

