
package ma.infractionservice.web.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveInfraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveInfraction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infraction" type="{http://soap.web.infractionservice.ma/}infractionRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveInfraction", propOrder = {
    "infraction"
})
public class SaveInfraction {

    protected InfractionRequest infraction;

    /**
     * Gets the value of the infraction property.
     * 
     * @return
     *     possible object is
     *     {@link InfractionRequest }
     *     
     */
    public InfractionRequest getInfraction() {
        return infraction;
    }

    /**
     * Sets the value of the infraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfractionRequest }
     *     
     */
    public void setInfraction(InfractionRequest value) {
        this.infraction = value;
    }

}
