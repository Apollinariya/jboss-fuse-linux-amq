
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfAdditionalWork;


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
 *         &lt;element name="GetAdditionalWorksResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfAdditionalWork" minOccurs="0"/&gt;
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
    "getAdditionalWorksResult"
})
@XmlRootElement(name = "GetAdditionalWorksResponse")
public class GetAdditionalWorksResponse {

    @XmlElementRef(name = "GetAdditionalWorksResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAdditionalWork> getAdditionalWorksResult;

    /**
     * Gets the value of the getAdditionalWorksResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdditionalWork }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdditionalWork> getGetAdditionalWorksResult() {
        return getAdditionalWorksResult;
    }

    /**
     * Sets the value of the getAdditionalWorksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdditionalWork }{@code >}
     *     
     */
    public void setGetAdditionalWorksResult(JAXBElement<ArrayOfAdditionalWork> value) {
        this.getAdditionalWorksResult = value;
    }

}
