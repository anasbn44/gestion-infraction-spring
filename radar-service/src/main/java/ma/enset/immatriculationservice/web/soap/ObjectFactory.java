
package ma.enset.immatriculationservice.web.soap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.enset.immatriculationservice.web.soap package. 
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

    private final static QName _VehiculeByMatricule_QNAME = new QName("http://soap.web.immatriculationservice.enset.ma/", "vehiculeByMatricule");
    private final static QName _VehiculeByMatriculeResponse_QNAME = new QName("http://soap.web.immatriculationservice.enset.ma/", "vehiculeByMatriculeResponse");
    private final static QName _VehiculeList_QNAME = new QName("http://soap.web.immatriculationservice.enset.ma/", "vehiculeList");
    private final static QName _VehiculeListResponse_QNAME = new QName("http://soap.web.immatriculationservice.enset.ma/", "vehiculeListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.enset.immatriculationservice.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VehiculeByMatricule }
     * 
     */
    public VehiculeByMatricule createVehiculeByMatricule() {
        return new VehiculeByMatricule();
    }

    /**
     * Create an instance of {@link VehiculeByMatriculeResponse }
     * 
     */
    public VehiculeByMatriculeResponse createVehiculeByMatriculeResponse() {
        return new VehiculeByMatriculeResponse();
    }

    /**
     * Create an instance of {@link VehiculeList }
     * 
     */
    public VehiculeList createVehiculeList() {
        return new VehiculeList();
    }

    /**
     * Create an instance of {@link VehiculeListResponse }
     * 
     */
    public VehiculeListResponse createVehiculeListResponse() {
        return new VehiculeListResponse();
    }

    /**
     * Create an instance of {@link VehiculeResponseDto }
     * 
     */
    public VehiculeResponseDto createVehiculeResponseDto() {
        return new VehiculeResponseDto();
    }

    /**
     * Create an instance of {@link Vehicule }
     * 
     */
    public Vehicule createVehicule() {
        return new Vehicule();
    }

    /**
     * Create an instance of {@link Proprietaire }
     * 
     */
    public Proprietaire createProprietaire() {
        return new Proprietaire();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculeByMatricule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculeByMatricule }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.immatriculationservice.enset.ma/", name = "vehiculeByMatricule")
    public JAXBElement<VehiculeByMatricule> createVehiculeByMatricule(VehiculeByMatricule value) {
        return new JAXBElement<VehiculeByMatricule>(_VehiculeByMatricule_QNAME, VehiculeByMatricule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculeByMatriculeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculeByMatriculeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.immatriculationservice.enset.ma/", name = "vehiculeByMatriculeResponse")
    public JAXBElement<VehiculeByMatriculeResponse> createVehiculeByMatriculeResponse(VehiculeByMatriculeResponse value) {
        return new JAXBElement<VehiculeByMatriculeResponse>(_VehiculeByMatriculeResponse_QNAME, VehiculeByMatriculeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculeList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculeList }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.immatriculationservice.enset.ma/", name = "vehiculeList")
    public JAXBElement<VehiculeList> createVehiculeList(VehiculeList value) {
        return new JAXBElement<VehiculeList>(_VehiculeList_QNAME, VehiculeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculeListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculeListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.immatriculationservice.enset.ma/", name = "vehiculeListResponse")
    public JAXBElement<VehiculeListResponse> createVehiculeListResponse(VehiculeListResponse value) {
        return new JAXBElement<VehiculeListResponse>(_VehiculeListResponse_QNAME, VehiculeListResponse.class, null, value);
    }

}
