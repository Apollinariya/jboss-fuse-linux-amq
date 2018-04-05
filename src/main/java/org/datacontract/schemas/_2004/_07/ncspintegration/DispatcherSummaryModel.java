
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
 * <p>Java class for DispatcherSummaryModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispatcherSummaryModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actualonly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BerthSorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateDeparture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateMooring" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatePlanEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatePrrEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatePrrStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeArrivalTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeDeparture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeDepartureTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeMooring" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeMooringTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePlanEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePlanEndTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePrrEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePrrEndTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePrrStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePrrStartTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DowntimeDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DowntimeNight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EcoresCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EcoresCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EcoresCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FactWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InventsiteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventsiteShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MooringNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NavigableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperationTypeTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PlanWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ProcessConditions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProcessConditionsTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RemailByDetailedPlan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RemainWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeArrival" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeDeparture" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeMooring" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimePlanEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimePrrEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimePrrStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimesheetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WeightDetailedPlan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightFactDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightPlanDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightTotalBerth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightTotalNavigable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightTotalPort" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeightTotalSite" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispatcherSummaryModel", propOrder = {
    "actualonly",
    "agent",
    "agentName",
    "berthCode",
    "berthSorting",
    "dateArrival",
    "dateDeparture",
    "dateMooring",
    "datePlanEnd",
    "datePrrEnd",
    "datePrrStart",
    "datetimeArrival",
    "datetimeArrivalTzid",
    "datetimeDeparture",
    "datetimeDepartureTzid",
    "datetimeMooring",
    "datetimeMooringTzid",
    "datetimePlanEnd",
    "datetimePlanEndTzid",
    "datetimePrrEnd",
    "datetimePrrEndTzid",
    "datetimePrrStart",
    "datetimePrrStartTzid",
    "downtimeDay",
    "downtimeNight",
    "ecoresCategoryCode",
    "ecoresCategoryId",
    "ecoresCategoryName",
    "factActual",
    "factWeight",
    "inventsiteId",
    "inventsiteShortName",
    "mooringNum",
    "navigableId",
    "operationType",
    "operationTypeTxt",
    "planActual",
    "planWeight",
    "processConditions",
    "processConditionsTxt",
    "recId",
    "remailByDetailedPlan",
    "remainWeight",
    "shipName",
    "shipcode",
    "timeArrival",
    "timeDeparture",
    "timeMooring",
    "timePlanEnd",
    "timePrrEnd",
    "timePrrStart",
    "timesheetId",
    "transDate",
    "weightDetailedPlan",
    "weightFactDay",
    "weightPlanDay",
    "weightTotal",
    "weightTotalBerth",
    "weightTotalNavigable",
    "weightTotalPort",
    "weightTotalSite"
})
public class DispatcherSummaryModel {

