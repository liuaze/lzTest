
package com.example.demo.net;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>saleContractEntity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="saleContractEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caoEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caoSta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNTRACTTEMPDATA9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="dealerSettlementRule" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="eleLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eleSalePackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generateElecUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generateElecUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifcontact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orederId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="preEleAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rcordTextContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordExecuteContract" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="salePeople" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settleRules" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="settlementenddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementstartdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signCu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signCuNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signPeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textContractT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tradingDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "saleContractEntity", propOrder = {
    "approvalStatus",
    "caoEnd",
    "caoSta",
    "coNTRACTTEMPDATA1",
    "coNTRACTTEMPDATA10",
    "coNTRACTTEMPDATA2",
    "coNTRACTTEMPDATA3",
    "coNTRACTTEMPDATA4",
    "coNTRACTTEMPDATA5",
    "coNTRACTTEMPDATA6",
    "coNTRACTTEMPDATA7",
    "coNTRACTTEMPDATA8",
    "coNTRACTTEMPDATA9",
    "conNo",
    "contractType",
    "createOrganisation",
    "createUserId",
    "createdTime",
    "customers",
    "day",
    "dealerSettlementRule",
    "eleLevel",
    "eleSalePackage",
    "generateElecUnit",
    "generateElecUnitId",
    "hour",
    "id",
    "ifcontact",
    "ifj",
    "limitration",
    "mdm",
    "modifiedTime",
    "modifyUserId",
    "money",
    "month",
    "name",
    "no",
    "notification",
    "orederId",
    "parent",
    "persent",
    "preEleAmount",
    "rcordTextContract",
    "recordExecuteContract",
    "salePeople",
    "settleRules",
    "settlementenddate",
    "settlementstartdate",
    "signCu",
    "signCuNo",
    "signDate",
    "signPeo",
    "signType",
    "status",
    "tempdata1",
    "tempdata2",
    "tempdata3",
    "tempdata4",
    "tempdata5",
    "textContractT",
    "totalAmount",
    "tradingDirection",
    "tradingPrice",
    "tradingVariety",
    "unitName"
})
public class SaleContractEntity {

    protected String approvalStatus;
    protected String caoEnd;
    protected String caoSta;
    protected String coNTRACTTEMPDATA1;
    protected String coNTRACTTEMPDATA10;
    protected String coNTRACTTEMPDATA2;
    protected String coNTRACTTEMPDATA3;
    protected String coNTRACTTEMPDATA4;
    protected String coNTRACTTEMPDATA5;
    protected String coNTRACTTEMPDATA6;
    protected String coNTRACTTEMPDATA7;
    protected String coNTRACTTEMPDATA8;
    protected String coNTRACTTEMPDATA9;
    protected String conNo;
    protected String contractType;
    protected String createOrganisation;
    protected String createUserId;
    protected String createdTime;
    protected String customers;
    protected Object day;
    protected Object dealerSettlementRule;
    protected String eleLevel;
    protected String eleSalePackage;
    protected String generateElecUnit;
    protected String generateElecUnitId;
    protected Object hour;
    protected String id;
    protected String ifcontact;
    protected String ifj;
    protected BigDecimal limitration;
    @XmlElement(name = "MDM")
    protected String mdm;
    protected String modifiedTime;
    protected String modifyUserId;
    protected BigDecimal money;
    protected Object month;
    protected String name;
    protected String no;
    protected String notification;
    protected String orederId;
    protected String parent;
    protected BigDecimal persent;
    protected BigDecimal preEleAmount;
    protected String rcordTextContract;
    protected Object recordExecuteContract;
    protected String salePeople;
    protected Object settleRules;
    protected String settlementenddate;
    protected String settlementstartdate;
    protected String signCu;
    protected String signCuNo;
    protected String signDate;
    protected String signPeo;
    protected String signType;
    protected String status;
    protected String tempdata1;
    protected String tempdata2;
    protected String tempdata3;
    protected String tempdata4;
    protected String tempdata5;
    protected String textContractT;
    protected BigDecimal totalAmount;
    protected String tradingDirection;
    protected BigDecimal tradingPrice;
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
     * 获取caoEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaoEnd() {
        return caoEnd;
    }

