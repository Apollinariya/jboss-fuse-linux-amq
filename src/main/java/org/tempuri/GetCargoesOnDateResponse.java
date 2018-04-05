
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfCargoOnDateTableModel;


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
 *         &lt;element name="GetCargoesOnDateResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfCargoOnDateTableModel" minOccurs="0"/&gt;
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
    "getCargoesOnDateResult"
})
@XmlRootElement(name = "GetCargoesOnDateResponse")
public class GetCargoesOnDateResponse {

    @XmlElementRef(name = "GetCargoesOnDateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCargoOnDateTableModel> getCargoesOnDateResult;

    /**
     * Gets the value of the getCargoesOnDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargoOnDateTableModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCargoOnDateTableModel> getGetCargoesOnDateResult() {
        return getCargoesOnDateResult;
    }

    /**
     * Sets the value of the getCargoesOnDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargoOnDateTableModel }{@code >}
     *     
     */
    public void setGetCargoesOnDateResult(JAXBElement<ArrayOfCargoOnDateTableModel> value) {
        this.getCargoesOnDateResult = value;
    }

}
