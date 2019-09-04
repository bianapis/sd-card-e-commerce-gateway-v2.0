package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceAnalysis;
import org.bian.dto.CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionRetrieveInputModel
 */
public class CReCommerceGatewayOperatingSessionRetrieveInputModel   {
  private Object eCommerceGatewayOperatingSessionRetrieveActionTaskRecord = null;

  private String eCommerceGatewayOperatingSessionRetrieveActionRequest = null;

  private CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceReportRecord eCommerceGatewayOperatingSessionInstanceReportRecord = null;

  private CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceAnalysis eCommerceGatewayOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eCommerceGatewayOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getECommerceGatewayOperatingSessionRetrieveActionTaskRecord() {
    return eCommerceGatewayOperatingSessionRetrieveActionTaskRecord;
  }

  public void setECommerceGatewayOperatingSessionRetrieveActionTaskRecord(Object eCommerceGatewayOperatingSessionRetrieveActionTaskRecord) {
    this.eCommerceGatewayOperatingSessionRetrieveActionTaskRecord = eCommerceGatewayOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return eCommerceGatewayOperatingSessionRetrieveActionRequest
  **/

  public String getECommerceGatewayOperatingSessionRetrieveActionRequest() {
    return eCommerceGatewayOperatingSessionRetrieveActionRequest;
  }

  public void setECommerceGatewayOperatingSessionRetrieveActionRequest(String eCommerceGatewayOperatingSessionRetrieveActionRequest) {
    this.eCommerceGatewayOperatingSessionRetrieveActionRequest = eCommerceGatewayOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get eCommerceGatewayOperatingSessionInstanceReportRecord
   * @return eCommerceGatewayOperatingSessionInstanceReportRecord
  **/

  public CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceReportRecord getECommerceGatewayOperatingSessionInstanceReportRecord() {
    return eCommerceGatewayOperatingSessionInstanceReportRecord;
  }

  public void setECommerceGatewayOperatingSessionInstanceReportRecord(CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceReportRecord eCommerceGatewayOperatingSessionInstanceReportRecord) {
    this.eCommerceGatewayOperatingSessionInstanceReportRecord = eCommerceGatewayOperatingSessionInstanceReportRecord;
  }


  /**
   * Get eCommerceGatewayOperatingSessionInstanceAnalysis
   * @return eCommerceGatewayOperatingSessionInstanceAnalysis
  **/

  public CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceAnalysis getECommerceGatewayOperatingSessionInstanceAnalysis() {
    return eCommerceGatewayOperatingSessionInstanceAnalysis;
  }

  public void setECommerceGatewayOperatingSessionInstanceAnalysis(CReCommerceGatewayOperatingSessionRetrieveInputModelECommerceGatewayOperatingSessionInstanceAnalysis eCommerceGatewayOperatingSessionInstanceAnalysis) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysis = eCommerceGatewayOperatingSessionInstanceAnalysis;
  }


}

