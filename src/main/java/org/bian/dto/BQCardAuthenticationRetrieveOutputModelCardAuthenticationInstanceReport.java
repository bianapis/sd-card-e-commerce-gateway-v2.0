package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceReport
 */
public class BQCardAuthenticationRetrieveOutputModelCardAuthenticationInstanceReport   {
  private Object cardAuthenticationInstanceReportRecord = null;

  private String cardAuthenticationInstanceReportType = null;

  private String cardAuthenticationInstanceReportParameters = null;

  private Object cardAuthenticationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cardAuthenticationInstanceReportRecord
  **/

  public Object getCardAuthenticationInstanceReportRecord() {
    return cardAuthenticationInstanceReportRecord;
  }

  public void setCardAuthenticationInstanceReportRecord(Object cardAuthenticationInstanceReportRecord) {
    this.cardAuthenticationInstanceReportRecord = cardAuthenticationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cardAuthenticationInstanceReportType
  **/

  public String getCardAuthenticationInstanceReportType() {
    return cardAuthenticationInstanceReportType;
  }

  public void setCardAuthenticationInstanceReportType(String cardAuthenticationInstanceReportType) {
    this.cardAuthenticationInstanceReportType = cardAuthenticationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cardAuthenticationInstanceReportParameters
  **/

  public String getCardAuthenticationInstanceReportParameters() {
    return cardAuthenticationInstanceReportParameters;
  }

  public void setCardAuthenticationInstanceReportParameters(String cardAuthenticationInstanceReportParameters) {
    this.cardAuthenticationInstanceReportParameters = cardAuthenticationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cardAuthenticationInstanceReport
  **/

  public Object getCardAuthenticationInstanceReport() {
    return cardAuthenticationInstanceReport;
  }

  public void setCardAuthenticationInstanceReport(Object cardAuthenticationInstanceReport) {
    this.cardAuthenticationInstanceReport = cardAuthenticationInstanceReport;
  }


}

