
package ma.infractionservice.web.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infractionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infractionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matriculeVehicule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nuneroRadar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="vitesseMax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="vitesseVehicule" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infractionRequest", propOrder = {
    "matriculeVehicule",
    "nuneroRadar",
    "vitesseMax",
    "vitesseVehicule"
})
public class InfractionRequest {

    protected String matriculeVehicule;
    protected Long nuneroRadar;
    protected double vitesseMax;
    protected double vitesseVehicule;

    /**
     * Gets the value of the matriculeVehicule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculeVehicule() {
        return matriculeVehicule;
    }

    /**
     * Sets the value of the matriculeVehicule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculeVehicule(String value) {
        this.matriculeVehicule = value;
    }

    /**
     * Gets the value of the nuneroRadar property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNuneroRadar() {
        return nuneroRadar;
    }

    /**
     * Sets the value of the nuneroRadar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNuneroRadar(Long value) {
        this.nuneroRadar = value;
    }

    /**
     * Gets the value of the vitesseMax property.
     * 
     */
    public double getVitesseMax() {
        return vitesseMax;
    }

    /**
     * Sets the value of the vitesseMax property.
     * 
     */
    public void setVitesseMax(double value) {
        this.vitesseMax = value;
    }

    /**
     * Gets the value of the vitesseVehicule property.
     * 
     */
    public double getVitesseVehicule() {
        return vitesseVehicule;
    }

    /**
     * Sets the value of the vitesseVehicule property.
     * 
     */
    public void setVitesseVehicule(double value) {
        this.vitesseVehicule = value;
    }

}
