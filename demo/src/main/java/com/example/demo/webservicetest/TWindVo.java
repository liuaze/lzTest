
package com.example.demo.webservicetest;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tWindVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tWindVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wind1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wind2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wind3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="wind4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wind5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tWindVo", propOrder = {
    "customer",
    "customerno",
    "wind1",
    "wind2",
    "wind3",
    "wind4",
    "wind5"
})
public class TWindVo {

    protected String customer;
    protected String customerno;
    protected String wind1;
    protected String wind2;
    protected BigDecimal wind3;
    protected String wind4;
    protected String wind5;

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
     * 获取customerno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerno() {
        return customerno;
    }

    /**
     * 设置customerno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerno(String value) {
        this.customerno = value;
    }

    /**
     * 获取wind1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind1() {
        return wind1;
    }

    /**
     * 设置wind1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind1(String value) {
        this.wind1 = value;
    }

    /**
     * 获取wind2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind2() {
        return wind2;
    }

    /**
     * 设置wind2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind2(String value) {
        this.wind2 = value;
    }

    /**
     * 获取wind3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWind3() {
        return wind3;
    }

    /**
     * 设置wind3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWind3(BigDecimal value) {
        this.wind3 = value;
    }

    /**
     * 获取wind4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind4() {
        return wind4;
    }

    /**
     * 设置wind4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind4(String value) {
        this.wind4 = value;
    }

    /**
     * 获取wind5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind5() {
        return wind5;
    }

    /**
     * 设置wind5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind5(String value) {
        this.wind5 = value;
    }

}
