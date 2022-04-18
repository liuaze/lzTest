
package com.example.demo.webservice;

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
@WebService(name = "contractWebService", targetNamespace = "http://contract.mdm.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContractWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.demo.webservice.ObjectRestResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertDevEle", targetNamespace = "http://contract.mdm.com", className = "com.example.demo.webservice.InsertDevEle")
    @ResponseWrapper(localName = "insertDevEleResponse", targetNamespace = "http://contract.mdm.com", className = "com.example.demo.webservice.InsertDevEleResponse")
    public ObjectRestResponse insertDevEle(
        @WebParam(name = "arg0", targetNamespace = "")
        ContractDevEleRequestVO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.demo.webservice.ObjectRestResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insert", targetNamespace = "http://contract.mdm.com", className = "com.example.demo.webservice.Insert")
    @ResponseWrapper(localName = "insertResponse", targetNamespace = "http://contract.mdm.com", className = "com.example.demo.webservice.InsertResponse")
    public ObjectRestResponse insert(
        @WebParam(name = "arg0", targetNamespace = "")
        ContractRequestVO arg0);

}
