package com.xukaiqiang.entity.makeloancheck3;

public class SubList {

	// private String applicationWater;
	// private Integer subWater;
	// private String feeCode;
	// private Integer feeSubId;
	// private Integer version;
	// private String createDate;
	private String paymentType;
	// private String paymentFrom;
	// private String paymentDirection;
	// private String includeTo;
	// private String feeCalCode;
	// private String lastUpdateDate;
	// private Integer lastUpdateUserId;
	private Integer startPeriodNumber;
	private Integer stopPeriodNumber;
	private Integer feeProportion;
	// private Integer minFee;
	// private Integer maxFee;
	 private String isTotalFee;
	private Integer feeAmount;
	private Integer promotionPeriodFee;
	// private String promotionNumber;
	// private String promotionName;
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Integer getStartPeriodNumber() {
		return startPeriodNumber;
	}
	public void setStartPeriodNumber(Integer startPeriodNumber) {
		this.startPeriodNumber = startPeriodNumber;
	}
	public Integer getStopPeriodNumber() {
		return stopPeriodNumber;
	}
	public void setStopPeriodNumber(Integer stopPeriodNumber) {
		this.stopPeriodNumber = stopPeriodNumber;
	}
	public Integer getFeeProportion() {
		return feeProportion;
	}
	public void setFeeProportion(Integer feeProportion) {
		this.feeProportion = feeProportion;
	}
	public String getIsTotalFee() {
		return isTotalFee;
	}
	public void setIsTotalFee(String isTotalFee) {
		this.isTotalFee = isTotalFee;
	}
	public Integer getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(Integer feeAmount) {
		this.feeAmount = feeAmount;
	}
	public Integer getPromotionPeriodFee() {
		return promotionPeriodFee;
	}
	public void setPromotionPeriodFee(Integer promotionPeriodFee) {
		this.promotionPeriodFee = promotionPeriodFee;
	}


}
