
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortEquipmentModel;


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
 *         &lt;element name="GetPortEquipmentModelsResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortEquipmentModel" minOccurs="0"/&gt;
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
    "getPortEquipmentModelsResult"
})
@XmlRootElement(name = "GetPortEquipmentModelsResponse")
public class GetPortEquipmentModelsResponse {

    @XmlElementRef(name = "GetPortEquipmentModelsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortEquipmentModel> getPortEquipmentModelsResult;

    /**
     * Gets the value of the getPortEquipmentModelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortEquipmentModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortEquipmentModel> getGetPortEquipmentModelsResult() {
        return getPortEquipmentModelsResult;
    }

    /**
     * Sets the value of the getPortEquipmentModelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortEquipmentModel }{@code >}
     *     
     */
    public void setGetPortEquipmentModelsResult(JAXBElement<ArrayOfPortEquipmentModel> value) {
        this.getPortEquipmentModelsResult = value;
    }

}
