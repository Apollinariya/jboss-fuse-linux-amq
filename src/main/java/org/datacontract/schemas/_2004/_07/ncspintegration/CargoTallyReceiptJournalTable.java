
package org.datacontract.schemas._2004._07.ncspintegration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CargoTallyReceiptJournalTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoTallyReceiptJournalTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptanceAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcceptanceActSend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AssistantTallymanWorker" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BrigadeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoTallyReceiptJournalTranses" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfCargoTallyReceiptJournalTrans" minOccurs="0"/&gt;
 *         &lt;element name="ControlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DocumentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExportJournalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventsiteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoadedListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MovementJournalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NavigableExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NavigableImport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumWithInNavigable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PostedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PostedDatetimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PostedUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReImport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptIdCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipCodeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipHoldNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShipHoldNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipNameTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TallyStevedore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TallymanWorker" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TaskDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TaskDatetimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransferJournalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsedEquipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkShiftDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "CargoTallyReceiptJournalTable", propOrder = {
    "acceptanceAct",
    "acceptanceActSend",
    "assistantTallymanWorker",
    "berthCode",
    "blocked",
    "brigadeId",
    "cargoTallyReceiptJournalTranses",
    "controlCode",
    "createdBy",
    "createdDatetime",
    "documentDate",
    "documentNum",
    "endDate",
    "endTime",
    "exportJournalId",
    "inventLocationId",
    "inventsiteId",
    "loadedListId",
    "modifiedBy",
    "modifiedDatetime",
    "movementJournalId",
    "navigableExport",
    "navigableImport",
    "numWithInNavigable",
    "postedDatetime",
    "postedDatetimeTzid",
    "postedUserId",
    "reImport",
    "recId",
    "receiptDirection",
    "receiptId",
    "receiptIdCreated",
    "receiptMode",
    "receiptStatus",
    "shipCode",
    "shipCodeTo",
    "shipHoldNum",
    "shipHoldNumberId",
    "shipName",
    "shipNameTo",
    "startDate",
    "startTime",
    "tallyStevedore",
    "tallymanWorker",
    "taskDatetime",
    "taskDatetimeTzid",
    "transferJournalId",
    "usedEquipment",
    "workShiftDate",
    "workShiftId",
    "workVariantId"
})
public class CargoTallyReceiptJournalTable {

