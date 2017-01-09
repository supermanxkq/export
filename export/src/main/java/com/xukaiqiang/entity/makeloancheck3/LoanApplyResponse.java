package com.xukaiqiang.entity.makeloancheck3;

public class LoanApplyResponse {

    private String applicationWater;
    private Integer version;
    private String applyDate;
    private String applyTime;
    private String organizationNo;
    private String createDate;
    private Integer lastUpdateUserId;
    private String lastUpdateDate;
    private String status;
    private String cuMaNa;
    private String customerNo;
    private String customerName;
    private String loanKindCode;
    private String loanTypeNo;
    private Integer loanTypeId;
    private String loanUseCode;
    private String loanUseExplain;
    private String materialNo;
    private String loanInChannelCode;
    private String comment;
    private AccountList AccountList;
    private FeeList FeeList;//费用信息
    private SubList SubList;
    private MaterialList MaterialList;//资料相关
    private GoodsList GoodsList;//商品列表
    private LoanApplyPeopleOfZS LoanApplyPeopleOfZS;//主申请人
    private PersonListOfGS  PersonListOfGS;  //共同申请人
    private LoanApplyContract  LoanApplyContract;//合同

    public LoanApplyContract getLoanApplyContract() {
		return LoanApplyContract;
	}

	public void setLoanApplyContract(LoanApplyContract loanApplyContract) {
		LoanApplyContract = loanApplyContract;
	}

	public AccountList getAccountList() {
		return AccountList;
	}

	public void setAccountList(AccountList accountList) {
		AccountList = accountList;
	}

	public FeeList getFeeList() {
		return FeeList;
	}

	public void setFeeList(FeeList feeList) {
		FeeList = feeList;
	}

	public SubList getSubList() {
		return SubList;
	}

	public void setSubList(SubList subList) {
		SubList = subList;
	}

	public MaterialList getMaterialList() {
		return MaterialList;
	}

	public void setMaterialList(MaterialList materialList) {
		MaterialList = materialList;
	}

	public GoodsList getGoodsList() {
		return GoodsList;
	}

	public void setGoodsList(GoodsList goodsList) {
		GoodsList = goodsList;
	}

	public LoanApplyPeopleOfZS getLoanApplyPeopleOfZS() {
		return LoanApplyPeopleOfZS;
	}

	public void setLoanApplyPeopleOfZS(LoanApplyPeopleOfZS loanApplyPeopleOfZS) {
		LoanApplyPeopleOfZS = loanApplyPeopleOfZS;
	}

	public PersonListOfGS getPersonListOfGS() {
		return PersonListOfGS;
	}

	public void setPersonListOfGS(PersonListOfGS personListOfGS) {
		PersonListOfGS = personListOfGS;
	}


    public String getApplicationWater() {
        return applicationWater;
    }

    public void setApplicationWater(String applicationWater) {
        this.applicationWater = applicationWater;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Integer lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCuMaNa() {
        return cuMaNa;
    }

    public void setCuMaNa(String cuMaNa) {
        this.cuMaNa = cuMaNa;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLoanKindCode() {
        return loanKindCode;
    }

    public void setLoanKindCode(String loanKindCode) {
        this.loanKindCode = loanKindCode;
    }

    public String getLoanTypeNo() {
        return loanTypeNo;
    }

    public void setLoanTypeNo(String loanTypeNo) {
        this.loanTypeNo = loanTypeNo;
    }

    public Integer getLoanTypeId() {
        return loanTypeId;
    }

    public void setLoanTypeId(Integer loanTypeId) {
        this.loanTypeId = loanTypeId;
    }

    public String getLoanUseCode() {
        return loanUseCode;
    }

    public void setLoanUseCode(String loanUseCode) {
        this.loanUseCode = loanUseCode;
    }

    public String getLoanUseExplain() {
        return loanUseExplain;
    }

    public void setLoanUseExplain(String loanUseExplain) {
        this.loanUseExplain = loanUseExplain;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    public String getLoanInChannelCode() {
        return loanInChannelCode;
    }

    public void setLoanInChannelCode(String loanInChannelCode) {
        this.loanInChannelCode = loanInChannelCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
