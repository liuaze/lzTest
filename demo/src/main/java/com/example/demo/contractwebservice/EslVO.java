
package com.example.demo.contractwebservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>eslVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapril���Ե�ֵ��
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
     * ����april���Ե�ֵ��
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
     * ��ȡaprilPri���Ե�ֵ��
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
     * ����aprilPri���Ե�ֵ��
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
     * ��ȡaugust���Ե�ֵ��
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
     * ����august���Ե�ֵ��
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
     * ��ȡaugustPri���Ե�ֵ��
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
     * ����augustPri���Ե�ֵ��
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
     * ��ȡcontactType���Ե�ֵ��
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
     * ����contactType���Ե�ֵ��
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
     * ��ȡcontracts���Ե�ֵ��
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
     * ����contracts���Ե�ֵ��
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
     * ��ȡdecember���Ե�ֵ��
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
     * ����december���Ե�ֵ��
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
     * ��ȡdecemberPri���Ե�ֵ��
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
     * ����decemberPri���Ե�ֵ��
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
     * ��ȡfebruary���Ե�ֵ��
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
     * ����february���Ե�ֵ��
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
     * ��ȡfebruaryPri���Ե�ֵ��
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
     * ����februaryPri���Ե�ֵ��
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
     * ��ȡjanuary���Ե�ֵ��
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
     * ����january���Ե�ֵ��
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
     * ��ȡjanuaryPri���Ե�ֵ��
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
     * ����januaryPri���Ե�ֵ��
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
     * ��ȡjuly���Ե�ֵ��
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
     * ����july���Ե�ֵ��
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
     * ��ȡjulyPri���Ե�ֵ��
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
     * ����julyPri���Ե�ֵ��
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
     * ��ȡjune���Ե�ֵ��
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
     * ����june���Ե�ֵ��
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
     * ��ȡjunePri���Ե�ֵ��
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
     * ����junePri���Ե�ֵ��
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
     * ��ȡmarch���Ե�ֵ��
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
     * ����march���Ե�ֵ��
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
     * ��ȡmarchPri���Ե�ֵ��
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
     * ����marchPri���Ե�ֵ��
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
     * ��ȡmay���Ե�ֵ��
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
     * ����may���Ե�ֵ��
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
     * ��ȡmayPri���Ե�ֵ��
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
     * ����mayPri���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡnovember���Ե�ֵ��
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
     * ����november���Ե�ֵ��
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
     * ��ȡnovemberPri���Ե�ֵ��
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
     * ����novemberPri���Ե�ֵ��
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
     * ��ȡoctober���Ե�ֵ��
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
     * ����october���Ե�ֵ��
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
     * ��ȡoctoberPri���Ե�ֵ��
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
     * ����octoberPri���Ե�ֵ��
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
     * ��ȡproject���Ե�ֵ��
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
     * ����project���Ե�ֵ��
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
     * ��ȡseptember���Ե�ֵ��
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
     * ����september���Ե�ֵ��
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
     * ��ȡseptemberPri���Ե�ֵ��
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
     * ����septemberPri���Ե�ֵ��
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
     * ��ȡyear���Ե�ֵ��
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
     * ����year���Ե�ֵ��
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
