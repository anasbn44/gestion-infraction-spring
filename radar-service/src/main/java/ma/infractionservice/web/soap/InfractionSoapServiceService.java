package ma.infractionservice.web.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-06-24T22:39:11.879+01:00
 * Generated source version: 4.0.0
 *
 */
@WebServiceClient(name = "InfractionSoapServiceService",
                  wsdlLocation = "file:/C:/Users/anaso/IdeaProjects/exam-s2/radar-service/src/main/resources/InfractionService.wsdl",
                  targetNamespace = "http://soap.web.infractionservice.ma/")
public class InfractionSoapServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.web.infractionservice.ma/", "InfractionSoapServiceService");
    public final static QName InfractionServicePort = new QName("http://soap.web.infractionservice.ma/", "InfractionServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/anaso/IdeaProjects/exam-s2/radar-service/src/main/resources/InfractionService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InfractionSoapServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/anaso/IdeaProjects/exam-s2/radar-service/src/main/resources/InfractionService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InfractionSoapServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InfractionSoapServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InfractionSoapServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public InfractionSoapServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public InfractionSoapServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InfractionSoapServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns InfractionService
     */
    @WebEndpoint(name = "InfractionServicePort")
    public InfractionService getInfractionServicePort() {
        return super.getPort(InfractionServicePort, InfractionService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfractionService
     */
    @WebEndpoint(name = "InfractionServicePort")
    public InfractionService getInfractionServicePort(WebServiceFeature... features) {
        return super.getPort(InfractionServicePort, InfractionService.class, features);
    }

}
