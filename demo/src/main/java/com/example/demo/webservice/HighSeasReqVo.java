
package com.example.demo.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>highSeasReqVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="highSeasReqVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactsVO" type="{http://service.dlyx.ccie.com}tContactsVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerVO" type="{http://service.dlyx.ccie.com}customerVO" minOccurs="0"/>
 *         &lt;element name="historicalConsumptionVo" type="{http://service.dlyx.ccie.com}tHistoricalConsumptionVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noVO" type="{http://service.dlyx.ccie.com}tNoVo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "highSeasReqVo", propOrder = {
    "contactsVO",
    "customerVO",
    "historicalConsumptionVo",
    "noVO"
})
public class HighSeasReqVo {

    @XmlElement(nillable = true)
    protected List<TContactsVo> contactsVO;
    protected CustomerVO customerVO;
    @XmlElement(nillable = true)
    protected List<THistoricalConsumptionVo> historicalConsumptionVo;
    @XmlElement(nillable = true)
    protected List<TNoVo> noVO;

    /**
     * Gets the value of the contactsVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactsVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactsVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TContactsVo }
     * 
     * 
     */
    public List<TContactsVo> getContactsVO() {
        if (contactsVO == null) {
            contactsVO = new ArrayList<TContactsVo>();
        }
        return this.contactsVO;
    }

    /**
     * 获取customerVO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerVO }
     *     
     */
    public CustomerVO getCustomerVO() {
        return customerVO;
    }

    /**
     * 设置customerVO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerVO }
     *     
     */
    public void setCustomerVO(CustomerVO value) {
        this.customerVO = value;
    }

    /**
     * Gets the value of the historicalConsumptionVo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicalConsumptionVo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalConsumptionVo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THistoricalConsumptionVo }
     * 
     * 
     */
    public List<THistoricalConsumptionVo> getHistoricalConsumptionVo() {
        if (historicalConsumptionVo == null) {
            historicalConsumptionVo = new ArrayList<THistoricalConsumptionVo>();
        }
        return this.historicalConsumptionVo;
    }

    /**
     * Gets the value of the noVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNoVo }
     * 
     * 
     */
    public List<TNoVo> getNoVO() {
        if (noVO == null) {
            noVO = new ArrayList<TNoVo>();
        }
        return this.noVO;
    }

}
