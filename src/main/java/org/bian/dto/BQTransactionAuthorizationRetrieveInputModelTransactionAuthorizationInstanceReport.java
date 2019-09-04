package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceReport
 */
public class BQTransactionAuthorizationRetrieveInputModelTransactionAuthorizationInstanceReport   {
  private String transactionAuthorizationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transactionAuthorizationInstanceReportReference
  **/

  public String getTransactionAuthorizationInstanceReportReference() {
    return transactionAuthorizationInstanceReportReference;
  }

  public void setTransactionAuthorizationInstanceReportReference(String transactionAuthorizationInstanceReportReference) {
    this.transactionAuthorizationInstanceReportReference = transactionAuthorizationInstanceReportReference;
  }


}

