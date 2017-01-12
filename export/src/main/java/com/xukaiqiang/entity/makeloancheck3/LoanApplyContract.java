package com.xukaiqiang.entity.makeloancheck3;

public class LoanApplyContract {

//    private String applicationWater;
//    private Integer version;
//    private String createDate;
//    private String createDateAt;
//    private Integer lastUpdateUserId;
//    private String laUpDt;
//    private String laUpDtAt;
    private String contractNumber;
//    private Integer contractAmount;
    private Integer executionRateFirstLoan;
//    private String ratePatternCode;
//    private String loRtAdjTyCd;
//    private String rateTypeNumber;
//    private Integer loanBaseRate;
//    private Integer payFreQt;
//    private String payFreCd;
//    private String paymentDateCode;
//    private String loCoMakeYn;
//    private Integer loanPayDay;
//    private String loOneMlYn;
//    private Integer loMlAm;
//    private String lastUpdateDate;
//    private String paymentSpace;

    
    
	public String getContractNumber() {
		return contractNumber;
	}

	public Integer getExecutionRateFirstLoan() {
		return executionRateFirstLoan;
	}

	public void setExecutionRateFirstLoan(Integer executionRateFirstLoan) {
		this.executionRateFirstLoan = executionRateFirstLoan;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

}

