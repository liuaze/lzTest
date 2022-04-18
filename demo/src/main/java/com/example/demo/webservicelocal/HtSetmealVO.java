
package com.example.demo.webservicelocal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>htSetmealVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="htSetmealVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comboType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricityPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setMealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setMealName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempdata4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "htSetmealVO", propOrder = {
    "comboType",
    "createdBy",
    "createdTime",
    "description",
    "electricityPrice",
    "id",
    "imgs",
    "orgCode",
    "picture",
    "setMealCode",
    "setMealName",
    "settlementScheme",
    "shortdes",
    "tempdata1",
    "tempdata2",
    "tempdata3",
    "tempdata4",
    "updatedBy",
    "updatedTime"
})
public class HtSetmealVO {

    protected String comboType;
    protected String createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    protected String description;
    protected String electricityPrice;
    protected String id;
    @XmlElement(nillable = true)
    protected List<String> imgs;
    protected String orgCode;
    protected String picture;
    protected String setMealCode;
    protected String setMealName;
    protected String settlementScheme;
    protected String shortdes;
    protected String tempdata1;
    protected String tempdata2;
    protected String tempdata3;
    protected String tempdata4;
    protected String updatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * ��ȡcomboType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComboType() {
        return comboType;
    }

    /**
     * ����comboType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComboType(String value) {
        this.comboType = value;
    }

    /**
     * ��ȡcreatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * ����createdBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * ��ȡcreatedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * ����createdTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡelectricityPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectricityPrice() {
        return electricityPrice;
    }

    /**
     * ����electricityPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricityPrice(String value) {
        this.electricityPrice = value;
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
     * Gets the value of the imgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImgs() {
        if (imgs == null) {
            imgs = new ArrayList<String>();
        }
        return this.imgs;
    }

    /**
     * ��ȡorgCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * ����orgCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * ��ȡpicture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * ����picture���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * ��ȡsetMealCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetMealCode() {
        return setMealCode;
    }

    /**
     * ����setMealCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetMealCode(String value) {
        this.setMealCode = value;
    }

    /**
     * ��ȡsetMealName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetMealName() {
        return setMealName;
    }

    /**
     * ����setMealName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetMealName(String value) {
        this.setMealName = value;
    }

    /**
     * ��ȡsettlementScheme���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementScheme() {
        return settlementScheme;
    }

    /**
     * ����settlementScheme���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementScheme(String value) {
        this.settlementScheme = value;
    }

    /**
     * ��ȡshortdes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortdes() {
        return shortdes;
    }

    /**
     * ����shortdes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortdes(String value) {
        this.shortdes = value;
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
     * ��ȡupdatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * ����updatedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * ��ȡupdatedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * ����updatedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

}
