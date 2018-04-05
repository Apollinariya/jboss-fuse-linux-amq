
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClientListModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientListModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientListModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ClientListModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientListModel", propOrder = {
    "clientListModel"
})
public class ArrayOfClientListModel {

    @XmlElement(name = "ClientListModel", nillable = true)
    protected List<ClientListModel> clientListModel;

    /**
     * Gets the value of the clientListModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientListModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientListModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientListModel }
     * 
     * 
     */
    public List<ClientListModel> getClientListModel() {
        if (clientListModel == null) {
            clientListModel = new ArrayList<ClientListModel>();
        }
        return this.clientListModel;
    }

}
