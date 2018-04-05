
package org.datacontract.schemas._2004._07.ncspintegration;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PlanTableModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanTableModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastOperation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Mesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NomVag" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumNaPuti" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PkVag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pogruzka" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Put" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VagStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanTableModel", propOrder = {
    "lastOperation",
    "mesto",
    "nomVag",
    "numNaPuti",
    "pkVag",
    "pogruzka",
    "put",
    "vagStatus"
})
public class PlanTableModel {

    @XmlElement(name = "LastOperation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOperation;
    @XmlElementRef(name = "Mesto", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mesto;
    @XmlElement(name = "NomVag")
    protected BigDecimal nomVag;
    @XmlElement(name = "NumNaPuti")
    protected Short numNaPuti;
    @XmlElementRef(name = "PkVag", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pkVag;
    @XmlElement(name = "Pogruzka")
    protected BigDecimal pogruzka;
    @XmlElementRef(name = "Put", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> put;
    @XmlElementRef(name = "VagStatus", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vagStatus;

    /**
     * Gets the value of the lastOperation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOperation() {
        return lastOperation;
    }

    /**
     * Sets the value of the lastOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOperation(XMLGregorianCalendar value) {
        this.lastOperation = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMesto(JAXBElement<String> value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the nomVag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNomVag() {
        return nomVag;
    }

    /**
     * Sets the value of the nomVag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNomVag(BigDecimal value) {
        this.nomVag = value;
    }

    /**
     * Gets the value of the numNaPuti property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumNaPuti() {
        return numNaPuti;
    }

    /**
     * Sets the value of the numNaPuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumNaPuti(Short value) {
        this.numNaPuti = value;
    }

    /**
     * Gets the value of the pkVag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkVag() {
        return pkVag;
    }

    /**
     * Sets the value of the pkVag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkVag(JAXBElement<String> value) {
        this.pkVag = value;
    }

    /**
     * Gets the value of the pogruzka property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPogruzka() {
        return pogruzka;
    }

    /**
     * Sets the value of the pogruzka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPogruzka(BigDecimal value) {
        this.pogruzka = value;
    }

    /**
     * Gets the value of the put property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPut() {
        return put;
    }

    /**
     * Sets the value of the put property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPut(JAXBElement<String> value) {
        this.put = value;
    }

    /**
     * Gets the value of the vagStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVagStatus() {
        return vagStatus;
    }

    /**
     * Sets the value of the vagStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVagStatus(JAXBElement<String> value) {
        this.vagStatus = value;
    }

}
