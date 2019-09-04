package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceAnalysis
 */
public class BQCardAuthenticationRetrieveInputModelCardAuthenticationInstanceAnalysis   {
  private String cardAuthenticationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cardAuthenticationInstanceAnalysisReference
  **/

  public String getCardAuthenticationInstanceAnalysisReference() {
    return cardAuthenticationInstanceAnalysisReference;
  }

  public void setCardAuthenticationInstanceAnalysisReference(String cardAuthenticationInstanceAnalysisReference) {
    this.cardAuthenticationInstanceAnalysisReference = cardAuthenticationInstanceAnalysisReference;
  }


}