    @XmlElement(name = "Actualonly")
    protected Integer actualonly;
    @XmlElementRef(name = "Agent", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agent;
    @XmlElementRef(name = "AgentName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agentName;
    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElement(name = "BerthSorting")
    protected Integer berthSorting;
    @XmlElement(name = "DateArrival")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArrival;
    @XmlElement(name = "DateDeparture")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDeparture;
    @XmlElement(name = "DateMooring")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMooring;
    @XmlElement(name = "DatePlanEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePlanEnd;
    @XmlElement(name = "DatePrrEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePrrEnd;
    @XmlElement(name = "DatePrrStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePrrStart;
    @XmlElement(name = "DatetimeArrival")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeArrival;
    @XmlElement(name = "DatetimeArrivalTzid")
    protected Integer datetimeArrivalTzid;
    @XmlElement(name = "DatetimeDeparture")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeDeparture;
    @XmlElement(name = "DatetimeDepartureTzid")
    protected Integer datetimeDepartureTzid;
    @XmlElement(name = "DatetimeMooring")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeMooring;
    @XmlElement(name = "DatetimeMooringTzid")
    protected Integer datetimeMooringTzid;
    @XmlElement(name = "DatetimePlanEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimePlanEnd;
    @XmlElement(name = "DatetimePlanEndTzid")
    protected Integer datetimePlanEndTzid;
    @XmlElement(name = "DatetimePrrEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimePrrEnd;
    @XmlElement(name = "DatetimePrrEndTzid")
    protected Integer datetimePrrEndTzid;
    @XmlElement(name = "DatetimePrrStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimePrrStart;
    @XmlElement(name = "DatetimePrrStartTzid")
    protected Integer datetimePrrStartTzid;
    @XmlElement(name = "DowntimeDay")
    protected BigDecimal downtimeDay;
    @XmlElement(name = "DowntimeNight")
    protected BigDecimal downtimeNight;
    @XmlElementRef(name = "EcoresCategoryCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoresCategoryCode;
    @XmlElement(name = "EcoresCategoryId")
    protected Long ecoresCategoryId;
    @XmlElementRef(name = "EcoresCategoryName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoresCategoryName;
    @XmlElement(name = "FactActual")
    protected BigDecimal factActual;
    @XmlElement(name = "FactWeight")
    protected BigDecimal factWeight;
    @XmlElementRef(name = "InventsiteId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventsiteId;
    @XmlElementRef(name = "InventsiteShortName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventsiteShortName;
    @XmlElement(name = "MooringNum")
    protected Integer mooringNum;
    @XmlElementRef(name = "NavigableId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navigableId;
    @XmlElement(name = "OperationType")
    protected Integer operationType;
    @XmlElementRef(name = "OperationTypeTxt", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationTypeTxt;
    @XmlElement(name = "PlanActual")
    protected BigDecimal planActual;
    @XmlElement(name = "PlanWeight")
    protected BigDecimal planWeight;
    @XmlElement(name = "ProcessConditions")
    protected Integer processConditions;
    @XmlElementRef(name = "ProcessConditionsTxt", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processConditionsTxt;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RemailByDetailedPlan")
    protected BigDecimal remailByDetailedPlan;
    @XmlElement(name = "RemainWeight")
    protected BigDecimal remainWeight;
    @XmlElementRef(name = "ShipName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipName;
    @XmlElementRef(name = "Shipcode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipcode;
    @XmlElement(name = "TimeArrival")
    protected Integer timeArrival;
    @XmlElement(name = "TimeDeparture")
    protected Integer timeDeparture;
    @XmlElement(name = "TimeMooring")
    protected Integer timeMooring;
    @XmlElement(name = "TimePlanEnd")
    protected Integer timePlanEnd;
    @XmlElement(name = "TimePrrEnd")
    protected Integer timePrrEnd;
    @XmlElement(name = "TimePrrStart")
    protected Integer timePrrStart;
    @XmlElementRef(name = "TimesheetId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timesheetId;
    @XmlElement(name = "TransDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transDate;
    @XmlElement(name = "WeightDetailedPlan")
    protected BigDecimal weightDetailedPlan;
    @XmlElement(name = "WeightFactDay")
    protected BigDecimal weightFactDay;
    @XmlElement(name = "WeightPlanDay")
    protected BigDecimal weightPlanDay;
    @XmlElement(name = "WeightTotal")
    protected BigDecimal weightTotal;
    @XmlElement(name = "WeightTotalBerth")
    protected BigDecimal weightTotalBerth;
    @XmlElement(name = "WeightTotalNavigable")
    protected BigDecimal weightTotalNavigable;
    @XmlElement(name = "WeightTotalPort")
    protected BigDecimal weightTotalPort;
    @XmlElement(name = "WeightTotalSite")
    protected BigDecimal weightTotalSite;

    /**
     * Gets the value of the actualonly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualonly() {
        return actualonly;
    }

    /**
     * Sets the value of the actualonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualonly(Integer value) {
        this.actualonly = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgent(JAXBElement<String> value) {
        this.agent = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgentName(JAXBElement<String> value) {
        this.agentName = value;
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
     * Gets the value of the berthSorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBerthSorting() {
        return berthSorting;
    }

    /**
     * Sets the value of the berthSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBerthSorting(Integer value) {
        this.berthSorting = value;
    }

    /**
     * Gets the value of the dateArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateArrival() {
        return dateArrival;
    }

    /**
     * Sets the value of the dateArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateArrival(XMLGregorianCalendar value) {
        this.dateArrival = value;
    }

    /**
     * Gets the value of the dateDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDeparture() {
        return dateDeparture;
    }

    /**
     * Sets the value of the dateDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDeparture(XMLGregorianCalendar value) {
        this.dateDeparture = value;
    }

    /**
     * Gets the value of the dateMooring property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMooring() {
        return dateMooring;
    }

    /**
     * Sets the value of the dateMooring property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMooring(XMLGregorianCalendar value) {
        this.dateMooring = value;
    }

    /**
     * Gets the value of the datePlanEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePlanEnd() {
        return datePlanEnd;
    }

    /**
     * Sets the value of the datePlanEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePlanEnd(XMLGregorianCalendar value) {
        this.datePlanEnd = value;
    }

    /**
     * Gets the value of the datePrrEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePrrEnd() {
        return datePrrEnd;
    }

    /**
     * Sets the value of the datePrrEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePrrEnd(XMLGregorianCalendar value) {
        this.datePrrEnd = value;
    }

    /**
     * Gets the value of the datePrrStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePrrStart() {
        return datePrrStart;
    }

    /**
     * Sets the value of the datePrrStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePrrStart(XMLGregorianCalendar value) {
        this.datePrrStart = value;
    }

    /**
     * Gets the value of the datetimeArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeArrival() {
        return datetimeArrival;
    }

    /**
     * Sets the value of the datetimeArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeArrival(XMLGregorianCalendar value) {
        this.datetimeArrival = value;
    }

    /**
     * Gets the value of the datetimeArrivalTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeArrivalTzid() {
        return datetimeArrivalTzid;
    }

    /**
     * Sets the value of the datetimeArrivalTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeArrivalTzid(Integer value) {
        this.datetimeArrivalTzid = value;
    }

    /**
     * Gets the value of the datetimeDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeDeparture() {
        return datetimeDeparture;
    }

    /**
     * Sets the value of the datetimeDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeDeparture(XMLGregorianCalendar value) {
        this.datetimeDeparture = value;
    }

    /**
     * Gets the value of the datetimeDepartureTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeDepartureTzid() {
        return datetimeDepartureTzid;
    }

    /**
     * Sets the value of the datetimeDepartureTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeDepartureTzid(Integer value) {
        this.datetimeDepartureTzid = value;
    }

    /**
     * Gets the value of the datetimeMooring property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeMooring() {
        return datetimeMooring;
    }

    /**
     * Sets the value of the datetimeMooring property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeMooring(XMLGregorianCalendar value) {
        this.datetimeMooring = value;
    }

    /**
     * Gets the value of the datetimeMooringTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeMooringTzid() {
        return datetimeMooringTzid;
    }

    /**
     * Sets the value of the datetimeMooringTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeMooringTzid(Integer value) {
        this.datetimeMooringTzid = value;
    }

    /**
     * Gets the value of the datetimePlanEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimePlanEnd() {
        return datetimePlanEnd;
    }

    /**
     * Sets the value of the datetimePlanEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimePlanEnd(XMLGregorianCalendar value) {
        this.datetimePlanEnd = value;
    }

    /**
     * Gets the value of the datetimePlanEndTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimePlanEndTzid() {
        return datetimePlanEndTzid;
    }

    /**
     * Sets the value of the datetimePlanEndTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimePlanEndTzid(Integer value) {
        this.datetimePlanEndTzid = value;
    }

    /**
     * Gets the value of the datetimePrrEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimePrrEnd() {
        return datetimePrrEnd;
    }

    /**
     * Sets the value of the datetimePrrEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimePrrEnd(XMLGregorianCalendar value) {
        this.datetimePrrEnd = value;
    }

    /**
     * Gets the value of the datetimePrrEndTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimePrrEndTzid() {
        return datetimePrrEndTzid;
    }

    /**
     * Sets the value of the datetimePrrEndTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimePrrEndTzid(Integer value) {
        this.datetimePrrEndTzid = value;
    }

    /**
     * Gets the value of the datetimePrrStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimePrrStart() {
        return datetimePrrStart;
    }

    /**
     * Sets the value of the datetimePrrStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimePrrStart(XMLGregorianCalendar value) {
        this.datetimePrrStart = value;
    }

    /**
     * Gets the value of the datetimePrrStartTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimePrrStartTzid() {
        return datetimePrrStartTzid;
    }

    /**
     * Sets the value of the datetimePrrStartTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimePrrStartTzid(Integer value) {
        this.datetimePrrStartTzid = value;
    }

    /**
     * Gets the value of the downtimeDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDowntimeDay() {
        return downtimeDay;
    }

    /**
     * Sets the value of the downtimeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDowntimeDay(BigDecimal value) {
        this.downtimeDay = value;
    }

    /**
     * Gets the value of the downtimeNight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDowntimeNight() {
        return downtimeNight;
    }

    /**
     * Sets the value of the downtimeNight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDowntimeNight(BigDecimal value) {
        this.downtimeNight = value;
    }

    /**
     * Gets the value of the ecoresCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoresCategoryCode() {
        return ecoresCategoryCode;
    }

    /**
     * Sets the value of the ecoresCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoresCategoryCode(JAXBElement<String> value) {
        this.ecoresCategoryCode = value;
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
     * Gets the value of the ecoresCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoresCategoryName() {
        return ecoresCategoryName;
    }

    /**
     * Sets the value of the ecoresCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoresCategoryName(JAXBElement<String> value) {
        this.ecoresCategoryName = value;
    }

    /**
     * Gets the value of the factActual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactActual() {
        return factActual;
    }

    /**
     * Sets the value of the factActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactActual(BigDecimal value) {
        this.factActual = value;
    }

    /**
     * Gets the value of the factWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactWeight() {
        return factWeight;
    }

    /**
     * Sets the value of the factWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactWeight(BigDecimal value) {
        this.factWeight = value;
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
     * Gets the value of the inventsiteShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventsiteShortName() {
        return inventsiteShortName;
    }

    /**
     * Sets the value of the inventsiteShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventsiteShortName(JAXBElement<String> value) {
        this.inventsiteShortName = value;
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
     * Gets the value of the operationTypeTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationTypeTxt() {
        return operationTypeTxt;
    }

    /**
     * Sets the value of the operationTypeTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationTypeTxt(JAXBElement<String> value) {
        this.operationTypeTxt = value;
    }

    /**
     * Gets the value of the planActual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanActual() {
        return planActual;
    }

    /**
     * Sets the value of the planActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanActual(BigDecimal value) {
        this.planActual = value;
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
     * Gets the value of the processConditions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessConditions() {
        return processConditions;
    }

    /**
     * Sets the value of the processConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessConditions(Integer value) {
        this.processConditions = value;
    }

    /**
     * Gets the value of the processConditionsTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessConditionsTxt() {
        return processConditionsTxt;
    }

    /**
     * Sets the value of the processConditionsTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessConditionsTxt(JAXBElement<String> value) {
        this.processConditionsTxt = value;
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
     * Gets the value of the remailByDetailedPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemailByDetailedPlan() {
        return remailByDetailedPlan;
    }

    /**
     * Sets the value of the remailByDetailedPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemailByDetailedPlan(BigDecimal value) {
        this.remailByDetailedPlan = value;
    }

    /**
     * Gets the value of the remainWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainWeight() {
        return remainWeight;
    }

    /**
     * Sets the value of the remainWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainWeight(BigDecimal value) {
        this.remainWeight = value;
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
     * Gets the value of the shipcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipcode() {
        return shipcode;
    }

    /**
     * Sets the value of the shipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipcode(JAXBElement<String> value) {
        this.shipcode = value;
    }

    /**
     * Gets the value of the timeArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeArrival() {
        return timeArrival;
    }

    /**
     * Sets the value of the timeArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeArrival(Integer value) {
        this.timeArrival = value;
    }

    /**
     * Gets the value of the timeDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeDeparture() {
        return timeDeparture;
    }

    /**
     * Sets the value of the timeDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeDeparture(Integer value) {
        this.timeDeparture = value;
    }

    /**
     * Gets the value of the timeMooring property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeMooring() {
        return timeMooring;
    }

    /**
     * Sets the value of the timeMooring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeMooring(Integer value) {
        this.timeMooring = value;
    }

    /**
     * Gets the value of the timePlanEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimePlanEnd() {
        return timePlanEnd;
    }

    /**
     * Sets the value of the timePlanEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimePlanEnd(Integer value) {
        this.timePlanEnd = value;
    }

    /**
     * Gets the value of the timePrrEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimePrrEnd() {
        return timePrrEnd;
    }

    /**
     * Sets the value of the timePrrEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimePrrEnd(Integer value) {
        this.timePrrEnd = value;
    }

    /**
     * Gets the value of the timePrrStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimePrrStart() {
        return timePrrStart;
    }

    /**
     * Sets the value of the timePrrStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimePrrStart(Integer value) {
        this.timePrrStart = value;
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
     * Gets the value of the weightDetailedPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightDetailedPlan() {
        return weightDetailedPlan;
    }

    /**
     * Sets the value of the weightDetailedPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightDetailedPlan(BigDecimal value) {
        this.weightDetailedPlan = value;
    }

    /**
     * Gets the value of the weightFactDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightFactDay() {
        return weightFactDay;
    }

    /**
     * Sets the value of the weightFactDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightFactDay(BigDecimal value) {
        this.weightFactDay = value;
    }

    /**
     * Gets the value of the weightPlanDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightPlanDay() {
        return weightPlanDay;
    }

    /**
     * Sets the value of the weightPlanDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightPlanDay(BigDecimal value) {
        this.weightPlanDay = value;
    }

    /**
     * Gets the value of the weightTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightTotal() {
        return weightTotal;
    }

    /**
     * Sets the value of the weightTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightTotal(BigDecimal value) {
        this.weightTotal = value;
    }

    /**
     * Gets the value of the weightTotalBerth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightTotalBerth() {
        return weightTotalBerth;
    }

    /**
     * Sets the value of the weightTotalBerth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightTotalBerth(BigDecimal value) {
        this.weightTotalBerth = value;
    }

    /**
     * Gets the value of the weightTotalNavigable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightTotalNavigable() {
        return weightTotalNavigable;
    }

    /**
     * Sets the value of the weightTotalNavigable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightTotalNavigable(BigDecimal value) {
        this.weightTotalNavigable = value;
    }

    /**
     * Gets the value of the weightTotalPort property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightTotalPort() {
        return weightTotalPort;
    }

    /**
     * Sets the value of the weightTotalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightTotalPort(BigDecimal value) {
        this.weightTotalPort = value;
    }

    /**
     * Gets the value of the weightTotalSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightTotalSite() {
        return weightTotalSite;
    }

    /**
     * Sets the value of the weightTotalSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightTotalSite(BigDecimal value) {
        this.weightTotalSite = value;
    }

}
