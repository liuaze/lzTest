
package com.example.demo.webservicetest;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>tCustomerVo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tCustomerVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adimitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="admitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="belongDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBelongGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTagM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTypeC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTypeM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileUrl1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingCompanyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highTech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="important" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastyear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="legalPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdMno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="records" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voltageLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCustomerVo", propOrder = {
    "abbreviation",
    "addressZipcode",
    "adimitTime",
    "admitStatus",
    "bpNo",
    "bank",
    "bankAccount",
    "belongDepartment",
    "businessNo",
    "capitalType",
    "city",
    "code",
    "county",
    "customerBelongGroup",
    "customerClass",
    "customerManager",
    "customerStatusCode",
    "customerTagM",
    "customerTypeC",
    "customerTypeM",
    "fileUrl1",
    "heatingCompany",
    "heatingCompanyType",
    "heatingMethod",
    "heatingType",
    "highTech",
    "id",
    "important",
    "industrial",
    "industry",
    "industryE",
    "jobNumber",
    "lastyear",
    "legalPerson",
    "majorProject",
    "mdMno",
    "name",
    "netId",
    "orgPower",
    "powerType",
    "provinces",
    "records",
    "registerCurrency",
    "registrationAddress",
    "signedCompany",
    "socialCode",
    "sorg",
    "supplierNo",
    "taxCertificate",
    "voltageLevel"
})
public class TCustomerVo {

    protected String abbreviation;
    protected String addressZipcode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adimitTime;
    protected String admitStatus;
    @XmlElement(name = "BPNo")
    protected String bpNo;
    protected String bank;
    protected String bankAccount;
    protected String belongDepartment;
    protected String businessNo;
    protected String capitalType;
    protected String city;
    protected String code;
    protected String county;
    protected String customerBelongGroup;
    protected String customerClass;
    protected String customerManager;
    protected String customerStatusCode;
    protected String customerTagM;
    protected String customerTypeC;
    protected String customerTypeM;
    protected String fileUrl1;
    protected String heatingCompany;
    protected String heatingCompanyType;
    protected String heatingMethod;
    protected String heatingType;
    protected String highTech;
    protected String id;
    protected String important;
    protected String industrial;
    protected String industry;
    protected String industryE;
    protected String jobNumber;
    protected BigDecimal lastyear;
    protected String legalPerson;
    protected String majorProject;
    protected String mdMno;
    protected String name;
    protected String netId;
    protected String orgPower;
    protected String powerType;
    protected String provinces;
    protected String records;
    protected String registerCurrency;
    protected String registrationAddress;
    protected String signedCompany;
    protected String socialCode;
    protected String sorg;
    protected String supplierNo;
    protected String taxCertificate;
    protected String voltageLevel;

