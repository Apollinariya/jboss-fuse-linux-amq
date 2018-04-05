
package org.datacontract.schemas._2004._07.ncspintegration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortEquipmentGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortEquipmentGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalcQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentGroupParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupSubType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HierarchyLEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdleQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdleQtyOmOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NameAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingQtyOmOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalQtyOmOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortEquipmentGroup", propOrder = {
    "calcQty",
    "description",
    "equipmentGroup",
    "equipmentGroupParent",
    "groupSubType",
    "groupType",
    "hierarchyLEVEL",
    "idleQty",
    "idleQtyOmOperatingUnit",
    "nameAlias",
    "processingQty",
    "processingQtyOmOperatingUnit",
    "recId",
    "totalQty",
    "totalQtyOmOperatingUnit"
})
public class PortEquipmentGroup {

    @XmlElement(name = "CalcQty")
    protected Integer calcQty;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EquipmentGroup", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentGroup;
    @XmlElementRef(name = "EquipmentGroupParent", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentGroupParent;
    @XmlElement(name = "GroupSubType")
    protected Integer groupSubType;
    @XmlElement(name = "GroupType")
    protected Integer groupType;
    @XmlElement(name = "HierarchyLEVEL")
    protected Integer hierarchyLEVEL;
    @XmlElement(name = "IdleQty")
    protected Integer idleQty;
    @XmlElement(name = "IdleQtyOmOperatingUnit")
    protected Integer idleQtyOmOperatingUnit;
    @XmlElementRef(name = "NameAlias", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameAlias;
    @XmlElement(name = "ProcessingQty")
    protected Integer processingQty;
    @XmlElement(name = "ProcessingQtyOmOperatingUnit")
    protected Integer processingQtyOmOperatingUnit;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "TotalQty")
    protected Integer totalQty;
    @XmlElement(name = "TotalQtyOmOperatingUnit")
    protected Integer totalQtyOmOperatingUnit;

    /**
     * Gets the value of the calcQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalcQty() {
        return calcQty;
    }

    /**
     * Sets the value of the calcQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalcQty(Integer value) {
        this.calcQty = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the equipmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentGroup() {
        return equipmentGroup;
    }

    /**
     * Sets the value of the equipmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentGroup(JAXBElement<String> value) {
        this.equipmentGroup = value;
    }

    /**
     * Gets the value of the equipmentGroupParent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentGroupParent() {
        return equipmentGroupParent;
    }

    /**
     * Sets the value of the equipmentGroupParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentGroupParent(JAXBElement<String> value) {
        this.equipmentGroupParent = value;
    }

    /**
     * Gets the value of the groupSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupSubType() {
        return groupSubType;
    }

    /**
     * Sets the value of the groupSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupSubType(Integer value) {
        this.groupSubType = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupType(Integer value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the hierarchyLEVEL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHierarchyLEVEL() {
        return hierarchyLEVEL;
    }

    /**
     * Sets the value of the hierarchyLEVEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHierarchyLEVEL(Integer value) {
        this.hierarchyLEVEL = value;
    }

    /**
     * Gets the value of the idleQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdleQty() {
        return idleQty;
    }

    /**
     * Sets the value of the idleQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdleQty(Integer value) {
        this.idleQty = value;
    }

    /**
     * Gets the value of the idleQtyOmOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdleQtyOmOperatingUnit() {
        return idleQtyOmOperatingUnit;
    }

    /**
     * Sets the value of the idleQtyOmOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdleQtyOmOperatingUnit(Integer value) {
        this.idleQtyOmOperatingUnit = value;
    }

    /**
     * Gets the value of the nameAlias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameAlias() {
        return nameAlias;
    }

    /**
     * Sets the value of the nameAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameAlias(JAXBElement<String> value) {
        this.nameAlias = value;
    }

    /**
     * Gets the value of the processingQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessingQty() {
        return processingQty;
    }

    /**
     * Sets the value of the processingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessingQty(Integer value) {
        this.processingQty = value;
    }

    /**
     * Gets the value of the processingQtyOmOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessingQtyOmOperatingUnit() {
        return processingQtyOmOperatingUnit;
    }

    /**
     * Sets the value of the processingQtyOmOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessingQtyOmOperatingUnit(Integer value) {
        this.processingQtyOmOperatingUnit = value;
    }

    /**
     * Gets the value of the recId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecId() {
        return recId;
    }

    /**
     * Sets the value of the recId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecId(Long value) {
        this.recId = value;
    }

    /**
     * Gets the value of the totalQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalQty() {
        return totalQty;
    }

    /**
     * Sets the value of the totalQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalQty(Integer value) {
        this.totalQty = value;
    }

    /**
     * Gets the value of the totalQtyOmOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalQtyOmOperatingUnit() {
        return totalQtyOmOperatingUnit;
    }

    /**
     * Sets the value of the totalQtyOmOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalQtyOmOperatingUnit(Integer value) {
        this.totalQtyOmOperatingUnit = value;
    }

}
