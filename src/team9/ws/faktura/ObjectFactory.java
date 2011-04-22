
package team9.ws.faktura;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team9.ws.faktura package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team9.ws.faktura
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Faktura_Type.Zaglavlje }
     * 
     */
    public Faktura_Type.Zaglavlje createFaktura_TypeZaglavlje() {
        return new Faktura_Type.Zaglavlje();
    }

    /**
     * Create an instance of {@link Faktura_Type.Stavka.Rabat }
     * 
     */
    public Faktura_Type.Stavka.Rabat createFaktura_TypeStavkaRabat() {
        return new Faktura_Type.Stavka.Rabat();
    }

    /**
     * Create an instance of {@link Faktura_Type }
     * 
     */
    public Faktura_Type createFaktura_Type() {
        return new Faktura_Type();
    }

    /**
     * Create an instance of {@link Faktura_Type.Stavka }
     * 
     */
    public Faktura_Type.Stavka createFaktura_TypeStavka() {
        return new Faktura_Type.Stavka();
    }

    /**
     * Create an instance of {@link Faktura_Type.Zaglavlje.Racun }
     * 
     */
    public Faktura_Type.Zaglavlje.Racun createFaktura_TypeZaglavljeRacun() {
        return new Faktura_Type.Zaglavlje.Racun();
    }

    /**
     * Create an instance of {@link FakturaResponse }
     * 
     */
    public FakturaResponse createFakturaResponse() {
        return new FakturaResponse();
    }

    /**
     * Create an instance of {@link Ucesnik }
     * 
     */
    public Ucesnik createUcesnik() {
        return new Ucesnik();
    }

}
