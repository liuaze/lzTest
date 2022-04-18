
package com.example.demo.webservicetest;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>saleContractVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcontracttempdata1���Ե�ֵ��
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
     * ����contracttempdata1���Ե�ֵ��
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
     * ��ȡcontracttempdata10���Ե�ֵ��
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
     * ����contracttempdata10���Ե�ֵ��
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
     * ��ȡcontracttempdata2���Ե�ֵ��
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
     * ����contracttempdata2���Ե�ֵ��
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
     * ��ȡcontracttempdata3���Ե�ֵ��
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
     * ����contracttempdata3���Ե�ֵ��
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
     * ��ȡcontracttempdata4���Ե�ֵ��
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
     * ����contracttempdata4���Ե�ֵ��
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
     * ��ȡcontracttempdata5���Ե�ֵ��
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
     * ����contracttempdata5���Ե�ֵ��
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
     * ��ȡcontracttempdata6���Ե�ֵ��
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
     * ����contracttempdata6���Ե�ֵ��
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
     * ��ȡcontracttempdata7���Ե�ֵ��
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
     * ����contracttempdata7���Ե�ֵ��
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
     * ��ȡcontracttempdata8���Ե�ֵ��
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
     * ����contracttempdata8���Ե�ֵ��
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
     * ��ȡcontracttempdata9���Ե�ֵ��
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
     * ����contracttempdata9���Ե�ֵ��
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
     * ��ȡcaoEnd���Ե�ֵ��
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
     * ����caoEnd���Ե�ֵ��
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
     * ��ȡcaoSta���Ե�ֵ��
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
     * ����caoSta���Ե�ֵ��
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
     * ��ȡcreateTime���Ե�ֵ��
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
     * ����createTime���Ե�ֵ��
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
     * ��ȡcreator���Ե�ֵ��
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
     * ����creator���Ե�ֵ��
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
     * ��ȡcreatorId���Ե�ֵ��
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
     * ����creatorId���Ե�ֵ��
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
     * ��ȡcustmerContact���Ե�ֵ��
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
     * ����custmerContact���Ե�ֵ��
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
     * ��ȡdealerSettlementRule���Ե�ֵ��
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
     * ����dealerSettlementRule���Ե�ֵ��
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
     * ��ȡiFj���Ե�ֵ��
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
     * ����iFj���Ե�ֵ��
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
     * ��ȡlimitRation���Ե�ֵ��
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
     * ����limitRation���Ե�ֵ��
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
     * ��ȡmodifier���Ե�ֵ��
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
     * ����modifier���Ե�ֵ��
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
     * ��ȡmodifierId���Ե�ֵ��
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
     * ����modifierId���Ե�ֵ��
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
     * ��ȡmodifyTime���Ե�ֵ��
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
     * ����modifyTime���Ե�ֵ��
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
     * ��ȡno���Ե�ֵ��
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
     * ����no���Ե�ֵ��
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
     * ��ȡpersent���Ե�ֵ��
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
     * ����persent���Ե�ֵ��
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
     * ��ȡsettleRules���Ե�ֵ��
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
     * ����settleRules���Ե�ֵ��
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
     * ��ȡsettlementEndDate���Ե�ֵ��
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
     * ����settlementEndDate���Ե�ֵ��
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
     * ��ȡsettlementStartDate���Ե�ֵ��
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
     * ����settlementStartDate���Ե�ֵ��
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
     * ��ȡsignDate���Ե�ֵ��
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
     * ����signDate���Ե�ֵ��
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
     * ��ȡsignPeoDepartmentCode���Ե�ֵ��
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
     * ����signPeoDepartmentCode���Ե�ֵ��
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
     * ��ȡsignPeoDescribe���Ե�ֵ��
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
     * ����signPeoDescribe���Ե�ֵ��
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
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * ����totalAmount���Ե�ֵ��
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
     *     {@link String }
     *     
     */
    public String getTradingPrice() {
        return tradingPrice;
    }

    /**
     * ����tradingPrice���Ե�ֵ��
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
