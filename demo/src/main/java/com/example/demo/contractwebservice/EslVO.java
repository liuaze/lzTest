
package com.example.demo.contractwebservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>eslVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="eslVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="april" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="aprilPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="august" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="augustPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contracts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="december" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="decemberPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="february" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="februaryPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="january" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="januaryPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="july" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="julyPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="june" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="junePri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="march" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="marchPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="may" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="mayPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="november" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="novemberPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="october" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="octoberPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="september" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="septemberPri" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eslVO", propOrder = {
    "april",
    "aprilPri",
    "august",
    "augustPri",
    "contactType",
    "contracts",
    "december",
    "decemberPri",
    "february",
    "februaryPri",
    "id",
    "january",
    "januaryPri",
    "july",
    "julyPri",
    "june",
    "junePri",
    "march",
    "marchPri",
    "may",
    "mayPri",
    "name",
    "november",
    "novemberPri",
    "october",
    "octoberPri",
    "project",
    "september",
    "septemberPri",
    "year"
})
public class EslVO {

    protected BigDecimal april;
    protected BigDecimal aprilPri;
    protected BigDecimal august;
    protected BigDecimal augustPri;
    protected String contactType;
    protected String contracts;
    protected BigDecimal december;
    protected BigDecimal decemberPri;
    protected BigDecimal february;
    protected BigDecimal februaryPri;
    protected String id;
    protected BigDecimal january;
    protected BigDecimal januaryPri;
    protected BigDecimal july;
    protected BigDecimal julyPri;
    protected BigDecimal june;
    protected BigDecimal junePri;
    protected BigDecimal march;
    protected BigDecimal marchPri;
    protected BigDecimal may;
    protected BigDecimal mayPri;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar name;
    protected BigDecimal november;
    protected BigDecimal novemberPri;
    protected BigDecimal october;
    protected BigDecimal octoberPri;
    protected String project;
    protected BigDecimal september;
    protected BigDecimal septemberPri;
    protected String year;

    /**
     * 获取april属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApril() {
        return april;
    }

    /**
     * 设置april属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApril(BigDecimal value) {
        this.april = value;
    }

    /**
     * 获取aprilPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAprilPri() {
        return aprilPri;
    }

    /**
     * 设置aprilPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAprilPri(BigDecimal value) {
        this.aprilPri = value;
    }

    /**
     * 获取august属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAugust() {
        return august;
    }

    /**
     * 设置august属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAugust(BigDecimal value) {
        this.august = value;
    }

    /**
     * 获取augustPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAugustPri() {
        return augustPri;
    }

    /**
     * 设置augustPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAugustPri(BigDecimal value) {
        this.augustPri = value;
    }

    /**
     * 获取contactType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * 设置contactType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * 获取contracts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContracts() {
        return contracts;
    }

    /**
     * 设置contracts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContracts(String value) {
        this.contracts = value;
    }

    /**
     * 获取december属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecember() {
        return december;
    }

    /**
     * 设置december属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecember(BigDecimal value) {
        this.december = value;
    }

    /**
     * 获取decemberPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecemberPri() {
        return decemberPri;
    }

    /**
     * 设置decemberPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecemberPri(BigDecimal value) {
        this.decemberPri = value;
    }

    /**
     * 获取february属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFebruary() {
        return february;
    }

    /**
     * 设置february属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFebruary(BigDecimal value) {
        this.february = value;
    }

    /**
     * 获取februaryPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFebruaryPri() {
        return februaryPri;
    }

    /**
     * 设置februaryPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFebruaryPri(BigDecimal value) {
        this.februaryPri = value;
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
     * 获取january属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJanuary() {
        return january;
    }

    /**
     * 设置january属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJanuary(BigDecimal value) {
        this.january = value;
    }

    /**
     * 获取januaryPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJanuaryPri() {
        return januaryPri;
    }

    /**
     * 设置januaryPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJanuaryPri(BigDecimal value) {
        this.januaryPri = value;
    }

    /**
     * 获取july属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJuly() {
        return july;
    }

    /**
     * 设置july属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJuly(BigDecimal value) {
        this.july = value;
    }

    /**
     * 获取julyPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJulyPri() {
        return julyPri;
    }

    /**
     * 设置julyPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJulyPri(BigDecimal value) {
        this.julyPri = value;
    }

    /**
     * 获取june属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJune() {
        return june;
    }

    /**
     * 设置june属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJune(BigDecimal value) {
        this.june = value;
    }

    /**
     * 获取junePri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJunePri() {
        return junePri;
    }

    /**
     * 设置junePri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJunePri(BigDecimal value) {
        this.junePri = value;
    }

    /**
     * 获取march属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarch() {
        return march;
    }

    /**
     * 设置march属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarch(BigDecimal value) {
        this.march = value;
    }

    /**
     * 获取marchPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarchPri() {
        return marchPri;
    }

    /**
     * 设置marchPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarchPri(BigDecimal value) {
        this.marchPri = value;
    }

    /**
     * 获取may属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMay() {
        return may;
    }

    /**
     * 设置may属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMay(BigDecimal value) {
        this.may = value;
    }

    /**
     * 获取mayPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMayPri() {
        return mayPri;
    }

    /**
     * 设置mayPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMayPri(BigDecimal value) {
        this.mayPri = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setName(XMLGregorianCalendar value) {
        this.name = value;
    }

    /**
     * 获取november属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNovember() {
        return november;
    }

    /**
     * 设置november属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNovember(BigDecimal value) {
        this.november = value;
    }

    /**
     * 获取novemberPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNovemberPri() {
        return novemberPri;
    }

    /**
     * 设置novemberPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNovemberPri(BigDecimal value) {
        this.novemberPri = value;
    }

    /**
     * 获取october属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOctober() {
        return october;
    }

    /**
     * 设置october属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOctober(BigDecimal value) {
        this.october = value;
    }

    /**
     * 获取octoberPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOctoberPri() {
        return octoberPri;
    }

    /**
     * 设置octoberPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOctoberPri(BigDecimal value) {
        this.octoberPri = value;
    }

    /**
     * 获取project属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * 设置project属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * 获取september属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeptember() {
        return september;
    }

    /**
     * 设置september属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeptember(BigDecimal value) {
        this.september = value;
    }

    /**
     * 获取septemberPri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeptemberPri() {
        return septemberPri;
    }

    /**
     * 设置septemberPri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeptemberPri(BigDecimal value) {
        this.septemberPri = value;
    }

    /**
     * 获取year属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
