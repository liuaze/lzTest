
package com.example.demo.net;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>attachmentEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="attachmentEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachement" type="{http://netcontractService.service.marketing.clickpaas.com/}attachmentPathParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDepartmentId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifyDepartmentId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="modifyUserId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibleDepartmentId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="responsibleUserId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenantId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zcontact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachmentEntity", propOrder = {
    "applyForm",
    "attachement",
    "companyId",
    "contact",
    "createDepartmentId",
    "createUserId",
    "createdTime",
    "customer",
    "enterpriseId",
    "id",
    "isDeleted",
    "link",
    "modifiedTime",
    "modifyDepartmentId",
    "modifyUserId",
    "name",
    "responsibleDepartmentId",
    "responsibleUserId",
    "size",
    "tenantId",
    "type",
    "zcontact"
})
public class AttachmentEntity {

    protected String applyForm;
    @XmlElement(nillable = true)
    protected List<AttachmentPathParam> attachement;
    protected Object companyId;
    protected String contact;
    protected Object createDepartmentId;
    protected Object createUserId;
    protected String createdTime;
    protected String customer;
    protected Object enterpriseId;
    protected String id;
    protected String isDeleted;
    protected String link;
    protected String modifiedTime;
    protected Object modifyDepartmentId;
    protected Object modifyUserId;
    protected String name;
    protected Object responsibleDepartmentId;
    protected Object responsibleUserId;
    protected String size;
    protected Object tenantId;
    protected String type;
    protected String zcontact;

    /**
     * ��ȡapplyForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyForm() {
        return applyForm;
    }

    /**
     * ����applyForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyForm(String value) {
        this.applyForm = value;
    }

    /**
     * Gets the value of the attachement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentPathParam }
     * 
     * 
     */
    public List<AttachmentPathParam> getAttachement() {
        if (attachement == null) {
            attachement = new ArrayList<AttachmentPathParam>();
        }
        return this.attachement;
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
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
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
     * ��ȡlink���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * ����link���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
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
     * ��ȡsize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * ����size���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
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
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡzcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZcontact() {
        return zcontact;
    }

    /**
     * ����zcontact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZcontact(String value) {
        this.zcontact = value;
    }

}
