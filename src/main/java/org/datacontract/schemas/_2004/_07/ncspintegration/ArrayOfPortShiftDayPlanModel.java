
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortShiftDayPlanModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortShiftDayPlanModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortShiftDayPlanModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortShiftDayPlanModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortShiftDayPlanModel", propOrder = {
    "portShiftDayPlanModel"
})
public class ArrayOfPortShiftDayPlanModel {

    @XmlElement(name = "PortShiftDayPlanModel", nillable = true)
    protected List<PortShiftDayPlanModel> portShiftDayPlanModel;

    /**
     * Gets the value of the portShiftDayPlanModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portShiftDayPlanModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortShiftDayPlanModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortShiftDayPlanModel }
     * 
     * 
     */
    public List<PortShiftDayPlanModel> getPortShiftDayPlanModel() {
        if (portShiftDayPlanModel == null) {
            portShiftDayPlanModel = new ArrayList<PortShiftDayPlanModel>();
        }
        return this.portShiftDayPlanModel;
    }

}
