
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortShipTableModel;


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
 *         &lt;element name="GetPortShipsResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortShipTableModel" minOccurs="0"/&gt;
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
    "getPortShipsResult"
})
@XmlRootElement(name = "GetPortShipsResponse")
public class GetPortShipsResponse {

    @XmlElementRef(name = "GetPortShipsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortShipTableModel> getPortShipsResult;

    /**
     * Gets the value of the getPortShipsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortShipTableModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortShipTableModel> getGetPortShipsResult() {
        return getPortShipsResult;
    }

    /**
     * Sets the value of the getPortShipsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortShipTableModel }{@code >}
     *     
     */
    public void setGetPortShipsResult(JAXBElement<ArrayOfPortShipTableModel> value) {
        this.getPortShipsResult = value;
    }

}
