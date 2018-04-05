
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEcoresCategoryHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEcoresCategoryHierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EcoresCategoryHierarchy" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}EcoresCategoryHierarchy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEcoresCategoryHierarchy", propOrder = {
    "ecoresCategoryHierarchy"
})
public class ArrayOfEcoresCategoryHierarchy {

    @XmlElement(name = "EcoresCategoryHierarchy", nillable = true)
    protected List<EcoresCategoryHierarchy> ecoresCategoryHierarchy;

    /**
     * Gets the value of the ecoresCategoryHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecoresCategoryHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcoresCategoryHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EcoresCategoryHierarchy }
     * 
     * 
     */
    public List<EcoresCategoryHierarchy> getEcoresCategoryHierarchy() {
        if (ecoresCategoryHierarchy == null) {
            ecoresCategoryHierarchy = new ArrayList<EcoresCategoryHierarchy>();
        }
        return this.ecoresCategoryHierarchy;
    }

}
