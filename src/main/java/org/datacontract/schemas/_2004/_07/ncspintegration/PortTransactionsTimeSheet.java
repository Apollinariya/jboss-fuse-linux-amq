
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
 * <p>Java class for PortTransactionsTimeSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortTransactionsTimeSheet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountMechanizedLines" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoForGrossNorms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateFinishOperation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishOperation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishOperationTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeStartOperationTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimestartOperation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DowntimeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Modifiedby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MooringNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOperation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OldEcoresCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequestUoperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeFinishOperation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimesheetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimesheetOperationsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortTransactionsTimeSheet", propOrder = {
    "amountMechanizedLines",
    "berthCode",
    "cargoForGrossNorms",
    "createdBy",
    "createdDatetime",
    "dateFinishOperation",
    "datetimeFinishOperation",
    "datetimeFinishOperationTzid",
    "datetimeStartOperationTzid",
    "datetimestartOperation",
    "downtimeReason",
    "lineNum",
    "modifiedDatetime",
    "modifiedby",
    "mooringNum",
    "notes",
    "numberOperation",
    "oldEcoresCategoryId",
    "operationDuration",
    "recId",
    "requestUoperationType",
    "timeFinishOperation",
    "timesheetId",
    "timesheetOperationsId"
})
public class PortTransactionsTimeSheet {

    @XmlElement(name = "AmountMechanizedLines")
    protected Long amountMechanizedLines;
    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElementRef(name = "CargoForGrossNorms", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoForGrossNorms;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "DateFinishOperation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinishOperation;
    @XmlElement(name = "DatetimeFinishOperation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFinishOperation;
    @XmlElement(name = "DatetimeFinishOperationTzid")
    protected Integer datetimeFinishOperationTzid;
    @XmlElement(name = "DatetimeStartOperationTzid")
    protected Integer datetimeStartOperationTzid;
    @XmlElement(name = "DatetimestartOperation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimestartOperation;
    @XmlElementRef(name = "DowntimeReason", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downtimeReason;
    @XmlElement(name = "LineNum")
    protected BigDecimal lineNum;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "Modifiedby", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedby;
    @XmlElement(name = "MooringNum")
    protected Integer mooringNum;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElement(name = "NumberOperation")
    protected Integer numberOperation;
    @XmlElementRef(name = "OldEcoresCategoryId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldEcoresCategoryId;
    @XmlElement(name = "OperationDuration")
    protected BigDecimal operationDuration;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RequestUoperationType")
    protected Integer requestUoperationType;
    @XmlElement(name = "TimeFinishOperation")
    protected Integer timeFinishOperation;
    @XmlElementRef(name = "TimesheetId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timesheetId;
    @XmlElementRef(name = "TimesheetOperationsId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timesheetOperationsId;

    /**
     * Gets the value of the amountMechanizedLines property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountMechanizedLines() {
        return amountMechanizedLines;
    }

    /**
     * Sets the value of the amountMechanizedLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountMechanizedLines(Long value) {
        this.amountMechanizedLines = value;
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
     * Gets the value of the cargoForGrossNorms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoForGrossNorms() {
        return cargoForGrossNorms;
    }

    /**
     * Sets the value of the cargoForGrossNorms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoForGrossNorms(JAXBElement<String> value) {
        this.cargoForGrossNorms = value;
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
     * Gets the value of the dateFinishOperation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinishOperation() {
        return dateFinishOperation;
    }

    /**
     * Sets the value of the dateFinishOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinishOperation(XMLGregorianCalendar value) {
        this.dateFinishOperation = value;
    }

    /**
     * Gets the value of the datetimeFinishOperation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFinishOperation() {
        return datetimeFinishOperation;
    }

    /**
     * Sets the value of the datetimeFinishOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFinishOperation(XMLGregorianCalendar value) {
        this.datetimeFinishOperation = value;
    }

    /**
     * Gets the value of the datetimeFinishOperationTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFinishOperationTzid() {
        return datetimeFinishOperationTzid;
    }

    /**
     * Sets the value of the datetimeFinishOperationTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFinishOperationTzid(Integer value) {
        this.datetimeFinishOperationTzid = value;
    }

    /**
     * Gets the value of the datetimeStartOperationTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeStartOperationTzid() {
        return datetimeStartOperationTzid;
    }

    /**
     * Sets the value of the datetimeStartOperationTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeStartOperationTzid(Integer value) {
        this.datetimeStartOperationTzid = value;
    }

    /**
     * Gets the value of the datetimestartOperation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimestartOperation() {
        return datetimestartOperation;
    }

    /**
     * Sets the value of the datetimestartOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimestartOperation(XMLGregorianCalendar value) {
        this.datetimestartOperation = value;
    }

    /**
     * Gets the value of the downtimeReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDowntimeReason() {
        return downtimeReason;
    }

    /**
     * Sets the value of the downtimeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDowntimeReason(JAXBElement<String> value) {
        this.downtimeReason = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineNum(BigDecimal value) {
        this.lineNum = value;
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
     * Gets the value of the modifiedby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifiedby() {
        return modifiedby;
    }

    /**
     * Sets the value of the modifiedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifiedby(JAXBElement<String> value) {
        this.modifiedby = value;
    }

    /**
     * Gets the value of the mooringNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMooringNum() {
        return mooringNum;
    }

    /**
     * Sets the value of the mooringNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMooringNum(Integer value) {
        this.mooringNum = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the numberOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOperation() {
        return numberOperation;
    }

    /**
     * Sets the value of the numberOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOperation(Integer value) {
        this.numberOperation = value;
    }

    /**
     * Gets the value of the oldEcoresCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldEcoresCategoryId() {
        return oldEcoresCategoryId;
    }

    /**
     * Sets the value of the oldEcoresCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldEcoresCategoryId(JAXBElement<String> value) {
        this.oldEcoresCategoryId = value;
    }

    /**
     * Gets the value of the operationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperationDuration() {
        return operationDuration;
    }

    /**
     * Sets the value of the operationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperationDuration(BigDecimal value) {
        this.operationDuration = value;
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
     * Gets the value of the requestUoperationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestUoperationType() {
        return requestUoperationType;
    }

    /**
     * Sets the value of the requestUoperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestUoperationType(Integer value) {
        this.requestUoperationType = value;
    }

    /**
     * Gets the value of the timeFinishOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeFinishOperation() {
        return timeFinishOperation;
    }

    /**
     * Sets the value of the timeFinishOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeFinishOperation(Integer value) {
        this.timeFinishOperation = value;
    }

    /**
     * Gets the value of the timesheetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimesheetId() {
        return timesheetId;
    }

    /**
     * Sets the value of the timesheetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimesheetId(JAXBElement<String> value) {
        this.timesheetId = value;
    }

    /**
     * Gets the value of the timesheetOperationsId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimesheetOperationsId() {
        return timesheetOperationsId;
    }

    /**
     * Sets the value of the timesheetOperationsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimesheetOperationsId(JAXBElement<String> value) {
        this.timesheetOperationsId = value;
    }

}
