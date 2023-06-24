
package ma.infractionservice.web.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infraction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="matriculeVehicule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "infraction", propOrder = {
    "date",
    "id",
    "matriculeVehicule",
    "montant",
    "nuneroRadar",
    "vitesseMax",
    "vitesseVehicule"
})
public class Infraction {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Long id;
    protected String matriculeVehicule;
    protected double montant;
    protected Long nuneroRadar;
    protected double vitesseMax;
    protected double vitesseVehicule;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

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
     * Gets the value of the montant property.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
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
