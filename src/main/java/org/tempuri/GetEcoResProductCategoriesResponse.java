
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfEcoResProductCategory;


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
 *         &lt;element name="GetEcoResProductCategoriesResult" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfEcoResProductCategory" minOccurs="0"/&gt;
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
    "getEcoResProductCategoriesResult"
})
@XmlRootElement(name = "GetEcoResProductCategoriesResponse")
public class GetEcoResProductCategoriesResponse {

    @XmlElementRef(name = "GetEcoResProductCategoriesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEcoResProductCategory> getEcoResProductCategoriesResult;

    /**
     * Gets the value of the getEcoResProductCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEcoResProductCategory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEcoResProductCategory> getGetEcoResProductCategoriesResult() {
        return getEcoResProductCategoriesResult;
    }

    /**
     * Sets the value of the getEcoResProductCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEcoResProductCategory }{@code >}
     *     
     */
    public void setGetEcoResProductCategoriesResult(JAXBElement<ArrayOfEcoResProductCategory> value) {
        this.getEcoResProductCategoriesResult = value;
    }

}