    /**
     * ��ȡabbreviation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * ����abbreviation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * ��ȡaddressZipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressZipcode() {
        return addressZipcode;
    }

    /**
     * ����addressZipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressZipcode(String value) {
        this.addressZipcode = value;
    }

    /**
     * ��ȡadimitTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdimitTime() {
        return adimitTime;
    }

    /**
     * ����adimitTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdimitTime(XMLGregorianCalendar value) {
        this.adimitTime = value;
    }

    /**
     * ��ȡadmitStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmitStatus() {
        return admitStatus;
    }

    /**
     * ����admitStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmitStatus(String value) {
        this.admitStatus = value;
    }

    /**
     * ��ȡbpNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPNo() {
        return bpNo;
    }

    /**
     * ����bpNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPNo(String value) {
        this.bpNo = value;
    }

    /**
     * ��ȡbank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * ����bank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * ��ȡbankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * ����bankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * ��ȡbelongDepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelongDepartment() {
        return belongDepartment;
    }

    /**
     * ����belongDepartment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelongDepartment(String value) {
        this.belongDepartment = value;
    }

    /**
     * ��ȡbusinessNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * ����businessNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNo(String value) {
        this.businessNo = value;
    }

    /**
     * ��ȡcapitalType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalType() {
        return capitalType;
    }

    /**
     * ����capitalType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalType(String value) {
        this.capitalType = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * ��ȡcounty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * ����county���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * ��ȡcustomerBelongGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBelongGroup() {
        return customerBelongGroup;
    }

    /**
     * ����customerBelongGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBelongGroup(String value) {
        this.customerBelongGroup = value;
    }

    /**
     * ��ȡcustomerClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClass() {
        return customerClass;
    }

    /**
     * ����customerClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClass(String value) {
        this.customerClass = value;
    }

    /**
     * ��ȡcustomerManager���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManager() {
        return customerManager;
    }

    /**
     * ����customerManager���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManager(String value) {
        this.customerManager = value;
    }

    /**
     * ��ȡcustomerStatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStatusCode() {
        return customerStatusCode;
    }

    /**
     * ����customerStatusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStatusCode(String value) {
        this.customerStatusCode = value;
    }

    /**
     * ��ȡcustomerTagM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTagM() {
        return customerTagM;
    }

    /**
     * ����customerTagM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTagM(String value) {
        this.customerTagM = value;
    }

    /**
     * ��ȡcustomerTypeC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeC() {
        return customerTypeC;
    }

    /**
     * ����customerTypeC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeC(String value) {
        this.customerTypeC = value;
    }

    /**
     * ��ȡcustomerTypeM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTypeM() {
        return customerTypeM;
    }

    /**
     * ����customerTypeM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTypeM(String value) {
        this.customerTypeM = value;
    }

    /**
     * ��ȡfileUrl1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUrl1() {
        return fileUrl1;
    }

    /**
     * ����fileUrl1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUrl1(String value) {
        this.fileUrl1 = value;
    }

    /**
     * ��ȡheatingCompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingCompany() {
        return heatingCompany;
    }

    /**
     * ����heatingCompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingCompany(String value) {
        this.heatingCompany = value;
    }

    /**
     * ��ȡheatingCompanyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingCompanyType() {
        return heatingCompanyType;
    }

    /**
     * ����heatingCompanyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingCompanyType(String value) {
        this.heatingCompanyType = value;
    }

    /**
     * ��ȡheatingMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingMethod() {
        return heatingMethod;
    }

    /**
     * ����heatingMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingMethod(String value) {
        this.heatingMethod = value;
    }

    /**
     * ��ȡheatingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingType() {
        return heatingType;
    }

    /**
     * ����heatingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingType(String value) {
        this.heatingType = value;
    }

    /**
     * ��ȡhighTech���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighTech() {
        return highTech;
    }

    /**
     * ����highTech���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighTech(String value) {
        this.highTech = value;
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
     * ��ȡimportant���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportant() {
        return important;
    }

    /**
     * ����important���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportant(String value) {
        this.important = value;
    }

    /**
     * ��ȡindustrial���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrial() {
        return industrial;
    }

    /**
     * ����industrial���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrial(String value) {
        this.industrial = value;
    }

    /**
     * ��ȡindustry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * ����industry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * ��ȡindustryE���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryE() {
        return industryE;
    }

    /**
     * ����industryE���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryE(String value) {
        this.industryE = value;
    }

    /**
     * ��ȡjobNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * ����jobNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * ��ȡlastyear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastyear() {
        return lastyear;
    }

    /**
     * ����lastyear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastyear(BigDecimal value) {
        this.lastyear = value;
    }

    /**
     * ��ȡlegalPerson���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * ����legalPerson���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalPerson(String value) {
        this.legalPerson = value;
    }

    /**
     * ��ȡmajorProject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorProject() {
        return majorProject;
    }

    /**
     * ����majorProject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorProject(String value) {
        this.majorProject = value;
    }

    /**
     * ��ȡmdMno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdMno() {
        return mdMno;
    }

    /**
     * ����mdMno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdMno(String value) {
        this.mdMno = value;
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
     * ��ȡnetId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetId() {
        return netId;
    }

    /**
     * ����netId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetId(String value) {
        this.netId = value;
    }

    /**
     * ��ȡorgPower���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPower() {
        return orgPower;
    }

    /**
     * ����orgPower���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPower(String value) {
        this.orgPower = value;
    }

    /**
     * ��ȡpowerType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerType() {
        return powerType;
    }

    /**
     * ����powerType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerType(String value) {
        this.powerType = value;
    }

    /**
     * ��ȡprovinces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinces() {
        return provinces;
    }

    /**
     * ����provinces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinces(String value) {
        this.provinces = value;
    }

    /**
     * ��ȡrecords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecords() {
        return records;
    }

    /**
     * ����records���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecords(String value) {
        this.records = value;
    }

    /**
     * ��ȡregisterCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterCurrency() {
        return registerCurrency;
    }

    /**
     * ����registerCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterCurrency(String value) {
        this.registerCurrency = value;
    }

    /**
     * ��ȡregistrationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * ����registrationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationAddress(String value) {
        this.registrationAddress = value;
    }

    /**
     * ��ȡsignedCompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedCompany() {
        return signedCompany;
    }

    /**
     * ����signedCompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedCompany(String value) {
        this.signedCompany = value;
    }

    /**
     * ��ȡsocialCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialCode() {
        return socialCode;
    }

    /**
     * ����socialCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialCode(String value) {
        this.socialCode = value;
    }

    /**
     * ��ȡsorg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorg() {
        return sorg;
    }

    /**
     * ����sorg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorg(String value) {
        this.sorg = value;
    }

    /**
     * ��ȡsupplierNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierNo() {
        return supplierNo;
    }

    /**
     * ����supplierNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierNo(String value) {
        this.supplierNo = value;
    }

    /**
     * ��ȡtaxCertificate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCertificate() {
        return taxCertificate;
    }

    /**
     * ����taxCertificate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCertificate(String value) {
        this.taxCertificate = value;
    }

    /**
     * ��ȡvoltageLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * ����voltageLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoltageLevel(String value) {
        this.voltageLevel = value;
    }

}
