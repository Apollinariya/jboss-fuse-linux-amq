
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfClientListModel;


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
 *         &lt;element name="GetClientsListResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfClientListModel" minOccurs="0"/&gt;
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
    "getClientsListResult"
})
@XmlRootElement(name = "GetClientsListResponse")
public class GetClientsListResponse {

    @XmlElementRef(name = "GetClientsListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClientListModel> getClientsListResult;

    /**
     * Gets the value of the getClientsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientListModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClientListModel> getGetClientsListResult() {
        return getClientsListResult;
    }

    /**
     * Sets the value of the getClientsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientListModel }{@code >}
     *     
     */
    public void setGetClientsListResult(JAXBElement<ArrayOfClientListModel> value) {
        this.getClientsListResult = value;
    }

}
