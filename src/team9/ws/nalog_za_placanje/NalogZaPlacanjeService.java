
package team9.ws.nalog_za_placanje;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Nalog_za_placanjeService", targetNamespace = "http://team9/ws/nalog_za_placanje", wsdlLocation = "file:/home/gajop/bsep/xws-bsep-project/scheme/nalog_za_placanje.wsdl")
public class NalogZaPlacanjeService
    extends Service
{

    private final static URL NALOGZAPLACANJESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(team9.ws.nalog_za_placanje.NalogZaPlacanjeService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = team9.ws.nalog_za_placanje.NalogZaPlacanjeService.class.getResource(".");
            url = new URL(baseUrl, "file:C:\\Users\\Bojan\\Documents\\faks\\2010_11\\Ljetnji\\XML i Web servisi\\projekt\\workspace\\xws-bsep-project\\scheme\\nalog_za_placanje.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:C:\\Users\\Bojan\\Documents\\faks\\2010_11\\Ljetnji\\XML i Web servisi\\projekt\\workspace\\xws-bsep-project\\scheme\\nalog_za_placanje.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NALOGZAPLACANJESERVICE_WSDL_LOCATION = url;
    }

    public NalogZaPlacanjeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NalogZaPlacanjeService() {
        super(NALOGZAPLACANJESERVICE_WSDL_LOCATION, new QName("http://team9/ws/nalog_za_placanje", "Nalog_za_placanjeService"));
    }

    /**
     * 
     * @return
     *     returns NalogZaPlacanje
     */
    @WebEndpoint(name = "Nalog_za_placanjePort")
    public NalogZaPlacanje getNalogZaPlacanjePort() {
        return super.getPort(new QName("http://team9/ws/nalog_za_placanje", "Nalog_za_placanjePort"), NalogZaPlacanje.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NalogZaPlacanje
     */
    @WebEndpoint(name = "Nalog_za_placanjePort")
    public NalogZaPlacanje getNalogZaPlacanjePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://team9/ws/nalog_za_placanje", "Nalog_za_placanjePort"), NalogZaPlacanje.class, features);
    }

}
