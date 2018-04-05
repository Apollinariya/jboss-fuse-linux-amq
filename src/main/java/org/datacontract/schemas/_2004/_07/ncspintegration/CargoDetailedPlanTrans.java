
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
 * <p>Java class for CargoDetailedPlanTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoDetailedPlanTrans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptanceActNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementOutfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillOfLadingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrigadeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoBillOfLadingTransRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoDetPlanTransDistribLetterRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoDetailedPlanJour" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}CargoDetailedPlanJour" minOccurs="0"/&gt;
 *         &lt;element name="CargoOrdersTransRefRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoTransportInvoiceTransRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Consignor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsignorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContainerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryregionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDeclarationList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionAttr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetailedplanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EcoResCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EcoResItemLabelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EcoResItemSizeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightFact" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightPr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeightPv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventJournalIdTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationidFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LineNum_Del" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NetWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NetWeightFact" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumberPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortCargoTimeSheetRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyBillOfLading" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyFact" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QtyPiecesFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QtyPr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyPv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipBatchNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SizeBatchAttribEnumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StorageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalDefect" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalDefectDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionsTimeSheetRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasureQtyPcs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasureRecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UnitPackagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WagonCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WagonOwn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WagonTare" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WagonWeighCreationUtcDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WagonWeighCreationUtcDatetimeTzId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WeightBatchAttribEnumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WmsLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsLocationIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsPalletId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsPalletIdFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CargoDetailedPlanTrans", propOrder = {
    "acceptanceActNum",
    "agreementNum",
    "agreementOutfit",
    "billOfLadingId",
    "brigadeId",
    "cargoBillOfLadingTransRef",
    "cargoDetPlanTransDistribLetterRecId",
    "cargoDetailedPlanJour",
    "cargoOrdersTransRefRecId",
    "cargoTransportInvoiceTransRecId",
    "consignee",
    "consignor",
    "consignorName",
    "containerNum",
    "countryregionId",
    "createdDateTime",
    "customsDeclarationList",
    "description",
    "descriptionAttr",
    "detailedplanId",
    "direction",
    "ecoResCategoryId",
    "ecoResItemLabelName",
    "ecoResItemSizeName",
    "grossWeight",
    "grossWeightFact",
    "grossWeightPr",
    "grossWeightPv",
    "height",
    "identifier",
    "inventJournalIdTransfer",
    "inventLocationId",
    "inventLocationidFact",
    "invoiceId",
    "itemId",
    "length",
    "lineNumDel",
    "lineNumber",
    "modifiedDateTime",
    "netWeight",
    "netWeightFact",
    "numberPlace",
    "portCargoTimeSheetRecId",
    "qty",
    "qtyBillOfLading",
    "qtyFact",
    "qtyPieces",
    "qtyPiecesFact",
    "qtyPr",
    "qtyPv",
    "recId",
    "requestId",
    "shipBatchNum",
    "siteId",
    "siteIdFact",
    "sizeBatchAttribEnumValue",
    "status",
    "storageType",
    "technicalDefect",
    "technicalDefectDescription",
    "transId",
    "transactionsTimeSheetRecId",
    "unitOfMeasureQtyPcs",
    "unitOfMeasureRecId",
    "unitPackagingType",
    "unitWeight",
    "vehicleNum",
    "wagonCapacity",
    "wagonOwn",
    "wagonTare",
    "wagonWeighCreationUtcDatetime",
    "wagonWeighCreationUtcDatetimeTzId",
    "weightBatchAttribEnumValue",
    "width",
    "wmsLocationId",
    "wmsLocationIdFact",
    "wmsPalletId",
    "wmsPalletIdFact",
    "workVariantId"
})
public class CargoDetailedPlanTrans {

