
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfEcoresCategoryHierarchy;


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
 *         &lt;element name="GetEcoresCategoryHierarchyesResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfEcoresCategoryHierarchy" minOccurs="0"/&gt;
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
    "getEcoresCategoryHierarchyesResult"
})
@XmlRootElement(name = "GetEcoresCategoryHierarchyesResponse")
public class GetEcoresCategoryHierarchyesResponse {

    @XmlElementRef(name = "GetEcoresCategoryHierarchyesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEcoresCategoryHierarchy> getEcoresCategoryHierarchyesResult;

    /**
     * Gets the value of the getEcoresCategoryHierarchyesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEcoresCategoryHierarchy }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEcoresCategoryHierarchy> getGetEcoresCategoryHierarchyesResult() {
        return getEcoresCategoryHierarchyesResult;
    }

    /**
     * Sets the value of the getEcoresCategoryHierarchyesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEcoresCategoryHierarchy }{@code >}
     *     
     */
    public void setGetEcoresCategoryHierarchyesResult(JAXBElement<ArrayOfEcoresCategoryHierarchy> value) {
        this.getEcoresCategoryHierarchyesResult = value;
    }

}
