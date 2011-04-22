
package team9.ws.rtgs_nalog;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team9.ws.rtgs_nalog package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team9.ws.rtgs_nalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ucesnik }
     * 
     */
    public Ucesnik createUcesnik() {
        return new Ucesnik();
    }

    /**
     * Create an instance of {@link RTGSNalog_Type }
     * 
     */
    public RTGSNalog_Type createRTGSNalog_Type() {
        return new RTGSNalog_Type();
    }

    /**
     * Create an instance of {@link PodaciOUplati }
     * 
     */
    public PodaciOUplati createPodaciOUplati() {
        return new PodaciOUplati();
    }

    /**
     * Create an instance of {@link RTGSNalogResponse }
     * 
     */
    public RTGSNalogResponse createRTGSNalogResponse() {
        return new RTGSNalogResponse();
    }

}
