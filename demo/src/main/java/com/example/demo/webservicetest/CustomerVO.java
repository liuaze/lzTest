
package com.example.demo.webservicetest;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>customerVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取abbreviation属性的值。
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
     * 设置abbreviation属性的值。
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
     * 获取accountNo属性的值。
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
     * 设置accountNo属性的值。
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
     * 获取addressZipcode属性的值。
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
     * 设置addressZipcode属性的值。
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
     * 获取adimitTime属性的值。
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
     * 设置adimitTime属性的值。
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
     * 获取admitStatus属性的值。
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
     * 设置admitStatus属性的值。
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
     * 获取bpNo属性的值。
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
     * 设置bpNo属性的值。
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
     * 获取bank属性的值。
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
     * 设置bank属性的值。
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
     * 获取bankAccount属性的值。
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
     * 设置bankAccount属性的值。
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
     * 获取belongDepartment属性的值。
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
     * 设置belongDepartment属性的值。
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
     * 获取businessNo属性的值。
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
     * 设置businessNo属性的值。
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
     * 获取capitalType属性的值。
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
     * 设置capitalType属性的值。
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
     * 获取city属性的值。
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
     * 设置city属性的值。
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
     * 获取code属性的值。
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
     * 设置code属性的值。
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
     * 获取county属性的值。
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
     * 设置county属性的值。
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
     * 获取customer属性的值。
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
     * 设置customer属性的值。
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
     * 获取customerBelongGroup属性的值。
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
     * 设置customerBelongGroup属性的值。
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
     * 获取customerClass属性的值。
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
     * 设置customerClass属性的值。
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
     * 获取customerStatusCode属性的值。
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
     * 设置customerStatusCode属性的值。
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
     * 获取customerTagM属性的值。
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
     * 设置customerTagM属性的值。
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
     * 获取customerTypeC属性的值。
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
     * 设置customerTypeC属性的值。
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
     * 获取customerTypeM属性的值。
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
     * 设置customerTypeM属性的值。
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
     * 获取customerRegisteredPhone属性的值。
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
     * 设置customerRegisteredPhone属性的值。
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
     * 获取followEmployee属性的值。
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
     * 设置followEmployee属性的值。
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
     * 获取followMiddle属性的值。
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
     * 设置followMiddle属性的值。
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
     * 获取follower属性的值。
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
     * 设置follower属性的值。
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
     * 获取gStatus属性的值。
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
     * 设置gStatus属性的值。
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
     * 获取gstartTime属性的值。
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
     * 设置gstartTime属性的值。
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
     * 获取heatingCompany属性的值。
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
     * 设置heatingCompany属性的值。
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
     * 获取heatingGroup属性的值。
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
     * 设置heatingGroup属性的值。
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
     * 获取heatingMethod属性的值。
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
     * 设置heatingMethod属性的值。
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
     * 获取heatingType属性的值。
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
     * 设置heatingType属性的值。
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
     * 获取highTech属性的值。
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
     * 设置highTech属性的值。
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
     * 获取ifbuild属性的值。
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
     * 设置ifbuild属性的值。
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
     * 获取important属性的值。
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
     * 设置important属性的值。
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
     * 获取industrial属性的值。
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
     * 设置industrial属性的值。
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
     * 获取industry属性的值。
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
     * 设置industry属性的值。
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
     * 获取industryE属性的值。
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
     * 设置industryE属性的值。
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
     * 获取lastYear属性的值。
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
     * 设置lastYear属性的值。
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
     * 获取legalPerson属性的值。
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
     * 设置legalPerson属性的值。
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
     * 获取mdMno属性的值。
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
     * 设置mdMno属性的值。
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
     * 获取majorProject属性的值。
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
     * 设置majorProject属性的值。
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
     * 获取provinces属性的值。
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
     * 设置provinces属性的值。
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
     * 获取records属性的值。
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
     * 设置records属性的值。
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
     * 获取registerCurrency属性的值。
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
     * 设置registerCurrency属性的值。
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
     * 获取registrationAddress属性的值。
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
     * 设置registrationAddress属性的值。
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
     * 获取saleGroupCode属性的值。
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
     * 设置saleGroupCode属性的值。
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
     * 获取signedCompany属性的值。
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
     * 设置signedCompany属性的值。
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
     * 获取socialCode属性的值。
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
     * 设置socialCode属性的值。
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
     * 获取supplierNo属性的值。
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
     * 设置supplierNo属性的值。
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
     * 获取tagF属性的值。
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
     * 设置tagF属性的值。
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
     * 获取taxCertificate属性的值。
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
     * 设置taxCertificate属性的值。
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
     * 获取voltageLevel属性的值。
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
     * 设置voltageLevel属性的值。
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
