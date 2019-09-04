package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceAnalysis;
import org.bian.dto.BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionBatchRetrieveOutputModel
 */
public class BQTransactionBatchRetrieveOutputModel   {
  private Object eCommerceGatewayOperatingSessionInstanceRecord = null;

  private Object transactionBatchInstanceRecord = null;

  private String transactionBatchRetrieveActionTaskReference = null;

  private Object transactionBatchRetrieveActionTaskRecord = null;

  private String transactionBatchRetrieveActionResponse = null;

  private BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceReport transactionBatchInstanceReport = null;

  private BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceAnalysis transactionBatchInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The eCommerce Gateway operational service session productInstanceReference:  type: string  example: \"732426\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Reference to the card product identifier/number customerReference:  type: string  example: \"757416\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: The card holder as detailed on the plastic cardexpirationdate:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: As detailed on the plastic/token cardCVV:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: As detailed on the plastic/token cardIssuingBankReference:  type: string  example: \"744799\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the card holder's issuing bank merchantAcquiringBankReference:  type: string  example: \"755602\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant's acquiring bank eCommerceTransactionType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The type of transaction (purchase, cash advance, etc.) eCommerceTransactionCurrency:  type: string  example: USD  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency    general-info: The currency that the transaction is made in eCommerceTransactionAmountType:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Type of amount (e.g. original amount, billing currency amount, conversion rate, FX Mark-up) eCommerceTransactionAmount:  type: string  example: USD 250  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount    general-info: The amount corresponding to the type eCommerceTransactionMerchantReference:  type: string  example: \"771977\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant initiating the transaction eCommerceTransactionLocationReference:  type: string  example: \"773938\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the point of sale location eCommerceTransactionProductServiceReference:  type: string  example: \"738314\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Details of the transaction (e.g. purchased service/product, purpose) eCommerceTransactionDateTime:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: Significant dates and times associated with the transaction 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Handling data items for a batch/collection of transactions submitted for a merchant eCommerceBatchTransactionDateTime:  type: string  example: \"09-22-2018\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime    general-info: Significant dates and times associated with the batch transaction transactionMerchantReference:  type: string  example: \"784696\"  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    general-info: Refers to the merchant initiating the batch eCommerceBatchTransactionRecord:  type: object  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary    general-info: Batch record contains multiple Card Transactions 
   * @return transactionBatchInstanceRecord
  **/

  public Object getTransactionBatchInstanceRecord() {
    return transactionBatchInstanceRecord;
  }

  public void setTransactionBatchInstanceRecord(Object transactionBatchInstanceRecord) {
    this.transactionBatchInstanceRecord = transactionBatchInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Batch instance retrieve service call 
   * @return transactionBatchRetrieveActionTaskReference
  **/

  public String getTransactionBatchRetrieveActionTaskReference() {
    return transactionBatchRetrieveActionTaskReference;
  }

  public void setTransactionBatchRetrieveActionTaskReference(String transactionBatchRetrieveActionTaskReference) {
    this.transactionBatchRetrieveActionTaskReference = transactionBatchRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionBatchRetrieveActionTaskRecord
  **/

  public Object getTransactionBatchRetrieveActionTaskRecord() {
    return transactionBatchRetrieveActionTaskRecord;
  }

  public void setTransactionBatchRetrieveActionTaskRecord(Object transactionBatchRetrieveActionTaskRecord) {
    this.transactionBatchRetrieveActionTaskRecord = transactionBatchRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionBatchRetrieveActionResponse
  **/

  public String getTransactionBatchRetrieveActionResponse() {
    return transactionBatchRetrieveActionResponse;
  }

  public void setTransactionBatchRetrieveActionResponse(String transactionBatchRetrieveActionResponse) {
    this.transactionBatchRetrieveActionResponse = transactionBatchRetrieveActionResponse;
  }


  /**
   * Get transactionBatchInstanceReport
   * @return transactionBatchInstanceReport
  **/

  public BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceReport getTransactionBatchInstanceReport() {
    return transactionBatchInstanceReport;
  }

  public void setTransactionBatchInstanceReport(BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceReport transactionBatchInstanceReport) {
    this.transactionBatchInstanceReport = transactionBatchInstanceReport;
  }


  /**
   * Get transactionBatchInstanceAnalysis
   * @return transactionBatchInstanceAnalysis
  **/

  public BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceAnalysis getTransactionBatchInstanceAnalysis() {
    return transactionBatchInstanceAnalysis;
  }

  public void setTransactionBatchInstanceAnalysis(BQTransactionBatchRetrieveOutputModelTransactionBatchInstanceAnalysis transactionBatchInstanceAnalysis) {
    this.transactionBatchInstanceAnalysis = transactionBatchInstanceAnalysis;
  }


}

