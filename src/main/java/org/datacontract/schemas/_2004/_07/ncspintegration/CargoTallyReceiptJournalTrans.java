
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
 * <p>Java class for CargoTallyReceiptJournalTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoTallyReceiptJournalTrans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptanceActGraded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcceptanceActNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementHeaderExt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AgreementNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementOutFit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillOfLadingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillOfLadingJourNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillOfLadingTransDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoAlertSend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CargoDetailedPlanTransRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoInvoiceTakingOutRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoPlumbsJourTable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoTallyReceiptJournalTable" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}CargoTallyReceiptJournalTable" minOccurs="0"/&gt;
 *         &lt;element name="CompleteCargoDebitSlipTrans" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompleteCargoShipmentNotificationTrans" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ContainerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDeclarationList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfDischarge" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeOfDischargeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeStartOfDischarge" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeStartOfDischargeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Defect" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionAttr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EcoresCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EcoresItemLabelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EcoresItemSizeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExportInventTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralCargoShipmentNotificationTransRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightFact" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightPlan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InventBatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventDimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventSiteIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventSiteIdPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadingOnTheShip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MovementInventTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetWeightFact" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NetWeightPlan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumberPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlumbsJournalTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortCargoSecondTimesheetRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PortCargoTimesheetRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="QTYFact" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QTYPiecesFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QTYPiecesPlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QTYPlan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RateNaturalLossPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RateNaturalLossQTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RateNaturalLossUnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShiftDayPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToInventDimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferInventTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasureQTYPCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasureRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UnitPackagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WMSLocationIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WMSLocationIdPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WMSPalletFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WMSPalletPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WagonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WagonCodeOld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoTallyReceiptJournalTrans", propOrder = {
    "acceptanceActGraded",
    "acceptanceActNum",
    "agreementHeaderExt",
    "agreementNum",
    "agreementOutFit",
    "billOfLadingId",
    "billOfLadingJourNum",
    "billOfLadingTransDescription",
    "cargoAlertSend",
    "cargoDetailedPlanTransRef",
    "cargoInvoiceTakingOutRef",
    "cargoPlumbsJourTable",
    "cargoTallyReceiptJournalTable",
    "completeCargoDebitSlipTrans",
    "completeCargoShipmentNotificationTrans",
    "containerNum",
    "createdBy",
    "createdDatetime",
    "customsDeclarationList",
    "datetimeOfDischarge",
    "datetimeOfDischargeTzid",
    "datetimeStartOfDischarge",
    "datetimeStartOfDischargeTzid",
    "defect",
    "descriptionAttr",
    "ecoresCategory",
    "ecoresItemLabelName",
    "ecoresItemSizeName",
    "exportInventTransId",
    "generalCargoShipmentNotificationTransRef",
    "grossWeightFact",
    "grossWeightPlan",
    "inventBatchId",
    "inventDimId",
    "inventLocationIdFact",
    "inventLocationIdPlan",
    "inventSiteIdFact",
    "inventSiteIdPlan",
    "isLoadingOnTheShip",
    "itemId",
    "lineNum",
    "modifiedBy",
    "modifiedDatetime",
    "movementInventTransId",
    "netWeightFact",
    "netWeightPlan",
    "numberPlace",
    "plumbsJournalTransId",
    "portCargoSecondTimesheetRecId",
    "portCargoTimesheetRecId",
    "qtyFact",
    "qtyPiecesFact",
    "qtyPiecesPlan",
    "qtyPlan",
    "rateNaturalLossPercent",
    "rateNaturalLossQTY",
    "rateNaturalLossUnitOfMeasure",
    "recId",
    "receiptId",
    "requestId",
    "shiftDayPlanId",
    "toInventDimId",
    "transferInventTransId",
    "unitOfMeasureQTYPCS",
    "unitOfMeasureRecId",
    "unitPackagingType",
    "unitWeight",
    "wmsLocationIdFact",
    "wmsLocationIdPlan",
    "wmsPalletFact",
    "wmsPalletPlan",
    "wagonCode",
    "wagonCodeOld"
})
public class CargoTallyReceiptJournalTrans {

