
package com.example.demo.net;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>netContractSaveOrUpdate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="netContractSaveOrUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netContractParam" type="{http://netcontractService.service.marketing.clickpaas.com/}netContractParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "netContractSaveOrUpdate", propOrder = {
    "netContractParam"
})
public class NetContractSaveOrUpdate {

    protected NetContractParam netContractParam;

    /**
     * 获取netContractParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetContractParam }
     *     
     */
    public NetContractParam getNetContractParam() {
        return netContractParam;
    }

    /**
     * 设置netContractParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetContractParam }
     *     
     */
    public void setNetContractParam(NetContractParam value) {
        this.netContractParam = value;
    }

}