    /**
     * 设置caoEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaoEnd(String value) {
        this.caoEnd = value;
    }

    /**
     * 获取caoSta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaoSta() {
        return caoSta;
    }

    /**
     * 设置caoSta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaoSta(String value) {
        this.caoSta = value;
    }

    /**
     * 获取coNTRACTTEMPDATA1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA1() {
        return coNTRACTTEMPDATA1;
    }

    /**
     * 设置coNTRACTTEMPDATA1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA1(String value) {
        this.coNTRACTTEMPDATA1 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA10() {
        return coNTRACTTEMPDATA10;
    }

    /**
     * 设置coNTRACTTEMPDATA10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA10(String value) {
        this.coNTRACTTEMPDATA10 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA2() {
        return coNTRACTTEMPDATA2;
    }

    /**
     * 设置coNTRACTTEMPDATA2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA2(String value) {
        this.coNTRACTTEMPDATA2 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA3() {
        return coNTRACTTEMPDATA3;
    }

    /**
     * 设置coNTRACTTEMPDATA3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA3(String value) {
        this.coNTRACTTEMPDATA3 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA4() {
        return coNTRACTTEMPDATA4;
    }

    /**
     * 设置coNTRACTTEMPDATA4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA4(String value) {
        this.coNTRACTTEMPDATA4 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA5() {
        return coNTRACTTEMPDATA5;
    }

    /**
     * 设置coNTRACTTEMPDATA5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA5(String value) {
        this.coNTRACTTEMPDATA5 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA6() {
        return coNTRACTTEMPDATA6;
    }

    /**
     * 设置coNTRACTTEMPDATA6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA6(String value) {
        this.coNTRACTTEMPDATA6 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA7() {
        return coNTRACTTEMPDATA7;
    }

    /**
     * 设置coNTRACTTEMPDATA7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA7(String value) {
        this.coNTRACTTEMPDATA7 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA8() {
        return coNTRACTTEMPDATA8;
    }

    /**
     * 设置coNTRACTTEMPDATA8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA8(String value) {
        this.coNTRACTTEMPDATA8 = value;
    }

    /**
     * 获取coNTRACTTEMPDATA9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNTRACTTEMPDATA9() {
        return coNTRACTTEMPDATA9;
    }

    /**
     * 设置coNTRACTTEMPDATA9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNTRACTTEMPDATA9(String value) {
        this.coNTRACTTEMPDATA9 = value;
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
     * 获取createOrganisation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateOrganisation() {
        return createOrganisation;
    }

    /**
     * 设置createOrganisation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateOrganisation(String value) {
        this.createOrganisation = value;
    }

    /**
     * 获取createUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置createUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUserId(String value) {
        this.createUserId = value;
    }

    /**
     * 获取createdTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置createdTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTime(String value) {
        this.createdTime = value;
    }

    /**
     * 获取customers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomers() {
        return customers;
    }

    /**
     * 设置customers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomers(String value) {
        this.customers = value;
    }

    /**
     * 获取day属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDay() {
        return day;
    }

    /**
     * 设置day属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDay(Object value) {
        this.day = value;
    }

    /**
     * 获取dealerSettlementRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDealerSettlementRule() {
        return dealerSettlementRule;
    }

    /**
     * 设置dealerSettlementRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDealerSettlementRule(Object value) {
        this.dealerSettlementRule = value;
    }

    /**
     * 获取eleLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEleLevel() {
        return eleLevel;
    }

    /**
     * 设置eleLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEleLevel(String value) {
        this.eleLevel = value;
    }

    /**
     * 获取eleSalePackage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEleSalePackage() {
        return eleSalePackage;
    }

    /**
     * 设置eleSalePackage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEleSalePackage(String value) {
        this.eleSalePackage = value;
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
     * 获取hour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHour() {
        return hour;
    }

    /**
     * 设置hour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHour(Object value) {
        this.hour = value;
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
     * 获取ifj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfj() {
        return ifj;
    }

    /**
     * 设置ifj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfj(String value) {
        this.ifj = value;
    }

    /**
     * 获取limitration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitration() {
        return limitration;
    }

    /**
     * 设置limitration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitration(BigDecimal value) {
        this.limitration = value;
    }

    /**
     * 获取mdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDM() {
        return mdm;
    }

    /**
     * 设置mdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDM(String value) {
        this.mdm = value;
    }

    /**
     * 获取modifiedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置modifiedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedTime(String value) {
        this.modifiedTime = value;
    }

    /**
     * 获取modifyUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyUserId() {
        return modifyUserId;
    }

    /**
     * 设置modifyUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyUserId(String value) {
        this.modifyUserId = value;
    }

    /**
     * 获取money属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置money属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoney(BigDecimal value) {
        this.money = value;
    }

    /**
     * 获取month属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMonth() {
        return month;
    }

    /**
     * 设置month属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMonth(Object value) {
        this.month = value;
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
     * 获取no属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
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
    public void setNo(String value) {
        this.no = value;
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
     * 获取orederId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrederId() {
        return orederId;
    }

    /**
     * 设置orederId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrederId(String value) {
        this.orederId = value;
    }

    /**
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * 获取persent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPersent() {
        return persent;
    }

    /**
     * 设置persent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPersent(BigDecimal value) {
        this.persent = value;
    }

    /**
     * 获取preEleAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreEleAmount() {
        return preEleAmount;
    }

    /**
     * 设置preEleAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreEleAmount(BigDecimal value) {
        this.preEleAmount = value;
    }

    /**
     * 获取rcordTextContract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcordTextContract() {
        return rcordTextContract;
    }

    /**
     * 设置rcordTextContract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcordTextContract(String value) {
        this.rcordTextContract = value;
    }

    /**
     * 获取recordExecuteContract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRecordExecuteContract() {
        return recordExecuteContract;
    }

    /**
     * 设置recordExecuteContract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRecordExecuteContract(Object value) {
        this.recordExecuteContract = value;
    }

    /**
     * 获取salePeople属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalePeople() {
        return salePeople;
    }

    /**
     * 设置salePeople属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalePeople(String value) {
        this.salePeople = value;
    }

    /**
     * 获取settleRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSettleRules() {
        return settleRules;
    }

    /**
     * 设置settleRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSettleRules(Object value) {
        this.settleRules = value;
    }

    /**
     * 获取settlementenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementenddate() {
        return settlementenddate;
    }

    /**
     * 设置settlementenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementenddate(String value) {
        this.settlementenddate = value;
    }

    /**
     * 获取settlementstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementstartdate() {
        return settlementstartdate;
    }

    /**
     * 设置settlementstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementstartdate(String value) {
        this.settlementstartdate = value;
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
     * 获取signCuNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignCuNo() {
        return signCuNo;
    }

    /**
     * 设置signCuNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignCuNo(String value) {
        this.signCuNo = value;
    }

    /**
     * 获取signDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * 设置signDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(String value) {
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
     * 获取tempdata1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempdata1() {
        return tempdata1;
    }

    /**
     * 设置tempdata1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempdata1(String value) {
        this.tempdata1 = value;
    }

    /**
     * 获取tempdata2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempdata2() {
        return tempdata2;
    }

    /**
     * 设置tempdata2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempdata2(String value) {
        this.tempdata2 = value;
    }

    /**
     * 获取tempdata3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempdata3() {
        return tempdata3;
    }

    /**
     * 设置tempdata3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempdata3(String value) {
        this.tempdata3 = value;
    }

    /**
     * 获取tempdata4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempdata4() {
        return tempdata4;
    }

    /**
     * 设置tempdata4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempdata4(String value) {
        this.tempdata4 = value;
    }

    /**
     * 获取tempdata5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempdata5() {
        return tempdata5;
    }

    /**
     * 设置tempdata5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempdata5(String value) {
        this.tempdata5 = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradingPrice() {
        return tradingPrice;
    }

    /**
     * 设置tradingPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradingPrice(BigDecimal value) {
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
