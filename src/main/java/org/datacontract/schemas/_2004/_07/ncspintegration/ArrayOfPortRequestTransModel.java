
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortRequestTransModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortRequestTransModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortRequestTransModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortRequestTransModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortRequestTransModel", propOrder = {
    "portRequestTransModel"
})
public class ArrayOfPortRequestTransModel {

    @XmlElement(name = "PortRequestTransModel", nillable = true)
    protected List<PortRequestTransModel> portRequestTransModel;

    /**
     * Gets the value of the portRequestTransModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portRequestTransModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortRequestTransModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRequestTransModel }
     * 
     * 
     */
    public List<PortRequestTransModel> getPortRequestTransModel() {
        if (portRequestTransModel == null) {
            portRequestTransModel = new ArrayList<PortRequestTransModel>();
        }
        return this.portRequestTransModel;
    }

}
