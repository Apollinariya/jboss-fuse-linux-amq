
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortCargoTimeSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortCargoTimeSheet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortCargoTimeSheet" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortCargoTimeSheet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortCargoTimeSheet", propOrder = {
    "portCargoTimeSheet"
})
public class ArrayOfPortCargoTimeSheet {

    @XmlElement(name = "PortCargoTimeSheet", nillable = true)
    protected List<PortCargoTimeSheet> portCargoTimeSheet;

    /**
     * Gets the value of the portCargoTimeSheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portCargoTimeSheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortCargoTimeSheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortCargoTimeSheet }
     * 
     * 
     */
    public List<PortCargoTimeSheet> getPortCargoTimeSheet() {
        if (portCargoTimeSheet == null) {
            portCargoTimeSheet = new ArrayList<PortCargoTimeSheet>();
        }
        return this.portCargoTimeSheet;
    }

}
