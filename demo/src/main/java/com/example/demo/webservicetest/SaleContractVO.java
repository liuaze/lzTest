
package com.example.demo.webservicetest;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>saleContractVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="saleContractVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="caoEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="caoSta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="conNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contract_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custmerContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealer_Settlement_Rule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generateElecUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generateElecUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IFj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifcontact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit_ration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settleRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlement_end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="settlement_start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signCu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signPeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signPeoDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signPeoDescribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text_ContractT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradingDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradingPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradingVariety" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saleContractVO", propOrder = {
    "approvalStatus",
    "contracttempdata1",
    "contracttempdata10",
    "contracttempdata2",
    "contracttempdata3",
    "contracttempdata4",
    "contracttempdata5",
    "contracttempdata6",
    "contracttempdata7",
    "contracttempdata8",
    "contracttempdata9",
    "caoEnd",
    "caoSta",
    "conNo",
    "contractType",
    "createTime",
    "creator",
    "creatorId",
    "custmerContact",
    "dealerSettlementRule",
    "generateElecUnit",
    "generateElecUnitId",
    "iFj",
    "id",
    "ifcontact",
    "limitRation",
    "modifier",
    "modifierId",
    "modifyTime",
    "no",
    "name",
    "notification",
    "persent",
    "settleRules",
    "settlementEndDate",
    "settlementStartDate",
    "signCu",
    "signDate",
    "signPeo",
    "signPeoDepartmentCode",
    "signPeoDescribe",
    "signType",
    "status",
    "textContractT",
    "totalAmount",
    "tradingDirection",
    "tradingPrice",
    "tradingVariety",
    "unitName"
})
public class SaleContractVO {

