
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCargoOnDateTransModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCargoOnDateTransModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CargoOnDateTransModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}CargoOnDateTransModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCargoOnDateTransModel", propOrder = {
    "cargoOnDateTransModel"
})
public class ArrayOfCargoOnDateTransModel {

    @XmlElement(name = "CargoOnDateTransModel", nillable = true)
    protected List<CargoOnDateTransModel> cargoOnDateTransModel;

    /**
     * Gets the value of the cargoOnDateTransModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoOnDateTransModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoOnDateTransModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargoOnDateTransModel }
     * 
     * 
     */
    public List<CargoOnDateTransModel> getCargoOnDateTransModel() {
        if (cargoOnDateTransModel == null) {
            cargoOnDateTransModel = new ArrayList<CargoOnDateTransModel>();
        }
        return this.cargoOnDateTransModel;
    }

}
