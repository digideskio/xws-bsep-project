
package team9.ws.presek;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team9.ws.presek package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team9.ws.presek
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PodaciOUplati }
     * 
     */
    public PodaciOUplati createPodaciOUplati() {
        return new PodaciOUplati();
    }

    /**
     * Create an instance of {@link Promene }
     * 
     */
    public Promene createPromene() {
        return new Promene();
    }

    /**
     * Create an instance of {@link Ucesnik }
     * 
     */
    public Ucesnik createUcesnik() {
        return new Ucesnik();
    }

    /**
     * Create an instance of {@link Presek_Type.Stavka }
     * 
     */
    public Presek_Type.Stavka createPresek_TypeStavka() {
        return new Presek_Type.Stavka();
    }

    /**
     * Create an instance of {@link Presek_Type.Zaglavlje }
     * 
     */
    public Presek_Type.Zaglavlje createPresek_TypeZaglavlje() {
        return new Presek_Type.Zaglavlje();
    }

    /**
     * Create an instance of {@link PresekResponse }
     * 
     */
    public PresekResponse createPresekResponse() {
        return new PresekResponse();
    }

    /**
     * Create an instance of {@link Presek_Type }
     * 
     */
    public Presek_Type createPresek_Type() {
        return new Presek_Type();
    }

}
