
package com.example.demo.webservicelocal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>insertHighSeas complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="insertHighSeas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.dlyx.ccie.com}highSeasReqVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertHighSeas", propOrder = {
    "arg0"
})
public class InsertHighSeas {

    protected HighSeasReqVo arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HighSeasReqVo }
     *     
     */
    public HighSeasReqVo getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HighSeasReqVo }
     *     
     */
    public void setArg0(HighSeasReqVo value) {
        this.arg0 = value;
    }

}
