
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortEquipmentGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortEquipmentGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortEquipmentGroup" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortEquipmentGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortEquipmentGroup", propOrder = {
    "portEquipmentGroup"
})
public class ArrayOfPortEquipmentGroup {

    @XmlElement(name = "PortEquipmentGroup", nillable = true)
    protected List<PortEquipmentGroup> portEquipmentGroup;

    /**
     * Gets the value of the portEquipmentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portEquipmentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortEquipmentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortEquipmentGroup }
     * 
     * 
     */
    public List<PortEquipmentGroup> getPortEquipmentGroup() {
        if (portEquipmentGroup == null) {
            portEquipmentGroup = new ArrayList<PortEquipmentGroup>();
        }
        return this.portEquipmentGroup;
    }

}
