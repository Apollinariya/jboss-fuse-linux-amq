
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortRequestTableModel;


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
 *         &lt;element name="GetDeliveryPlanResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortRequestTableModel" minOccurs="0"/&gt;
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
    "getDeliveryPlanResult"
})
@XmlRootElement(name = "GetDeliveryPlanResponse")
public class GetDeliveryPlanResponse {

    @XmlElementRef(name = "GetDeliveryPlanResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortRequestTableModel> getDeliveryPlanResult;

    /**
     * Gets the value of the getDeliveryPlanResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTableModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortRequestTableModel> getGetDeliveryPlanResult() {
        return getDeliveryPlanResult;
    }

    /**
     * Sets the value of the getDeliveryPlanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTableModel }{@code >}
     *     
     */
    public void setGetDeliveryPlanResult(JAXBElement<ArrayOfPortRequestTableModel> value) {
        this.getDeliveryPlanResult = value;
    }

}
