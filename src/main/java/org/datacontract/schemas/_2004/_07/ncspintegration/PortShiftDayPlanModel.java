
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
 * <p>Java class for PortShiftDayPlanModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortShiftDayPlanModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoTallyReceiptCreated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EcoresCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ExpImpCabotage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventsiteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCreatedFunction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsEmergencyWork" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NavigableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nofreighter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanPackingUnitQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PlanPickType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlanVehicleQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlanWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PortImocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortShiftDayPlansFact" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortShiftDayPlanFactModel" minOccurs="0"/&gt;
 *         &lt;element name="PortShiftDayPlansFactEquipment" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortShiftDayPlanFactEquipmentModel" minOccurs="0"/&gt;
 *         &lt;element name="RailRoadLoadingAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShiftDayPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StorageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TaskMarked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TaskPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkShiftId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkVariantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortShiftDayPlanModel", propOrder = {
    "berthCode",
    "cargoTallyReceiptCreated",
    "createdBy",
    "createdDatetime",
    "ecoresCategoryId",
    "expImpCabotage",
    "inventLocationId",
    "inventsiteId",
    "isCreatedFunction",
    "isEmergencyWork",
    "itemId",
    "modifiedBy",
    "modifiedDatetime",
    "navigableId",
    "nofreighter",
    "operationType",
    "pierCode",
    "planPackingUnitQty",
    "planPickType",
    "planVehicleQty",
    "planWeight",
    "portImocode",
    "portShiftDayPlansFact",
    "portShiftDayPlansFactEquipment",
    "railRoadLoadingAreaCode",
    "recId",
    "requestId",
    "section",
    "shiftDayPlanId",
    "shipCode",
    "shipName",
    "storageType",
    "taskMarked",
    "taskPriority",
    "transDate",
    "workShiftId",
    "workVariantId"
})
public class PortShiftDayPlanModel {

    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElement(name = "CargoTallyReceiptCreated")
    protected Integer cargoTallyReceiptCreated;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "EcoresCategoryId")
    protected Long ecoresCategoryId;
    @XmlElement(name = "ExpImpCabotage")
    protected Integer expImpCabotage;
    @XmlElementRef(name = "InventLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationId;
    @XmlElementRef(name = "InventsiteId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventsiteId;
    @XmlElement(name = "IsCreatedFunction")
    protected Integer isCreatedFunction;
    @XmlElement(name = "IsEmergencyWork")
    protected Integer isEmergencyWork;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemId;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "NavigableId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navigableId;
    @XmlElement(name = "Nofreighter")
    protected Integer nofreighter;
    @XmlElement(name = "OperationType")
    protected Integer operationType;
    @XmlElementRef(name = "PierCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pierCode;
    @XmlElement(name = "PlanPackingUnitQty")
    protected BigDecimal planPackingUnitQty;
    @XmlElement(name = "PlanPickType")
    protected Integer planPickType;
    @XmlElement(name = "PlanVehicleQty")
    protected Integer planVehicleQty;
    @XmlElement(name = "PlanWeight")
    protected BigDecimal planWeight;
    @XmlElementRef(name = "PortImocode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portImocode;
    @XmlElementRef(name = "PortShiftDayPlansFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortShiftDayPlanFactModel> portShiftDayPlansFact;
    @XmlElementRef(name = "PortShiftDayPlansFactEquipment", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel> portShiftDayPlansFactEquipment;
    @XmlElementRef(name = "RailRoadLoadingAreaCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> railRoadLoadingAreaCode;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElementRef(name = "RequestId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElement(name = "Section")
    protected Integer section;
    @XmlElementRef(name = "ShiftDayPlanId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftDayPlanId;
    @XmlElementRef(name = "ShipCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCode;
    @XmlElementRef(name = "ShipName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipName;
    @XmlElement(name = "StorageType")
    protected Integer storageType;
    @XmlElement(name = "TaskMarked")
    protected Integer taskMarked;
    @XmlElement(name = "TaskPriority")
    protected Integer taskPriority;
    @XmlElement(name = "TransDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transDate;
    @XmlElementRef(name = "WorkShiftId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workShiftId;
    @XmlElementRef(name = "WorkVariantId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workVariantId;

    /**
     * Gets the value of the berthCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBerthCode() {
        return berthCode;
    }

    /**
     * Sets the value of the berthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBerthCode(JAXBElement<String> value) {
        this.berthCode = value;
    }

    /**
     * Gets the value of the cargoTallyReceiptCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCargoTallyReceiptCreated() {
        return cargoTallyReceiptCreated;
    }

    /**
     * Sets the value of the cargoTallyReceiptCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCargoTallyReceiptCreated(Integer value) {
        this.cargoTallyReceiptCreated = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDatetime() {
        return createdDatetime;
    }

    /**
     * Sets the value of the createdDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDatetime(XMLGregorianCalendar value) {
        this.createdDatetime = value;
    }

    /**
     * Gets the value of the ecoresCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEcoresCategoryId() {
        return ecoresCategoryId;
    }

    /**
     * Sets the value of the ecoresCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEcoresCategoryId(Long value) {
        this.ecoresCategoryId = value;
    }

    /**
     * Gets the value of the expImpCabotage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpImpCabotage() {
        return expImpCabotage;
    }

    /**
     * Sets the value of the expImpCabotage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpImpCabotage(Integer value) {
        this.expImpCabotage = value;
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
     * Gets the value of the inventsiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventsiteId() {
        return inventsiteId;
    }

    /**
     * Sets the value of the inventsiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventsiteId(JAXBElement<String> value) {
        this.inventsiteId = value;
    }

    /**
     * Gets the value of the isCreatedFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsCreatedFunction() {
        return isCreatedFunction;
    }

    /**
     * Sets the value of the isCreatedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsCreatedFunction(Integer value) {
        this.isCreatedFunction = value;
    }

    /**
     * Gets the value of the isEmergencyWork property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsEmergencyWork() {
        return isEmergencyWork;
    }

    /**
     * Sets the value of the isEmergencyWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsEmergencyWork(Integer value) {
        this.isEmergencyWork = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemId(JAXBElement<String> value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifiedBy(JAXBElement<String> value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifiedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDatetime() {
        return modifiedDatetime;
    }

    /**
     * Sets the value of the modifiedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDatetime(XMLGregorianCalendar value) {
        this.modifiedDatetime = value;
    }

    /**
     * Gets the value of the navigableId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavigableId() {
        return navigableId;
    }

    /**
     * Sets the value of the navigableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavigableId(JAXBElement<String> value) {
        this.navigableId = value;
    }

    /**
     * Gets the value of the nofreighter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNofreighter() {
        return nofreighter;
    }

    /**
     * Sets the value of the nofreighter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNofreighter(Integer value) {
        this.nofreighter = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationType(Integer value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the pierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPierCode() {
        return pierCode;
    }

    /**
     * Sets the value of the pierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPierCode(JAXBElement<String> value) {
        this.pierCode = value;
    }

    /**
     * Gets the value of the planPackingUnitQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanPackingUnitQty() {
        return planPackingUnitQty;
    }

    /**
     * Sets the value of the planPackingUnitQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanPackingUnitQty(BigDecimal value) {
        this.planPackingUnitQty = value;
    }

    /**
     * Gets the value of the planPickType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanPickType() {
        return planPickType;
    }

    /**
     * Sets the value of the planPickType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanPickType(Integer value) {
        this.planPickType = value;
    }

    /**
     * Gets the value of the planVehicleQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanVehicleQty() {
        return planVehicleQty;
    }

    /**
     * Sets the value of the planVehicleQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanVehicleQty(Integer value) {
        this.planVehicleQty = value;
    }

    /**
     * Gets the value of the planWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanWeight() {
        return planWeight;
    }

    /**
     * Sets the value of the planWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanWeight(BigDecimal value) {
        this.planWeight = value;
    }

    /**
     * Gets the value of the portImocode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortImocode() {
        return portImocode;
    }

    /**
     * Sets the value of the portImocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortImocode(JAXBElement<String> value) {
        this.portImocode = value;
    }

    /**
     * Gets the value of the portShiftDayPlansFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortShiftDayPlanFactModel> getPortShiftDayPlansFact() {
        return portShiftDayPlansFact;
    }

    /**
     * Sets the value of the portShiftDayPlansFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactModel }{@code >}
     *     
     */
    public void setPortShiftDayPlansFact(JAXBElement<ArrayOfPortShiftDayPlanFactModel> value) {
        this.portShiftDayPlansFact = value;
    }

    /**
     * Gets the value of the portShiftDayPlansFactEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactEquipmentModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel> getPortShiftDayPlansFactEquipment() {
        return portShiftDayPlansFactEquipment;
    }

    /**
     * Sets the value of the portShiftDayPlansFactEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactEquipmentModel }{@code >}
     *     
     */
    public void setPortShiftDayPlansFactEquipment(JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel> value) {
        this.portShiftDayPlansFactEquipment = value;
    }

    /**
     * Gets the value of the railRoadLoadingAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRailRoadLoadingAreaCode() {
        return railRoadLoadingAreaCode;
    }

    /**
     * Sets the value of the railRoadLoadingAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRailRoadLoadingAreaCode(JAXBElement<String> value) {
        this.railRoadLoadingAreaCode = value;
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
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<String> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSection(Integer value) {
        this.section = value;
    }

    /**
     * Gets the value of the shiftDayPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShiftDayPlanId() {
        return shiftDayPlanId;
    }

    /**
     * Sets the value of the shiftDayPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShiftDayPlanId(JAXBElement<String> value) {
        this.shiftDayPlanId = value;
    }

    /**
     * Gets the value of the shipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCode() {
        return shipCode;
    }

    /**
     * Sets the value of the shipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCode(JAXBElement<String> value) {
        this.shipCode = value;
    }

    /**
     * Gets the value of the shipName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipName() {
        return shipName;
    }

    /**
     * Sets the value of the shipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipName(JAXBElement<String> value) {
        this.shipName = value;
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
     * Gets the value of the taskMarked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskMarked() {
        return taskMarked;
    }

    /**
     * Sets the value of the taskMarked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskMarked(Integer value) {
        this.taskMarked = value;
    }

    /**
     * Gets the value of the taskPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskPriority() {
        return taskPriority;
    }

    /**
     * Sets the value of the taskPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskPriority(Integer value) {
        this.taskPriority = value;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDate(XMLGregorianCalendar value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the workShiftId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkShiftId() {
        return workShiftId;
    }

    /**
     * Sets the value of the workShiftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkShiftId(JAXBElement<String> value) {
        this.workShiftId = value;
    }

    /**
     * Gets the value of the workVariantId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkVariantId() {
        return workVariantId;
    }

    /**
     * Sets the value of the workVariantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkVariantId(JAXBElement<String> value) {
        this.workVariantId = value;
    }

}
