/**
 * @Title: [ContractCreateReq.java]
 * @Package: [com.qf.paydayloan.bizapp.vo.api.req]
 * @author: [LongshiWei]
 * @CreateDate: [2017/3/13 18:32]
 * @UpdateUser: [LongshiWei]
 * @UpdateDate: [2017/3/13 18:32]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [合同生成请求参数]
 * @version: [V1.0]
 */
package com.breeze.framework.entity;


/**
 * @author JuanChensh
 *
 */
public class ContractCreate  {
	private String name;
	private String ssn;
	private String phone;
	/**
	 * flag
	 */
	private String flag;
	/**
	 * loanId
	 */
	private String loanId;

	/**
	 * 证件类型
	 */
	
	private String certTypeName;

	/**
	 * 合同编号
	 */
	
	private String contCode;
	/**
	 * 合同签署日期
	 */
	
	private String contSignDate;
	/**
	 * 借款人住所
	 */
	
	private String address;

	/**
	 * 借款人收款账户户名
	 */
	private String loanBandDeptName;
	/**
	 * 借款人收款账户账号
	 */
	
	private String loanBandDeptAcnt;

	/**
	 * 借款人收款账户开户行
	 */
	
	private String loanBandDept;

	/**
	 * 借款人还款账户户名
	 */
	
	private String payBandDeptName;
	/**
	 * 借款人还款账户账号
	 */
	
	private String payBandDeptAcnt;
	/**
	 * 借款人还款账户开户行
	 */
	
	private String payBandDept;
	/**
	 * 借款年利率
	 */
	
	private String dayRate;

	/**
	 * 逾期总费率（合同中已带单位：%/日）
	 */
	
	private String overdueRateTotal;
	/**
	 * 逾期账户管理费率（合同中已带单位：%/日）
	 */
	
	private String overdueRateMgt;
	/**
	 * 逾期利息费率（合同中已带单位：%/日）
	 */
	
	private String overdueRateInst;
	/**
	 * 逾期最高费率上限（合同中已带单位：%）
	 */
	
	private String overdueRateLimt;
	/**
	 * 借款本金
	 */
	
	private String pricAmt;
	/**
	 * 借款咨询费
	 */
	
	private String cnstFee;
	/**
	 * 风险补偿金
	 */
	
	private String riskComp;
	/**
	 * 借款期限
	 */
	
	private String pmtDurDay;
	/**
	 * 放款时间
	 */
	
	private String lendDate;
	/**
	 * 还款金额
	 */
	
	private String pmtAmt;
	/**
	 * 还款日期
	 */
	
	private String pmtDay;

	/**
	 * 信息服务费
	 */
	
	private String infoServiceAmt;

	/**
	 * 乙方地址
	 */
	
	private String companyAddress;

	/**
	 * 贷后管理费
	 */
	
	private String postManagementAmt;
	
	
	
	/**
	 * @return the loanId
	 */
	public String getLoanId() {
		return loanId;
	}

	/**
	 * @param loanId the loanId to set
	 */
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	/**
	 * @return the certType.
	 */
	public String getCertTypeName() {
		return certTypeName;
	}

	/**
	 * @param certType
	 *            the certType to set
	 */
	public void setCertTypeName(String certTypeName) {
		this.certTypeName = certTypeName;
	}

	/**
	 * @return the contCode.
	 */
	public String getContCode() {
		return contCode;
	}

	/**
	 * @param contCode
	 *            the contCode to set
	 */
	public void setContCode(String contCode) {
		this.contCode = contCode;
	}

	/**
	 * @return the contSignDate.
	 */
	public String getContSignDate() {
		return contSignDate;
	}

	/**
	 * @param contSignDate
	 *            the contSignDate to set
	 */
	public void setContSignDate(String contSignDate) {
		this.contSignDate = contSignDate;
	}

	/**
	 * @return the address.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the loanBandDeptName.
	 */
	public String getLoanBandDeptName() {
		return loanBandDeptName;
	}

	/**
	 * @param loanBandDeptName
	 *            the loanBandDeptName to set
	 */
	public void setLoanBandDeptName(String loanBandDeptName) {
		this.loanBandDeptName = loanBandDeptName;
	}

	/**
	 * @return the loanBandDeptAcnt.
	 */
	public String getLoanBandDeptAcnt() {
		return loanBandDeptAcnt;
	}

	/**
	 * @param loanBandDeptAcnt
	 *            the loanBandDeptAcnt to set
	 */
	public void setLoanBandDeptAcnt(String loanBandDeptAcnt) {
		this.loanBandDeptAcnt = loanBandDeptAcnt;
	}

	/**
	 * @return the loanBandDept.
	 */
	public String getLoanBandDept() {
		return loanBandDept;
	}

