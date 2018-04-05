
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
 * <p>Java class for ProcessingOfWagonModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingOfWagonModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CargoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ChangedDatetimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfDeleting" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfDeletingTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfDischarge" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfDischargetzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfInfoTransferUnloadingBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfInfoTransferUnloadingBeginTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfInfoTransferUnloadingEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfInfoTransferUnloadingEndTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfNotificationSending" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfNotificationSendingTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfReturningOfNotification" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfReturningOfNotificationTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeStartOfDischarge" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeStartOfDischargeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EmailTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventSiteIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventSiteIdFact1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoicEid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NameModifyingTimeProcessingWagons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnConsigmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransDelete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Transmitted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnloadedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UnloadedDatetimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WagonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WagonNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ProcessingOfWagonModel", propOrder = {
    "cargoName",
    "changedDatetime",
    "changedDatetimeTzid",
    "createdBy",
    "createdDatetime",
    "datetimeOfDeleting",
    "datetimeOfDeletingTzid",
    "datetimeOfDischarge",
    "datetimeOfDischargetzid",
    "datetimeOfInfoTransferUnloadingBegin",
    "datetimeOfInfoTransferUnloadingBeginTzid",
    "datetimeOfInfoTransferUnloadingEnd",
    "datetimeOfInfoTransferUnloadingEndTzid",
    "datetimeOfNotificationSending",
    "datetimeOfNotificationSendingTzid",
    "datetimeOfReturningOfNotification",
    "datetimeOfReturningOfNotificationTzid",
    "datetimeStartOfDischarge",
    "datetimeStartOfDischargeTzid",
    "deleted",
    "emailTo",
    "inventLocationIdFact",
    "inventSiteIdFact",
    "inventSiteIdFact1",
    "invoicEid",
    "invoiceNum",
    "modifiedBy",
    "modifiedDatetime",
    "nameModifyingTimeProcessingWagons",
    "notificationText",
    "recId",
    "receiptId",
    "returnConsigmentStatus",
    "salesAgreementId",
    "transDelete",
    "transmitted",
    "unloadedDatetime",
    "unloadedDatetimeTzid",
    "updated",
    "wagonCode",
    "wagonNum",
    "workVariantId"
})
public class ProcessingOfWagonModel {

