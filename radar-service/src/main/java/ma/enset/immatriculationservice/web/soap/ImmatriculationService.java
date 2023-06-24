package ma.enset.immatriculationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-06-24T22:47:25.599+01:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://soap.web.immatriculationservice.enset.ma/", name = "ImmatriculationService")
@XmlSeeAlso({ObjectFactory.class})
public interface ImmatriculationService {

    @WebMethod
    @RequestWrapper(localName = "vehiculeByMatricule", targetNamespace = "http://soap.web.immatriculationservice.enset.ma/", className = "ma.enset.immatriculationservice.web.soap.VehiculeByMatricule")
    @ResponseWrapper(localName = "vehiculeByMatriculeResponse", targetNamespace = "http://soap.web.immatriculationservice.enset.ma/", className = "ma.enset.immatriculationservice.web.soap.VehiculeByMatriculeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ma.enset.immatriculationservice.web.soap.Vehicule vehiculeByMatricule(

        @WebParam(name = "matricule", targetNamespace = "")
        java.lang.String matricule
    );

    @WebMethod
    @RequestWrapper(localName = "vehiculeList", targetNamespace = "http://soap.web.immatriculationservice.enset.ma/", className = "ma.enset.immatriculationservice.web.soap.VehiculeList")
    @ResponseWrapper(localName = "vehiculeListResponse", targetNamespace = "http://soap.web.immatriculationservice.enset.ma/", className = "ma.enset.immatriculationservice.web.soap.VehiculeListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ma.enset.immatriculationservice.web.soap.Vehicule> vehiculeList()
;
}