	/**
	 * @param loanBandDept
	 *            the loanBandDept to set
	 */
	public void setLoanBandDept(String loanBandDept) {
		this.loanBandDept = loanBandDept;
	}

	/**
	 * @return the payBandDeptName.
	 */
	public String getPayBandDeptName() {
		return payBandDeptName;
	}

	/**
	 * @param payBandDeptName
	 *            the payBandDeptName to set
	 */
	public void setPayBandDeptName(String payBandDeptName) {
		this.payBandDeptName = payBandDeptName;
	}

	/**
	 * @return the payBandDeptAcnt.
	 */
	public String getPayBandDeptAcnt() {
		return payBandDeptAcnt;
	}

	/**
	 * @param payBandDeptAcnt
	 *            the payBandDeptAcnt to set
	 */
	public void setPayBandDeptAcnt(String payBandDeptAcnt) {
		this.payBandDeptAcnt = payBandDeptAcnt;
	}

	/**
	 * @return the payBandDept.
	 */
	public String getPayBandDept() {
		return payBandDept;
	}

	/**
	 * @param payBandDept
	 *            the payBandDept to set
	 */
	public void setPayBandDept(String payBandDept) {
		this.payBandDept = payBandDept;
	}

	public String getDayRate() {
		return dayRate;
	}

	public void setDayRate(String dayRate) {
		this.dayRate = dayRate;
	}

	public String getOverdueRateTotal() {
		return overdueRateTotal;
	}

	public void setOverdueRateTotal(String overdueRateTotal) {
		this.overdueRateTotal = overdueRateTotal;
	}

	public String getOverdueRateMgt() {
		return overdueRateMgt;
	}

	public void setOverdueRateMgt(String overdueRateMgt) {
		this.overdueRateMgt = overdueRateMgt;
	}

	public String getOverdueRateInst() {
		return overdueRateInst;
	}

	/**
	 * @param overdueRateInst
	 *            the overdueRateInst to set
	 */
	public void setOverdueRateInst(String overdueRateInst) {
		this.overdueRateInst = overdueRateInst;
	}

	/**
	 * @return the overdueRateLimt.
	 */
	public String getOverdueRateLimt() {
		return overdueRateLimt;
	}

	/**
	 * @param overdueRateLimt
	 *            the overdueRateLimt to set
	 */
	public void setOverdueRateLimt(String overdueRateLimt) {
		this.overdueRateLimt = overdueRateLimt;
	}

	/**
	 * @return the pricAmt.
	 */
	public String getPricAmt() {
		return pricAmt;
	}

	/**
	 * @param pricAmt
	 *            the pricAmt to set
	 */
	public void setPricAmt(String pricAmt) {
		this.pricAmt = pricAmt;
	}

	/**
	 * @return the cnstFee.
	 */
	public String getCnstFee() {
		return cnstFee;
	}

	/**
	 * @param cnstFee
	 *            the cnstFee to set
	 */
	public void setCnstFee(String cnstFee) {
		this.cnstFee = cnstFee;
	}

	/**
	 * @return the riskComp.
	 */
	public String getRiskComp() {
		return riskComp;
	}

	/**
	 * @param riskComp
	 *            the riskComp to set
	 */
	public void setRiskComp(String riskComp) {
		this.riskComp = riskComp;
	}

	/**
	 * @return the pmtDurDay.
	 */
	public String getPmtDurDay() {
		return pmtDurDay;
	}

	/**
	 * @param pmtDurDay
	 *            the pmtDurDay to set
	 */
	public void setPmtDurDay(String pmtDurDay) {
		this.pmtDurDay = pmtDurDay;
	}

	/**
	 * @return the lendDate.
	 */
	public String getLendDate() {
		return lendDate;
	}

	/**
	 * @param lendDate
	 *            the lendDate to set
	 */
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	/**
	 * @return the pmtAmt.
	 */
	public String getPmtAmt() {
		return pmtAmt;
	}

	/**
	 * @param pmtAmt
	 *            the pmtAmt to set
	 */
	public void setPmtAmt(String pmtAmt) {
		this.pmtAmt = pmtAmt;
	}

	/**
	 * @return the pmtDay.
	 */
	public String getPmtDay() {
		return pmtDay;
	}

	/**
	 * @param pmtDay
	 *            the pmtDay to set
	 */
	public void setPmtDay(String pmtDay) {
		this.pmtDay = pmtDay;
	}


	public String getInfoServiceAmt() {
		return infoServiceAmt;
	}

	public void setInfoServiceAmt(String infoServiceAmt) {
		this.infoServiceAmt = infoServiceAmt;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPostManagementAmt() {
		return postManagementAmt;
	}

	public void setPostManagementAmt(String postManagementAmt) {
		this.postManagementAmt = postManagementAmt;
	}

	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
}
