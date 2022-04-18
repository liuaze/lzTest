
package com.example.demo.net;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>noEntity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="noEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="createDepartmentId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributionTariff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="eleProportion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricityCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="eslEntityList" type="{http://netcontractService.service.marketing.clickpaas.com/}eslEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formoal" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="fund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastYearElectricity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="modifiedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyDepartmentId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="modifyUserId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="powerGird" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibleDepartmentId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="responsibleUserId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tariff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tempdata1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenantId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="totalForcastEle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalYearEle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformerCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "noEntity", propOrder = {
    "assetNo",
    "companyId",
    "contact",
    "createDepartmentId",
    "createUserId",
    "createdTime",
    "customer",
    "customerId",
    "distributionTariff",
    "eleProportion",
    "electricityCapacity",
    "enterpriseId",
    "eslEntityList",
    "formoal",
    "fund",
    "id",
    "isDeleted",
    "isPv",
    "lastYearElectricity",
    "modifiedTime",
    "modifyDepartmentId",
    "modifyUserId",
    "name",
    "no",
    "org",
    "powerGird",
    "powerId",
    "responsibleDepartmentId",
    "responsibleUserId",
    "status",
    "supplier",
    "tariff",
    "tempdata1",
    "tempdata2",
    "tempdata3",
    "tempdata4",
    "tempdata5",
    "tenantId",
    "totalForcastEle",
    "totalYearEle",
    "transformerCapacity",
    "voltageLevel"
})
public class NoEntity {

    protected String assetNo;
    protected Object companyId;
    protected Object contact;
    protected Object createDepartmentId;
    protected Object createUserId;
    protected String createdTime;
    protected Object customer;
    protected String customerId;
    protected BigDecimal distributionTariff;
    protected String eleProportion;
    protected BigDecimal electricityCapacity;
    protected Object enterpriseId;
    @XmlElement(nillable = true)
    protected List<EslEntity> eslEntityList;
    protected Object formoal;
    protected String fund;
    protected String id;
    protected String isDeleted;
    protected String isPv;
    protected BigDecimal lastYearElectricity;
    protected String modifiedTime;
    protected Object modifyDepartmentId;
    protected Object modifyUserId;
    protected String name;
    protected String no;
    protected Object org;
    protected String powerGird;
    protected String powerId;
    protected Object responsibleDepartmentId;
    protected Object responsibleUserId;
    protected String status;
    protected String supplier;
    protected BigDecimal tariff;
    protected String tempdata1;
    protected String tempdata2;
    protected String tempdata3;
    protected String tempdata4;
    protected String tempdata5;
    protected Object tenantId;
    protected String totalForcastEle;
    protected String totalYearEle;
    protected BigDecimal transformerCapacity;
    protected String voltageLevel;

    /**
     * 获取assetNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNo() {
        return assetNo;
    }

    /**
     * 设置assetNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNo(String value) {
        this.assetNo = value;
    }

    /**
     * 获取companyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompanyId() {
        return companyId;
    }

    /**
     * 设置companyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompanyId(Object value) {
        this.companyId = value;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContact(Object value) {
        this.contact = value;
    }

    /**
     * 获取createDepartmentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateDepartmentId() {
        return createDepartmentId;
    }

    /**
     * 设置createDepartmentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateDepartmentId(Object value) {
        this.createDepartmentId = value;
    }

    /**
     * 获取createUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置createUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCreateUserId(Object value) {
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
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCustomer(Object value) {
        this.customer = value;
    }

    /**
     * 获取customerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置customerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * 获取distributionTariff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistributionTariff() {
        return distributionTariff;
    }

    /**
     * 设置distributionTariff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistributionTariff(BigDecimal value) {
        this.distributionTariff = value;
    }

    /**
     * 获取eleProportion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEleProportion() {
        return eleProportion;
    }

    /**
     * 设置eleProportion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEleProportion(String value) {
        this.eleProportion = value;
    }

    /**
     * 获取electricityCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElectricityCapacity() {
        return electricityCapacity;
    }

    /**
     * 设置electricityCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElectricityCapacity(BigDecimal value) {
        this.electricityCapacity = value;
    }

    /**
     * 获取enterpriseId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置enterpriseId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEnterpriseId(Object value) {
        this.enterpriseId = value;
    }

    /**
     * Gets the value of the eslEntityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eslEntityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEslEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EslEntity }
     * 
     * 
     */
    public List<EslEntity> getEslEntityList() {
        if (eslEntityList == null) {
            eslEntityList = new ArrayList<EslEntity>();
        }
        return this.eslEntityList;
    }

