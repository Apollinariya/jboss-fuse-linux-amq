
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInventBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInventBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventBatch" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}InventBatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInventBatch", propOrder = {
    "inventBatch"
})
public class ArrayOfInventBatch {

    @XmlElement(name = "InventBatch", nillable = true)
    protected List<InventBatch> inventBatch;

    /**
     * Gets the value of the inventBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventBatch }
     * 
     * 
     */
    public List<InventBatch> getInventBatch() {
        if (inventBatch == null) {
            inventBatch = new ArrayList<InventBatch>();
        }
        return this.inventBatch;
    }

}
