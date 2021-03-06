
package team9.ws.presek;

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
@WebServiceClient(name = "PresekService", targetNamespace = "http://team9/ws/presek", wsdlLocation = "file:/home/gajop/bsep/xws-bsep-project/scheme/presek.wsdl")
public class PresekService
    extends Service
{

    private final static URL PRESEKSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(team9.ws.presek.PresekService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = team9.ws.presek.PresekService.class.getResource(".");
            url = new URL(baseUrl, "file:/home/gajop/bsep/xws-bsep-project/scheme/presek.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/gajop/bsep/xws-bsep-project/scheme/presek.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PRESEKSERVICE_WSDL_LOCATION = url;
    }

    public PresekService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PresekService() {
        super(PRESEKSERVICE_WSDL_LOCATION, new QName("http://team9/ws/presek", "PresekService"));
    }

    /**
     * 
     * @return
     *     returns Presek
     */
    @WebEndpoint(name = "PresekPort")
    public Presek getPresekPort() {
        return super.getPort(new QName("http://team9/ws/presek", "PresekPort"), Presek.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Presek
     */
    @WebEndpoint(name = "PresekPort")
    public Presek getPresekPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://team9/ws/presek", "PresekPort"), Presek.class, features);
    }

}
