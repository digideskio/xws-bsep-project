
package team9.ws.faktura;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Faktura", targetNamespace = "http://team9/ws/faktura")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Faktura {


    /**
     * 
     * @param stavka
     * @param zaglavlje
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "success", targetNamespace = "")
    @RequestWrapper(localName = "faktura", targetNamespace = "http://team9/ws/faktura", className = "team9.ws.faktura.Faktura_Type")
    @ResponseWrapper(localName = "fakturaResponse", targetNamespace = "http://team9/ws/faktura", className = "team9.ws.faktura.FakturaResponse")
    public boolean faktura(
        @WebParam(name = "zaglavlje", targetNamespace = "http://team9/ws/faktura")
        team9.ws.faktura.Faktura_Type.Zaglavlje zaglavlje,
        @WebParam(name = "stavka", targetNamespace = "http://team9/ws/faktura")
        List<team9.ws.faktura.Faktura_Type.Stavka> stavka);

}