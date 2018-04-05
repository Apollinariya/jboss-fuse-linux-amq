
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortShiftDayPlanFactEquipmentModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortShiftDayPlanFactEquipmentModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortShiftDayPlanFactEquipmentModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortShiftDayPlanFactEquipmentModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortShiftDayPlanFactEquipmentModel", propOrder = {
    "portShiftDayPlanFactEquipmentModel"
})
public class ArrayOfPortShiftDayPlanFactEquipmentModel {

    @XmlElement(name = "PortShiftDayPlanFactEquipmentModel", nillable = true)
    protected List<PortShiftDayPlanFactEquipmentModel> portShiftDayPlanFactEquipmentModel;

    /**
     * Gets the value of the portShiftDayPlanFactEquipmentModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portShiftDayPlanFactEquipmentModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortShiftDayPlanFactEquipmentModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortShiftDayPlanFactEquipmentModel }
     * 
     * 
     */
    public List<PortShiftDayPlanFactEquipmentModel> getPortShiftDayPlanFactEquipmentModel() {
        if (portShiftDayPlanFactEquipmentModel == null) {
            portShiftDayPlanFactEquipmentModel = new ArrayList<PortShiftDayPlanFactEquipmentModel>();
        }
        return this.portShiftDayPlanFactEquipmentModel;
    }

}
