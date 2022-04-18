
package com.example.demo.net;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>netContractParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="netContractParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentEntityList" type="{http://netcontractService.service.marketing.clickpaas.com/}attachmentEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indexEntityList" type="{http://netcontractService.service.marketing.clickpaas.com/}indexEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noEntityList" type="{http://netcontractService.service.marketing.clickpaas.com/}noEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="saleContractEntity" type="{http://netcontractService.service.marketing.clickpaas.com/}saleContractEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "netContractParam", propOrder = {
    "attachmentEntityList",
    "indexEntityList",
    "noEntityList",
    "saleContractEntity"
})
public class NetContractParam {

    @XmlElement(nillable = true)
    protected List<AttachmentEntity> attachmentEntityList;
    @XmlElement(nillable = true)
    protected List<IndexEntity> indexEntityList;
    @XmlElement(nillable = true)
    protected List<NoEntity> noEntityList;
    protected SaleContractEntity saleContractEntity;

    /**
     * Gets the value of the attachmentEntityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentEntityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentEntity }
     * 
     * 
     */
    public List<AttachmentEntity> getAttachmentEntityList() {
        if (attachmentEntityList == null) {
            attachmentEntityList = new ArrayList<AttachmentEntity>();
        }
        return this.attachmentEntityList;
    }

    /**
     * Gets the value of the indexEntityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexEntityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexEntity }
     * 
     * 
     */
    public List<IndexEntity> getIndexEntityList() {
        if (indexEntityList == null) {
            indexEntityList = new ArrayList<IndexEntity>();
        }
        return this.indexEntityList;
    }

    /**
     * Gets the value of the noEntityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noEntityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoEntity }
     * 
     * 
     */
    public List<NoEntity> getNoEntityList() {
        if (noEntityList == null) {
            noEntityList = new ArrayList<NoEntity>();
        }
        return this.noEntityList;
    }

    /**
     * 获取saleContractEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaleContractEntity }
     *     
     */
    public SaleContractEntity getSaleContractEntity() {
        return saleContractEntity;
    }

    /**
     * 设置saleContractEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContractEntity }
     *     
     */
    public void setSaleContractEntity(SaleContractEntity value) {
        this.saleContractEntity = value;
    }

}
