
package team9.ws.rtgs_nalog;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RTGS_nalog", targetNamespace = "http://team9/ws/RTGS_nalog")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RTGSNalog {


    /**
     * 
     * @param iznos
     * @param zaduzenje
     * @param duznikNalogodavac
     * @param odobrenje
     * @param datumValute
     * @param primalacPoverilac
     * @param datumNaloga
     * @param svrha
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "RTGS_nalog")
    @WebResult(name = "success", targetNamespace = "")
    @RequestWrapper(localName = "RTGS_nalog", targetNamespace = "http://team9/ws/RTGS_nalog", className = "team9.ws.rtgs_nalog.RTGSNalog_Type")
    @ResponseWrapper(localName = "RTGS_nalogResponse", targetNamespace = "http://team9/ws/RTGS_nalog", className = "team9.ws.rtgs_nalog.RTGSNalogResponse")
    public boolean rtgsNalog(
        @WebParam(name = "duznik_nalogodavac", targetNamespace = "http://team9/ws/RTGS_nalog")
        Ucesnik duznikNalogodavac,
        @WebParam(name = "primalac_poverilac", targetNamespace = "http://team9/ws/RTGS_nalog")
        Ucesnik primalacPoverilac,
        @WebParam(name = "svrha", targetNamespace = "http://team9/ws/RTGS_nalog")
        String svrha,
        @WebParam(name = "datum_naloga", targetNamespace = "http://team9/ws/RTGS_nalog")
        XMLGregorianCalendar datumNaloga,
        @WebParam(name = "datum_valute", targetNamespace = "http://team9/ws/RTGS_nalog")
        XMLGregorianCalendar datumValute,
        @WebParam(name = "zaduzenje", targetNamespace = "http://team9/ws/RTGS_nalog")
        PodaciOUplati zaduzenje,
        @WebParam(name = "odobrenje", targetNamespace = "http://team9/ws/RTGS_nalog")
        PodaciOUplati odobrenje,
        @WebParam(name = "iznos", targetNamespace = "http://team9/ws/RTGS_nalog")
        BigDecimal iznos);

}