    @XmlElementRef(name = "AcceptanceAct", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceptanceAct;
    @XmlElement(name = "AcceptanceActSend")
    protected Integer acceptanceActSend;
    @XmlElement(name = "AssistantTallymanWorker")
    protected Long assistantTallymanWorker;
    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElement(name = "Blocked")
    protected Integer blocked;
    @XmlElementRef(name = "BrigadeId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brigadeId;
    @XmlElementRef(name = "CargoTallyReceiptJournalTranses", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCargoTallyReceiptJournalTrans> cargoTallyReceiptJournalTranses;
    @XmlElementRef(name = "ControlCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlCode;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "DocumentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElementRef(name = "DocumentNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentNum;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EndTime")
    protected Integer endTime;
    @XmlElementRef(name = "ExportJournalId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportJournalId;
    @XmlElementRef(name = "InventLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationId;
    @XmlElementRef(name = "InventsiteId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventsiteId;
    @XmlElementRef(name = "LoadedListId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadedListId;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "MovementJournalId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movementJournalId;
    @XmlElementRef(name = "NavigableExport", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navigableExport;
    @XmlElementRef(name = "NavigableImport", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navigableImport;
    @XmlElement(name = "NumWithInNavigable")
    protected Integer numWithInNavigable;
    @XmlElement(name = "PostedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDatetime;
    @XmlElement(name = "PostedDatetimeTzid")
    protected Integer postedDatetimeTzid;
    @XmlElementRef(name = "PostedUserId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postedUserId;
    @XmlElement(name = "ReImport")
    protected Integer reImport;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "ReceiptDirection")
    protected Integer receiptDirection;
    @XmlElementRef(name = "ReceiptId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptId;
    @XmlElementRef(name = "ReceiptIdCreated", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptIdCreated;
    @XmlElement(name = "ReceiptMode")
    protected Integer receiptMode;
    @XmlElement(name = "ReceiptStatus")
    protected Integer receiptStatus;
    @XmlElementRef(name = "ShipCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCode;
    @XmlElementRef(name = "ShipCodeTo", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCodeTo;
    @XmlElement(name = "ShipHoldNum")
    protected Integer shipHoldNum;
    @XmlElementRef(name = "ShipHoldNumberId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipHoldNumberId;
    @XmlElementRef(name = "ShipName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipName;
    @XmlElementRef(name = "ShipNameTo", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipNameTo;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartTime")
    protected Integer startTime;
    @XmlElement(name = "TallyStevedore")
    protected Long tallyStevedore;
    @XmlElement(name = "TallymanWorker")
    protected Long tallymanWorker;
    @XmlElement(name = "TaskDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taskDatetime;
    @XmlElement(name = "TaskDatetimeTzid")
    protected Integer taskDatetimeTzid;
    @XmlElementRef(name = "TransferJournalId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferJournalId;
    @XmlElementRef(name = "UsedEquipment", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usedEquipment;
    @XmlElement(name = "WorkShiftDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workShiftDate;
    @XmlElementRef(name = "WorkShiftId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workShiftId;
    @XmlElementRef(name = "WorkVariantId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workVariantId;

    /**
     * Gets the value of the acceptanceAct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcceptanceAct() {
        return acceptanceAct;
    }

    /**
     * Sets the value of the acceptanceAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcceptanceAct(JAXBElement<String> value) {
        this.acceptanceAct = value;
    }

    /**
     * Gets the value of the acceptanceActSend property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptanceActSend() {
        return acceptanceActSend;
    }

    /**
     * Sets the value of the acceptanceActSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptanceActSend(Integer value) {
        this.acceptanceActSend = value;
    }

    /**
     * Gets the value of the assistantTallymanWorker property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssistantTallymanWorker() {
        return assistantTallymanWorker;
    }

    /**
     * Sets the value of the assistantTallymanWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssistantTallymanWorker(Long value) {
        this.assistantTallymanWorker = value;
    }

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
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlocked(Integer value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the brigadeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrigadeId() {
        return brigadeId;
    }

    /**
     * Sets the value of the brigadeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrigadeId(JAXBElement<String> value) {
        this.brigadeId = value;
    }

    /**
     * Gets the value of the cargoTallyReceiptJournalTranses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargoTallyReceiptJournalTrans }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCargoTallyReceiptJournalTrans> getCargoTallyReceiptJournalTranses() {
        return cargoTallyReceiptJournalTranses;
    }

    /**
     * Sets the value of the cargoTallyReceiptJournalTranses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargoTallyReceiptJournalTrans }{@code >}
     *     
     */
    public void setCargoTallyReceiptJournalTranses(JAXBElement<ArrayOfCargoTallyReceiptJournalTrans> value) {
        this.cargoTallyReceiptJournalTranses = value;
    }

    /**
     * Gets the value of the controlCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControlCode() {
        return controlCode;
    }

    /**
     * Sets the value of the controlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControlCode(JAXBElement<String> value) {
        this.controlCode = value;
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
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the documentNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentNum() {
        return documentNum;
    }

    /**
     * Sets the value of the documentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentNum(JAXBElement<String> value) {
        this.documentNum = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndTime(Integer value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the exportJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportJournalId() {
        return exportJournalId;
    }

    /**
     * Sets the value of the exportJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportJournalId(JAXBElement<String> value) {
        this.exportJournalId = value;
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
     * Gets the value of the loadedListId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadedListId() {
        return loadedListId;
    }

    /**
     * Sets the value of the loadedListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadedListId(JAXBElement<String> value) {
        this.loadedListId = value;
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
     * Gets the value of the movementJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovementJournalId() {
        return movementJournalId;
    }

    /**
     * Sets the value of the movementJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovementJournalId(JAXBElement<String> value) {
        this.movementJournalId = value;
    }

    /**
     * Gets the value of the navigableExport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavigableExport() {
        return navigableExport;
    }

    /**
     * Sets the value of the navigableExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavigableExport(JAXBElement<String> value) {
        this.navigableExport = value;
    }

    /**
     * Gets the value of the navigableImport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavigableImport() {
        return navigableImport;
    }

    /**
     * Sets the value of the navigableImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavigableImport(JAXBElement<String> value) {
        this.navigableImport = value;
    }

    /**
     * Gets the value of the numWithInNavigable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumWithInNavigable() {
        return numWithInNavigable;
    }

    /**
     * Sets the value of the numWithInNavigable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumWithInNavigable(Integer value) {
        this.numWithInNavigable = value;
    }

    /**
     * Gets the value of the postedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDatetime() {
        return postedDatetime;
    }

    /**
     * Sets the value of the postedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDatetime(XMLGregorianCalendar value) {
        this.postedDatetime = value;
    }

    /**
     * Gets the value of the postedDatetimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostedDatetimeTzid() {
        return postedDatetimeTzid;
    }

    /**
     * Sets the value of the postedDatetimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostedDatetimeTzid(Integer value) {
        this.postedDatetimeTzid = value;
    }

    /**
     * Gets the value of the postedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostedUserId() {
        return postedUserId;
    }

    /**
     * Sets the value of the postedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostedUserId(JAXBElement<String> value) {
        this.postedUserId = value;
    }

    /**
     * Gets the value of the reImport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReImport() {
        return reImport;
    }

    /**
     * Sets the value of the reImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReImport(Integer value) {
        this.reImport = value;
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
     * Gets the value of the receiptDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiptDirection() {
        return receiptDirection;
    }

    /**
     * Sets the value of the receiptDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiptDirection(Integer value) {
        this.receiptDirection = value;
    }

    /**
     * Gets the value of the receiptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptId() {
        return receiptId;
    }

    /**
     * Sets the value of the receiptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptId(JAXBElement<String> value) {
        this.receiptId = value;
    }

    /**
     * Gets the value of the receiptIdCreated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptIdCreated() {
        return receiptIdCreated;
    }

    /**
     * Sets the value of the receiptIdCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptIdCreated(JAXBElement<String> value) {
        this.receiptIdCreated = value;
    }

    /**
     * Gets the value of the receiptMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiptMode() {
        return receiptMode;
    }

    /**
     * Sets the value of the receiptMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiptMode(Integer value) {
        this.receiptMode = value;
    }

    /**
     * Gets the value of the receiptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiptStatus() {
        return receiptStatus;
    }

    /**
     * Sets the value of the receiptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiptStatus(Integer value) {
        this.receiptStatus = value;
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
     * Gets the value of the shipCodeTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCodeTo() {
        return shipCodeTo;
    }

    /**
     * Sets the value of the shipCodeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCodeTo(JAXBElement<String> value) {
        this.shipCodeTo = value;
    }

    /**
     * Gets the value of the shipHoldNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipHoldNum() {
        return shipHoldNum;
    }

    /**
     * Sets the value of the shipHoldNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipHoldNum(Integer value) {
        this.shipHoldNum = value;
    }

    /**
     * Gets the value of the shipHoldNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipHoldNumberId() {
        return shipHoldNumberId;
    }

    /**
     * Sets the value of the shipHoldNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipHoldNumberId(JAXBElement<String> value) {
        this.shipHoldNumberId = value;
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
     * Gets the value of the shipNameTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipNameTo() {
        return shipNameTo;
    }

    /**
     * Sets the value of the shipNameTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipNameTo(JAXBElement<String> value) {
        this.shipNameTo = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartTime(Integer value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the tallyStevedore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTallyStevedore() {
        return tallyStevedore;
    }

    /**
     * Sets the value of the tallyStevedore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTallyStevedore(Long value) {
        this.tallyStevedore = value;
    }

    /**
     * Gets the value of the tallymanWorker property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTallymanWorker() {
        return tallymanWorker;
    }

    /**
     * Sets the value of the tallymanWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTallymanWorker(Long value) {
        this.tallymanWorker = value;
    }

    /**
     * Gets the value of the taskDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaskDatetime() {
        return taskDatetime;
    }

    /**
     * Sets the value of the taskDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaskDatetime(XMLGregorianCalendar value) {
        this.taskDatetime = value;
    }

    /**
     * Gets the value of the taskDatetimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskDatetimeTzid() {
        return taskDatetimeTzid;
    }

    /**
     * Sets the value of the taskDatetimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskDatetimeTzid(Integer value) {
        this.taskDatetimeTzid = value;
    }

    /**
     * Gets the value of the transferJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferJournalId() {
        return transferJournalId;
    }

    /**
     * Sets the value of the transferJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferJournalId(JAXBElement<String> value) {
        this.transferJournalId = value;
    }

    /**
     * Gets the value of the usedEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsedEquipment() {
        return usedEquipment;
    }

    /**
     * Sets the value of the usedEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsedEquipment(JAXBElement<String> value) {
        this.usedEquipment = value;
    }

    /**
     * Gets the value of the workShiftDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkShiftDate() {
        return workShiftDate;
    }

    /**
     * Sets the value of the workShiftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkShiftDate(XMLGregorianCalendar value) {
        this.workShiftDate = value;
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
