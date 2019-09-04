package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveInputModelCardTransactionInstanceReport
 */
public class BQCardTransactionRetrieveInputModelCardTransactionInstanceReport   {
  private String cardTransactionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cardTransactionInstanceReportReference
  **/

  public String getCardTransactionInstanceReportReference() {
    return cardTransactionInstanceReportReference;
  }

  public void setCardTransactionInstanceReportReference(String cardTransactionInstanceReportReference) {
    this.cardTransactionInstanceReportReference = cardTransactionInstanceReportReference;
  }


}

