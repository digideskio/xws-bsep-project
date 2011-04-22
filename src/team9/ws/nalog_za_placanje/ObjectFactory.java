
package team9.ws.nalog_za_placanje;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team9.ws.nalog_za_placanje package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team9.ws.nalog_za_placanje
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NalogZaPlacanjeResponse }
     * 
     */
    public NalogZaPlacanjeResponse createNalogZaPlacanjeResponse() {
        return new NalogZaPlacanjeResponse();
    }

    /**
     * Create an instance of {@link NalogZaPlacanje_Type.Zaglavlje }
     * 
     */
    public NalogZaPlacanje_Type.Zaglavlje createNalogZaPlacanje_TypeZaglavlje() {
        return new NalogZaPlacanje_Type.Zaglavlje();
    }

    /**
     * Create an instance of {@link NalogZaPlacanje_Type.Zaglavlje.Firma }
     * 
     */
    public NalogZaPlacanje_Type.Zaglavlje.Firma createNalogZaPlacanje_TypeZaglavljeFirma() {
        return new NalogZaPlacanje_Type.Zaglavlje.Firma();
    }

    /**
     * Create an instance of {@link PodaciOUplati }
     * 
     */
    public PodaciOUplati createPodaciOUplati() {
        return new PodaciOUplati();
    }

    /**
     * Create an instance of {@link NalogZaPlacanje_Type.Stavka }
     * 
     */
    public NalogZaPlacanje_Type.Stavka createNalogZaPlacanje_TypeStavka() {
        return new NalogZaPlacanje_Type.Stavka();
    }

    /**
     * Create an instance of {@link NalogZaPlacanje_Type }
     * 
     */
    public NalogZaPlacanje_Type createNalogZaPlacanje_Type() {
        return new NalogZaPlacanje_Type();
    }

    /**
     * Create an instance of {@link Ucesnik }
     * 
     */
    public Ucesnik createUcesnik() {
        return new Ucesnik();
    }

}
