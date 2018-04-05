
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortTimeSheetOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortTimeSheetOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortTimeSheetOperation" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortTimeSheetOperation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortTimeSheetOperation", propOrder = {
    "portTimeSheetOperation"
})
public class ArrayOfPortTimeSheetOperation {

    @XmlElement(name = "PortTimeSheetOperation", nillable = true)
    protected List<PortTimeSheetOperation> portTimeSheetOperation;

    /**
     * Gets the value of the portTimeSheetOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portTimeSheetOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortTimeSheetOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortTimeSheetOperation }
     * 
     * 
     */
    public List<PortTimeSheetOperation> getPortTimeSheetOperation() {
        if (portTimeSheetOperation == null) {
            portTimeSheetOperation = new ArrayList<PortTimeSheetOperation>();
        }
        return this.portTimeSheetOperation;
    }

}
