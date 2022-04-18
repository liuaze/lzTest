
package com.example.demo.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tCrewReqVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tCrewReqVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crewVos" type="{http://service.dlyx.ccie.com}tCrewVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hydropowerVos" type="{http://service.dlyx.ccie.com}tHydropowerVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="windVos" type="{http://service.dlyx.ccie.com}tWindVo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCrewReqVo", propOrder = {
    "crewVos",
    "hydropowerVos",
    "windVos"
})
public class TCrewReqVo {

    @XmlElement(nillable = true)
    protected List<TCrewVo> crewVos;
    @XmlElement(nillable = true)
    protected List<THydropowerVo> hydropowerVos;
    @XmlElement(nillable = true)
    protected List<TWindVo> windVos;

    /**
     * Gets the value of the crewVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCrewVo }
     * 
     * 
     */
    public List<TCrewVo> getCrewVos() {
        if (crewVos == null) {
            crewVos = new ArrayList<TCrewVo>();
        }
        return this.crewVos;
    }

    /**
     * Gets the value of the hydropowerVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydropowerVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHydropowerVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THydropowerVo }
     * 
     * 
     */
    public List<THydropowerVo> getHydropowerVos() {
        if (hydropowerVos == null) {
            hydropowerVos = new ArrayList<THydropowerVo>();
        }
        return this.hydropowerVos;
    }

    /**
     * Gets the value of the windVos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windVos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindVos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TWindVo }
     * 
     * 
     */
    public List<TWindVo> getWindVos() {
        if (windVos == null) {
            windVos = new ArrayList<TWindVo>();
        }
        return this.windVos;
    }

}