    @XmlElementRef(name = "AcceptanceActNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceptanceActNum;
    @XmlElementRef(name = "AgreementNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementNum;
    @XmlElementRef(name = "AgreementOutfit", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementOutfit;
    @XmlElementRef(name = "BillOfLadingId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billOfLadingId;
    @XmlElementRef(name = "BrigadeId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brigadeId;
    @XmlElement(name = "CargoBillOfLadingTransRef")
    protected Long cargoBillOfLadingTransRef;
    @XmlElement(name = "CargoDetPlanTransDistribLetterRecId")
    protected Long cargoDetPlanTransDistribLetterRecId;
    @XmlElementRef(name = "CargoDetailedPlanJour", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<CargoDetailedPlanJour> cargoDetailedPlanJour;
    @XmlElement(name = "CargoOrdersTransRefRecId")
    protected Long cargoOrdersTransRefRecId;
    @XmlElement(name = "CargoTransportInvoiceTransRecId")
    protected Long cargoTransportInvoiceTransRecId;
    @XmlElementRef(name = "Consignee", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignee;
    @XmlElementRef(name = "Consignor", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignor;
    @XmlElementRef(name = "ConsignorName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignorName;
    @XmlElementRef(name = "ContainerNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> containerNum;
    @XmlElementRef(name = "CountryregionId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryregionId;
    @XmlElement(name = "CreatedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElementRef(name = "CustomsDeclarationList", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customsDeclarationList;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DescriptionAttr", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionAttr;
    @XmlElementRef(name = "DetailedplanId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detailedplanId;
    @XmlElement(name = "Direction")
    protected Integer direction;
    @XmlElement(name = "EcoResCategoryId")
    protected Long ecoResCategoryId;
    @XmlElementRef(name = "EcoResItemLabelName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoResItemLabelName;
    @XmlElementRef(name = "EcoResItemSizeName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoResItemSizeName;
    @XmlElement(name = "GrossWeight")
    protected BigDecimal grossWeight;
    @XmlElement(name = "GrossWeightFact")
    protected BigDecimal grossWeightFact;
    @XmlElement(name = "GrossWeightPr")
    protected BigDecimal grossWeightPr;
    @XmlElement(name = "GrossWeightPv")
    protected BigDecimal grossWeightPv;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "InventJournalIdTransfer", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventJournalIdTransfer;
    @XmlElementRef(name = "InventLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationId;
    @XmlElementRef(name = "InventLocationidFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationidFact;
    @XmlElementRef(name = "InvoiceId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceId;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemId;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "LineNum_Del")
    protected BigDecimal lineNumDel;
    @XmlElement(name = "LineNumber")
    protected Integer lineNumber;
    @XmlElement(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlElement(name = "NetWeight")
    protected BigDecimal netWeight;
    @XmlElement(name = "NetWeightFact")
    protected BigDecimal netWeightFact;
    @XmlElementRef(name = "NumberPlace", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberPlace;
    @XmlElement(name = "PortCargoTimeSheetRecId")
    protected Long portCargoTimeSheetRecId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "QtyBillOfLading")
    protected BigDecimal qtyBillOfLading;
    @XmlElement(name = "QtyFact")
    protected BigDecimal qtyFact;
    @XmlElement(name = "QtyPieces")
    protected Integer qtyPieces;
    @XmlElement(name = "QtyPiecesFact")
    protected Integer qtyPiecesFact;
    @XmlElement(name = "QtyPr")
    protected BigDecimal qtyPr;
    @XmlElement(name = "QtyPv")
    protected BigDecimal qtyPv;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElementRef(name = "RequestId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "ShipBatchNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipBatchNum;
    @XmlElementRef(name = "SiteId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siteId;
    @XmlElementRef(name = "SiteIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siteIdFact;
    @XmlElementRef(name = "SizeBatchAttribEnumValue", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sizeBatchAttribEnumValue;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "StorageType")
    protected Integer storageType;
    @XmlElement(name = "TechnicalDefect")
    protected Integer technicalDefect;
    @XmlElementRef(name = "TechnicalDefectDescription", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> technicalDefectDescription;
    @XmlElementRef(name = "TransId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transId;
    @XmlElement(name = "TransactionsTimeSheetRecId")
    protected Long transactionsTimeSheetRecId;
    @XmlElementRef(name = "UnitOfMeasureQtyPcs", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasureQtyPcs;
    @XmlElement(name = "UnitOfMeasureRecId")
    protected Long unitOfMeasureRecId;
    @XmlElementRef(name = "UnitPackagingType", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitPackagingType;
    @XmlElementRef(name = "UnitWeight", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitWeight;
    @XmlElementRef(name = "VehicleNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleNum;
    @XmlElement(name = "WagonCapacity")
    protected Integer wagonCapacity;
    @XmlElement(name = "WagonOwn")
    protected Integer wagonOwn;
    @XmlElement(name = "WagonTare")
    protected Integer wagonTare;
    @XmlElement(name = "WagonWeighCreationUtcDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wagonWeighCreationUtcDatetime;
    @XmlElement(name = "WagonWeighCreationUtcDatetimeTzId")
    protected Integer wagonWeighCreationUtcDatetimeTzId;
    @XmlElementRef(name = "WeightBatchAttribEnumValue", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weightBatchAttribEnumValue;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElementRef(name = "WmsLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationId;
    @XmlElementRef(name = "WmsLocationIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationIdFact;
    @XmlElementRef(name = "WmsPalletId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsPalletId;
    @XmlElementRef(name = "WmsPalletIdFact", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsPalletIdFact;
    @XmlElementRef(name = "WorkVariantId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workVariantId;

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
     * Gets the value of the agreementOutfit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementOutfit() {
        return agreementOutfit;
    }

    /**
     * Sets the value of the agreementOutfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementOutfit(JAXBElement<String> value) {
        this.agreementOutfit = value;
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
     * Gets the value of the cargoBillOfLadingTransRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoBillOfLadingTransRef() {
        return cargoBillOfLadingTransRef;
    }

    /**
     * Sets the value of the cargoBillOfLadingTransRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoBillOfLadingTransRef(Long value) {
        this.cargoBillOfLadingTransRef = value;
    }

    /**
     * Gets the value of the cargoDetPlanTransDistribLetterRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoDetPlanTransDistribLetterRecId() {
        return cargoDetPlanTransDistribLetterRecId;
    }

    /**
     * Sets the value of the cargoDetPlanTransDistribLetterRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoDetPlanTransDistribLetterRecId(Long value) {
        this.cargoDetPlanTransDistribLetterRecId = value;
    }

    /**
     * Gets the value of the cargoDetailedPlanJour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CargoDetailedPlanJour }{@code >}
     *     
     */
    public JAXBElement<CargoDetailedPlanJour> getCargoDetailedPlanJour() {
        return cargoDetailedPlanJour;
    }

    /**
     * Sets the value of the cargoDetailedPlanJour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CargoDetailedPlanJour }{@code >}
     *     
     */
    public void setCargoDetailedPlanJour(JAXBElement<CargoDetailedPlanJour> value) {
        this.cargoDetailedPlanJour = value;
    }

    /**
     * Gets the value of the cargoOrdersTransRefRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoOrdersTransRefRecId() {
        return cargoOrdersTransRefRecId;
    }

    /**
     * Sets the value of the cargoOrdersTransRefRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoOrdersTransRefRecId(Long value) {
        this.cargoOrdersTransRefRecId = value;
    }

    /**
     * Gets the value of the cargoTransportInvoiceTransRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoTransportInvoiceTransRecId() {
        return cargoTransportInvoiceTransRecId;
    }

    /**
     * Sets the value of the cargoTransportInvoiceTransRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoTransportInvoiceTransRecId(Long value) {
        this.cargoTransportInvoiceTransRecId = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignee(JAXBElement<String> value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the consignor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignor(JAXBElement<String> value) {
        this.consignor = value;
    }

    /**
     * Gets the value of the consignorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignorName() {
        return consignorName;
    }

    /**
     * Sets the value of the consignorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignorName(JAXBElement<String> value) {
        this.consignorName = value;
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
     * Gets the value of the countryregionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryregionId() {
        return countryregionId;
    }

    /**
     * Sets the value of the countryregionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryregionId(JAXBElement<String> value) {
        this.countryregionId = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
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
     * Gets the value of the detailedplanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetailedplanId() {
        return detailedplanId;
    }

    /**
     * Sets the value of the detailedplanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetailedplanId(JAXBElement<String> value) {
        this.detailedplanId = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
    }

    /**
     * Gets the value of the ecoResCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEcoResCategoryId() {
        return ecoResCategoryId;
    }

    /**
     * Sets the value of the ecoResCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEcoResCategoryId(Long value) {
        this.ecoResCategoryId = value;
    }

    /**
     * Gets the value of the ecoResItemLabelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoResItemLabelName() {
        return ecoResItemLabelName;
    }

    /**
     * Sets the value of the ecoResItemLabelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoResItemLabelName(JAXBElement<String> value) {
        this.ecoResItemLabelName = value;
    }

    /**
     * Gets the value of the ecoResItemSizeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoResItemSizeName() {
        return ecoResItemSizeName;
    }

    /**
     * Sets the value of the ecoResItemSizeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoResItemSizeName(JAXBElement<String> value) {
        this.ecoResItemSizeName = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeight(BigDecimal value) {
        this.grossWeight = value;
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
     * Gets the value of the grossWeightPr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeightPr() {
        return grossWeightPr;
    }

    /**
     * Sets the value of the grossWeightPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeightPr(BigDecimal value) {
        this.grossWeightPr = value;
    }

    /**
     * Gets the value of the grossWeightPv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeightPv() {
        return grossWeightPv;
    }

    /**
     * Sets the value of the grossWeightPv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeightPv(BigDecimal value) {
        this.grossWeightPv = value;
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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the inventJournalIdTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventJournalIdTransfer() {
        return inventJournalIdTransfer;
    }

    /**
     * Sets the value of the inventJournalIdTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventJournalIdTransfer(JAXBElement<String> value) {
        this.inventJournalIdTransfer = value;
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
     * Gets the value of the inventLocationidFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationidFact() {
        return inventLocationidFact;
    }

    /**
     * Sets the value of the inventLocationidFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationidFact(JAXBElement<String> value) {
        this.inventLocationidFact = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceId(JAXBElement<String> value) {
        this.invoiceId = value;
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
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the lineNumDel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineNumDel() {
        return lineNumDel;
    }

    /**
     * Sets the value of the lineNumDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineNumDel(BigDecimal value) {
        this.lineNumDel = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the modifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDateTime() {
        return modifiedDateTime;
    }

    /**
     * Sets the value of the modifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDateTime(XMLGregorianCalendar value) {
        this.modifiedDateTime = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeight(BigDecimal value) {
        this.netWeight = value;
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
     * Gets the value of the portCargoTimeSheetRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortCargoTimeSheetRecId() {
        return portCargoTimeSheetRecId;
    }

    /**
     * Sets the value of the portCargoTimeSheetRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortCargoTimeSheetRecId(Long value) {
        this.portCargoTimeSheetRecId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the qtyBillOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyBillOfLading() {
        return qtyBillOfLading;
    }

    /**
     * Sets the value of the qtyBillOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyBillOfLading(BigDecimal value) {
        this.qtyBillOfLading = value;
    }

    /**
     * Gets the value of the qtyFact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyFact() {
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
    public void setQtyFact(BigDecimal value) {
        this.qtyFact = value;
    }

    /**
     * Gets the value of the qtyPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyPieces() {
        return qtyPieces;
    }

    /**
     * Sets the value of the qtyPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtyPieces(Integer value) {
        this.qtyPieces = value;
    }

    /**
     * Gets the value of the qtyPiecesFact property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyPiecesFact() {
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
    public void setQtyPiecesFact(Integer value) {
        this.qtyPiecesFact = value;
    }

    /**
     * Gets the value of the qtyPr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyPr() {
        return qtyPr;
    }

    /**
     * Sets the value of the qtyPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyPr(BigDecimal value) {
        this.qtyPr = value;
    }

    /**
     * Gets the value of the qtyPv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyPv() {
        return qtyPv;
    }

    /**
     * Sets the value of the qtyPv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyPv(BigDecimal value) {
        this.qtyPv = value;
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
     * Gets the value of the shipBatchNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipBatchNum() {
        return shipBatchNum;
    }

    /**
     * Sets the value of the shipBatchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipBatchNum(JAXBElement<String> value) {
        this.shipBatchNum = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiteId(JAXBElement<String> value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the siteIdFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiteIdFact() {
        return siteIdFact;
    }

    /**
     * Sets the value of the siteIdFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiteIdFact(JAXBElement<String> value) {
        this.siteIdFact = value;
    }

    /**
     * Gets the value of the sizeBatchAttribEnumValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSizeBatchAttribEnumValue() {
        return sizeBatchAttribEnumValue;
    }

    /**
     * Sets the value of the sizeBatchAttribEnumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSizeBatchAttribEnumValue(JAXBElement<String> value) {
        this.sizeBatchAttribEnumValue = value;
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
     * Gets the value of the technicalDefect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTechnicalDefect() {
        return technicalDefect;
    }

    /**
     * Sets the value of the technicalDefect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTechnicalDefect(Integer value) {
        this.technicalDefect = value;
    }

    /**
     * Gets the value of the technicalDefectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTechnicalDefectDescription() {
        return technicalDefectDescription;
    }

    /**
     * Sets the value of the technicalDefectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTechnicalDefectDescription(JAXBElement<String> value) {
        this.technicalDefectDescription = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransId(JAXBElement<String> value) {
        this.transId = value;
    }

    /**
     * Gets the value of the transactionsTimeSheetRecId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionsTimeSheetRecId() {
        return transactionsTimeSheetRecId;
    }

    /**
     * Sets the value of the transactionsTimeSheetRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionsTimeSheetRecId(Long value) {
        this.transactionsTimeSheetRecId = value;
    }

    /**
     * Gets the value of the unitOfMeasureQtyPcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasureQtyPcs() {
        return unitOfMeasureQtyPcs;
    }

    /**
     * Sets the value of the unitOfMeasureQtyPcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasureQtyPcs(JAXBElement<String> value) {
        this.unitOfMeasureQtyPcs = value;
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
     * Gets the value of the vehicleNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleNum() {
        return vehicleNum;
    }

    /**
     * Sets the value of the vehicleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleNum(JAXBElement<String> value) {
        this.vehicleNum = value;
    }

    /**
     * Gets the value of the wagonCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWagonCapacity() {
        return wagonCapacity;
    }

    /**
     * Sets the value of the wagonCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWagonCapacity(Integer value) {
        this.wagonCapacity = value;
    }

    /**
     * Gets the value of the wagonOwn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWagonOwn() {
        return wagonOwn;
    }

    /**
     * Sets the value of the wagonOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWagonOwn(Integer value) {
        this.wagonOwn = value;
    }

    /**
     * Gets the value of the wagonTare property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWagonTare() {
        return wagonTare;
    }

    /**
     * Sets the value of the wagonTare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWagonTare(Integer value) {
        this.wagonTare = value;
    }

    /**
     * Gets the value of the wagonWeighCreationUtcDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWagonWeighCreationUtcDatetime() {
        return wagonWeighCreationUtcDatetime;
    }

    /**
     * Sets the value of the wagonWeighCreationUtcDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWagonWeighCreationUtcDatetime(XMLGregorianCalendar value) {
        this.wagonWeighCreationUtcDatetime = value;
    }

    /**
     * Gets the value of the wagonWeighCreationUtcDatetimeTzId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWagonWeighCreationUtcDatetimeTzId() {
        return wagonWeighCreationUtcDatetimeTzId;
    }

    /**
     * Sets the value of the wagonWeighCreationUtcDatetimeTzId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWagonWeighCreationUtcDatetimeTzId(Integer value) {
        this.wagonWeighCreationUtcDatetimeTzId = value;
    }

    /**
     * Gets the value of the weightBatchAttribEnumValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeightBatchAttribEnumValue() {
        return weightBatchAttribEnumValue;
    }

    /**
     * Sets the value of the weightBatchAttribEnumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeightBatchAttribEnumValue(JAXBElement<String> value) {
        this.weightBatchAttribEnumValue = value;
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
     * Gets the value of the wmsLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsLocationId() {
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
    public void setWmsLocationId(JAXBElement<String> value) {
        this.wmsLocationId = value;
    }

    /**
     * Gets the value of the wmsLocationIdFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsLocationIdFact() {
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
    public void setWmsLocationIdFact(JAXBElement<String> value) {
        this.wmsLocationIdFact = value;
    }

    /**
     * Gets the value of the wmsPalletId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsPalletId() {
        return wmsPalletId;
    }

    /**
     * Sets the value of the wmsPalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsPalletId(JAXBElement<String> value) {
        this.wmsPalletId = value;
    }

    /**
     * Gets the value of the wmsPalletIdFact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsPalletIdFact() {
        return wmsPalletIdFact;
    }

    /**
     * Sets the value of the wmsPalletIdFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsPalletIdFact(JAXBElement<String> value) {
        this.wmsPalletIdFact = value;
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
