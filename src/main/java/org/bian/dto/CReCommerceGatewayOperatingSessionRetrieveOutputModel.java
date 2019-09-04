package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceAnalysis;
import org.bian.dto.CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CReCommerceGatewayOperatingSessionRetrieveOutputModel
 */
public class CReCommerceGatewayOperatingSessionRetrieveOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private String eCommerceGatewayOperatingSessionRetrieveActionTaskReference = null;

  private Object eCommerceGatewayOperatingSessionRetrieveActionTaskRecord = null;

  private String eCommerceGatewayOperatingSessionRetrieveActionResponse = null;

  private CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceReportRecord eCommerceGatewayOperatingSessionInstanceReportRecord = null;

  private CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceAnalysis eCommerceGatewayOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The eCommerce Gateway operational service session 
   * @return eCommerceGatewayOperatingSessionInstanceRecord
  **/

  public Object getECommerceGatewayOperatingSessionInstanceRecord() {
    return eCommerceGatewayOperatingSessionInstanceRecord;
  }
   
  @JsonProperty("eCommerceGatewayOperatingSessionInstanceRecord")
  public void setECommerceGatewayOperatingSessionInstanceRecord(Object eCommerceGatewayOperatingSessionInstanceRecord) {
    this.eCommerceGatewayOperatingSessionInstanceRecord = eCommerceGatewayOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a eCommerce Gateway Operating Session instance retrieve service call 
   * @return eCommerceGatewayOperatingSessionRetrieveActionTaskReference
  **/

  public String getECommerceGatewayOperatingSessionRetrieveActionTaskReference() {
    return eCommerceGatewayOperatingSessionRetrieveActionTaskReference;
  }
   @JsonProperty("eCommerceGatewayOperatingSessionRetrieveActionTaskReference")
  public void setECommerceGatewayOperatingSessionRetrieveActionTaskReference(String eCommerceGatewayOperatingSessionRetrieveActionTaskReference) {
    this.eCommerceGatewayOperatingSessionRetrieveActionTaskReference = eCommerceGatewayOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eCommerceGatewayOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getECommerceGatewayOperatingSessionRetrieveActionTaskRecord() {
    return eCommerceGatewayOperatingSessionRetrieveActionTaskRecord;
  }
   
  @JsonProperty("eCommerceGatewayOperatingSessionRetrieveActionTaskRecord")
  public void setECommerceGatewayOperatingSessionRetrieveActionTaskRecord(Object eCommerceGatewayOperatingSessionRetrieveActionTaskRecord) {
    this.eCommerceGatewayOperatingSessionRetrieveActionTaskRecord = eCommerceGatewayOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return eCommerceGatewayOperatingSessionRetrieveActionResponse
  **/

  public String getECommerceGatewayOperatingSessionRetrieveActionResponse() {
    return eCommerceGatewayOperatingSessionRetrieveActionResponse;
  }
   @JsonProperty("eCommerceGatewayOperatingSessionRetrieveActionResponse")
  public void setECommerceGatewayOperatingSessionRetrieveActionResponse(String eCommerceGatewayOperatingSessionRetrieveActionResponse) {
    this.eCommerceGatewayOperatingSessionRetrieveActionResponse = eCommerceGatewayOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get eCommerceGatewayOperatingSessionInstanceReportRecord
   * @return eCommerceGatewayOperatingSessionInstanceReportRecord
  **/

  public CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceReportRecord getECommerceGatewayOperatingSessionInstanceReportRecord() {
    return eCommerceGatewayOperatingSessionInstanceReportRecord;
  }
  
   @JsonProperty("eCommerceGatewayOperatingSessionInstanceReportRecord")
  public void setECommerceGatewayOperatingSessionInstanceReportRecord(CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceReportRecord eCommerceGatewayOperatingSessionInstanceReportRecord) {
    this.eCommerceGatewayOperatingSessionInstanceReportRecord = eCommerceGatewayOperatingSessionInstanceReportRecord;
  }


  /**
   * Get eCommerceGatewayOperatingSessionInstanceAnalysis
   * @return eCommerceGatewayOperatingSessionInstanceAnalysis
  **/

  public CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceAnalysis getECommerceGatewayOperatingSessionInstanceAnalysis() {
    return eCommerceGatewayOperatingSessionInstanceAnalysis;
  }
  
    @JsonProperty("eCommerceGatewayOperatingSessionInstanceAnalysis")
  public void setECommerceGatewayOperatingSessionInstanceAnalysis(CReCommerceGatewayOperatingSessionRetrieveOutputModelECommerceGatewayOperatingSessionInstanceAnalysis eCommerceGatewayOperatingSessionInstanceAnalysis) {
    this.eCommerceGatewayOperatingSessionInstanceAnalysis = eCommerceGatewayOperatingSessionInstanceAnalysis;
  }


}