    @XmlElementRef(name = "CargoName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoName;
    @XmlElement(name = "ChangedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedDatetime;
    @XmlElement(name = "ChangedDatetimeTzid")
    protected Integer changedDatetimeTzid;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "DatetimeOfDeleting")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfDeleting;
    @XmlElement(name = "DatetimeOfDeletingTzid")
    protected Integer datetimeOfDeletingTzid;
    @XmlElement(name = "DatetimeOfDischarge")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfDischarge;
    @XmlElement(name = "DatetimeOfDischargetzid")
    protected Integer datetimeOfDischargetzid;
    @XmlElement(name = "DatetimeOfInfoTransferUnloadingBegin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfInfoTransferUnloadingBegin;
    @XmlElement(name = "DatetimeOfInfoTransferUnloadingBeginTzid")
    protected Integer datetimeOfInfoTransferUnloadingBeginTzid;
    @XmlElement(name = "DatetimeOfInfoTransferUnloadingEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfInfoTransferUnloadingEnd;
    @XmlElement(name = "DatetimeOfInfoTransferUnloadingEndTzid")
    protected Integer datetimeOfInfoTransferUnloadingEndTzid;
    @XmlElement(name = "DatetimeOfNotificationSending")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfNotificationSending;
    @XmlElement(name = "DatetimeOfNotificationSendingTzid")
    protected Integer datetimeOfNotificationSendingTzid;
    @XmlElement(name = "DatetimeOfReturningOfNotification")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfReturningOfNotification;
    @XmlElement(name = "DatetimeOfReturningOfNotificationTzid")
    protected Integer datetimeOfReturningOfNotificationTzid;
    @XmlElement(name = "DatetimeStartOfDischarge")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeStartOfDischarge;
    @XmlElement(name = "DatetimeStartOfDischargeTzid")
    protected Integer datetimeStartOfDischargeTzid;
    @XmlElement(name = "Deleted")
    protected Integer deleted;
    @XmlElementRef(name = "EmailTo", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailTo;
    @XmlElementRef(name = "InventLocationIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdFact;
    @XmlElementRef(name = "InventSiteIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventSiteIdFact;
    @XmlElementRef(name = "InventSiteIdFact1", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventSiteIdFact1;
    @XmlElementRef(name = "InvoicEid", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicEid;
    @XmlElementRef(name = "InvoiceNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceNum;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "NameModifyingTimeProcessingWagons", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameModifyingTimeProcessingWagons;
    @XmlElementRef(name = "NotificationText", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationText;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElementRef(name = "ReceiptId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptId;
    @XmlElementRef(name = "ReturnConsigmentStatus", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnConsigmentStatus;
    @XmlElementRef(name = "SalesAgreementId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAgreementId;
    @XmlElement(name = "TransDelete")
    protected Integer transDelete;
    @XmlElement(name = "Transmitted")
    protected Integer transmitted;
    @XmlElement(name = "UnloadedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unloadedDatetime;
    @XmlElement(name = "UnloadedDatetimeTzid")
    protected Integer unloadedDatetimeTzid;
    @XmlElement(name = "Updated")
    protected Integer updated;
    @XmlElementRef(name = "WagonCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wagonCode;
    @XmlElementRef(name = "WagonNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wagonNum;
    @XmlElementRef(name = "WorkVariantId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workVariantId;

    /**
     * Gets the value of the cargoName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoName() {
        return cargoName;
    }

    /**
     * Sets the value of the cargoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoName(JAXBElement<String> value) {
        this.cargoName = value;
    }

    /**
     * Gets the value of the changedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedDatetime() {
        return changedDatetime;
    }

    /**
     * Sets the value of the changedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedDatetime(XMLGregorianCalendar value) {
        this.changedDatetime = value;
    }

    /**
     * Gets the value of the changedDatetimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangedDatetimeTzid() {
        return changedDatetimeTzid;
    }

    /**
     * Sets the value of the changedDatetimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangedDatetimeTzid(Integer value) {
        this.changedDatetimeTzid = value;
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
     * Gets the value of the datetimeOfDeleting property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeOfDeleting() {
        return datetimeOfDeleting;
    }

    /**
     * Sets the value of the datetimeOfDeleting property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeOfDeleting(XMLGregorianCalendar value) {
        this.datetimeOfDeleting = value;
    }

    /**
     * Gets the value of the datetimeOfDeletingTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfDeletingTzid() {
        return datetimeOfDeletingTzid;
    }

    /**
     * Sets the value of the datetimeOfDeletingTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfDeletingTzid(Integer value) {
        this.datetimeOfDeletingTzid = value;
    }

    /**
     * Gets the value of the datetimeOfDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeOfDischarge() {
        return datetimeOfDischarge;
    }

    /**
     * Sets the value of the datetimeOfDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeOfDischarge(XMLGregorianCalendar value) {
        this.datetimeOfDischarge = value;
    }

    /**
     * Gets the value of the datetimeOfDischargetzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfDischargetzid() {
        return datetimeOfDischargetzid;
    }

    /**
     * Sets the value of the datetimeOfDischargetzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfDischargetzid(Integer value) {
        this.datetimeOfDischargetzid = value;
    }

    /**
     * Gets the value of the datetimeOfInfoTransferUnloadingBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeOfInfoTransferUnloadingBegin() {
        return datetimeOfInfoTransferUnloadingBegin;
    }

    /**
     * Sets the value of the datetimeOfInfoTransferUnloadingBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeOfInfoTransferUnloadingBegin(XMLGregorianCalendar value) {
        this.datetimeOfInfoTransferUnloadingBegin = value;
    }

    /**
     * Gets the value of the datetimeOfInfoTransferUnloadingBeginTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfInfoTransferUnloadingBeginTzid() {
        return datetimeOfInfoTransferUnloadingBeginTzid;
    }

    /**
     * Sets the value of the datetimeOfInfoTransferUnloadingBeginTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfInfoTransferUnloadingBeginTzid(Integer value) {
        this.datetimeOfInfoTransferUnloadingBeginTzid = value;
    }

    /**
     * Gets the value of the datetimeOfInfoTransferUnloadingEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeOfInfoTransferUnloadingEnd() {
        return datetimeOfInfoTransferUnloadingEnd;
    }

    /**
     * Sets the value of the datetimeOfInfoTransferUnloadingEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeOfInfoTransferUnloadingEnd(XMLGregorianCalendar value) {
        this.datetimeOfInfoTransferUnloadingEnd = value;
    }

    /**
     * Gets the value of the datetimeOfInfoTransferUnloadingEndTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfInfoTransferUnloadingEndTzid() {
        return datetimeOfInfoTransferUnloadingEndTzid;
    }

    /**
     * Sets the value of the datetimeOfInfoTransferUnloadingEndTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfInfoTransferUnloadingEndTzid(Integer value) {
        this.datetimeOfInfoTransferUnloadingEndTzid = value;
    }

    /**
     * Gets the value of the datetimeOfNotificationSending property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeOfNotificationSending() {
        return datetimeOfNotificationSending;
    }

    /**
     * Sets the value of the datetimeOfNotificationSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeOfNotificationSending(XMLGregorianCalendar value) {
        this.datetimeOfNotificationSending = value;
    }

    /**
     * Gets the value of the datetimeOfNotificationSendingTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfNotificationSendingTzid() {
        return datetimeOfNotificationSendingTzid;
    }

    /**
     * Sets the value of the datetimeOfNotificationSendingTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfNotificationSendingTzid(Integer value) {
        this.datetimeOfNotificationSendingTzid = value;
    }

    /**
     * Gets the value of the datetimeOfReturningOfNotification property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeOfReturningOfNotification() {
        return datetimeOfReturningOfNotification;
    }

    /**
     * Sets the value of the datetimeOfReturningOfNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeOfReturningOfNotification(XMLGregorianCalendar value) {
        this.datetimeOfReturningOfNotification = value;
    }

    /**
     * Gets the value of the datetimeOfReturningOfNotificationTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfReturningOfNotificationTzid() {
        return datetimeOfReturningOfNotificationTzid;
    }

    /**
     * Sets the value of the datetimeOfReturningOfNotificationTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfReturningOfNotificationTzid(Integer value) {
        this.datetimeOfReturningOfNotificationTzid = value;
    }

    /**
     * Gets the value of the datetimeStartOfDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeStartOfDischarge() {
        return datetimeStartOfDischarge;
    }

    /**
     * Sets the value of the datetimeStartOfDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeStartOfDischarge(XMLGregorianCalendar value) {
        this.datetimeStartOfDischarge = value;
    }

    /**
     * Gets the value of the datetimeStartOfDischargeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeStartOfDischargeTzid() {
        return datetimeStartOfDischargeTzid;
    }

    /**
     * Sets the value of the datetimeStartOfDischargeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeStartOfDischargeTzid(Integer value) {
        this.datetimeStartOfDischargeTzid = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeleted(Integer value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the emailTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailTo() {
        return emailTo;
    }

    /**
     * Sets the value of the emailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailTo(JAXBElement<String> value) {
        this.emailTo = value;
    }

    /**
     * Gets the value of the inventLocationIdFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationIdFact() {
        return inventLocationIdFact;
    }

    /**
     * Sets the value of the inventLocationIdFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationIdFact(JAXBElement<String> value) {
        this.inventLocationIdFact = value;
    }

    /**
     * Gets the value of the inventSiteIdFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventSiteIdFact() {
        return inventSiteIdFact;
    }

    /**
     * Sets the value of the inventSiteIdFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventSiteIdFact(JAXBElement<String> value) {
        this.inventSiteIdFact = value;
    }

    /**
     * Gets the value of the inventSiteIdFact1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventSiteIdFact1() {
        return inventSiteIdFact1;
    }

    /**
     * Sets the value of the inventSiteIdFact1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventSiteIdFact1(JAXBElement<String> value) {
        this.inventSiteIdFact1 = value;
    }

    /**
     * Gets the value of the invoicEid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicEid() {
        return invoicEid;
    }

    /**
     * Sets the value of the invoicEid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicEid(JAXBElement<String> value) {
        this.invoicEid = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceNum(JAXBElement<String> value) {
        this.invoiceNum = value;
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
     * Gets the value of the nameModifyingTimeProcessingWagons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameModifyingTimeProcessingWagons() {
        return nameModifyingTimeProcessingWagons;
    }

    /**
     * Sets the value of the nameModifyingTimeProcessingWagons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameModifyingTimeProcessingWagons(JAXBElement<String> value) {
        this.nameModifyingTimeProcessingWagons = value;
    }

    /**
     * Gets the value of the notificationText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationText() {
        return notificationText;
    }

    /**
     * Sets the value of the notificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationText(JAXBElement<String> value) {
        this.notificationText = value;
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
     * Gets the value of the returnConsigmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnConsigmentStatus() {
        return returnConsigmentStatus;
    }

    /**
     * Sets the value of the returnConsigmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnConsigmentStatus(JAXBElement<String> value) {
        this.returnConsigmentStatus = value;
    }

    /**
     * Gets the value of the salesAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAgreementId() {
        return salesAgreementId;
    }

    /**
     * Sets the value of the salesAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAgreementId(JAXBElement<String> value) {
        this.salesAgreementId = value;
    }

    /**
     * Gets the value of the transDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransDelete() {
        return transDelete;
    }

    /**
     * Sets the value of the transDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransDelete(Integer value) {
        this.transDelete = value;
    }

    /**
     * Gets the value of the transmitted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransmitted() {
        return transmitted;
    }

    /**
     * Sets the value of the transmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransmitted(Integer value) {
        this.transmitted = value;
    }

    /**
     * Gets the value of the unloadedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnloadedDatetime() {
        return unloadedDatetime;
    }

    /**
     * Sets the value of the unloadedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnloadedDatetime(XMLGregorianCalendar value) {
        this.unloadedDatetime = value;
    }

    /**
     * Gets the value of the unloadedDatetimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnloadedDatetimeTzid() {
        return unloadedDatetimeTzid;
    }

    /**
     * Sets the value of the unloadedDatetimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnloadedDatetimeTzid(Integer value) {
        this.unloadedDatetimeTzid = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpdated(Integer value) {
        this.updated = value;
    }

    /**
     * Gets the value of the wagonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWagonCode() {
        return wagonCode;
    }

    /**
     * Sets the value of the wagonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWagonCode(JAXBElement<String> value) {
        this.wagonCode = value;
    }

    /**
     * Gets the value of the wagonNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWagonNum() {
        return wagonNum;
    }

    /**
     * Sets the value of the wagonNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWagonNum(JAXBElement<String> value) {
        this.wagonNum = value;
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
