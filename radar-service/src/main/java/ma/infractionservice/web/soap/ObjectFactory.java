
package ma.infractionservice.web.soap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.infractionservice.web.soap package. 
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

    private final static QName _DeleteInfraction_QNAME = new QName("http://soap.web.infractionservice.ma/", "deleteInfraction");
    private final static QName _DeleteInfractionResponse_QNAME = new QName("http://soap.web.infractionservice.ma/", "deleteInfractionResponse");
    private final static QName _InfractionById_QNAME = new QName("http://soap.web.infractionservice.ma/", "infractionById");
    private final static QName _InfractionByIdResponse_QNAME = new QName("http://soap.web.infractionservice.ma/", "infractionByIdResponse");
    private final static QName _Infractions_QNAME = new QName("http://soap.web.infractionservice.ma/", "infractions");
    private final static QName _InfractionsResponse_QNAME = new QName("http://soap.web.infractionservice.ma/", "infractionsResponse");
    private final static QName _SaveInfraction_QNAME = new QName("http://soap.web.infractionservice.ma/", "saveInfraction");
    private final static QName _SaveInfractionResponse_QNAME = new QName("http://soap.web.infractionservice.ma/", "saveInfractionResponse");
    private final static QName _UpdateInfraction_QNAME = new QName("http://soap.web.infractionservice.ma/", "updateInfraction");
    private final static QName _UpdateInfractionResponse_QNAME = new QName("http://soap.web.infractionservice.ma/", "updateInfractionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.infractionservice.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteInfraction }
     * 
     */
    public DeleteInfraction createDeleteInfraction() {
        return new DeleteInfraction();
    }

    /**
     * Create an instance of {@link DeleteInfractionResponse }
     * 
     */
    public DeleteInfractionResponse createDeleteInfractionResponse() {
        return new DeleteInfractionResponse();
    }

    /**
     * Create an instance of {@link InfractionById }
     * 
     */
    public InfractionById createInfractionById() {
        return new InfractionById();
    }

    /**
     * Create an instance of {@link InfractionByIdResponse }
     * 
     */
    public InfractionByIdResponse createInfractionByIdResponse() {
        return new InfractionByIdResponse();
    }

    /**
     * Create an instance of {@link Infractions }
     * 
     */
    public Infractions createInfractions() {
        return new Infractions();
    }

    /**
     * Create an instance of {@link InfractionsResponse }
     * 
     */
    public InfractionsResponse createInfractionsResponse() {
        return new InfractionsResponse();
    }

    /**
     * Create an instance of {@link SaveInfraction }
     * 
     */
    public SaveInfraction createSaveInfraction() {
        return new SaveInfraction();
    }

    /**
     * Create an instance of {@link SaveInfractionResponse }
     * 
     */
    public SaveInfractionResponse createSaveInfractionResponse() {
        return new SaveInfractionResponse();
    }

    /**
     * Create an instance of {@link UpdateInfraction }
     * 
     */
    public UpdateInfraction createUpdateInfraction() {
        return new UpdateInfraction();
    }

    /**
     * Create an instance of {@link UpdateInfractionResponse }
     * 
     */
    public UpdateInfractionResponse createUpdateInfractionResponse() {
        return new UpdateInfractionResponse();
    }

    /**
     * Create an instance of {@link InfractionRequest }
     * 
     */
    public InfractionRequest createInfractionRequest() {
        return new InfractionRequest();
    }

    /**
     * Create an instance of {@link Infraction }
     * 
     */
    public Infraction createInfraction() {
        return new Infraction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInfraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteInfraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "deleteInfraction")
    public JAXBElement<DeleteInfraction> createDeleteInfraction(DeleteInfraction value) {
        return new JAXBElement<DeleteInfraction>(_DeleteInfraction_QNAME, DeleteInfraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInfractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteInfractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "deleteInfractionResponse")
    public JAXBElement<DeleteInfractionResponse> createDeleteInfractionResponse(DeleteInfractionResponse value) {
        return new JAXBElement<DeleteInfractionResponse>(_DeleteInfractionResponse_QNAME, DeleteInfractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfractionById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfractionById }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "infractionById")
    public JAXBElement<InfractionById> createInfractionById(InfractionById value) {
        return new JAXBElement<InfractionById>(_InfractionById_QNAME, InfractionById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfractionByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfractionByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "infractionByIdResponse")
    public JAXBElement<InfractionByIdResponse> createInfractionByIdResponse(InfractionByIdResponse value) {
        return new JAXBElement<InfractionByIdResponse>(_InfractionByIdResponse_QNAME, InfractionByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Infractions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Infractions }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "infractions")
    public JAXBElement<Infractions> createInfractions(Infractions value) {
        return new JAXBElement<Infractions>(_Infractions_QNAME, Infractions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfractionsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfractionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "infractionsResponse")
    public JAXBElement<InfractionsResponse> createInfractionsResponse(InfractionsResponse value) {
        return new JAXBElement<InfractionsResponse>(_InfractionsResponse_QNAME, InfractionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInfraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveInfraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "saveInfraction")
    public JAXBElement<SaveInfraction> createSaveInfraction(SaveInfraction value) {
        return new JAXBElement<SaveInfraction>(_SaveInfraction_QNAME, SaveInfraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInfractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveInfractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "saveInfractionResponse")
    public JAXBElement<SaveInfractionResponse> createSaveInfractionResponse(SaveInfractionResponse value) {
        return new JAXBElement<SaveInfractionResponse>(_SaveInfractionResponse_QNAME, SaveInfractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInfraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateInfraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "updateInfraction")
    public JAXBElement<UpdateInfraction> createUpdateInfraction(UpdateInfraction value) {
        return new JAXBElement<UpdateInfraction>(_UpdateInfraction_QNAME, UpdateInfraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInfractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateInfractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.web.infractionservice.ma/", name = "updateInfractionResponse")
    public JAXBElement<UpdateInfractionResponse> createUpdateInfractionResponse(UpdateInfractionResponse value) {
        return new JAXBElement<UpdateInfractionResponse>(_UpdateInfractionResponse_QNAME, UpdateInfractionResponse.class, null, value);
    }

}
