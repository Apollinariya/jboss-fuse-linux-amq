
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortEquipmentModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortEquipmentModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortEquipmentModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortEquipmentModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortEquipmentModel", propOrder = {
    "portEquipmentModel"
})
public class ArrayOfPortEquipmentModel {

    @XmlElement(name = "PortEquipmentModel", nillable = true)
    protected List<PortEquipmentModel> portEquipmentModel;

    /**
     * Gets the value of the portEquipmentModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portEquipmentModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortEquipmentModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortEquipmentModel }
     * 
     * 
     */
    public List<PortEquipmentModel> getPortEquipmentModel() {
        if (portEquipmentModel == null) {
            portEquipmentModel = new ArrayList<PortEquipmentModel>();
        }
        return this.portEquipmentModel;
    }

}
