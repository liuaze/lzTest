
package com.example.demo.net;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>noEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡassetNo���Ե�ֵ��
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
     * ����assetNo���Ե�ֵ��
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
     * ��ȡcompanyId���Ե�ֵ��
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
     * ����companyId���Ե�ֵ��
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
     * ��ȡcontact���Ե�ֵ��
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
     * ����contact���Ե�ֵ��
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
     * ��ȡcreateDepartmentId���Ե�ֵ��
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
     * ����createDepartmentId���Ե�ֵ��
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
     * ��ȡcreateUserId���Ե�ֵ��
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
     * ����createUserId���Ե�ֵ��
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
     * ��ȡcustomer���Ե�ֵ��
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
     * ����customer���Ե�ֵ��
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
     * ��ȡcustomerId���Ե�ֵ��
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
     * ����customerId���Ե�ֵ��
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
     * ��ȡdistributionTariff���Ե�ֵ��
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
     * ����distributionTariff���Ե�ֵ��
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
     * ��ȡeleProportion���Ե�ֵ��
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
     * ����eleProportion���Ե�ֵ��
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
     * ��ȡelectricityCapacity���Ե�ֵ��
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
     * ����electricityCapacity���Ե�ֵ��
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
     * ��ȡenterpriseId���Ե�ֵ��
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
     * ����enterpriseId���Ե�ֵ��
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
     * ��ȡformoal���Ե�ֵ��
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
     * ����formoal���Ե�ֵ��
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
     * ��ȡfund���Ե�ֵ��
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
     * ����fund���Ե�ֵ��
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
     * ��ȡisDeleted���Ե�ֵ��
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
     * ����isDeleted���Ե�ֵ��
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
     * ��ȡisPv���Ե�ֵ��
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
     * ����isPv���Ե�ֵ��
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
     * ��ȡlastYearElectricity���Ե�ֵ��
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
     * ����lastYearElectricity���Ե�ֵ��
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
     * ��ȡmodifyDepartmentId���Ե�ֵ��
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
     * ����modifyDepartmentId���Ե�ֵ��
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
     * ��ȡmodifyUserId���Ե�ֵ��
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
     * ����modifyUserId���Ե�ֵ��
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
     * ��ȡorg���Ե�ֵ��
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
     * ����org���Ե�ֵ��
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
     * ��ȡpowerGird���Ե�ֵ��
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
     * ����powerGird���Ե�ֵ��
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
     * ��ȡpowerId���Ե�ֵ��
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
     * ����powerId���Ե�ֵ��
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
     * ��ȡresponsibleDepartmentId���Ե�ֵ��
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
     * ����responsibleDepartmentId���Ե�ֵ��
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
     * ��ȡresponsibleUserId���Ե�ֵ��
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
     * ����responsibleUserId���Ե�ֵ��
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
     * ��ȡsupplier���Ե�ֵ��
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
     * ����supplier���Ե�ֵ��
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
     * ��ȡtariff���Ե�ֵ��
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
     * ����tariff���Ե�ֵ��
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
     * ��ȡtenantId���Ե�ֵ��
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
     * ����tenantId���Ե�ֵ��
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
     * ��ȡtotalForcastEle���Ե�ֵ��
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
     * ����totalForcastEle���Ե�ֵ��
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
     * ��ȡtotalYearEle���Ե�ֵ��
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
     * ����totalYearEle���Ե�ֵ��
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
     * ��ȡtransformerCapacity���Ե�ֵ��
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
     * ����transformerCapacity���Ե�ֵ��
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
