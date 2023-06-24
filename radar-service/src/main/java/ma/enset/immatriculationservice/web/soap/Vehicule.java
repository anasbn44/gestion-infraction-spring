
package ma.enset.immatriculationservice.web.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="marque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modele" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="proprietaire" type="{http://soap.web.immatriculationservice.enset.ma/}proprietaire" minOccurs="0"/&gt;
 *         &lt;element name="puissanceFiscale" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicule", propOrder = {
    "id",
    "marque",
    "matricule",
    "modele",
    "proprietaire",
    "puissanceFiscale"
})
public class Vehicule {

    protected Long id;
    protected String marque;
    protected String matricule;
    protected int modele;
    protected Proprietaire proprietaire;
    protected int puissanceFiscale;

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
     * Gets the value of the marque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Sets the value of the marque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarque(String value) {
        this.marque = value;
    }

    /**
     * Gets the value of the matricule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Sets the value of the matricule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricule(String value) {
        this.matricule = value;
    }

    /**
     * Gets the value of the modele property.
     * 
     */
    public int getModele() {
        return modele;
    }

    /**
     * Sets the value of the modele property.
     * 
     */
    public void setModele(int value) {
        this.modele = value;
    }

    /**
     * Gets the value of the proprietaire property.
     * 
     * @return
     *     possible object is
     *     {@link Proprietaire }
     *     
     */
    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    /**
     * Sets the value of the proprietaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proprietaire }
     *     
     */
    public void setProprietaire(Proprietaire value) {
        this.proprietaire = value;
    }

    /**
     * Gets the value of the puissanceFiscale property.
     * 
     */
    public int getPuissanceFiscale() {
        return puissanceFiscale;
    }

    /**
     * Sets the value of the puissanceFiscale property.
     * 
     */
    public void setPuissanceFiscale(int value) {
        this.puissanceFiscale = value;
    }

}
