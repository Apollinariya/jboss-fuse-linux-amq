
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortWorkBrigade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortWorkBrigade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortWorkBrigade" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}PortWorkBrigade" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortWorkBrigade", propOrder = {
    "portWorkBrigade"
})
public class ArrayOfPortWorkBrigade {

    @XmlElement(name = "PortWorkBrigade", nillable = true)
    protected List<PortWorkBrigade> portWorkBrigade;

    /**
     * Gets the value of the portWorkBrigade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portWorkBrigade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortWorkBrigade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortWorkBrigade }
     * 
     * 
     */
    public List<PortWorkBrigade> getPortWorkBrigade() {
        if (portWorkBrigade == null) {
            portWorkBrigade = new ArrayList<PortWorkBrigade>();
        }
        return this.portWorkBrigade;
    }

}
