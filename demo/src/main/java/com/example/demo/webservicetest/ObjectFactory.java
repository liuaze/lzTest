
package com.example.demo.webservicetest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.webservicetest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertDevEle_QNAME = new QName("http://contract.mdm.com", "insertDevEle");
    private final static QName _InsertDevEleResponse_QNAME = new QName("http://contract.mdm.com", "insertDevEleResponse");
    private final static QName _InsertResponse_QNAME = new QName("http://contract.mdm.com", "insertResponse");
    private final static QName _Insert_QNAME = new QName("http://contract.mdm.com", "insert");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.webservicetest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertDevEleResponse }
     * 
     */
    public InsertDevEleResponse createInsertDevEleResponse() {
        return new InsertDevEleResponse();
    }

    /**
     * Create an instance of {@link InsertDevEle }
     * 
     */
    public InsertDevEle createInsertDevEle() {
        return new InsertDevEle();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link ObjectRestResponse }
     * 
     */
    public ObjectRestResponse createObjectRestResponse() {
        return new ObjectRestResponse();
    }

    /**
     * Create an instance of {@link IndexRangeVO }
     * 
     */
    public IndexRangeVO createIndexRangeVO() {
        return new IndexRangeVO();
    }

    /**
     * Create an instance of {@link DevEleVO }
     * 
     */
    public DevEleVO createDevEleVO() {
        return new DevEleVO();
    }

    /**
     * Create an instance of {@link SaleContractVO }
     * 
     */
    public SaleContractVO createSaleContractVO() {
        return new SaleContractVO();
    }

    /**
     * Create an instance of {@link InterfaceLogVO }
     * 
     */
    public InterfaceLogVO createInterfaceLogVO() {
        return new InterfaceLogVO();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link ContractRequestVO }
     * 
     */
    public ContractRequestVO createContractRequestVO() {
        return new ContractRequestVO();
    }

    /**
     * Create an instance of {@link ElectricityConsumVO }
     * 
     */
    public ElectricityConsumVO createElectricityConsumVO() {
        return new ElectricityConsumVO();
    }

    /**
     * Create an instance of {@link EslVO }
     * 
     */
    public EslVO createEslVO() {
        return new EslVO();
    }

    /**
     * Create an instance of {@link SettleRulesVO }
     * 
     */
    public SettleRulesVO createSettleRulesVO() {
        return new SettleRulesVO();
    }

    /**
     * Create an instance of {@link ContractDevEleRequestVO }
     * 
     */
    public ContractDevEleRequestVO createContractDevEleRequestVO() {
        return new ContractDevEleRequestVO();
    }

    /**
     * Create an instance of {@link SettleInfVO }
     * 
     */
    public SettleInfVO createSettleInfVO() {
        return new SettleInfVO();
    }

    /**
     * Create an instance of {@link IndexVO }
     * 
     */
    public IndexVO createIndexVO() {
        return new IndexVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDevEle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contract.mdm.com", name = "insertDevEle")
    public JAXBElement<InsertDevEle> createInsertDevEle(InsertDevEle value) {
        return new JAXBElement<InsertDevEle>(_InsertDevEle_QNAME, InsertDevEle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDevEleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contract.mdm.com", name = "insertDevEleResponse")
    public JAXBElement<InsertDevEleResponse> createInsertDevEleResponse(InsertDevEleResponse value) {
        return new JAXBElement<InsertDevEleResponse>(_InsertDevEleResponse_QNAME, InsertDevEleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contract.mdm.com", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://contract.mdm.com", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

}
