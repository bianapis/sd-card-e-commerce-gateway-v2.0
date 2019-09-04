package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionBatchRetrieveInputModelTransactionBatchInstanceAnalysis
 */
public class BQTransactionBatchRetrieveInputModelTransactionBatchInstanceAnalysis   {
  private String transactionBatchInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return transactionBatchInstanceAnalysisReference
  **/

  public String getTransactionBatchInstanceAnalysisReference() {
    return transactionBatchInstanceAnalysisReference;
  }

  public void setTransactionBatchInstanceAnalysisReference(String transactionBatchInstanceAnalysisReference) {
    this.transactionBatchInstanceAnalysisReference = transactionBatchInstanceAnalysisReference;
  }


}

