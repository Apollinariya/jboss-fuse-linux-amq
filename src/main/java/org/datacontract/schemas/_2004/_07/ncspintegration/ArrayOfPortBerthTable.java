
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortBerthTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortBerthTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortBerthTable" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortBerthTable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortBerthTable", propOrder = {
    "portBerthTable"
})
public class ArrayOfPortBerthTable {

    @XmlElement(name = "PortBerthTable", nillable = true)
    protected List<PortBerthTable> portBerthTable;

    /**
     * Gets the value of the portBerthTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portBerthTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortBerthTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortBerthTable }
     * 
     * 
     */
    public List<PortBerthTable> getPortBerthTable() {
        if (portBerthTable == null) {
            portBerthTable = new ArrayList<PortBerthTable>();
        }
        return this.portBerthTable;
    }

}
