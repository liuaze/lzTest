
package com.example.demo.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tHydropowerVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tHydropowerVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydropower5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hydropower9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tHydropowerVo", propOrder = {
    "customer",
    "customerno",
    "hydropower1",
    "hydropower10",
    "hydropower11",
    "hydropower12",
    "hydropower13",
    "hydropower14",
    "hydropower15",
    "hydropower16",
    "hydropower2",
    "hydropower3",
    "hydropower4",
    "hydropower5",
    "hydropower6",
    "hydropower7",
    "hydropower8",
    "hydropower9"
})
public class THydropowerVo {

    protected String customer;
    protected String customerno;
    protected String hydropower1;
    protected BigDecimal hydropower10;
    protected BigDecimal hydropower11;
    protected BigDecimal hydropower12;
    protected BigDecimal hydropower13;
    protected String hydropower14;
    protected String hydropower15;
    protected String hydropower16;
    protected String hydropower2;
    protected String hydropower3;
    protected String hydropower4;
    protected BigDecimal hydropower5;
    protected BigDecimal hydropower6;
    protected BigDecimal hydropower7;
    protected BigDecimal hydropower8;
    protected BigDecimal hydropower9;

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
     * 获取hydropower1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower1() {
        return hydropower1;
    }

    /**
     * 设置hydropower1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower1(String value) {
        this.hydropower1 = value;
    }

    /**
     * 获取hydropower10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower10() {
        return hydropower10;
    }

    /**
     * 设置hydropower10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower10(BigDecimal value) {
        this.hydropower10 = value;
    }

    /**
     * 获取hydropower11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower11() {
        return hydropower11;
    }

    /**
     * 设置hydropower11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower11(BigDecimal value) {
        this.hydropower11 = value;
    }

    /**
     * 获取hydropower12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower12() {
        return hydropower12;
    }

    /**
     * 设置hydropower12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower12(BigDecimal value) {
        this.hydropower12 = value;
    }

    /**
     * 获取hydropower13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower13() {
        return hydropower13;
    }

    /**
     * 设置hydropower13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower13(BigDecimal value) {
        this.hydropower13 = value;
    }

    /**
     * 获取hydropower14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower14() {
        return hydropower14;
    }

    /**
     * 设置hydropower14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower14(String value) {
        this.hydropower14 = value;
    }

    /**
     * 获取hydropower15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower15() {
        return hydropower15;
    }

    /**
     * 设置hydropower15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower15(String value) {
        this.hydropower15 = value;
    }

    /**
     * 获取hydropower16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower16() {
        return hydropower16;
    }

    /**
     * 设置hydropower16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower16(String value) {
        this.hydropower16 = value;
    }

    /**
     * 获取hydropower2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower2() {
        return hydropower2;
    }

    /**
     * 设置hydropower2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower2(String value) {
        this.hydropower2 = value;
    }

    /**
     * 获取hydropower3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower3() {
        return hydropower3;
    }

    /**
     * 设置hydropower3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower3(String value) {
        this.hydropower3 = value;
    }

    /**
     * 获取hydropower4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydropower4() {
        return hydropower4;
    }

    /**
     * 设置hydropower4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydropower4(String value) {
        this.hydropower4 = value;
    }

    /**
     * 获取hydropower5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower5() {
        return hydropower5;
    }

    /**
     * 设置hydropower5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower5(BigDecimal value) {
        this.hydropower5 = value;
    }

    /**
     * 获取hydropower6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower6() {
        return hydropower6;
    }

    /**
     * 设置hydropower6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower6(BigDecimal value) {
        this.hydropower6 = value;
    }

    /**
     * 获取hydropower7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower7() {
        return hydropower7;
    }

    /**
     * 设置hydropower7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower7(BigDecimal value) {
        this.hydropower7 = value;
    }

    /**
     * 获取hydropower8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower8() {
        return hydropower8;
    }

    /**
     * 设置hydropower8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower8(BigDecimal value) {
        this.hydropower8 = value;
    }

    /**
     * 获取hydropower9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHydropower9() {
        return hydropower9;
    }

    /**
     * 设置hydropower9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHydropower9(BigDecimal value) {
        this.hydropower9 = value;
    }

}
