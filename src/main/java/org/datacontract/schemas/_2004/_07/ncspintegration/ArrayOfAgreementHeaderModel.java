
package org.datacontract.schemas._2004._07.ncspintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgreementHeaderModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgreementHeaderModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgreementHeaderModel" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}AgreementHeaderModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgreementHeaderModel", propOrder = {
    "agreementHeaderModel"
})
public class ArrayOfAgreementHeaderModel {

    @XmlElement(name = "AgreementHeaderModel", nillable = true)
    protected List<AgreementHeaderModel> agreementHeaderModel;

    /**
     * Gets the value of the agreementHeaderModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementHeaderModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementHeaderModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementHeaderModel }
     * 
     * 
     */
    public List<AgreementHeaderModel> getAgreementHeaderModel() {
        if (agreementHeaderModel == null) {
            agreementHeaderModel = new ArrayList<AgreementHeaderModel>();
        }
        return this.agreementHeaderModel;
    }

}
