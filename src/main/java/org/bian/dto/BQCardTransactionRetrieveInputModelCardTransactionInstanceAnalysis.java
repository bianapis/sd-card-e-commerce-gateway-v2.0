package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardTransactionRetrieveInputModelCardTransactionInstanceAnalysis
 */
public class BQCardTransactionRetrieveInputModelCardTransactionInstanceAnalysis   {
  private String cardTransactionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardTransactionInstanceAnalysisReference
  **/

  public String getCardTransactionInstanceAnalysisReference() {
    return cardTransactionInstanceAnalysisReference;
  }

  public void setCardTransactionInstanceAnalysisReference(String cardTransactionInstanceAnalysisReference) {
    this.cardTransactionInstanceAnalysisReference = cardTransactionInstanceAnalysisReference;
  }


}

