
package com.example.demo.webservicetest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>customerReqVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="customerReqVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactsVos" type="{http://service.dlyx.ccie.com}tContactsVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerVo" type="{http://service.dlyx.ccie.com}tCustomerVo" minOccurs="0"/>
 *         &lt;element name="historicalConsumptionVos" type="{http://service.dlyx.ccie.com}tHistoricalConsumptionVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noVos" type="{http://service.dlyx.ccie.com}tNoVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TAgencyRelationshipVos" type="{http://service.dlyx.ccie.com}tAgencyRelationshipVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TBankAccountVo" type="{http://service.dlyx.ccie.com}tBankAccountVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerReqVo", propOrder = {
    "contactsVos",
    "customerVo",
    "historicalConsumptionVos",
    "noVos",
    "tAgencyRelationshipVos",
    "tBankAccountVo"
})
public class CustomerReqVo {

    @XmlElement(nillable = true)
    protected List<TContactsVo> contactsVos;
    protected TCustomerVo customerVo;
    @XmlElement(nillable = true)
    protected List<THistoricalConsumptionVo> historicalConsumptionVos;
    @XmlElement(nillable = true)
    protected List<TNoVo> noVos;
    @XmlElement(name = "TAgencyRelationshipVos", nillable = true)
    protected List<TAgencyRelationshipVo> tAgencyRelationshipVos;
    @XmlElement(name = "TBankAccountVo")
    protected TBankAccountVo tBankAccountVo;

    /**
     * Gets the value of the contactsVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactsVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactsVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TContactsVo }
     * 
     * 
     */
    public List<TContactsVo> getContactsVos() {
        if (contactsVos == null) {
            contactsVos = new ArrayList<TContactsVo>();
        }
        return this.contactsVos;
    }

    /**
     * 获取customerVo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TCustomerVo }
     *     
     */
    public TCustomerVo getCustomerVo() {
        return customerVo;
    }

    /**
     * 设置customerVo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerVo }
     *     
     */
    public void setCustomerVo(TCustomerVo value) {
        this.customerVo = value;
    }

    /**
     * Gets the value of the historicalConsumptionVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicalConsumptionVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalConsumptionVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THistoricalConsumptionVo }
     * 
     * 
     */
    public List<THistoricalConsumptionVo> getHistoricalConsumptionVos() {
        if (historicalConsumptionVos == null) {
            historicalConsumptionVos = new ArrayList<THistoricalConsumptionVo>();
        }
        return this.historicalConsumptionVos;
    }

    /**
     * Gets the value of the noVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNoVo }
     * 
     * 
     */
    public List<TNoVo> getNoVos() {
        if (noVos == null) {
            noVos = new ArrayList<TNoVo>();
        }
        return this.noVos;
    }

    /**
     * Gets the value of the tAgencyRelationshipVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tAgencyRelationshipVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAgencyRelationshipVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAgencyRelationshipVo }
     * 
     * 
     */
    public List<TAgencyRelationshipVo> getTAgencyRelationshipVos() {
        if (tAgencyRelationshipVos == null) {
            tAgencyRelationshipVos = new ArrayList<TAgencyRelationshipVo>();
        }
        return this.tAgencyRelationshipVos;
    }

    /**
     * 获取tBankAccountVo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TBankAccountVo }
     *     
     */
    public TBankAccountVo getTBankAccountVo() {
        return tBankAccountVo;
    }

    /**
     * 设置tBankAccountVo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TBankAccountVo }
     *     
     */
    public void setTBankAccountVo(TBankAccountVo value) {
        this.tBankAccountVo = value;
    }

}
