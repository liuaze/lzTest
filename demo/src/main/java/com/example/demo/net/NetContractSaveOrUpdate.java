
package com.example.demo.net;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>netContractSaveOrUpdate complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡnetContractParam���Ե�ֵ��
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
     * ����netContractParam���Ե�ֵ��
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
