
package com.example.demo.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>settleInfVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="settleInfVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTRACT_TEMPDATA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT_TEMPDATA5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eleeve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settleall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settleInfVO", propOrder = {
    "contracttempdata1",
    "contracttempdata2",
    "contracttempdata3",
    "contracttempdata4",
    "contracttempdata5",
    "contact",
    "date",
    "ele",
    "eleeve",
    "inContact",
    "name",
    "settleall"
})
public class SettleInfVO {

    @XmlElement(name = "CONTRACT_TEMPDATA1")
    protected String contracttempdata1;
    @XmlElement(name = "CONTRACT_TEMPDATA2")
    protected String contracttempdata2;
    @XmlElement(name = "CONTRACT_TEMPDATA3")
    protected String contracttempdata3;
    @XmlElement(name = "CONTRACT_TEMPDATA4")
    protected String contracttempdata4;
    @XmlElement(name = "CONTRACT_TEMPDATA5")
    protected String contracttempdata5;
    protected String contact;
    protected String date;
    protected String ele;
    protected String eleeve;
    protected String inContact;
    protected String name;
    protected String settleall;

    /**
     * 获取contracttempdata1属性的值。
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
     * 设置contracttempdata1属性的值。
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
     * 获取contracttempdata2属性的值。
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
     * 设置contracttempdata2属性的值。
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
     * 获取contracttempdata3属性的值。
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
     * 设置contracttempdata3属性的值。
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
     * 获取contracttempdata4属性的值。
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
     * 设置contracttempdata4属性的值。
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
     * 获取contracttempdata5属性的值。
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
     * 设置contracttempdata5属性的值。
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
     * 获取contact属性的值。
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
     * 设置contact属性的值。
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
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * 获取ele属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEle() {
        return ele;
    }

    /**
     * 设置ele属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEle(String value) {
        this.ele = value;
    }

    /**
     * 获取eleeve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEleeve() {
        return eleeve;
    }

    /**
     * 设置eleeve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEleeve(String value) {
        this.eleeve = value;
    }

    /**
     * 获取inContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContact() {
        return inContact;
    }

    /**
     * 设置inContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContact(String value) {
        this.inContact = value;
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
     * 获取settleall属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleall() {
        return settleall;
    }

    /**
     * 设置settleall属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleall(String value) {
        this.settleall = value;
    }

}
