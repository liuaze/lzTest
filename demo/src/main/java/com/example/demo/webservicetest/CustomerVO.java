
package com.example.demo.webservicetest;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>customerVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="customerVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_Zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adimit_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="admit_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="belongDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBelongGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTagM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTypeC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTypeM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_Registered_Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="followEmployee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="followMiddle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="follower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gstartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="heatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heatingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highTech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifbuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="important" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industrial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="legalPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDMno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="records" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "customerVO", propOrder = {
    "abbreviation",
    "accountNo",
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
    "createOrganisation",
    "customer",
    "customerBelongGroup",
    "customerClass",
    "customerStatusCode",
    "customerTagM",
    "customerTypeC",
    "customerTypeM",
    "customerRegisteredPhone",
    "followEmployee",
    "followMiddle",
    "follower",
    "gStatus",
    "gstartTime",
    "heatingCompany",
    "heatingGroup",
    "heatingMethod",
    "heatingType",
    "highTech",
    "id",
    "ifbuild",
    "important",
    "industrial",
    "industry",
    "industryE",
    "lastYear",
    "legalPerson",
    "mdMno",
    "majorProject",
    "name",
    "provinces",
    "records",
    "registerCurrency",
    "registrationAddress",
    "saleGroupCode",
    "signedCompany",
    "socialCode",
    "supplierNo",
    "tagF",
    "taxCertificate",
    "voltageLevel"
})
public class CustomerVO {

    protected String abbreviation;
    protected String accountNo;
    @XmlElement(name = "address_Zipcode")
    protected String addressZipcode;
    @XmlElement(name = "adimit_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adimitTime;
    @XmlElement(name = "admit_Status")
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
    protected String createOrganisation;
    protected String customer;
    protected String customerBelongGroup;
    protected String customerClass;
    protected String customerStatusCode;
    protected String customerTagM;
    protected String customerTypeC;
    protected String customerTypeM;
    @XmlElement(name = "customer_Registered_Phone")
    protected String customerRegisteredPhone;
    protected String followEmployee;
    protected String followMiddle;
    protected String follower;
    @XmlElement(name = "GStatus")
    protected String gStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gstartTime;
    protected String heatingCompany;
    protected String heatingGroup;
    protected String heatingMethod;
    protected String heatingType;
    protected String highTech;
    protected String id;
    protected String ifbuild;
    protected String important;
    protected String industrial;
    protected String industry;
    protected String industryE;
    protected BigDecimal lastYear;
    protected String legalPerson;
    @XmlElement(name = "MDMno")
    protected String mdMno;
    protected String majorProject;
    protected String name;
    protected String provinces;
    protected String records;
    protected String registerCurrency;
    protected String registrationAddress;
    protected String saleGroupCode;
    protected String signedCompany;
    protected String socialCode;
    protected String supplierNo;
    protected String tagF;
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
     * ��ȡaccountNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * ����accountNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
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
     * ��ȡcustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * ����customer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
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
     * ��ȡcustomerRegisteredPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRegisteredPhone() {
        return customerRegisteredPhone;
    }

    /**
     * ����customerRegisteredPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRegisteredPhone(String value) {
        this.customerRegisteredPhone = value;
    }

    /**
     * ��ȡfollowEmployee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowEmployee() {
        return followEmployee;
    }

    /**
     * ����followEmployee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowEmployee(String value) {
        this.followEmployee = value;
    }

    /**
     * ��ȡfollowMiddle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowMiddle() {
        return followMiddle;
    }

    /**
     * ����followMiddle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowMiddle(String value) {
        this.followMiddle = value;
    }

    /**
     * ��ȡfollower���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollower() {
        return follower;
    }

    /**
     * ����follower���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollower(String value) {
        this.follower = value;
    }

    /**
     * ��ȡgStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGStatus() {
        return gStatus;
    }

    /**
     * ����gStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGStatus(String value) {
        this.gStatus = value;
    }

    /**
     * ��ȡgstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGstartTime() {
        return gstartTime;
    }

    /**
     * ����gstartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGstartTime(XMLGregorianCalendar value) {
        this.gstartTime = value;
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
     * ��ȡheatingGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingGroup() {
        return heatingGroup;
    }

    /**
     * ����heatingGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingGroup(String value) {
        this.heatingGroup = value;
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
     * ��ȡifbuild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfbuild() {
        return ifbuild;
    }

    /**
     * ����ifbuild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfbuild(String value) {
        this.ifbuild = value;
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
     * ��ȡlastYear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastYear() {
        return lastYear;
    }

    /**
     * ����lastYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastYear(BigDecimal value) {
        this.lastYear = value;
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
     * ��ȡmdMno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDMno() {
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
    public void setMDMno(String value) {
        this.mdMno = value;
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
     * ��ȡsaleGroupCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleGroupCode() {
        return saleGroupCode;
    }

    /**
     * ����saleGroupCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleGroupCode(String value) {
        this.saleGroupCode = value;
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
     * ��ȡtagF���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagF() {
        return tagF;
    }

    /**
     * ����tagF���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagF(String value) {
        this.tagF = value;
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
