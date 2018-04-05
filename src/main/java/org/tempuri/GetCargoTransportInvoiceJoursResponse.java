
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfCargoTransportInvoiceJourModel;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCargoTransportInvoiceJoursResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfCargoTransportInvoiceJourModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCargoTransportInvoiceJoursResult"
})
@XmlRootElement(name = "GetCargoTransportInvoiceJoursResponse")
public class GetCargoTransportInvoiceJoursResponse {

    @XmlElementRef(name = "GetCargoTransportInvoiceJoursResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCargoTransportInvoiceJourModel> getCargoTransportInvoiceJoursResult;

    /**
     * Gets the value of the getCargoTransportInvoiceJoursResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargoTransportInvoiceJourModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCargoTransportInvoiceJourModel> getGetCargoTransportInvoiceJoursResult() {
        return getCargoTransportInvoiceJoursResult;
    }

    /**
     * Sets the value of the getCargoTransportInvoiceJoursResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargoTransportInvoiceJourModel }{@code >}
     *     
     */
    public void setGetCargoTransportInvoiceJoursResult(JAXBElement<ArrayOfCargoTransportInvoiceJourModel> value) {
        this.getCargoTransportInvoiceJoursResult = value;
    }

}
