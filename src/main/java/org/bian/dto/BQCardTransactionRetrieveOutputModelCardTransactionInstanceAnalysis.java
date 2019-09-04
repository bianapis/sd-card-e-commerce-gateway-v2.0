package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis
 */
public class BQCardTransactionRetrieveOutputModelCardTransactionInstanceAnalysis   {
  private Object cardTransactionInstanceAnalysisRecord = null;

  private String cardTransactionInstanceAnalysisReportType = null;

  private String cardTransactionInstanceAnalysisParameters = null;

  private Object cardTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cardTransactionInstanceAnalysisRecord
  **/

  public Object getCardTransactionInstanceAnalysisRecord() {
    return cardTransactionInstanceAnalysisRecord;
  }

  public void setCardTransactionInstanceAnalysisRecord(Object cardTransactionInstanceAnalysisRecord) {
    this.cardTransactionInstanceAnalysisRecord = cardTransactionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cardTransactionInstanceAnalysisReportType
  **/

  public String getCardTransactionInstanceAnalysisReportType() {
    return cardTransactionInstanceAnalysisReportType;
  }

  public void setCardTransactionInstanceAnalysisReportType(String cardTransactionInstanceAnalysisReportType) {
    this.cardTransactionInstanceAnalysisReportType = cardTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cardTransactionInstanceAnalysisParameters
  **/

  public String getCardTransactionInstanceAnalysisParameters() {
    return cardTransactionInstanceAnalysisParameters;
  }

  public void setCardTransactionInstanceAnalysisParameters(String cardTransactionInstanceAnalysisParameters) {
    this.cardTransactionInstanceAnalysisParameters = cardTransactionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cardTransactionInstanceAnalysisReport
  **/

  public Object getCardTransactionInstanceAnalysisReport() {
    return cardTransactionInstanceAnalysisReport;
  }

  public void setCardTransactionInstanceAnalysisReport(Object cardTransactionInstanceAnalysisReport) {
    this.cardTransactionInstanceAnalysisReport = cardTransactionInstanceAnalysisReport;
  }


}

