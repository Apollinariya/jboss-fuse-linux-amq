
package org.datacontract.schemas._2004._07.ncspintegration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortWorkBrigade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortWorkBrigade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrigadeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrigadeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OmOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortWorkBrigade", propOrder = {
    "brigadeId",
    "brigadeName",
    "omOperatingUnit",
    "recId"
})
public class PortWorkBrigade {

    @XmlElementRef(name = "BrigadeId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brigadeId;
    @XmlElementRef(name = "BrigadeName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brigadeName;
    @XmlElement(name = "OmOperatingUnit")
    protected Long omOperatingUnit;
    @XmlElement(name = "RecId")
    protected Long recId;

    /**
     * Gets the value of the brigadeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrigadeId() {
        return brigadeId;
    }

    /**
     * Sets the value of the brigadeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrigadeId(JAXBElement<String> value) {
        this.brigadeId = value;
    }

    /**
     * Gets the value of the brigadeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrigadeName() {
        return brigadeName;
    }

    /**
     * Sets the value of the brigadeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrigadeName(JAXBElement<String> value) {
        this.brigadeName = value;
    }

    /**
     * Gets the value of the omOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOmOperatingUnit() {
        return omOperatingUnit;
    }

    /**
     * Sets the value of the omOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOmOperatingUnit(Long value) {
        this.omOperatingUnit = value;
    }

    /**
     * Gets the value of the recId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecId() {
        return recId;
    }

    /**
     * Sets the value of the recId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecId(Long value) {
        this.recId = value;
    }

}
