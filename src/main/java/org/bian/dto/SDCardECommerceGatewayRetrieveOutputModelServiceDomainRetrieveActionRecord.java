package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis;
import org.bian.dto.SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecord
 */
public class SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecord   {
  private SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  private SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  private SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/

  public SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }


  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/

  public SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCardECommerceGatewayRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