    /**
     * 获取formoal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFormoal() {
        return formoal;
    }

    /**
     * 设置formoal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFormoal(Object value) {
        this.formoal = value;
    }

    /**
     * 获取fund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFund() {
        return fund;
    }

    /**
     * 设置fund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFund(String value) {
        this.fund = value;
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
     * 获取isDeleted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置isDeleted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDeleted(String value) {
        this.isDeleted = value;
    }

    /**
     * 获取isPv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPv() {
        return isPv;
    }

    /**
     * 设置isPv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPv(String value) {
        this.isPv = value;
    }

    /**
     * 获取lastYearElectricity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastYearElectricity() {
        return lastYearElectricity;
    }

    /**
     * 设置lastYearElectricity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastYearElectricity(BigDecimal value) {
        this.lastYearElectricity = value;
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
     * 获取modifyDepartmentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getModifyDepartmentId() {
        return modifyDepartmentId;
    }

    /**
     * 设置modifyDepartmentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setModifyDepartmentId(Object value) {
        this.modifyDepartmentId = value;
    }

    /**
     * 获取modifyUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getModifyUserId() {
        return modifyUserId;
    }

    /**
     * 设置modifyUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setModifyUserId(Object value) {
        this.modifyUserId = value;
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
     * 获取org属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrg() {
        return org;
    }

    /**
     * 设置org属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrg(Object value) {
        this.org = value;
    }

    /**
     * 获取powerGird属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerGird() {
        return powerGird;
    }

    /**
     * 设置powerGird属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerGird(String value) {
        this.powerGird = value;
    }

    /**
     * 获取powerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerId() {
        return powerId;
    }

    /**
     * 设置powerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerId(String value) {
        this.powerId = value;
    }

    /**
     * 获取responsibleDepartmentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResponsibleDepartmentId() {
        return responsibleDepartmentId;
    }

    /**
     * 设置responsibleDepartmentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResponsibleDepartmentId(Object value) {
        this.responsibleDepartmentId = value;
    }

    /**
     * 获取responsibleUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResponsibleUserId() {
        return responsibleUserId;
    }

    /**
     * 设置responsibleUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResponsibleUserId(Object value) {
        this.responsibleUserId = value;
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
     * 获取supplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * 设置supplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * 获取tariff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTariff() {
        return tariff;
    }

    /**
     * 设置tariff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTariff(BigDecimal value) {
        this.tariff = value;
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
     * 获取tenantId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTenantId() {
        return tenantId;
    }

    /**
     * 设置tenantId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTenantId(Object value) {
        this.tenantId = value;
    }

    /**
     * 获取totalForcastEle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalForcastEle() {
        return totalForcastEle;
    }

    /**
     * 设置totalForcastEle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalForcastEle(String value) {
        this.totalForcastEle = value;
    }

    /**
     * 获取totalYearEle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalYearEle() {
        return totalYearEle;
    }

    /**
     * 设置totalYearEle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalYearEle(String value) {
        this.totalYearEle = value;
    }

    /**
     * 获取transformerCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransformerCapacity() {
        return transformerCapacity;
    }

    /**
     * 设置transformerCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransformerCapacity(BigDecimal value) {
        this.transformerCapacity = value;
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
