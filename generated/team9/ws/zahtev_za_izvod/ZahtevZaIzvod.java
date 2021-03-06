
package team9.ws.zahtev_za_izvod;

import java.math.BigInteger;
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
@WebService(name = "Zahtev_za_izvod", targetNamespace = "http://team9/ws/zahtev_za_izvod")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ZahtevZaIzvod {


    /**
     * 
     * @param redniBrojPreseka
     * @param datum
     * @param brojRacuna
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "zahtev_za_izvod")
    @WebResult(name = "success", targetNamespace = "")
    @RequestWrapper(localName = "zahtev_za_izvod", targetNamespace = "http://team9/ws/zahtev_za_izvod", className = "team9.ws.zahtev_za_izvod.ZahtevZaIzvod_Type")
    @ResponseWrapper(localName = "zahtev_za_izvodResponse", targetNamespace = "http://team9/ws/zahtev_za_izvod", className = "team9.ws.zahtev_za_izvod.ZahtevZaIzvodResponse")
    public boolean zahtevZaIzvod(
        @WebParam(name = "broj_racuna", targetNamespace = "http://team9/ws/zahtev_za_izvod")
        String brojRacuna,
        @WebParam(name = "datum", targetNamespace = "http://team9/ws/zahtev_za_izvod")
        XMLGregorianCalendar datum,
        @WebParam(name = "redni_broj_preseka", targetNamespace = "http://team9/ws/zahtev_za_izvod")
        BigInteger redniBrojPreseka);

}
