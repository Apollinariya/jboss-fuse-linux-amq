
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCargoDetailedPlanTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCargoDetailedPlanTrans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CargoDetailedPlanTrans" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}CargoDetailedPlanTrans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCargoDetailedPlanTrans", propOrder = {
    "cargoDetailedPlanTrans"
})
public class ArrayOfCargoDetailedPlanTrans {

    @XmlElement(name = "CargoDetailedPlanTrans", nillable = true)
    protected List<CargoDetailedPlanTrans> cargoDetailedPlanTrans;

    /**
     * Gets the value of the cargoDetailedPlanTrans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoDetailedPlanTrans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoDetailedPlanTrans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargoDetailedPlanTrans }
     * 
     * 
     */
    public List<CargoDetailedPlanTrans> getCargoDetailedPlanTrans() {
        if (cargoDetailedPlanTrans == null) {
            cargoDetailedPlanTrans = new ArrayList<CargoDetailedPlanTrans>();
        }
        return this.cargoDetailedPlanTrans;
    }

}
