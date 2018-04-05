
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
 * <p>Java class for PortTimeSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortTimeSheet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BerthChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BerthEmployment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedGrossIntensity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedGrossTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedWaitingBerth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CargoLiftingMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CargoTimePure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CountryRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeArrivalShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeArrivalShipTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeDocumentsSigned" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeDocumentsSignedTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeEndFastening" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeEndFasteningTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishGrossTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishGrossTimeTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishWorksPlan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishworksPlanTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstGrossTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstGrossTimeTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstOperationMooring" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstOperationMooringTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstOperationProcessinTZID60070" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstOperationProcessing" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstOperationProcessingLoading" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstOperationProcessingtZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeLastOperationProcessing" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeLastOperationProcessingLoading" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeLastOperationProcessingTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeLastOperationProcessingTZID60071" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeLastOperationUnmooring" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeLastOperationUnmooringTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePlannedStartWork" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimePlannedStartWorkTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Demurrage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Dispatch" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EconomyOverRun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Grossintensity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IntensityNearPier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InventJournalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOutsideShip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LayTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NetIntensity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NoteCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParkingResponsibly" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ParkingnOtResponsibly" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Partition" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Pereshvartovka" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDatetimeFinishWorks" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDatetimeFinishWorksTZID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PortMooringOperations" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortMooringOperation" minOccurs="0"/&gt;
 *         &lt;element name="PortTransactionsTimeSheets" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPortTransactionsTimeSheet" minOccurs="0"/&gt;
 *         &lt;element name="Raspauzka" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestOperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequestProcessConditions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipHoldsNumbers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShipIdLeTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipNameEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeSheetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Used" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortTimeSheet", propOrder = {
    "agent",
    "berthChange",
    "berthCode",
    "berthEmployment",
    "calculatedGrossIntensity",
    "calculatedGrossTime",
    "calculatedWaitingBerth",
    "cargoLiftingMechanism",
    "cargoTime",
    "cargoTimePure",
    "closeDate",
    "countryRegionId",
    "createdBy",
    "createdDatetime",
    "dataAreaId",
    "datetimeArrivalShip",
    "datetimeArrivalShipTZID",
    "datetimeDocumentsSigned",
    "datetimeDocumentsSignedTZID",
    "datetimeEndFastening",
    "datetimeEndFasteningTZID",
    "datetimeFinishGrossTime",
    "datetimeFinishGrossTimeTZID",
    "datetimeFinishWorksPlan",
    "datetimeFinishworksPlanTZID",
    "datetimeFirstGrossTime",
    "datetimeFirstGrossTimeTZID",
    "datetimeFirstOperationMooring",
    "datetimeFirstOperationMooringTZID",
    "datetimeFirstOperationProcessinTZID60070",
    "datetimeFirstOperationProcessing",
    "datetimeFirstOperationProcessingLoading",
    "datetimeFirstOperationProcessingtZID",
    "datetimeLastOperationProcessing",
    "datetimeLastOperationProcessingLoading",
    "datetimeLastOperationProcessingTZID",
    "datetimeLastOperationProcessingTZID60071",
    "datetimeLastOperationUnmooring",
    "datetimeLastOperationUnmooringTZID",
    "datetimePlannedStartWork",
    "datetimePlannedStartWorkTZID",
    "demurrage",
    "dispatch",
    "economyOverRun",
    "grossintensity",
    "intensityNearPier",
    "inventJournalId",
    "isOutsideShip",
    "layTime",
    "modifiedBy",
    "modifiedDatetime",
    "netIntensity",
    "noteCargo",
    "parkingResponsibly",
    "parkingnOtResponsibly",
    "partition",
    "pereshvartovka",
    "plannedDatetimeFinishWorks",
    "plannedDatetimeFinishWorksTZID",
    "portMooringOperations",
    "portTransactionsTimeSheets",
    "raspauzka",
    "recId",
    "recVersion",
    "requestId",
    "requestOperationType",
    "requestProcessConditions",
    "shipCode",
    "shipGroupCode",
    "shipHoldsNumbers",
    "shipIdLeTime",
    "shipName",
    "shipNameEnglish",
    "status",
    "timeSheetId",
    "used"
})
public class PortTimeSheet {

