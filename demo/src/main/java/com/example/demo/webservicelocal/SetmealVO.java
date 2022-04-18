
package com.example.demo.webservicelocal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>setmealVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="setmealVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldList" type="{http://netHallContract.mdm.com}htSetmealPackagefieldVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="htSetmealVO" type="{http://netHallContract.mdm.com}htSetmealVO" minOccurs="0"/>
 *         &lt;element name="index" type="{http://netHallContract.mdm.com}htSettlementIndexVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setmealVO", propOrder = {
    "fieldList",
    "htSetmealVO",
    "index"
})
public class SetmealVO {

    @XmlElement(nillable = true)
    protected List<HtSetmealPackagefieldVO> fieldList;
    protected HtSetmealVO htSetmealVO;
    @XmlElement(nillable = true)
    protected List<HtSettlementIndexVO> index;

    /**
     * Gets the value of the fieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HtSetmealPackagefieldVO }
     * 
     * 
     */
    public List<HtSetmealPackagefieldVO> getFieldList() {
        if (fieldList == null) {
            fieldList = new ArrayList<HtSetmealPackagefieldVO>();
        }
        return this.fieldList;
    }

    /**
     * 获取htSetmealVO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HtSetmealVO }
     *     
     */
    public HtSetmealVO getHtSetmealVO() {
        return htSetmealVO;
    }

    /**
     * 设置htSetmealVO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HtSetmealVO }
     *     
     */
    public void setHtSetmealVO(HtSetmealVO value) {
        this.htSetmealVO = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the index property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HtSettlementIndexVO }
     * 
     * 
     */
    public List<HtSettlementIndexVO> getIndex() {
        if (index == null) {
            index = new ArrayList<HtSettlementIndexVO>();
        }
        return this.index;
    }

}