    protected String approvalStatus;
    @XmlElement(name = "CONTRACT_TEMPDATA1")
    protected String contracttempdata1;
    @XmlElement(name = "CONTRACT_TEMPDATA10")
    protected String contracttempdata10;
    @XmlElement(name = "CONTRACT_TEMPDATA2")
    protected String contracttempdata2;
    @XmlElement(name = "CONTRACT_TEMPDATA3")
    protected String contracttempdata3;
    @XmlElement(name = "CONTRACT_TEMPDATA4")
    protected String contracttempdata4;
    @XmlElement(name = "CONTRACT_TEMPDATA5")
    protected String contracttempdata5;
    @XmlElement(name = "CONTRACT_TEMPDATA6")
    protected String contracttempdata6;
    @XmlElement(name = "CONTRACT_TEMPDATA7")
    protected String contracttempdata7;
    @XmlElement(name = "CONTRACT_TEMPDATA8")
    protected String contracttempdata8;
    @XmlElement(name = "CONTRACT_TEMPDATA9")
    protected BigDecimal contracttempdata9;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caoEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caoSta;
    protected String conNo;
    @XmlElement(name = "contract_Type")
    protected String contractType;
    protected String createTime;
    protected String creator;
    protected String creatorId;
    protected String custmerContact;
    @XmlElement(name = "dealer_Settlement_Rule")
    protected String dealerSettlementRule;
    protected String generateElecUnit;
    protected String generateElecUnitId;
    @XmlElement(name = "IFj")
    protected String iFj;
    protected String id;
    protected String ifcontact;
    @XmlElement(name = "limit_ration")
    protected String limitRation;
    protected String modifier;
    protected String modifierId;
    protected String modifyTime;
    @XmlElement(name = "NO")
    protected String no;
    protected String name;
    protected String notification;
    protected String persent;
    protected String settleRules;
    @XmlElement(name = "settlement_end_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementEndDate;
    @XmlElement(name = "settlement_start_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementStartDate;
    protected String signCu;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    protected String signPeo;
    protected String signPeoDepartmentCode;
    protected String signPeoDescribe;
    protected String signType;
    protected String status;
    @XmlElement(name = "text_ContractT")
    protected String textContractT;
    @XmlElement(name = "total_Amount")
    protected String totalAmount;
    protected String tradingDirection;
    protected String tradingPrice;
    protected String tradingVariety;
    protected String unitName;

    /**
     * 获取approvalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置approvalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * 获取contracttempdata1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA1() {
        return contracttempdata1;
    }

    /**
     * 设置contracttempdata1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA1(String value) {
        this.contracttempdata1 = value;
    }

    /**
     * 获取contracttempdata10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA10() {
        return contracttempdata10;
    }

    /**
     * 设置contracttempdata10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA10(String value) {
        this.contracttempdata10 = value;
    }

    /**
     * 获取contracttempdata2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA2() {
        return contracttempdata2;
    }

    /**
     * 设置contracttempdata2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA2(String value) {
        this.contracttempdata2 = value;
    }

    /**
     * 获取contracttempdata3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA3() {
        return contracttempdata3;
    }

    /**
     * 设置contracttempdata3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA3(String value) {
        this.contracttempdata3 = value;
    }

    /**
     * 获取contracttempdata4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA4() {
        return contracttempdata4;
    }

    /**
     * 设置contracttempdata4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA4(String value) {
        this.contracttempdata4 = value;
    }

    /**
     * 获取contracttempdata5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA5() {
        return contracttempdata5;
    }

    /**
     * 设置contracttempdata5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA5(String value) {
        this.contracttempdata5 = value;
    }

    /**
     * 获取contracttempdata6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA6() {
        return contracttempdata6;
    }

    /**
     * 设置contracttempdata6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA6(String value) {
        this.contracttempdata6 = value;
    }

    /**
     * 获取contracttempdata7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA7() {
        return contracttempdata7;
    }

    /**
     * 设置contracttempdata7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA7(String value) {
        this.contracttempdata7 = value;
    }

    /**
     * 获取contracttempdata8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTTEMPDATA8() {
        return contracttempdata8;
    }

    /**
     * 设置contracttempdata8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTTEMPDATA8(String value) {
        this.contracttempdata8 = value;
    }

    /**
     * 获取contracttempdata9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCONTRACTTEMPDATA9() {
        return contracttempdata9;
    }

    /**
     * 设置contracttempdata9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCONTRACTTEMPDATA9(BigDecimal value) {
        this.contracttempdata9 = value;
    }

    /**
     * 获取caoEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaoEnd() {
        return caoEnd;
    }

    /**
     * 设置caoEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaoEnd(XMLGregorianCalendar value) {
        this.caoEnd = value;
    }

    /**
     * 获取caoSta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaoSta() {
        return caoSta;
    }

    /**
     * 设置caoSta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaoSta(XMLGregorianCalendar value) {
        this.caoSta = value;
    }

    /**
     * 获取conNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConNo() {
        return conNo;
    }

    /**
     * 设置conNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConNo(String value) {
        this.conNo = value;
    }

    /**
     * 获取contractType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * 设置contractType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取creatorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置creatorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorId(String value) {
        this.creatorId = value;
    }

    /**
     * 获取custmerContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustmerContact() {
        return custmerContact;
    }

    /**
     * 设置custmerContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustmerContact(String value) {
        this.custmerContact = value;
    }

    /**
     * 获取dealerSettlementRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerSettlementRule() {
        return dealerSettlementRule;
    }

    /**
     * 设置dealerSettlementRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerSettlementRule(String value) {
        this.dealerSettlementRule = value;
    }

    /**
     * 获取generateElecUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerateElecUnit() {
        return generateElecUnit;
    }

    /**
     * 设置generateElecUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerateElecUnit(String value) {
        this.generateElecUnit = value;
    }

    /**
     * 获取generateElecUnitId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerateElecUnitId() {
        return generateElecUnitId;
    }

    /**
     * 设置generateElecUnitId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerateElecUnitId(String value) {
        this.generateElecUnitId = value;
    }

    /**
     * 获取iFj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFj() {
        return iFj;
    }

    /**
     * 设置iFj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFj(String value) {
        this.iFj = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取ifcontact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfcontact() {
        return ifcontact;
    }

    /**
     * 设置ifcontact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfcontact(String value) {
        this.ifcontact = value;
    }

    /**
     * 获取limitRation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitRation() {
        return limitRation;
    }

    /**
     * 设置limitRation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitRation(String value) {
        this.limitRation = value;
    }

    /**
     * 获取modifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置modifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(String value) {
        this.modifier = value;
    }

    /**
     * 获取modifierId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * 设置modifierId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifierId(String value) {
        this.modifierId = value;
    }

    /**
     * 获取modifyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置modifyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyTime(String value) {
        this.modifyTime = value;
    }

    /**
     * 获取no属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNO() {
        return no;
    }

    /**
     * 设置no属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNO(String value) {
        this.no = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取notification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotification() {
        return notification;
    }

    /**
     * 设置notification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotification(String value) {
        this.notification = value;
    }

    /**
     * 获取persent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersent() {
        return persent;
    }

    /**
     * 设置persent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersent(String value) {
        this.persent = value;
    }

    /**
     * 获取settleRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleRules() {
        return settleRules;
    }

    /**
     * 设置settleRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleRules(String value) {
        this.settleRules = value;
    }

    /**
     * 获取settlementEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementEndDate() {
        return settlementEndDate;
    }

    /**
     * 设置settlementEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementEndDate(XMLGregorianCalendar value) {
        this.settlementEndDate = value;
    }

    /**
     * 获取settlementStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementStartDate() {
        return settlementStartDate;
    }

    /**
     * 设置settlementStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementStartDate(XMLGregorianCalendar value) {
        this.settlementStartDate = value;
    }

    /**
     * 获取signCu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignCu() {
        return signCu;
    }

    /**
     * 设置signCu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignCu(String value) {
        this.signCu = value;
    }

    /**
     * 获取signDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * 设置signDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * 获取signPeo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignPeo() {
        return signPeo;
    }

    /**
     * 设置signPeo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignPeo(String value) {
        this.signPeo = value;
    }

    /**
     * 获取signPeoDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignPeoDepartmentCode() {
        return signPeoDepartmentCode;
    }

    /**
     * 设置signPeoDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignPeoDepartmentCode(String value) {
        this.signPeoDepartmentCode = value;
    }

    /**
     * 获取signPeoDescribe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignPeoDescribe() {
        return signPeoDescribe;
    }

    /**
     * 设置signPeoDescribe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignPeoDescribe(String value) {
        this.signPeoDescribe = value;
    }

    /**
     * 获取signType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignType() {
        return signType;
    }

    /**
     * 设置signType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignType(String value) {
        this.signType = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取textContractT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextContractT() {
        return textContractT;
    }

    /**
     * 设置textContractT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextContractT(String value) {
        this.textContractT = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * 获取tradingDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingDirection() {
        return tradingDirection;
    }

    /**
     * 设置tradingDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingDirection(String value) {
        this.tradingDirection = value;
    }

    /**
     * 获取tradingPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingPrice() {
        return tradingPrice;
    }

    /**
     * 设置tradingPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingPrice(String value) {
        this.tradingPrice = value;
    }

    /**
     * 获取tradingVariety属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingVariety() {
        return tradingVariety;
    }

    /**
     * 设置tradingVariety属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingVariety(String value) {
        this.tradingVariety = value;
    }

    /**
     * 获取unitName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置unitName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

}
