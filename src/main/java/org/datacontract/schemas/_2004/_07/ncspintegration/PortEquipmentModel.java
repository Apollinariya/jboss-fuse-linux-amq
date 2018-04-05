
package org.datacontract.schemas._2004._07.ncspintegration;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortEquipmentModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortEquipmentModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdleQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdleQtyOMOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoadCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingQtyOMOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalQtyOMOperatingUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VolumeCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortEquipmentModel", propOrder = {
    "description",
    "equipmentGroup",
    "equipmentModel",
    "idleQty",
    "idleQtyOMOperatingUnit",
    "loadCapacity",
    "processingQty",
    "processingQtyOMOperatingUnit",
    "recId",
    "totalQty",
    "totalQtyOMOperatingUnit",
    "volumeCapacity"
})
public class PortEquipmentModel {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EquipmentGroup", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentGroup;
    @XmlElementRef(name = "EquipmentModel", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentModel;
    @XmlElement(name = "IdleQty")
    protected Integer idleQty;
    @XmlElement(name = "IdleQtyOMOperatingUnit")
    protected Integer idleQtyOMOperatingUnit;
    @XmlElement(name = "LoadCapacity")
    protected BigDecimal loadCapacity;
    @XmlElement(name = "ProcessingQty")
    protected Integer processingQty;
    @XmlElement(name = "ProcessingQtyOMOperatingUnit")
    protected Integer processingQtyOMOperatingUnit;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "TotalQty")
    protected Integer totalQty;
    @XmlElement(name = "TotalQtyOMOperatingUnit")
    protected Integer totalQtyOMOperatingUnit;
    @XmlElement(name = "VolumeCapacity")
    protected BigDecimal volumeCapacity;

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
     * Gets the value of the equipmentModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentModel() {
        return equipmentModel;
    }

    /**
     * Sets the value of the equipmentModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentModel(JAXBElement<String> value) {
        this.equipmentModel = value;
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
     * Gets the value of the idleQtyOMOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdleQtyOMOperatingUnit() {
        return idleQtyOMOperatingUnit;
    }

    /**
     * Sets the value of the idleQtyOMOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdleQtyOMOperatingUnit(Integer value) {
        this.idleQtyOMOperatingUnit = value;
    }

    /**
     * Gets the value of the loadCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Sets the value of the loadCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoadCapacity(BigDecimal value) {
        this.loadCapacity = value;
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
     * Gets the value of the processingQtyOMOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessingQtyOMOperatingUnit() {
        return processingQtyOMOperatingUnit;
    }

    /**
     * Sets the value of the processingQtyOMOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessingQtyOMOperatingUnit(Integer value) {
        this.processingQtyOMOperatingUnit = value;
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
     * Gets the value of the totalQtyOMOperatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalQtyOMOperatingUnit() {
        return totalQtyOMOperatingUnit;
    }

    /**
     * Sets the value of the totalQtyOMOperatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalQtyOMOperatingUnit(Integer value) {
        this.totalQtyOMOperatingUnit = value;
    }

    /**
     * Gets the value of the volumeCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeCapacity() {
        return volumeCapacity;
    }

    /**
     * Sets the value of the volumeCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeCapacity(BigDecimal value) {
        this.volumeCapacity = value;
    }

}
