
package org.datacontract.schemas._2004._07.ncspintegration;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WMSLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WMSLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AbsoluteHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AisleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InputBlockingCauseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastCountedUtcDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastCountedUtcDateTimeTzId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ManualName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ManualSortCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxPalletCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="McrReservationPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutputBlockingCauseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PalletTypeGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickingAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rack" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SortCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StorageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StoreAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitLoad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WMSLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WMSLocation", propOrder = {
    "absoluteHeight",
    "aisleId",
    "checkText",
    "depth",
    "height",
    "inputBlockingCauseId",
    "inputLocation",
    "inventLocationId",
    "lastCountedUtcDateTime",
    "lastCountedUtcDateTimeTzId",
    "level",
    "locProfileId",
    "locationType",
    "manualName",
    "manualSortCode",
    "maxPalletCount",
    "maxVolume",
    "maxWeight",
    "mcrReservationPriority",
    "outputBlockingCauseId",
    "palletTypeGroupId",
    "pickingAreaId",
    "position",
    "rack",
    "recId",
    "sortCode",
    "storageType",
    "storeAreaId",
    "unitLoad",
    "volume",
    "wmsLocationId",
    "width",
    "zoneId"
})
public class WMSLocation {

    @XmlElement(name = "AbsoluteHeight")
    protected BigDecimal absoluteHeight;
    @XmlElementRef(name = "AisleId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aisleId;
    @XmlElementRef(name = "CheckText", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkText;
    @XmlElement(name = "Depth")
    protected BigDecimal depth;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElementRef(name = "InputBlockingCauseId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBlockingCauseId;
    @XmlElementRef(name = "InputLocation", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputLocation;
    @XmlElementRef(name = "InventLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationId;
    @XmlElement(name = "LastCountedUtcDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCountedUtcDateTime;
    @XmlElement(name = "LastCountedUtcDateTimeTzId")
    protected Integer lastCountedUtcDateTimeTzId;
    @XmlElement(name = "Level")
    protected Integer level;
    @XmlElementRef(name = "LocProfileId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locProfileId;
    @XmlElement(name = "LocationType")
    protected Integer locationType;
    @XmlElement(name = "ManualName")
    protected Integer manualName;
    @XmlElement(name = "ManualSortCode")
    protected Integer manualSortCode;
    @XmlElement(name = "MaxPalletCount")
    protected Integer maxPalletCount;
    @XmlElement(name = "MaxVolume")
    protected BigDecimal maxVolume;
    @XmlElement(name = "MaxWeight")
    protected BigDecimal maxWeight;
    @XmlElement(name = "McrReservationPriority")
    protected Integer mcrReservationPriority;
    @XmlElementRef(name = "OutputBlockingCauseId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outputBlockingCauseId;
    @XmlElementRef(name = "PalletTypeGroupId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> palletTypeGroupId;
    @XmlElementRef(name = "PickingAreaId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pickingAreaId;
    @XmlElement(name = "Position")
    protected Integer position;
    @XmlElement(name = "Rack")
    protected Integer rack;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "SortCode")
    protected Integer sortCode;
    @XmlElement(name = "StorageType")
    protected Integer storageType;
    @XmlElementRef(name = "StoreAreaId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeAreaId;
    @XmlElement(name = "UnitLoad")
    protected BigDecimal unitLoad;
    @XmlElement(name = "Volume")
    protected BigDecimal volume;
    @XmlElementRef(name = "WMSLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationId;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElementRef(name = "ZoneId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zoneId;

    /**
     * Gets the value of the absoluteHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAbsoluteHeight() {
        return absoluteHeight;
    }

    /**
     * Sets the value of the absoluteHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbsoluteHeight(BigDecimal value) {
        this.absoluteHeight = value;
    }

    /**
     * Gets the value of the aisleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAisleId() {
        return aisleId;
    }

    /**
     * Sets the value of the aisleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAisleId(JAXBElement<String> value) {
        this.aisleId = value;
    }

    /**
     * Gets the value of the checkText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckText() {
        return checkText;
    }

    /**
     * Sets the value of the checkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckText(JAXBElement<String> value) {
        this.checkText = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepth(BigDecimal value) {
        this.depth = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Gets the value of the inputBlockingCauseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBlockingCauseId() {
        return inputBlockingCauseId;
    }

    /**
     * Sets the value of the inputBlockingCauseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBlockingCauseId(JAXBElement<String> value) {
        this.inputBlockingCauseId = value;
    }

    /**
     * Gets the value of the inputLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputLocation() {
        return inputLocation;
    }

    /**
     * Sets the value of the inputLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputLocation(JAXBElement<String> value) {
        this.inputLocation = value;
    }

    /**
     * Gets the value of the inventLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationId() {
        return inventLocationId;
    }

    /**
     * Sets the value of the inventLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationId(JAXBElement<String> value) {
        this.inventLocationId = value;
    }

    /**
     * Gets the value of the lastCountedUtcDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCountedUtcDateTime() {
        return lastCountedUtcDateTime;
    }

    /**
     * Sets the value of the lastCountedUtcDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCountedUtcDateTime(XMLGregorianCalendar value) {
        this.lastCountedUtcDateTime = value;
    }

    /**
     * Gets the value of the lastCountedUtcDateTimeTzId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastCountedUtcDateTimeTzId() {
        return lastCountedUtcDateTimeTzId;
    }

    /**
     * Sets the value of the lastCountedUtcDateTimeTzId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastCountedUtcDateTimeTzId(Integer value) {
        this.lastCountedUtcDateTimeTzId = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Gets the value of the locProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocProfileId() {
        return locProfileId;
    }

    /**
     * Sets the value of the locProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocProfileId(JAXBElement<String> value) {
        this.locProfileId = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationType(Integer value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the manualName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManualName() {
        return manualName;
    }

    /**
     * Sets the value of the manualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManualName(Integer value) {
        this.manualName = value;
    }

    /**
     * Gets the value of the manualSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManualSortCode() {
        return manualSortCode;
    }

    /**
     * Sets the value of the manualSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManualSortCode(Integer value) {
        this.manualSortCode = value;
    }

    /**
     * Gets the value of the maxPalletCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPalletCount() {
        return maxPalletCount;
    }

    /**
     * Sets the value of the maxPalletCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPalletCount(Integer value) {
        this.maxPalletCount = value;
    }

    /**
     * Gets the value of the maxVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxVolume() {
        return maxVolume;
    }

    /**
     * Sets the value of the maxVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxVolume(BigDecimal value) {
        this.maxVolume = value;
    }

    /**
     * Gets the value of the maxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets the value of the maxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWeight(BigDecimal value) {
        this.maxWeight = value;
    }

    /**
     * Gets the value of the mcrReservationPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMcrReservationPriority() {
        return mcrReservationPriority;
    }

    /**
     * Sets the value of the mcrReservationPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMcrReservationPriority(Integer value) {
        this.mcrReservationPriority = value;
    }

    /**
     * Gets the value of the outputBlockingCauseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutputBlockingCauseId() {
        return outputBlockingCauseId;
    }

    /**
     * Sets the value of the outputBlockingCauseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutputBlockingCauseId(JAXBElement<String> value) {
        this.outputBlockingCauseId = value;
    }

    /**
     * Gets the value of the palletTypeGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPalletTypeGroupId() {
        return palletTypeGroupId;
    }

    /**
     * Sets the value of the palletTypeGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPalletTypeGroupId(JAXBElement<String> value) {
        this.palletTypeGroupId = value;
    }

    /**
     * Gets the value of the pickingAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickingAreaId() {
        return pickingAreaId;
    }

    /**
     * Sets the value of the pickingAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickingAreaId(JAXBElement<String> value) {
        this.pickingAreaId = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the rack property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRack() {
        return rack;
    }

    /**
     * Sets the value of the rack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRack(Integer value) {
        this.rack = value;
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
     * Gets the value of the sortCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortCode() {
        return sortCode;
    }

    /**
     * Sets the value of the sortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortCode(Integer value) {
        this.sortCode = value;
    }

    /**
     * Gets the value of the storageType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStorageType() {
        return storageType;
    }

    /**
     * Sets the value of the storageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStorageType(Integer value) {
        this.storageType = value;
    }

    /**
     * Gets the value of the storeAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreAreaId() {
        return storeAreaId;
    }

    /**
     * Sets the value of the storeAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreAreaId(JAXBElement<String> value) {
        this.storeAreaId = value;
    }

    /**
     * Gets the value of the unitLoad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitLoad() {
        return unitLoad;
    }

    /**
     * Sets the value of the unitLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitLoad(BigDecimal value) {
        this.unitLoad = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the wmsLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSLocationId() {
        return wmsLocationId;
    }

    /**
     * Sets the value of the wmsLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSLocationId(JAXBElement<String> value) {
        this.wmsLocationId = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the zoneId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZoneId() {
        return zoneId;
    }

    /**
     * Sets the value of the zoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZoneId(JAXBElement<String> value) {
        this.zoneId = value;
    }

}
