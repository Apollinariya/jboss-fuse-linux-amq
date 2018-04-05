
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfTosContainerInfo;


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
 *         &lt;element name="GetTosContainerInfoResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfTosContainerInfo" minOccurs="0"/&gt;
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
    "getTosContainerInfoResult"
})
@XmlRootElement(name = "GetTosContainerInfoResponse")
public class GetTosContainerInfoResponse {

    @XmlElementRef(name = "GetTosContainerInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTosContainerInfo> getTosContainerInfoResult;

    /**
     * Gets the value of the getTosContainerInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTosContainerInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTosContainerInfo> getGetTosContainerInfoResult() {
        return getTosContainerInfoResult;
    }

    /**
     * Sets the value of the getTosContainerInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTosContainerInfo }{@code >}
     *     
     */
    public void setGetTosContainerInfoResult(JAXBElement<ArrayOfTosContainerInfo> value) {
        this.getTosContainerInfoResult = value;
    }

}
