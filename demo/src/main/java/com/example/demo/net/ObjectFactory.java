
package com.example.demo.net;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.net package. 
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

    private final static QName _NetContractSaveOrUpdate_QNAME = new QName("http://netcontractService.service.marketing.clickpaas.com/", "netContractSaveOrUpdate");
    private final static QName _QuerySaleRemainEleInfoResponse_QNAME = new QName("http://netcontractService.service.marketing.clickpaas.com/", "querySaleRemainEleInfoResponse");
    private final static QName _NetContractSaveOrUpdateResponse_QNAME = new QName("http://netcontractService.service.marketing.clickpaas.com/", "netContractSaveOrUpdateResponse");
    private final static QName _QuerySaleRemainEleInfo_QNAME = new QName("http://netcontractService.service.marketing.clickpaas.com/", "querySaleRemainEleInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.net
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NetContractRespParam }
     * 
     */
    public NetContractRespParam createNetContractRespParam() {
        return new NetContractRespParam();
    }

    /**
     * Create an instance of {@link NetContractRespParam.Data }
     * 
     */
    public NetContractRespParam.Data createNetContractRespParamData() {
        return new NetContractRespParam.Data();
    }

    /**
     * Create an instance of {@link NetContractSaveOrUpdateResponse }
     * 
     */
    public NetContractSaveOrUpdateResponse createNetContractSaveOrUpdateResponse() {
        return new NetContractSaveOrUpdateResponse();
    }

    /**
     * Create an instance of {@link QuerySaleRemainEleInfo }
     * 
     */
    public QuerySaleRemainEleInfo createQuerySaleRemainEleInfo() {
        return new QuerySaleRemainEleInfo();
    }

    /**
     * Create an instance of {@link NetContractSaveOrUpdate }
     * 
     */
    public NetContractSaveOrUpdate createNetContractSaveOrUpdate() {
        return new NetContractSaveOrUpdate();
    }

    /**
     * Create an instance of {@link QuerySaleRemainEleInfoResponse }
     * 
     */
    public QuerySaleRemainEleInfoResponse createQuerySaleRemainEleInfoResponse() {
        return new QuerySaleRemainEleInfoResponse();
    }

    /**
     * Create an instance of {@link SaleContractEntity }
     * 
     */
    public SaleContractEntity createSaleContractEntity() {
        return new SaleContractEntity();
    }

    /**
     * Create an instance of {@link NoEntity }
     * 
     */
    public NoEntity createNoEntity() {
        return new NoEntity();
    }

    /**
     * Create an instance of {@link NetContractParam }
     * 
     */
    public NetContractParam createNetContractParam() {
        return new NetContractParam();
    }

    /**
     * Create an instance of {@link IndexEntity }
     * 
     */
    public IndexEntity createIndexEntity() {
        return new IndexEntity();
    }

    /**
     * Create an instance of {@link AttachmentEntity }
     * 
     */
    public AttachmentEntity createAttachmentEntity() {
        return new AttachmentEntity();
    }

    /**
     * Create an instance of {@link EslEntity }
     * 
     */
    public EslEntity createEslEntity() {
        return new EslEntity();
    }

    /**
     * Create an instance of {@link AttachmentPathParam }
     * 
     */
    public AttachmentPathParam createAttachmentPathParam() {
        return new AttachmentPathParam();
    }

    /**
     * Create an instance of {@link NetContractRespParam.Data.Entry }
     * 
     */
    public NetContractRespParam.Data.Entry createNetContractRespParamDataEntry() {
        return new NetContractRespParam.Data.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetContractSaveOrUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netcontractService.service.marketing.clickpaas.com/", name = "netContractSaveOrUpdate")
    public JAXBElement<NetContractSaveOrUpdate> createNetContractSaveOrUpdate(NetContractSaveOrUpdate value) {
        return new JAXBElement<NetContractSaveOrUpdate>(_NetContractSaveOrUpdate_QNAME, NetContractSaveOrUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySaleRemainEleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netcontractService.service.marketing.clickpaas.com/", name = "querySaleRemainEleInfoResponse")
    public JAXBElement<QuerySaleRemainEleInfoResponse> createQuerySaleRemainEleInfoResponse(QuerySaleRemainEleInfoResponse value) {
        return new JAXBElement<QuerySaleRemainEleInfoResponse>(_QuerySaleRemainEleInfoResponse_QNAME, QuerySaleRemainEleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetContractSaveOrUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netcontractService.service.marketing.clickpaas.com/", name = "netContractSaveOrUpdateResponse")
    public JAXBElement<NetContractSaveOrUpdateResponse> createNetContractSaveOrUpdateResponse(NetContractSaveOrUpdateResponse value) {
        return new JAXBElement<NetContractSaveOrUpdateResponse>(_NetContractSaveOrUpdateResponse_QNAME, NetContractSaveOrUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySaleRemainEleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netcontractService.service.marketing.clickpaas.com/", name = "querySaleRemainEleInfo")
    public JAXBElement<QuerySaleRemainEleInfo> createQuerySaleRemainEleInfo(QuerySaleRemainEleInfo value) {
        return new JAXBElement<QuerySaleRemainEleInfo>(_QuerySaleRemainEleInfo_QNAME, QuerySaleRemainEleInfo.class, null, value);
    }

}