    @XmlElementRef(name = "Agent", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agent;
    @XmlElement(name = "BerthChange")
    protected Integer berthChange;
    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElement(name = "BerthEmployment")
    protected BigDecimal berthEmployment;
    @XmlElement(name = "CalculatedGrossIntensity")
    protected BigDecimal calculatedGrossIntensity;
    @XmlElement(name = "CalculatedGrossTime")
    protected BigDecimal calculatedGrossTime;
    @XmlElement(name = "CalculatedWaitingBerth")
    protected BigDecimal calculatedWaitingBerth;
    @XmlElementRef(name = "CargoLiftingMechanism", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoLiftingMechanism;
    @XmlElement(name = "CargoTime")
    protected BigDecimal cargoTime;
    @XmlElement(name = "CargoTimePure")
    protected BigDecimal cargoTimePure;
    @XmlElement(name = "CloseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDate;
    @XmlElementRef(name = "CountryRegionId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryRegionId;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElementRef(name = "DataAreaId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAreaId;
    @XmlElement(name = "DatetimeArrivalShip")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeArrivalShip;
    @XmlElement(name = "DatetimeArrivalShipTZID")
    protected Integer datetimeArrivalShipTZID;
    @XmlElement(name = "DatetimeDocumentsSigned")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeDocumentsSigned;
    @XmlElement(name = "DatetimeDocumentsSignedTZID")
    protected Integer datetimeDocumentsSignedTZID;
    @XmlElement(name = "DatetimeEndFastening")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeEndFastening;
    @XmlElement(name = "DatetimeEndFasteningTZID")
    protected Integer datetimeEndFasteningTZID;
    @XmlElement(name = "DatetimeFinishGrossTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFinishGrossTime;
    @XmlElement(name = "DatetimeFinishGrossTimeTZID")
    protected Integer datetimeFinishGrossTimeTZID;
    @XmlElement(name = "DatetimeFinishWorksPlan")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFinishWorksPlan;
    @XmlElement(name = "DatetimeFinishworksPlanTZID")
    protected Integer datetimeFinishworksPlanTZID;
    @XmlElement(name = "DatetimeFirstGrossTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFirstGrossTime;
    @XmlElement(name = "DatetimeFirstGrossTimeTZID")
    protected Integer datetimeFirstGrossTimeTZID;
    @XmlElement(name = "DatetimeFirstOperationMooring")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFirstOperationMooring;
    @XmlElement(name = "DatetimeFirstOperationMooringTZID")
    protected Integer datetimeFirstOperationMooringTZID;
    @XmlElement(name = "DatetimeFirstOperationProcessinTZID60070")
    protected Integer datetimeFirstOperationProcessinTZID60070;
    @XmlElement(name = "DatetimeFirstOperationProcessing")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFirstOperationProcessing;
    @XmlElement(name = "DatetimeFirstOperationProcessingLoading")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFirstOperationProcessingLoading;
    @XmlElement(name = "DatetimeFirstOperationProcessingtZID")
    protected Integer datetimeFirstOperationProcessingtZID;
    @XmlElement(name = "DatetimeLastOperationProcessing")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeLastOperationProcessing;
    @XmlElement(name = "DatetimeLastOperationProcessingLoading")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeLastOperationProcessingLoading;
    @XmlElement(name = "DatetimeLastOperationProcessingTZID")
    protected Integer datetimeLastOperationProcessingTZID;
    @XmlElement(name = "DatetimeLastOperationProcessingTZID60071")
    protected Integer datetimeLastOperationProcessingTZID60071;
    @XmlElement(name = "DatetimeLastOperationUnmooring")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeLastOperationUnmooring;
    @XmlElement(name = "DatetimeLastOperationUnmooringTZID")
    protected Integer datetimeLastOperationUnmooringTZID;
    @XmlElement(name = "DatetimePlannedStartWork")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimePlannedStartWork;
    @XmlElement(name = "DatetimePlannedStartWorkTZID")
    protected Integer datetimePlannedStartWorkTZID;
    @XmlElement(name = "Demurrage")
    protected BigDecimal demurrage;
    @XmlElement(name = "Dispatch")
    protected BigDecimal dispatch;
    @XmlElement(name = "EconomyOverRun")
    protected BigDecimal economyOverRun;
    @XmlElement(name = "Grossintensity")
    protected BigDecimal grossintensity;
    @XmlElement(name = "IntensityNearPier")
    protected BigDecimal intensityNearPier;
    @XmlElementRef(name = "InventJournalId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventJournalId;
    @XmlElement(name = "IsOutsideShip")
    protected Integer isOutsideShip;
    @XmlElement(name = "LayTime")
    protected BigDecimal layTime;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElement(name = "NetIntensity")
    protected BigDecimal netIntensity;
    @XmlElementRef(name = "NoteCargo", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteCargo;
    @XmlElement(name = "ParkingResponsibly")
    protected BigDecimal parkingResponsibly;
    @XmlElement(name = "ParkingnOtResponsibly")
    protected BigDecimal parkingnOtResponsibly;
    @XmlElement(name = "Partition")
    protected Long partition;
    @XmlElement(name = "Pereshvartovka")
    protected Integer pereshvartovka;
    @XmlElement(name = "PlannedDatetimeFinishWorks")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedDatetimeFinishWorks;
    @XmlElement(name = "PlannedDatetimeFinishWorksTZID")
    protected Integer plannedDatetimeFinishWorksTZID;
    @XmlElementRef(name = "PortMooringOperations", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortMooringOperation> portMooringOperations;
    @XmlElementRef(name = "PortTransactionsTimeSheets", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPortTransactionsTimeSheet> portTransactionsTimeSheets;
    @XmlElement(name = "Raspauzka")
    protected Integer raspauzka;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RecVersion")
    protected Integer recVersion;
    @XmlElementRef(name = "RequestId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElement(name = "RequestOperationType")
    protected Integer requestOperationType;
    @XmlElement(name = "RequestProcessConditions")
    protected Integer requestProcessConditions;
    @XmlElementRef(name = "ShipCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCode;
    @XmlElementRef(name = "ShipGroupCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipGroupCode;
    @XmlElement(name = "ShipHoldsNumbers")
    protected Integer shipHoldsNumbers;
    @XmlElement(name = "ShipIdLeTime")
    protected BigDecimal shipIdLeTime;
    @XmlElementRef(name = "ShipName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipName;
    @XmlElementRef(name = "ShipNameEnglish", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipNameEnglish;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElementRef(name = "TimeSheetId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeSheetId;
    @XmlElement(name = "Used")
    protected BigDecimal used;

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
     * Gets the value of the berthChange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBerthChange() {
        return berthChange;
    }

    /**
     * Sets the value of the berthChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBerthChange(Integer value) {
        this.berthChange = value;
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
     * Gets the value of the berthEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBerthEmployment() {
        return berthEmployment;
    }

    /**
     * Sets the value of the berthEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBerthEmployment(BigDecimal value) {
        this.berthEmployment = value;
    }

    /**
     * Gets the value of the calculatedGrossIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedGrossIntensity() {
        return calculatedGrossIntensity;
    }

    /**
     * Sets the value of the calculatedGrossIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedGrossIntensity(BigDecimal value) {
        this.calculatedGrossIntensity = value;
    }

    /**
     * Gets the value of the calculatedGrossTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedGrossTime() {
        return calculatedGrossTime;
    }

    /**
     * Sets the value of the calculatedGrossTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedGrossTime(BigDecimal value) {
        this.calculatedGrossTime = value;
    }

    /**
     * Gets the value of the calculatedWaitingBerth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedWaitingBerth() {
        return calculatedWaitingBerth;
    }

    /**
     * Sets the value of the calculatedWaitingBerth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedWaitingBerth(BigDecimal value) {
        this.calculatedWaitingBerth = value;
    }

    /**
     * Gets the value of the cargoLiftingMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoLiftingMechanism() {
        return cargoLiftingMechanism;
    }

    /**
     * Sets the value of the cargoLiftingMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoLiftingMechanism(JAXBElement<String> value) {
        this.cargoLiftingMechanism = value;
    }

    /**
     * Gets the value of the cargoTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCargoTime() {
        return cargoTime;
    }

    /**
     * Sets the value of the cargoTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCargoTime(BigDecimal value) {
        this.cargoTime = value;
    }

    /**
     * Gets the value of the cargoTimePure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCargoTimePure() {
        return cargoTimePure;
    }

    /**
     * Sets the value of the cargoTimePure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCargoTimePure(BigDecimal value) {
        this.cargoTimePure = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the countryRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryRegionId() {
        return countryRegionId;
    }

    /**
     * Sets the value of the countryRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryRegionId(JAXBElement<String> value) {
        this.countryRegionId = value;
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
     * Gets the value of the dataAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAreaId() {
        return dataAreaId;
    }

    /**
     * Sets the value of the dataAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAreaId(JAXBElement<String> value) {
        this.dataAreaId = value;
    }

    /**
     * Gets the value of the datetimeArrivalShip property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeArrivalShip() {
        return datetimeArrivalShip;
    }

    /**
     * Sets the value of the datetimeArrivalShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeArrivalShip(XMLGregorianCalendar value) {
        this.datetimeArrivalShip = value;
    }

    /**
     * Gets the value of the datetimeArrivalShipTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeArrivalShipTZID() {
        return datetimeArrivalShipTZID;
    }

    /**
     * Sets the value of the datetimeArrivalShipTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeArrivalShipTZID(Integer value) {
        this.datetimeArrivalShipTZID = value;
    }

    /**
     * Gets the value of the datetimeDocumentsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeDocumentsSigned() {
        return datetimeDocumentsSigned;
    }

    /**
     * Sets the value of the datetimeDocumentsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeDocumentsSigned(XMLGregorianCalendar value) {
        this.datetimeDocumentsSigned = value;
    }

    /**
     * Gets the value of the datetimeDocumentsSignedTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeDocumentsSignedTZID() {
        return datetimeDocumentsSignedTZID;
    }

    /**
     * Sets the value of the datetimeDocumentsSignedTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeDocumentsSignedTZID(Integer value) {
        this.datetimeDocumentsSignedTZID = value;
    }

    /**
     * Gets the value of the datetimeEndFastening property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeEndFastening() {
        return datetimeEndFastening;
    }

    /**
     * Sets the value of the datetimeEndFastening property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeEndFastening(XMLGregorianCalendar value) {
        this.datetimeEndFastening = value;
    }

    /**
     * Gets the value of the datetimeEndFasteningTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeEndFasteningTZID() {
        return datetimeEndFasteningTZID;
    }

    /**
     * Sets the value of the datetimeEndFasteningTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeEndFasteningTZID(Integer value) {
        this.datetimeEndFasteningTZID = value;
    }

    /**
     * Gets the value of the datetimeFinishGrossTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFinishGrossTime() {
        return datetimeFinishGrossTime;
    }

    /**
     * Sets the value of the datetimeFinishGrossTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFinishGrossTime(XMLGregorianCalendar value) {
        this.datetimeFinishGrossTime = value;
    }

    /**
     * Gets the value of the datetimeFinishGrossTimeTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFinishGrossTimeTZID() {
        return datetimeFinishGrossTimeTZID;
    }

    /**
     * Sets the value of the datetimeFinishGrossTimeTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFinishGrossTimeTZID(Integer value) {
        this.datetimeFinishGrossTimeTZID = value;
    }

    /**
     * Gets the value of the datetimeFinishWorksPlan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFinishWorksPlan() {
        return datetimeFinishWorksPlan;
    }

    /**
     * Sets the value of the datetimeFinishWorksPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFinishWorksPlan(XMLGregorianCalendar value) {
        this.datetimeFinishWorksPlan = value;
    }

    /**
     * Gets the value of the datetimeFinishworksPlanTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFinishworksPlanTZID() {
        return datetimeFinishworksPlanTZID;
    }

    /**
     * Sets the value of the datetimeFinishworksPlanTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFinishworksPlanTZID(Integer value) {
        this.datetimeFinishworksPlanTZID = value;
    }

    /**
     * Gets the value of the datetimeFirstGrossTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFirstGrossTime() {
        return datetimeFirstGrossTime;
    }

    /**
     * Sets the value of the datetimeFirstGrossTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFirstGrossTime(XMLGregorianCalendar value) {
        this.datetimeFirstGrossTime = value;
    }

    /**
     * Gets the value of the datetimeFirstGrossTimeTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFirstGrossTimeTZID() {
        return datetimeFirstGrossTimeTZID;
    }

    /**
     * Sets the value of the datetimeFirstGrossTimeTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFirstGrossTimeTZID(Integer value) {
        this.datetimeFirstGrossTimeTZID = value;
    }

    /**
     * Gets the value of the datetimeFirstOperationMooring property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFirstOperationMooring() {
        return datetimeFirstOperationMooring;
    }

    /**
     * Sets the value of the datetimeFirstOperationMooring property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFirstOperationMooring(XMLGregorianCalendar value) {
        this.datetimeFirstOperationMooring = value;
    }

    /**
     * Gets the value of the datetimeFirstOperationMooringTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFirstOperationMooringTZID() {
        return datetimeFirstOperationMooringTZID;
    }

    /**
     * Sets the value of the datetimeFirstOperationMooringTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFirstOperationMooringTZID(Integer value) {
        this.datetimeFirstOperationMooringTZID = value;
    }

    /**
     * Gets the value of the datetimeFirstOperationProcessinTZID60070 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFirstOperationProcessinTZID60070() {
        return datetimeFirstOperationProcessinTZID60070;
    }

    /**
     * Sets the value of the datetimeFirstOperationProcessinTZID60070 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFirstOperationProcessinTZID60070(Integer value) {
        this.datetimeFirstOperationProcessinTZID60070 = value;
    }

    /**
     * Gets the value of the datetimeFirstOperationProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFirstOperationProcessing() {
        return datetimeFirstOperationProcessing;
    }

    /**
     * Sets the value of the datetimeFirstOperationProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFirstOperationProcessing(XMLGregorianCalendar value) {
        this.datetimeFirstOperationProcessing = value;
    }

    /**
     * Gets the value of the datetimeFirstOperationProcessingLoading property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeFirstOperationProcessingLoading() {
        return datetimeFirstOperationProcessingLoading;
    }

    /**
     * Sets the value of the datetimeFirstOperationProcessingLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeFirstOperationProcessingLoading(XMLGregorianCalendar value) {
        this.datetimeFirstOperationProcessingLoading = value;
    }

    /**
     * Gets the value of the datetimeFirstOperationProcessingtZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFirstOperationProcessingtZID() {
        return datetimeFirstOperationProcessingtZID;
    }

    /**
     * Sets the value of the datetimeFirstOperationProcessingtZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFirstOperationProcessingtZID(Integer value) {
        this.datetimeFirstOperationProcessingtZID = value;
    }

    /**
     * Gets the value of the datetimeLastOperationProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeLastOperationProcessing() {
        return datetimeLastOperationProcessing;
    }

    /**
     * Sets the value of the datetimeLastOperationProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeLastOperationProcessing(XMLGregorianCalendar value) {
        this.datetimeLastOperationProcessing = value;
    }

    /**
     * Gets the value of the datetimeLastOperationProcessingLoading property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeLastOperationProcessingLoading() {
        return datetimeLastOperationProcessingLoading;
    }

    /**
     * Sets the value of the datetimeLastOperationProcessingLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeLastOperationProcessingLoading(XMLGregorianCalendar value) {
        this.datetimeLastOperationProcessingLoading = value;
    }

    /**
     * Gets the value of the datetimeLastOperationProcessingTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeLastOperationProcessingTZID() {
        return datetimeLastOperationProcessingTZID;
    }

    /**
     * Sets the value of the datetimeLastOperationProcessingTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeLastOperationProcessingTZID(Integer value) {
        this.datetimeLastOperationProcessingTZID = value;
    }

    /**
     * Gets the value of the datetimeLastOperationProcessingTZID60071 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeLastOperationProcessingTZID60071() {
        return datetimeLastOperationProcessingTZID60071;
    }

    /**
     * Sets the value of the datetimeLastOperationProcessingTZID60071 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeLastOperationProcessingTZID60071(Integer value) {
        this.datetimeLastOperationProcessingTZID60071 = value;
    }

    /**
     * Gets the value of the datetimeLastOperationUnmooring property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeLastOperationUnmooring() {
        return datetimeLastOperationUnmooring;
    }

    /**
     * Sets the value of the datetimeLastOperationUnmooring property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeLastOperationUnmooring(XMLGregorianCalendar value) {
        this.datetimeLastOperationUnmooring = value;
    }

    /**
     * Gets the value of the datetimeLastOperationUnmooringTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeLastOperationUnmooringTZID() {
        return datetimeLastOperationUnmooringTZID;
    }

    /**
     * Sets the value of the datetimeLastOperationUnmooringTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeLastOperationUnmooringTZID(Integer value) {
        this.datetimeLastOperationUnmooringTZID = value;
    }

    /**
     * Gets the value of the datetimePlannedStartWork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimePlannedStartWork() {
        return datetimePlannedStartWork;
    }

    /**
     * Sets the value of the datetimePlannedStartWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimePlannedStartWork(XMLGregorianCalendar value) {
        this.datetimePlannedStartWork = value;
    }

    /**
     * Gets the value of the datetimePlannedStartWorkTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimePlannedStartWorkTZID() {
        return datetimePlannedStartWorkTZID;
    }

    /**
     * Sets the value of the datetimePlannedStartWorkTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimePlannedStartWorkTZID(Integer value) {
        this.datetimePlannedStartWorkTZID = value;
    }

    /**
     * Gets the value of the demurrage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDemurrage() {
        return demurrage;
    }

    /**
     * Sets the value of the demurrage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDemurrage(BigDecimal value) {
        this.demurrage = value;
    }

    /**
     * Gets the value of the dispatch property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDispatch() {
        return dispatch;
    }

    /**
     * Sets the value of the dispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDispatch(BigDecimal value) {
        this.dispatch = value;
    }

    /**
     * Gets the value of the economyOverRun property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEconomyOverRun() {
        return economyOverRun;
    }

    /**
     * Sets the value of the economyOverRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEconomyOverRun(BigDecimal value) {
        this.economyOverRun = value;
    }

    /**
     * Gets the value of the grossintensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossintensity() {
        return grossintensity;
    }

    /**
     * Sets the value of the grossintensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossintensity(BigDecimal value) {
        this.grossintensity = value;
    }

    /**
     * Gets the value of the intensityNearPier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntensityNearPier() {
        return intensityNearPier;
    }

    /**
     * Sets the value of the intensityNearPier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntensityNearPier(BigDecimal value) {
        this.intensityNearPier = value;
    }

    /**
     * Gets the value of the inventJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventJournalId() {
        return inventJournalId;
    }

    /**
     * Sets the value of the inventJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventJournalId(JAXBElement<String> value) {
        this.inventJournalId = value;
    }

    /**
     * Gets the value of the isOutsideShip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsOutsideShip() {
        return isOutsideShip;
    }

    /**
     * Sets the value of the isOutsideShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsOutsideShip(Integer value) {
        this.isOutsideShip = value;
    }

    /**
     * Gets the value of the layTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLayTime() {
        return layTime;
    }

    /**
     * Sets the value of the layTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLayTime(BigDecimal value) {
        this.layTime = value;
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
     * Gets the value of the netIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetIntensity() {
        return netIntensity;
    }

    /**
     * Sets the value of the netIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetIntensity(BigDecimal value) {
        this.netIntensity = value;
    }

    /**
     * Gets the value of the noteCargo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteCargo() {
        return noteCargo;
    }

    /**
     * Sets the value of the noteCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteCargo(JAXBElement<String> value) {
        this.noteCargo = value;
    }

    /**
     * Gets the value of the parkingResponsibly property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParkingResponsibly() {
        return parkingResponsibly;
    }

    /**
     * Sets the value of the parkingResponsibly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParkingResponsibly(BigDecimal value) {
        this.parkingResponsibly = value;
    }

    /**
     * Gets the value of the parkingnOtResponsibly property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParkingnOtResponsibly() {
        return parkingnOtResponsibly;
    }

    /**
     * Sets the value of the parkingnOtResponsibly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParkingnOtResponsibly(BigDecimal value) {
        this.parkingnOtResponsibly = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartition(Long value) {
        this.partition = value;
    }

    /**
     * Gets the value of the pereshvartovka property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPereshvartovka() {
        return pereshvartovka;
    }

    /**
     * Sets the value of the pereshvartovka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPereshvartovka(Integer value) {
        this.pereshvartovka = value;
    }

    /**
     * Gets the value of the plannedDatetimeFinishWorks property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedDatetimeFinishWorks() {
        return plannedDatetimeFinishWorks;
    }

    /**
     * Sets the value of the plannedDatetimeFinishWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedDatetimeFinishWorks(XMLGregorianCalendar value) {
        this.plannedDatetimeFinishWorks = value;
    }

    /**
     * Gets the value of the plannedDatetimeFinishWorksTZID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlannedDatetimeFinishWorksTZID() {
        return plannedDatetimeFinishWorksTZID;
    }

    /**
     * Sets the value of the plannedDatetimeFinishWorksTZID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlannedDatetimeFinishWorksTZID(Integer value) {
        this.plannedDatetimeFinishWorksTZID = value;
    }

    /**
     * Gets the value of the portMooringOperations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortMooringOperation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortMooringOperation> getPortMooringOperations() {
        return portMooringOperations;
    }

    /**
     * Sets the value of the portMooringOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortMooringOperation }{@code >}
     *     
     */
    public void setPortMooringOperations(JAXBElement<ArrayOfPortMooringOperation> value) {
        this.portMooringOperations = value;
    }

    /**
     * Gets the value of the portTransactionsTimeSheets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortTransactionsTimeSheet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPortTransactionsTimeSheet> getPortTransactionsTimeSheets() {
        return portTransactionsTimeSheets;
    }

    /**
     * Sets the value of the portTransactionsTimeSheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPortTransactionsTimeSheet }{@code >}
     *     
     */
    public void setPortTransactionsTimeSheets(JAXBElement<ArrayOfPortTransactionsTimeSheet> value) {
        this.portTransactionsTimeSheets = value;
    }

    /**
     * Gets the value of the raspauzka property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRaspauzka() {
        return raspauzka;
    }

    /**
     * Sets the value of the raspauzka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRaspauzka(Integer value) {
        this.raspauzka = value;
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
     * Gets the value of the recVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecVersion() {
        return recVersion;
    }

    /**
     * Sets the value of the recVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecVersion(Integer value) {
        this.recVersion = value;
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
     * Gets the value of the requestOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestOperationType() {
        return requestOperationType;
    }

    /**
     * Sets the value of the requestOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestOperationType(Integer value) {
        this.requestOperationType = value;
    }

    /**
     * Gets the value of the requestProcessConditions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestProcessConditions() {
        return requestProcessConditions;
    }

    /**
     * Sets the value of the requestProcessConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestProcessConditions(Integer value) {
        this.requestProcessConditions = value;
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
     * Gets the value of the shipGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipGroupCode() {
        return shipGroupCode;
    }

    /**
     * Sets the value of the shipGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipGroupCode(JAXBElement<String> value) {
        this.shipGroupCode = value;
    }

    /**
     * Gets the value of the shipHoldsNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipHoldsNumbers() {
        return shipHoldsNumbers;
    }

    /**
     * Sets the value of the shipHoldsNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipHoldsNumbers(Integer value) {
        this.shipHoldsNumbers = value;
    }

    /**
     * Gets the value of the shipIdLeTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipIdLeTime() {
        return shipIdLeTime;
    }

    /**
     * Sets the value of the shipIdLeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipIdLeTime(BigDecimal value) {
        this.shipIdLeTime = value;
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
     * Gets the value of the shipNameEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipNameEnglish() {
        return shipNameEnglish;
    }

    /**
     * Sets the value of the shipNameEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipNameEnglish(JAXBElement<String> value) {
        this.shipNameEnglish = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeSheetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeSheetId() {
        return timeSheetId;
    }

    /**
     * Sets the value of the timeSheetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeSheetId(JAXBElement<String> value) {
        this.timeSheetId = value;
    }

    /**
     * Gets the value of the used property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsed(BigDecimal value) {
        this.used = value;
    }

}
