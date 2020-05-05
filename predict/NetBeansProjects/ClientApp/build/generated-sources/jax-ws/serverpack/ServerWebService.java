
package serverpack;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServerWebService", targetNamespace = "http://serverpack/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServerWebService {


    /**
     * 
     * @param b
     * @param old
     * @param sex
     * @param k
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://serverpack/", className = "serverpack.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://serverpack/", className = "serverpack.OperationResponse")
    @Action(input = "http://serverpack/ServerWebService/operationRequest", output = "http://serverpack/ServerWebService/operationResponse")
    public String operation(
        @WebParam(name = "k", targetNamespace = "")
        String k,
        @WebParam(name = "b", targetNamespace = "")
        String b,
        @WebParam(name = "sex", targetNamespace = "")
        String sex,
        @WebParam(name = "old", targetNamespace = "")
        String old);

}
