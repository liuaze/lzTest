
package com.example.demo.webservicelocal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.webservicelocal package. 
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

    private final static QName _ImportPackage_QNAME = new QName("http://netHallContract.mdm.com", "importPackage");
    private final static QName _UpdateContractOfIntentionStateResponse_QNAME = new QName("http://netHallContract.mdm.com", "updateContractOfIntentionStateResponse");
    private final static QName _UpdateContractOfIntentionState_QNAME = new QName("http://netHallContract.mdm.com", "updateContractOfIntentionState");
    private final static QName _ImportPackageResponse_QNAME = new QName("http://netHallContract.mdm.com", "importPackageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.webservicelocal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportPackage }
     * 
     */
    public ImportPackage createImportPackage() {
        return new ImportPackage();
    }

    /**
     * Create an instance of {@link UpdateContractOfIntentionStateResponse }
     * 
     */
    public UpdateContractOfIntentionStateResponse createUpdateContractOfIntentionStateResponse() {
        return new UpdateContractOfIntentionStateResponse();
    }

    /**
     * Create an instance of {@link ImportPackageResponse }
     * 
     */
    public ImportPackageResponse createImportPackageResponse() {
        return new ImportPackageResponse();
    }

    /**
     * Create an instance of {@link UpdateContractOfIntentionState }
     * 
     */
    public UpdateContractOfIntentionState createUpdateContractOfIntentionState() {
        return new UpdateContractOfIntentionState();
    }

    /**
     * Create an instance of {@link HtSetmealPackagefieldVO }
     * 
     */
    public HtSetmealPackagefieldVO createHtSetmealPackagefieldVO() {
        return new HtSetmealPackagefieldVO();
    }

    /**
     * Create an instance of {@link ObjectRestResponse }
     * 
     */
    public ObjectRestResponse createObjectRestResponse() {
        return new ObjectRestResponse();
    }

    /**
     * Create an instance of {@link HtSetmealVO }
     * 
     */
    public HtSetmealVO createHtSetmealVO() {
        return new HtSetmealVO();
    }

    /**
     * Create an instance of {@link HtOrderStateVO }
     * 
     */
    public HtOrderStateVO createHtOrderStateVO() {
        return new HtOrderStateVO();
    }

    /**
     * Create an instance of {@link HtSettlementIndexVO }
     * 
     */
    public HtSettlementIndexVO createHtSettlementIndexVO() {
        return new HtSettlementIndexVO();
    }

    /**
     * Create an instance of {@link MeterNumberVO }
     * 
     */
    public MeterNumberVO createMeterNumberVO() {
        return new MeterNumberVO();
    }

    /**
     * Create an instance of {@link SetmealVO }
     * 
     */
    public SetmealVO createSetmealVO() {
        return new SetmealVO();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netHallContract.mdm.com", name = "importPackage")
    public JAXBElement<ImportPackage> createImportPackage(ImportPackage value) {
        return new JAXBElement<ImportPackage>(_ImportPackage_QNAME, ImportPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContractOfIntentionStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netHallContract.mdm.com", name = "updateContractOfIntentionStateResponse")
    public JAXBElement<UpdateContractOfIntentionStateResponse> createUpdateContractOfIntentionStateResponse(UpdateContractOfIntentionStateResponse value) {
        return new JAXBElement<UpdateContractOfIntentionStateResponse>(_UpdateContractOfIntentionStateResponse_QNAME, UpdateContractOfIntentionStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContractOfIntentionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netHallContract.mdm.com", name = "updateContractOfIntentionState")
    public JAXBElement<UpdateContractOfIntentionState> createUpdateContractOfIntentionState(UpdateContractOfIntentionState value) {
        return new JAXBElement<UpdateContractOfIntentionState>(_UpdateContractOfIntentionState_QNAME, UpdateContractOfIntentionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netHallContract.mdm.com", name = "importPackageResponse")
    public JAXBElement<ImportPackageResponse> createImportPackageResponse(ImportPackageResponse value) {
        return new JAXBElement<ImportPackageResponse>(_ImportPackageResponse_QNAME, ImportPackageResponse.class, null, value);
    }

}
