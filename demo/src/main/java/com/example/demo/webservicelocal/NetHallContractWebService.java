
package com.example.demo.webservicelocal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "netHallContractWebService", targetNamespace = "http://netHallContract.mdm.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NetHallContractWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.demo.webservicelocal.ObjectRestResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "importPackage", targetNamespace = "http://netHallContract.mdm.com", className = "com.example.demo.webservicelocal.ImportPackage")
    @ResponseWrapper(localName = "importPackageResponse", targetNamespace = "http://netHallContract.mdm.com", className = "com.example.demo.webservicelocal.ImportPackageResponse")
    public ObjectRestResponse importPackage(
        @WebParam(name = "arg0", targetNamespace = "")
        SetmealVO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.demo.webservicelocal.ObjectRestResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateContractOfIntentionState", targetNamespace = "http://netHallContract.mdm.com", className = "com.example.demo.webservicelocal.UpdateContractOfIntentionState")
    @ResponseWrapper(localName = "updateContractOfIntentionStateResponse", targetNamespace = "http://netHallContract.mdm.com", className = "com.example.demo.webservicelocal.UpdateContractOfIntentionStateResponse")
    public ObjectRestResponse updateContractOfIntentionState(
        @WebParam(name = "arg0", targetNamespace = "")
        HtOrderStateVO arg0);

}
