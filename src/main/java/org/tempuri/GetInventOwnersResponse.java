
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfInventOwnerModel;


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
 *         &lt;element name="GetInventOwnersResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfInventOwnerModel" minOccurs="0"/&gt;
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
    "getInventOwnersResult"
})
@XmlRootElement(name = "GetInventOwnersResponse")
public class GetInventOwnersResponse {

    @XmlElementRef(name = "GetInventOwnersResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventOwnerModel> getInventOwnersResult;

    /**
     * Gets the value of the getInventOwnersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventOwnerModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventOwnerModel> getGetInventOwnersResult() {
        return getInventOwnersResult;
    }

    /**
     * Sets the value of the getInventOwnersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventOwnerModel }{@code >}
     *     
     */
    public void setGetInventOwnersResult(JAXBElement<ArrayOfInventOwnerModel> value) {
        this.getInventOwnersResult = value;
    }

}