    @XmlElement(name = "AcceptanceActGraded")
    protected Integer acceptanceActGraded;
    @XmlElementRef(name = "AcceptanceActNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceptanceActNum;
    @XmlElement(name = "AgreementHeaderExt")
    protected Long agreementHeaderExt;
    @XmlElementRef(name = "AgreementNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementNum;
    @XmlElementRef(name = "AgreementOutFit", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementOutFit;
    @XmlElementRef(name = "BillOfLadingId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billOfLadingId;
    @XmlElementRef(name = "BillOfLadingJourNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billOfLadingJourNum;
    @XmlElementRef(name = "BillOfLadingTransDescription", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billOfLadingTransDescription;
    @XmlElement(name = "CargoAlertSend")
    protected Integer cargoAlertSend;
    @XmlElement(name = "CargoDetailedPlanTransRef")
    protected Long cargoDetailedPlanTransRef;
    @XmlElement(name = "CargoInvoiceTakingOutRef")
    protected Long cargoInvoiceTakingOutRef;
    @XmlElement(name = "CargoPlumbsJourTable")
    protected Long cargoPlumbsJourTable;
    @XmlElementRef(name = "CargoTallyReceiptJournalTable", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<CargoTallyReceiptJournalTable> cargoTallyReceiptJournalTable;
    @XmlElement(name = "CompleteCargoDebitSlipTrans")
    protected Integer completeCargoDebitSlipTrans;
    @XmlElement(name = "CompleteCargoShipmentNotificationTrans")
    protected Integer completeCargoShipmentNotificationTrans;
    @XmlElementRef(name = "ContainerNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> containerNum;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElementRef(name = "CustomsDeclarationList", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customsDeclarationList;
    @XmlElement(name = "DatetimeOfDischarge")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeOfDischarge;
    @XmlElement(name = "DatetimeOfDischargeTzid")
    protected Integer datetimeOfDischargeTzid;
    @XmlElement(name = "DatetimeStartOfDischarge")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeStartOfDischarge;
    @XmlElement(name = "DatetimeStartOfDischargeTzid")
    protected Integer datetimeStartOfDischargeTzid;
    @XmlElement(name = "Defect")
    protected Integer defect;
    @XmlElementRef(name = "DescriptionAttr", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionAttr;
    @XmlElement(name = "EcoresCategory")
    protected Long ecoresCategory;
    @XmlElementRef(name = "EcoresItemLabelName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoresItemLabelName;
    @XmlElementRef(name = "EcoresItemSizeName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoresItemSizeName;
    @XmlElementRef(name = "ExportInventTransId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportInventTransId;
    @XmlElement(name = "GeneralCargoShipmentNotificationTransRef")
    protected Long generalCargoShipmentNotificationTransRef;
    @XmlElement(name = "GrossWeightFact")
    protected BigDecimal grossWeightFact;
    @XmlElement(name = "GrossWeightPlan")
    protected BigDecimal grossWeightPlan;
    @XmlElementRef(name = "InventBatchId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventBatchId;
    @XmlElementRef(name = "InventDimId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventDimId;
    @XmlElementRef(name = "InventLocationIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdFact;
    @XmlElementRef(name = "InventLocationIdPlan", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdPlan;
    @XmlElementRef(name = "InventSiteIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventSiteIdFact;
    @XmlElementRef(name = "InventSiteIdPlan", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventSiteIdPlan;
    @XmlElement(name = "IsLoadingOnTheShip")
    protected Integer isLoadingOnTheShip;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemId;
    @XmlElement(name = "LineNum")
    protected BigDecimal lineNum;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "MovementInventTransId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movementInventTransId;
    @XmlElement(name = "NetWeightFact")
    protected BigDecimal netWeightFact;
    @XmlElement(name = "NetWeightPlan")
    protected BigDecimal netWeightPlan;
    @XmlElementRef(name = "NumberPlace", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberPlace;
    @XmlElementRef(name = "PlumbsJournalTransId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plumbsJournalTransId;
    @XmlElement(name = "PortCargoSecondTimesheetRecId")
    protected Long portCargoSecondTimesheetRecId;
    @XmlElement(name = "PortCargoTimesheetRecId")
    protected Long portCargoTimesheetRecId;
    @XmlElement(name = "QTYFact")
    protected BigDecimal qtyFact;
    @XmlElement(name = "QTYPiecesFact")
    protected Integer qtyPiecesFact;
    @XmlElement(name = "QTYPiecesPlan")
    protected Integer qtyPiecesPlan;
    @XmlElement(name = "QTYPlan")
    protected BigDecimal qtyPlan;
    @XmlElement(name = "RateNaturalLossPercent")
    protected BigDecimal rateNaturalLossPercent;
    @XmlElement(name = "RateNaturalLossQTY")
    protected BigDecimal rateNaturalLossQTY;
    @XmlElement(name = "RateNaturalLossUnitOfMeasure")
    protected Long rateNaturalLossUnitOfMeasure;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElementRef(name = "ReceiptId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptId;
    @XmlElementRef(name = "RequestId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "ShiftDayPlanId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftDayPlanId;
    @XmlElementRef(name = "ToInventDimId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toInventDimId;
    @XmlElementRef(name = "TransferInventTransId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferInventTransId;
    @XmlElementRef(name = "UnitOfMeasureQTYPCS", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasureQTYPCS;
    @XmlElement(name = "UnitOfMeasureRecId")
    protected Long unitOfMeasureRecId;
    @XmlElementRef(name = "UnitPackagingType", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitPackagingType;
    @XmlElementRef(name = "UnitWeight", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitWeight;
    @XmlElementRef(name = "WMSLocationIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationIdFact;
    @XmlElementRef(name = "WMSLocationIdPlan", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationIdPlan;
    @XmlElementRef(name = "WMSPalletFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsPalletFact;
    @XmlElementRef(name = "WMSPalletPlan", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsPalletPlan;
    @XmlElementRef(name = "WagonCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wagonCode;
    @XmlElement(name = "WagonCodeOld")
    protected Integer wagonCodeOld;

    /**
     * Gets the value of the acceptanceActGraded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptanceActGraded() {
        return acceptanceActGraded;
    }

    /**
     * Sets the value of the acceptanceActGraded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptanceActGraded(Integer value) {
        this.acceptanceActGraded = value;
    }

    /**
     * Gets the value of the acceptanceActNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcceptanceActNum() {
        return acceptanceActNum;
    }

    /**
     * Sets the value of the acceptanceActNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcceptanceActNum(JAXBElement<String> value) {
        this.acceptanceActNum = value;
    }

    /**
     * Gets the value of the agreementHeaderExt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgreementHeaderExt() {
        return agreementHeaderExt;
    }

    /**
     * Sets the value of the agreementHeaderExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgreementHeaderExt(Long value) {
        this.agreementHeaderExt = value;
    }

    /**
     * Gets the value of the agreementNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementNum() {
        return agreementNum;
    }

    /**
     * Sets the value of the agreementNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementNum(JAXBElement<String> value) {
        this.agreementNum = value;
    }

    /**
     * Gets the value of the agreementOutFit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementOutFit() {
        return agreementOutFit;
    }

    /**
     * Sets the value of the agreementOutFit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementOutFit(JAXBElement<String> value) {
        this.agreementOutFit = value;
    }

    /**
     * Gets the value of the billOfLadingId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillOfLadingId() {
        return billOfLadingId;
    }

    /**
     * Sets the value of the billOfLadingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillOfLadingId(JAXBElement<String> value) {
        this.billOfLadingId = value;
    }

    /**
     * Gets the value of the billOfLadingJourNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillOfLadingJourNum() {
        return billOfLadingJourNum;
    }

    /**
     * Sets the value of the billOfLadingJourNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillOfLadingJourNum(JAXBElement<String> value) {
        this.billOfLadingJourNum = value;
    }

    /**
     * Gets the value of the billOfLadingTransDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillOfLadingTransDescription() {
        return billOfLadingTransDescription;
    }

    /**
     * Sets the value of the billOfLadingTransDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillOfLadingTransDescription(JAXBElement<String> value) {
        this.billOfLadingTransDescription = value;
    }

    /**
     * Gets the value of the cargoAlertSend property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCargoAlertSend() {
        return cargoAlertSend;
    }

    /**
     * Sets the value of the cargoAlertSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCargoAlertSend(Integer value) {
        this.cargoAlertSend = value;
    }

    /**
     * Gets the value of the cargoDetailedPlanTransRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoDetailedPlanTransRef() {
        return cargoDetailedPlanTransRef;
    }

    /**
     * Sets the value of the cargoDetailedPlanTransRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoDetailedPlanTransRef(Long value) {
        this.cargoDetailedPlanTransRef = value;
    }

    /**
     * Gets the value of the cargoInvoiceTakingOutRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoInvoiceTakingOutRef() {
        return cargoInvoiceTakingOutRef;
    }

    /**
     * Sets the value of the cargoInvoiceTakingOutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoInvoiceTakingOutRef(Long value) {
        this.cargoInvoiceTakingOutRef = value;
    }

    /**
     * Gets the value of the cargoPlumbsJourTable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoPlumbsJourTable() {
        return cargoPlumbsJourTable;
    }

    /**
     * Sets the value of the cargoPlumbsJourTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoPlumbsJourTable(Long value) {
        this.cargoPlumbsJourTable = value;
    }

    /**
     * Gets the value of the cargoTallyReceiptJournalTable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CargoTallyReceiptJournalTable }{@code >}
     *     
     */
    public JAXBElement<CargoTallyReceiptJournalTable> getCargoTallyReceiptJournalTable() {
        return cargoTallyReceiptJournalTable;
    }

    /**
     * Sets the value of the cargoTallyReceiptJournalTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CargoTallyReceiptJournalTable }{@code >}
     *     
     */
    public void setCargoTallyReceiptJournalTable(JAXBElement<CargoTallyReceiptJournalTable> value) {
        this.cargoTallyReceiptJournalTable = value;
    }

    /**
     * Gets the value of the completeCargoDebitSlipTrans property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompleteCargoDebitSlipTrans() {
        return completeCargoDebitSlipTrans;
    }

    /**
     * Sets the value of the completeCargoDebitSlipTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompleteCargoDebitSlipTrans(Integer value) {
        this.completeCargoDebitSlipTrans = value;
    }

    /**
     * Gets the value of the completeCargoShipmentNotificationTrans property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompleteCargoShipmentNotificationTrans() {
        return completeCargoShipmentNotificationTrans;
    }

    /**
     * Sets the value of the completeCargoShipmentNotificationTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompleteCargoShipmentNotificationTrans(Integer value) {
        this.completeCargoShipmentNotificationTrans = value;
    }

    /**
     * Gets the value of the containerNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContainerNum() {
        return containerNum;
    }

    /**
     * Sets the value of the containerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContainerNum(JAXBElement<String> value) {
        this.containerNum = value;
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
     * Gets the value of the customsDeclarationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomsDeclarationList() {
        return customsDeclarationList;
    }

    /**
     * Sets the value of the customsDeclarationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomsDeclarationList(JAXBElement<String> value) {
        this.customsDeclarationList = value;
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
     * Gets the value of the datetimeOfDischargeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeOfDischargeTzid() {
        return datetimeOfDischargeTzid;
    }

    /**
     * Sets the value of the datetimeOfDischargeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeOfDischargeTzid(Integer value) {
        this.datetimeOfDischargeTzid = value;
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
     * Gets the value of the defect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefect() {
        return defect;
    }

    /**
     * Sets the value of the defect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefect(Integer value) {
        this.defect = value;
    }

    /**
     * Gets the value of the descriptionAttr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionAttr() {
        return descriptionAttr;
    }

    /**
     * Sets the value of the descriptionAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionAttr(JAXBElement<String> value) {
        this.descriptionAttr = value;
    }

    /**
     * Gets the value of the ecoresCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEcoresCategory() {
        return ecoresCategory;
    }

    /**
     * Sets the value of the ecoresCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEcoresCategory(Long value) {
        this.ecoresCategory = value;
    }

    /**
     * Gets the value of the ecoresItemLabelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoresItemLabelName() {
        return ecoresItemLabelName;
    }

    /**
     * Sets the value of the ecoresItemLabelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoresItemLabelName(JAXBElement<String> value) {
        this.ecoresItemLabelName = value;
    }

    /**
     * Gets the value of the ecoresItemSizeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoresItemSizeName() {
        return ecoresItemSizeName;
    }

    /**
     * Sets the value of the ecoresItemSizeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoresItemSizeName(JAXBElement<String> value) {
        this.ecoresItemSizeName = value;
    }

    /**
     * Gets the value of the exportInventTransId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportInventTransId() {
        return exportInventTransId;
    }

    /**
     * Sets the value of the exportInventTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportInventTransId(JAXBElement<String> value) {
        this.exportInventTransId = value;
    }

    /**
     * Gets the value of the generalCargoShipmentNotificationTransRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGeneralCargoShipmentNotificationTransRef() {
        return generalCargoShipmentNotificationTransRef;
    }

    /**
     * Sets the value of the generalCargoShipmentNotificationTransRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGeneralCargoShipmentNotificationTransRef(Long value) {
        this.generalCargoShipmentNotificationTransRef = value;
    }

    /**
     * Gets the value of the grossWeightFact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeightFact() {
        return grossWeightFact;
    }

    /**
     * Sets the value of the grossWeightFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeightFact(BigDecimal value) {
        this.grossWeightFact = value;
    }

    /**
     * Gets the value of the grossWeightPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeightPlan() {
        return grossWeightPlan;
    }

    /**
     * Sets the value of the grossWeightPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeightPlan(BigDecimal value) {
        this.grossWeightPlan = value;
    }

    /**
     * Gets the value of the inventBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventBatchId() {
        return inventBatchId;
    }

    /**
     * Sets the value of the inventBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventBatchId(JAXBElement<String> value) {
        this.inventBatchId = value;
    }

    /**
     * Gets the value of the inventDimId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventDimId() {
        return inventDimId;
    }

    /**
     * Sets the value of the inventDimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventDimId(JAXBElement<String> value) {
        this.inventDimId = value;
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
     * Gets the value of the inventLocationIdPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationIdPlan() {
        return inventLocationIdPlan;
    }

    /**
     * Sets the value of the inventLocationIdPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationIdPlan(JAXBElement<String> value) {
        this.inventLocationIdPlan = value;
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
     * Gets the value of the inventSiteIdPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventSiteIdPlan() {
        return inventSiteIdPlan;
    }

    /**
     * Sets the value of the inventSiteIdPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventSiteIdPlan(JAXBElement<String> value) {
        this.inventSiteIdPlan = value;
    }

    /**
     * Gets the value of the isLoadingOnTheShip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsLoadingOnTheShip() {
        return isLoadingOnTheShip;
    }

    /**
     * Sets the value of the isLoadingOnTheShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsLoadingOnTheShip(Integer value) {
        this.isLoadingOnTheShip = value;
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
     * Gets the value of the movementInventTransId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovementInventTransId() {
        return movementInventTransId;
    }

    /**
     * Sets the value of the movementInventTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovementInventTransId(JAXBElement<String> value) {
        this.movementInventTransId = value;
    }

    /**
     * Gets the value of the netWeightFact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeightFact() {
        return netWeightFact;
    }

    /**
     * Sets the value of the netWeightFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeightFact(BigDecimal value) {
        this.netWeightFact = value;
    }

    /**
     * Gets the value of the netWeightPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeightPlan() {
        return netWeightPlan;
    }

    /**
     * Sets the value of the netWeightPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeightPlan(BigDecimal value) {
        this.netWeightPlan = value;
    }

    /**
     * Gets the value of the numberPlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberPlace() {
        return numberPlace;
    }

    /**
     * Sets the value of the numberPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberPlace(JAXBElement<String> value) {
        this.numberPlace = value;
    }

    /**
     * Gets the value of the plumbsJournalTransId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlumbsJournalTransId() {
        return plumbsJournalTransId;
    }

    /**
     * Sets the value of the plumbsJournalTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlumbsJournalTransId(JAXBElement<String> value) {
        this.plumbsJournalTransId = value;
    }

    /**
     * Gets the value of the portCargoSecondTimesheetRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortCargoSecondTimesheetRecId() {
        return portCargoSecondTimesheetRecId;
    }

    /**
     * Sets the value of the portCargoSecondTimesheetRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortCargoSecondTimesheetRecId(Long value) {
        this.portCargoSecondTimesheetRecId = value;
    }

    /**
     * Gets the value of the portCargoTimesheetRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortCargoTimesheetRecId() {
        return portCargoTimesheetRecId;
    }

    /**
     * Sets the value of the portCargoTimesheetRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortCargoTimesheetRecId(Long value) {
        this.portCargoTimesheetRecId = value;
    }

    /**
     * Gets the value of the qtyFact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQTYFact() {
        return qtyFact;
    }

    /**
     * Sets the value of the qtyFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQTYFact(BigDecimal value) {
        this.qtyFact = value;
    }

    /**
     * Gets the value of the qtyPiecesFact property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQTYPiecesFact() {
        return qtyPiecesFact;
    }

    /**
     * Sets the value of the qtyPiecesFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQTYPiecesFact(Integer value) {
        this.qtyPiecesFact = value;
    }

    /**
     * Gets the value of the qtyPiecesPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQTYPiecesPlan() {
        return qtyPiecesPlan;
    }

    /**
     * Sets the value of the qtyPiecesPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQTYPiecesPlan(Integer value) {
        this.qtyPiecesPlan = value;
    }

    /**
     * Gets the value of the qtyPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQTYPlan() {
        return qtyPlan;
    }

    /**
     * Sets the value of the qtyPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQTYPlan(BigDecimal value) {
        this.qtyPlan = value;
    }

    /**
     * Gets the value of the rateNaturalLossPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateNaturalLossPercent() {
        return rateNaturalLossPercent;
    }

    /**
     * Sets the value of the rateNaturalLossPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateNaturalLossPercent(BigDecimal value) {
        this.rateNaturalLossPercent = value;
    }

    /**
     * Gets the value of the rateNaturalLossQTY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateNaturalLossQTY() {
        return rateNaturalLossQTY;
    }

    /**
     * Sets the value of the rateNaturalLossQTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateNaturalLossQTY(BigDecimal value) {
        this.rateNaturalLossQTY = value;
    }

    /**
     * Gets the value of the rateNaturalLossUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateNaturalLossUnitOfMeasure() {
        return rateNaturalLossUnitOfMeasure;
    }

    /**
     * Sets the value of the rateNaturalLossUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateNaturalLossUnitOfMeasure(Long value) {
        this.rateNaturalLossUnitOfMeasure = value;
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
     * Gets the value of the toInventDimId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToInventDimId() {
        return toInventDimId;
    }

    /**
     * Sets the value of the toInventDimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToInventDimId(JAXBElement<String> value) {
        this.toInventDimId = value;
    }

    /**
     * Gets the value of the transferInventTransId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferInventTransId() {
        return transferInventTransId;
    }

    /**
     * Sets the value of the transferInventTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferInventTransId(JAXBElement<String> value) {
        this.transferInventTransId = value;
    }

    /**
     * Gets the value of the unitOfMeasureQTYPCS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasureQTYPCS() {
        return unitOfMeasureQTYPCS;
    }

    /**
     * Sets the value of the unitOfMeasureQTYPCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasureQTYPCS(JAXBElement<String> value) {
        this.unitOfMeasureQTYPCS = value;
    }

    /**
     * Gets the value of the unitOfMeasureRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitOfMeasureRecId() {
        return unitOfMeasureRecId;
    }

    /**
     * Sets the value of the unitOfMeasureRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitOfMeasureRecId(Long value) {
        this.unitOfMeasureRecId = value;
    }

    /**
     * Gets the value of the unitPackagingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitPackagingType() {
        return unitPackagingType;
    }

    /**
     * Sets the value of the unitPackagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitPackagingType(JAXBElement<String> value) {
        this.unitPackagingType = value;
    }

    /**
     * Gets the value of the unitWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitWeight() {
        return unitWeight;
    }

    /**
     * Sets the value of the unitWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitWeight(JAXBElement<String> value) {
        this.unitWeight = value;
    }

    /**
     * Gets the value of the wmsLocationIdFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSLocationIdFact() {
        return wmsLocationIdFact;
    }

    /**
     * Sets the value of the wmsLocationIdFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSLocationIdFact(JAXBElement<String> value) {
        this.wmsLocationIdFact = value;
    }

    /**
     * Gets the value of the wmsLocationIdPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSLocationIdPlan() {
        return wmsLocationIdPlan;
    }

    /**
     * Sets the value of the wmsLocationIdPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSLocationIdPlan(JAXBElement<String> value) {
        this.wmsLocationIdPlan = value;
    }

    /**
     * Gets the value of the wmsPalletFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSPalletFact() {
        return wmsPalletFact;
    }

    /**
     * Sets the value of the wmsPalletFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSPalletFact(JAXBElement<String> value) {
        this.wmsPalletFact = value;
    }

    /**
     * Gets the value of the wmsPalletPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSPalletPlan() {
        return wmsPalletPlan;
    }

    /**
     * Sets the value of the wmsPalletPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSPalletPlan(JAXBElement<String> value) {
        this.wmsPalletPlan = value;
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
     * Gets the value of the wagonCodeOld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWagonCodeOld() {
        return wagonCodeOld;
    }

    /**
     * Sets the value of the wagonCodeOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWagonCodeOld(Integer value) {
        this.wagonCodeOld = value;
    }

}
