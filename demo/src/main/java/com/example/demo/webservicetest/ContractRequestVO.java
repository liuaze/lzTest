
package com.example.demo.webservicetest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractRequestVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractRequestVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="electricityConsumVO" type="{http://contract.mdm.com}electricityConsumVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eslVO" type="{http://contract.mdm.com}eslVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indexRangeVO" type="{http://contract.mdm.com}indexRangeVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indexVO" type="{http://contract.mdm.com}indexVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interfaceLogVO" type="{http://contract.mdm.com}interfaceLogVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="saleContractVO" type="{http://contract.mdm.com}saleContractVO" minOccurs="0"/>
 *         &lt;element name="settleInfVO" type="{http://contract.mdm.com}settleInfVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settleRulesVO" type="{http://contract.mdm.com}settleRulesVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractRequestVO", propOrder = {
    "electricityConsumVO",
    "eslVO",
    "indexRangeVO",
    "indexVO",
    "interfaceLogVO",
    "saleContractVO",
    "settleInfVO",
    "settleRulesVO"
})
public class ContractRequestVO {

    @XmlElement(nillable = true)
    protected List<ElectricityConsumVO> electricityConsumVO;
    @XmlElement(nillable = true)
    protected List<EslVO> eslVO;
    @XmlElement(nillable = true)
    protected List<IndexRangeVO> indexRangeVO;
    @XmlElement(nillable = true)
    protected List<IndexVO> indexVO;
    @XmlElement(nillable = true)
    protected List<InterfaceLogVO> interfaceLogVO;
    protected SaleContractVO saleContractVO;
    @XmlElement(nillable = true)
    protected List<SettleInfVO> settleInfVO;
    @XmlElement(nillable = true)
    protected List<SettleRulesVO> settleRulesVO;

    /**
     * Gets the value of the electricityConsumVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricityConsumVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricityConsumVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricityConsumVO }
     * 
     * 
     */
    public List<ElectricityConsumVO> getElectricityConsumVO() {
        if (electricityConsumVO == null) {
            electricityConsumVO = new ArrayList<ElectricityConsumVO>();
        }
        return this.electricityConsumVO;
    }

    /**
     * Gets the value of the eslVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eslVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEslVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EslVO }
     * 
     * 
     */
    public List<EslVO> getEslVO() {
        if (eslVO == null) {
            eslVO = new ArrayList<EslVO>();
        }
        return this.eslVO;
    }

    /**
     * Gets the value of the indexRangeVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexRangeVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexRangeVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexRangeVO }
     * 
     * 
     */
    public List<IndexRangeVO> getIndexRangeVO() {
        if (indexRangeVO == null) {
            indexRangeVO = new ArrayList<IndexRangeVO>();
        }
        return this.indexRangeVO;
    }

    /**
     * Gets the value of the indexVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexVO }
     * 
     * 
     */
    public List<IndexVO> getIndexVO() {
        if (indexVO == null) {
            indexVO = new ArrayList<IndexVO>();
        }
        return this.indexVO;
    }

    /**
     * Gets the value of the interfaceLogVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceLogVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceLogVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceLogVO }
     * 
     * 
     */
    public List<InterfaceLogVO> getInterfaceLogVO() {
        if (interfaceLogVO == null) {
            interfaceLogVO = new ArrayList<InterfaceLogVO>();
        }
        return this.interfaceLogVO;
    }

    /**
     * 获取saleContractVO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaleContractVO }
     *     
     */
    public SaleContractVO getSaleContractVO() {
        return saleContractVO;
    }

    /**
     * 设置saleContractVO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContractVO }
     *     
     */
    public void setSaleContractVO(SaleContractVO value) {
        this.saleContractVO = value;
    }

    /**
     * Gets the value of the settleInfVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settleInfVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettleInfVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettleInfVO }
     * 
     * 
     */
    public List<SettleInfVO> getSettleInfVO() {
        if (settleInfVO == null) {
            settleInfVO = new ArrayList<SettleInfVO>();
        }
        return this.settleInfVO;
    }

    /**
     * Gets the value of the settleRulesVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settleRulesVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettleRulesVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettleRulesVO }
     * 
     * 
     */
    public List<SettleRulesVO> getSettleRulesVO() {
        if (settleRulesVO == null) {
            settleRulesVO = new ArrayList<SettleRulesVO>();
        }
        return this.settleRulesVO;
    }

}
