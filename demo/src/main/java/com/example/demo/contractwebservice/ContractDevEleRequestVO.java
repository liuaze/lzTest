
package com.example.demo.contractwebservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractDevEleRequestVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="contractDevEleRequestVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devEleVO" type="{http://contract.mdm.com}devEleVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractDevEleRequestVO", propOrder = {
    "contractId",
    "devEleVO",
    "num"
})
public class ContractDevEleRequestVO {

    protected String contractId;
    @XmlElement(nillable = true)
    protected List<DevEleVO> devEleVO;
    protected String num;

    /**
     * ��ȡcontractId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * ����contractId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the devEleVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devEleVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevEleVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevEleVO }
     * 
     * 
     */
    public List<DevEleVO> getDevEleVO() {
        if (devEleVO == null) {
            devEleVO = new ArrayList<DevEleVO>();
        }
        return this.devEleVO;
    }

    /**
     * ��ȡnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * ����num���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

}
