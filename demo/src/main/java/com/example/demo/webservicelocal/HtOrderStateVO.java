
package com.example.demo.webservicelocal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>htOrderStateVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="htOrderStateVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalOpinion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterNumberVOS" type="{http://netHallContract.mdm.com}meterNumberVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "htOrderStateVO", propOrder = {
    "approvalOpinion",
    "approvalStatus",
    "contractOrderId",
    "meterNumberVOS"
})
public class HtOrderStateVO {

    protected String approvalOpinion;
    protected String approvalStatus;
    protected String contractOrderId;
    @XmlElement(nillable = true)
    protected List<MeterNumberVO> meterNumberVOS;

    /**
     * 获取approvalOpinion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalOpinion() {
        return approvalOpinion;
    }

    /**
     * 设置approvalOpinion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalOpinion(String value) {
        this.approvalOpinion = value;
    }

    /**
     * 获取approvalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置approvalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalStatus(String value) {
        this.approvalStatus = value;
    }

    /**
     * 获取contractOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractOrderId() {
        return contractOrderId;
    }

    /**
     * 设置contractOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractOrderId(String value) {
        this.contractOrderId = value;
    }

    /**
     * Gets the value of the meterNumberVOS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterNumberVOS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterNumberVOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterNumberVO }
     * 
     * 
     */
    public List<MeterNumberVO> getMeterNumberVOS() {
        if (meterNumberVOS == null) {
            meterNumberVOS = new ArrayList<MeterNumberVO>();
        }
        return this.meterNumberVOS;
    }

}
