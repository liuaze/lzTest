
package com.example.demo.net;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>saleContractEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapprovalStatus���Ե�ֵ��
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
     * ����approvalStatus���Ե�ֵ��
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
     * ��ȡcaoEnd���Ե�ֵ��
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
     * ����caoEnd���Ե�ֵ��
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
     * ��ȡcaoSta���Ե�ֵ��
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
     * ����caoSta���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA1���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA1���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA10���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA10���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA2���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA2���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA3���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA3���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA4���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA4���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA5���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA5���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA6���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA6���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA7���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA7���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA8���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA8���Ե�ֵ��
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
     * ��ȡcoNTRACTTEMPDATA9���Ե�ֵ��
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
     * ����coNTRACTTEMPDATA9���Ե�ֵ��
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
     * ��ȡconNo���Ե�ֵ��
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
     * ����conNo���Ե�ֵ��
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
     * ��ȡcontractType���Ե�ֵ��
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
     * ����contractType���Ե�ֵ��
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
     * ��ȡcreateOrganisation���Ե�ֵ��
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
     * ����createOrganisation���Ե�ֵ��
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
     * ��ȡcreateUserId���Ե�ֵ��
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
     * ����createUserId���Ե�ֵ��
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
     * ��ȡcreatedTime���Ե�ֵ��
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
     * ����createdTime���Ե�ֵ��
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
     * ��ȡcustomers���Ե�ֵ��
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
     * ����customers���Ե�ֵ��
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
     * ��ȡday���Ե�ֵ��
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
     * ����day���Ե�ֵ��
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
     * ��ȡdealerSettlementRule���Ե�ֵ��
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
     * ����dealerSettlementRule���Ե�ֵ��
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
     * ��ȡeleLevel���Ե�ֵ��
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
     * ����eleLevel���Ե�ֵ��
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
     * ��ȡeleSalePackage���Ե�ֵ��
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
     * ����eleSalePackage���Ե�ֵ��
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
     * ��ȡgenerateElecUnit���Ե�ֵ��
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
     * ����generateElecUnit���Ե�ֵ��
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
     * ��ȡgenerateElecUnitId���Ե�ֵ��
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
     * ����generateElecUnitId���Ե�ֵ��
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
     * ��ȡhour���Ե�ֵ��
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
     * ����hour���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡifcontact���Ե�ֵ��
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
     * ����ifcontact���Ե�ֵ��
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
     * ��ȡifj���Ե�ֵ��
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
     * ����ifj���Ե�ֵ��
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
     * ��ȡlimitration���Ե�ֵ��
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
     * ����limitration���Ե�ֵ��
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
     * ��ȡmdm���Ե�ֵ��
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
     * ����mdm���Ե�ֵ��
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
     * ��ȡmodifiedTime���Ե�ֵ��
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
     * ����modifiedTime���Ե�ֵ��
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
     * ��ȡmodifyUserId���Ե�ֵ��
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
     * ����modifyUserId���Ե�ֵ��
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
     * ��ȡmoney���Ե�ֵ��
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
     * ����money���Ե�ֵ��
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
     * ��ȡmonth���Ե�ֵ��
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
     * ����month���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡno���Ե�ֵ��
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
     * ����no���Ե�ֵ��
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
     * ��ȡnotification���Ե�ֵ��
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
     * ����notification���Ե�ֵ��
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
     * ��ȡorederId���Ե�ֵ��
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
     * ����orederId���Ե�ֵ��
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
     * ��ȡparent���Ե�ֵ��
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
     * ����parent���Ե�ֵ��
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
     * ��ȡpersent���Ե�ֵ��
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
     * ����persent���Ե�ֵ��
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
     * ��ȡpreEleAmount���Ե�ֵ��
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
     * ����preEleAmount���Ե�ֵ��
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
     * ��ȡrcordTextContract���Ե�ֵ��
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
     * ����rcordTextContract���Ե�ֵ��
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
     * ��ȡrecordExecuteContract���Ե�ֵ��
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
     * ����recordExecuteContract���Ե�ֵ��
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
     * ��ȡsalePeople���Ե�ֵ��
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
     * ����salePeople���Ե�ֵ��
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
     * ��ȡsettleRules���Ե�ֵ��
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
     * ����settleRules���Ե�ֵ��
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
     * ��ȡsettlementenddate���Ե�ֵ��
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
     * ����settlementenddate���Ե�ֵ��
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
     * ��ȡsettlementstartdate���Ե�ֵ��
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
     * ����settlementstartdate���Ե�ֵ��
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
     * ��ȡsignCu���Ե�ֵ��
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
     * ����signCu���Ե�ֵ��
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
     * ��ȡsignCuNo���Ե�ֵ��
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
     * ����signCuNo���Ե�ֵ��
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
     * ��ȡsignDate���Ե�ֵ��
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
     * ����signDate���Ե�ֵ��
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
     * ��ȡsignPeo���Ե�ֵ��
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
     * ����signPeo���Ե�ֵ��
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
     * ��ȡsignType���Ե�ֵ��
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
     * ����signType���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡtempdata1���Ե�ֵ��
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
     * ����tempdata1���Ե�ֵ��
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
     * ��ȡtempdata2���Ե�ֵ��
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
     * ����tempdata2���Ե�ֵ��
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
     * ��ȡtempdata3���Ե�ֵ��
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
     * ����tempdata3���Ե�ֵ��
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
     * ��ȡtempdata4���Ե�ֵ��
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
     * ����tempdata4���Ե�ֵ��
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
     * ��ȡtempdata5���Ե�ֵ��
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
     * ����tempdata5���Ե�ֵ��
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
     * ��ȡtextContractT���Ե�ֵ��
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
     * ����textContractT���Ե�ֵ��
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
     * ��ȡtotalAmount���Ե�ֵ��
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
     * ����totalAmount���Ե�ֵ��
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
     * ��ȡtradingDirection���Ե�ֵ��
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
     * ����tradingDirection���Ե�ֵ��
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
     * ��ȡtradingPrice���Ե�ֵ��
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
     * ����tradingPrice���Ե�ֵ��
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
     * ��ȡtradingVariety���Ե�ֵ��
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
     * ����tradingVariety���Ե�ֵ��
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
     * ��ȡunitName���Ե�ֵ��
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
     * ����unitName���Ե�ֵ��
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
