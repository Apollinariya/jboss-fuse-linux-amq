
package org.datacontract.schemas._2004._07.ncspintegration;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ncspintegration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfDefect_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfDefect");
    private final static QName _Defect_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Defect");
    private final static QName _ArrayOfPortRailRoadLoadingArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortRailRoadLoadingArea");
    private final static QName _PortRailRoadLoadingArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortRailRoadLoadingArea");
    private final static QName _ArrayOfPortWorkBrigade_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortWorkBrigade");
    private final static QName _PortWorkBrigade_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortWorkBrigade");
    private final static QName _ArrayOfCargoDetailedPlanJour_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoDetailedPlanJour");
    private final static QName _CargoDetailedPlanJour_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoDetailedPlanJour");
    private final static QName _ArrayOfCargoDetailedPlanTrans_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoDetailedPlanTrans");
    private final static QName _CargoDetailedPlanTrans_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoDetailedPlanTrans");
    private final static QName _ArrayOfPortTimeSheet_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortTimeSheet");
    private final static QName _PortTimeSheet_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortTimeSheet");
    private final static QName _ArrayOfPortMooringOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortMooringOperation");
    private final static QName _PortMooringOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortMooringOperation");
    private final static QName _ArrayOfPortTransactionsTimeSheet_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortTransactionsTimeSheet");
    private final static QName _PortTransactionsTimeSheet_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortTransactionsTimeSheet");
    private final static QName _ArrayOfPortCargoTimeSheet_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortCargoTimeSheet");
    private final static QName _PortCargoTimeSheet_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortCargoTimeSheet");
    private final static QName _ArrayOfPortPierModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortPierModel");
    private final static QName _PortPierModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortPierModel");
    private final static QName _ArrayOfDispatcherSummaryModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfDispatcherSummaryModel");
    private final static QName _DispatcherSummaryModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DispatcherSummaryModel");
    private final static QName _ArrayOfEcoresCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfEcoresCategory");
    private final static QName _EcoresCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoresCategory");
    private final static QName _ArrayOfPortThirdPartyShipsFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortThirdPartyShipsFact");
    private final static QName _PortThirdPartyShipsFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortThirdPartyShipsFact");
    private final static QName _ArrayOfCargoTallyReceiptJournalTable_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoTallyReceiptJournalTable");
    private final static QName _CargoTallyReceiptJournalTable_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoTallyReceiptJournalTable");
    private final static QName _ArrayOfCargoTallyReceiptJournalTrans_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoTallyReceiptJournalTrans");
    private final static QName _CargoTallyReceiptJournalTrans_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoTallyReceiptJournalTrans");
    private final static QName _ArrayOfPortTimeSheetOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortTimeSheetOperation");
    private final static QName _PortTimeSheetOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortTimeSheetOperation");
    private final static QName _ArrayOfPortBerthTable_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortBerthTable");
    private final static QName _PortBerthTable_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortBerthTable");
    private final static QName _ArrayOfEcoresCategoryHierarchy_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfEcoresCategoryHierarchy");
    private final static QName _EcoresCategoryHierarchy_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoresCategoryHierarchy");
    private final static QName _ArrayOfPlanTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPlanTableModel");
    private final static QName _PlanTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PlanTableModel");
    private final static QName _ArrayOfWMSLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfWMSLocation");
    private final static QName _WMSLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSLocation");
    private final static QName _ArrayOfInventLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfInventLocation");
    private final static QName _InventLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocation");
    private final static QName _ArrayOfPortEquipmentGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortEquipmentGroup");
    private final static QName _PortEquipmentGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortEquipmentGroup");
    private final static QName _ArrayOfPortEquipmentModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortEquipmentModel");
    private final static QName _PortEquipmentModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortEquipmentModel");
    private final static QName _ArrayOfPortEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortEquipment");
    private final static QName _PortEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortEquipment");
    private final static QName _ArrayOfPortShipTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortShipTableModel");
    private final static QName _PortShipTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortShipTableModel");
    private final static QName _ArrayOfAgreementHeaderModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfAgreementHeaderModel");
    private final static QName _AgreementHeaderModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgreementHeaderModel");
    private final static QName _ArrayOfInventOwnerModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfInventOwnerModel");
    private final static QName _InventOwnerModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventOwnerModel");
    private final static QName _ArrayOfPortRequestTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortRequestTableModel");
    private final static QName _PortRequestTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortRequestTableModel");
    private final static QName _ArrayOfPortRequestTransModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortRequestTransModel");
    private final static QName _PortRequestTransModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortRequestTransModel");
    private final static QName _ArrayOfPortShiftDayPlanModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortShiftDayPlanModel");
    private final static QName _PortShiftDayPlanModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortShiftDayPlanModel");
    private final static QName _ArrayOfPortShiftDayPlanFactModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortShiftDayPlanFactModel");
    private final static QName _PortShiftDayPlanFactModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortShiftDayPlanFactModel");
    private final static QName _ArrayOfPortShiftDayPlanFactEquipmentModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPortShiftDayPlanFactEquipmentModel");
    private final static QName _PortShiftDayPlanFactEquipmentModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortShiftDayPlanFactEquipmentModel");
    private final static QName _ArrayOfAcceptanceActModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfAcceptanceActModel");
    private final static QName _AcceptanceActModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AcceptanceActModel");
    private final static QName _ArrayOfCargoTransportInvoiceJourModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoTransportInvoiceJourModel");
    private final static QName _CargoTransportInvoiceJourModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoTransportInvoiceJourModel");
    private final static QName _ArrayOfClientListModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfClientListModel");
    private final static QName _ClientListModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ClientListModel");
    private final static QName _ArrayOfProcessingOfWagonModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfProcessingOfWagonModel");
    private final static QName _ProcessingOfWagonModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ProcessingOfWagonModel");
    private final static QName _ArrayOfCargoOnDateTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoOnDateTableModel");
    private final static QName _CargoOnDateTableModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoOnDateTableModel");
    private final static QName _ArrayOfCargoOnDateTransModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfCargoOnDateTransModel");
    private final static QName _CargoOnDateTransModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoOnDateTransModel");
    private final static QName _ArrayOfEcoResProductCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfEcoResProductCategory");
    private final static QName _EcoResProductCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoResProductCategory");
    private final static QName _PlanTableStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PlanTableStatus");
    private final static QName _ArrayOfEmployeeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfEmployeeModel");
    private final static QName _EmployeeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EmployeeModel");
    private final static QName _ArrayOfExMooringModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfExMooringModel");
    private final static QName _ExMooringModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ExMooringModel");
    private final static QName _ArrayOfTosContainerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfTosContainerInfo");
    private final static QName _TosContainerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TosContainerInfo");
    private final static QName _ArrayOfAdditionalWork_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfAdditionalWork");
    private final static QName _AdditionalWork_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AdditionalWork");
    private final static QName _ArrayOfInventDim_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfInventDim");
    private final static QName _InventDim_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventDim");
    private final static QName _ArrayOfInventSum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfInventSum");
    private final static QName _InventSum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSum");
    private final static QName _ArrayOfInventBatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfInventBatch");
    private final static QName _InventBatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventBatch");
    private final static QName _ArrayOfPDSBatchAttribute_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ArrayOfPDSBatchAttribute");
    private final static QName _PDSBatchAttribute_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSBatchAttribute");
    private final static QName _PDSBatchAttributeInventBatchId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventBatchId");
    private final static QName _PDSBatchAttributeItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemId");
    private final static QName _PDSBatchAttributePDSBatchAttribId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSBatchAttribId");
    private final static QName _PDSBatchAttributePDSBatchAttribQualityOrderId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSBatchAttribQualityOrderId");
    private final static QName _PDSBatchAttributePDSBatchAttribValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSBatchAttribValue");
    private final static QName _InventBatchDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Description");
    private final static QName _InventBatchPDSBatchAttributes_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSBatchAttributes");
    private final static QName _InventBatchPDSCountryOforigin1_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSCountryOforigin1");
    private final static QName _InventBatchPDSCountryOforigin2_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSCountryOforigin2");
    private final static QName _InventBatchPDSDIsPositionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSDIsPositionCode");
    private final static QName _InventBatchPDSVendBatchId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PDSVendBatchId");
    private final static QName _InventSumInventDimId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventDimId");
    private final static QName _InventDimCargoBillOfLadingId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoBillOfLadingId");
    private final static QName _InventDimCargoPlaceTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoPlaceTypeId");
    private final static QName _InventDimConfigId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ConfigId");
    private final static QName _InventDimInventColorId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventColorId");
    private final static QName _InventDimInventGtdIdRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventGtdId_RU");
    private final static QName _InventDimInventLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationId");
    private final static QName _InventDimInventOwnerIdRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventOwnerId_RU");
    private final static QName _InventDimInventProfileIdRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventProfileId_RU");
    private final static QName _InventDimInventSerialId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSerialId");
    private final static QName _InventDimInventSiteId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSiteId");
    private final static QName _InventDimInventSizeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSizeId");
    private final static QName _InventDimInventStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventStatusId");
    private final static QName _InventDimInventStyleId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventStyleId");
    private final static QName _InventDimInventSums_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSums");
    private final static QName _InventDimLicensePlateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "LicensePlateId");
    private final static QName _InventDimModifiedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ModifiedBy");
    private final static QName _InventDimSha1Hash_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Sha1Hash");
    private final static QName _InventDimWMSLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSLocationId");
    private final static QName _InventDimWMSPalletId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSPalletId");
    private final static QName _AdditionalWorkAcceptanceActNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AcceptanceActNum");
    private final static QName _AdditionalWorkActNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ActNum");
    private final static QName _AdditionalWorkAgreementId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgreementId");
    private final static QName _AdditionalWorkBillOfLadingNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BillOfLadingNum");
    private final static QName _AdditionalWorkCargoSize_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoSize");
    private final static QName _AdditionalWorkCreatedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CreatedBy");
    private final static QName _AdditionalWorkCustAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustAccount");
    private final static QName _AdditionalWorkCustName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustName");
    private final static QName _AdditionalWorkCustomsRegime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustomsRegime");
    private final static QName _AdditionalWorkDirectionStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DirectionStr");
    private final static QName _AdditionalWorkDocumentTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DocumentTitle");
    private final static QName _AdditionalWorkEcoResCategoryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoResCategoryCode");
    private final static QName _AdditionalWorkEcoResCategoryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoResCategoryName");
    private final static QName _AdditionalWorkEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EndTime");
    private final static QName _AdditionalWorkItemIdTally_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemIdTally");
    private final static QName _AdditionalWorkItemName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemName");
    private final static QName _AdditionalWorkItemNameTally_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemNameTally");
    private final static QName _AdditionalWorkItemTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemTypeId");
    private final static QName _AdditionalWorkItemTypeStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemTypeStr");
    private final static QName _AdditionalWorkManifestNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ManifestNum");
    private final static QName _AdditionalWorkName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Name");
    private final static QName _AdditionalWorkNameAlias_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NameAlias");
    private final static QName _AdditionalWorkNameEnglish_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NameEnglish");
    private final static QName _AdditionalWorkOrderNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "OrderNum");
    private final static QName _AdditionalWorkPortCallId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortCallId");
    private final static QName _AdditionalWorkPortCargoType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortCargoType");
    private final static QName _AdditionalWorkProcessStatusStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ProcessStatusStr");
    private final static QName _AdditionalWorkRequestId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestId");
    private final static QName _AdditionalWorkRequestStatusStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestStatusStr");
    private final static QName _AdditionalWorkRequestTypeStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestTypeStr");
    private final static QName _AdditionalWorkSalesId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SalesId");
    private final static QName _AdditionalWorkShipCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipCode");
    private final static QName _AdditionalWorkStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "StartTime");
    private final static QName _AdditionalWorkUnitOfMeasure_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitOfMeasure");
    private final static QName _AdditionalWorkVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Vehicle");
    private final static QName _AdditionalWorkVehicleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VehicleType");
    private final static QName _AdditionalWorkWorkVariantStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WorkVariantStr");
    private final static QName _TosContainerInfoBillOfLandingNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BillOfLandingNumber");
    private final static QName _TosContainerInfoCargoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoName");
    private final static QName _TosContainerInfoCntSealDoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CntSealDoc");
    private final static QName _TosContainerInfoCntSealFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CntSealFact");
    private final static QName _TosContainerInfoContainerNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ContainerNumber");
    private final static QName _TosContainerInfoContract_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Contract");
    private final static QName _TosContainerInfoCurrentPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CurrentPlace");
    private final static QName _TosContainerInfoLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Location");
    private final static QName _TosContainerInfoTermOutDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TermOutDate");
    private final static QName _TosContainerInfoVesselCommingDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VesselCommingDate");
    private final static QName _TosContainerInfoVesselNameEng_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VesselNameEng");
    private final static QName _ExMooringModelMoorage_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Moorage");
    private final static QName _ExMooringModelTanker_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Tanker");
    private final static QName _EmployeeModelDisplayName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DisplayName");
    private final static QName _EmployeeModelFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "FullName");
    private final static QName _EmployeeModelTabelNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TabelNumber");
    private final static QName _CargoOnDateTransModelEcoresItemLabelName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoresItemLabelName");
    private final static QName _CargoOnDateTransModelInventOwnerIdRu_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventOwnerIdRu");
    private final static QName _CargoOnDateTableModelCargoesOnDateTrans_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoesOnDateTrans");
    private final static QName _CargoOnDateTableModelWmsLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsLocationId");
    private final static QName _CargoOnDateTableModelWorkShiftId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WorkShiftId");
    private final static QName _ProcessingOfWagonModelEmailTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EmailTo");
    private final static QName _ProcessingOfWagonModelInventLocationIdFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationIdFact");
    private final static QName _ProcessingOfWagonModelInventSiteIdFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSiteIdFact");
    private final static QName _ProcessingOfWagonModelInventSiteIdFact1_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSiteIdFact1");
    private final static QName _ProcessingOfWagonModelInvoicEid_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InvoicEid");
    private final static QName _ProcessingOfWagonModelInvoiceNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InvoiceNum");
    private final static QName _ProcessingOfWagonModelNameModifyingTimeProcessingWagons_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NameModifyingTimeProcessingWagons");
    private final static QName _ProcessingOfWagonModelNotificationText_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NotificationText");
    private final static QName _ProcessingOfWagonModelReceiptId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ReceiptId");
    private final static QName _ProcessingOfWagonModelReturnConsigmentStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ReturnConsigmentStatus");
    private final static QName _ProcessingOfWagonModelSalesAgreementId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SalesAgreementId");
    private final static QName _ProcessingOfWagonModelWagonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WagonCode");
    private final static QName _ProcessingOfWagonModelWagonNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WagonNum");
    private final static QName _ProcessingOfWagonModelWorkVariantId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WorkVariantId");
    private final static QName _ClientListModelAccountNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AccountNum");
    private final static QName _CargoTransportInvoiceJourModelClearanceUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ClearanceUserName");
    private final static QName _CargoTransportInvoiceJourModelConsignee_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Consignee");
    private final static QName _CargoTransportInvoiceJourModelConsignorAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ConsignorAccount");
    private final static QName _CargoTransportInvoiceJourModelCountryRegionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CountryRegionId");
    private final static QName _CargoTransportInvoiceJourModelCustomsDeclarationList_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustomsDeclarationList");
    private final static QName _CargoTransportInvoiceJourModelForwarder_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Forwarder");
    private final static QName _CargoTransportInvoiceJourModelInventsiteId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventsiteId");
    private final static QName _CargoTransportInvoiceJourModelInvoiceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InvoiceId");
    private final static QName _CargoTransportInvoiceJourModelPayer_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Payer");
    private final static QName _CargoTransportInvoiceJourModelRailRoadStationFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RailRoadStationFrom");
    private final static QName _CargoTransportInvoiceJourModelRailRoadStationTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RailRoadStationTo");
    private final static QName _CargoTransportInvoiceJourModelTransitDeclarationNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TransitDeclarationNum");
    private final static QName _CargoTransportInvoiceJourModelWorkshiftId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WorkshiftId");
    private final static QName _AcceptanceActModelCheckedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CheckedBy");
    private final static QName _AcceptanceActModelCheckedByDeputyStoreKeeper_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CheckedByDeputyStoreKeeper");
    private final static QName _AcceptanceActModelComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Comment");
    private final static QName _PortShiftDayPlanFactEquipmentModelEquipmentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EquipmentCode");
    private final static QName _PortShiftDayPlanFactEquipmentModelEquipmentGroupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EquipmentGroupCode");
    private final static QName _PortShiftDayPlanFactEquipmentModelEquipmentModelCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EquipmentModelCode");
    private final static QName _PortShiftDayPlanFactEquipmentModelFleetNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "FleetNumber");
    private final static QName _PortShiftDayPlanFactEquipmentModelShiftDayPlanId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShiftDayPlanId");
    private final static QName _PortShiftDayPlanFactEquipmentModelShiftDayPlanIdPrev_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShiftDayPlanIdPrev");
    private final static QName _PortShiftDayPlanFactModelDownTimeReasonId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DownTimeReasonId");
    private final static QName _PortShiftDayPlanFactModelTaskNotes_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TaskNotes");
    private final static QName _PortShiftDayPlanModelBerthCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BerthCode");
    private final static QName _PortShiftDayPlanModelNavigableId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NavigableId");
    private final static QName _PortShiftDayPlanModelPierCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PierCode");
    private final static QName _PortShiftDayPlanModelPortImocode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortImocode");
    private final static QName _PortShiftDayPlanModelPortShiftDayPlansFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortShiftDayPlansFact");
    private final static QName _PortShiftDayPlanModelPortShiftDayPlansFactEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortShiftDayPlansFactEquipment");
    private final static QName _PortShiftDayPlanModelRailRoadLoadingAreaCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RailRoadLoadingAreaCode");
    private final static QName _PortShiftDayPlanModelShipName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipName");
    private final static QName _PortRequestTransModelAgent_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Agent");
    private final static QName _PortRequestTransModelAgreementClassification_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgreementClassification");
    private final static QName _PortRequestTransModelConsigneeCountryRegionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ConsigneeCountryRegionId");
    private final static QName _PortRequestTransModelContainerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ContainerType");
    private final static QName _PortRequestTransModelCreatedby_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Createdby");
    private final static QName _PortRequestTransModelDangerClassid_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DangerClassid");
    private final static QName _PortRequestTransModelGrossRateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "GrossRateId");
    private final static QName _PortRequestTransModelItemIdService_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemIdService");
    private final static QName _PortRequestTransModelLoadingArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "LoadingArea");
    private final static QName _PortRequestTransModelLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "LocationId");
    private final static QName _PortRequestTransModelModifiedby_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Modifiedby");
    private final static QName _PortRequestTransModelNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Note");
    private final static QName _PortRequestTransModelNoteLc_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NoteLc");
    private final static QName _PortRequestTransModelNoteShip_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NoteShip");
    private final static QName _PortRequestTransModelPortCodeFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortCodeFrom");
    private final static QName _PortRequestTransModelPortCodeTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortCodeTo");
    private final static QName _PortRequestTransModelPortDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortDestination");
    private final static QName _PortRequestTransModelSequence_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Sequence");
    private final static QName _PortRequestTransModelShipper_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Shipper");
    private final static QName _PortRequestTransModelShipperCountryRegionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipperCountryRegionId");
    private final static QName _PortRequestTransModelShipperSmg_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipperSmg");
    private final static QName _PortRequestTransModelSiteId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SiteId");
    private final static QName _PortRequestTransModelStationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "StationCode");
    private final static QName _PortRequestTransModelStatusStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "StatusStr");
    private final static QName _PortRequestTransModelTeu_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Teu");
    private final static QName _PortRequestTransModelToInventDimId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ToInventDimId");
    private final static QName _PortRequestTransModelUnitVolume_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitVolume");
    private final static QName _PortRequestTransModelUnitWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitWeight");
    private final static QName _PortRequestTransModelWagonType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WagonType");
    private final static QName _PortRequestTableModelChangedRequestId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ChangedRequestId");
    private final static QName _PortRequestTableModelContactPersonId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ContactPersonId");
    private final static QName _PortRequestTableModelImoCodeNotice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ImoCodeNotice");
    private final static QName _PortRequestTableModelMainRequestId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "MainRequestId");
    private final static QName _PortRequestTableModelNavigableContainer_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NavigableContainer");
    private final static QName _PortRequestTableModelNavigableExport_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NavigableExport");
    private final static QName _PortRequestTableModelNavigableImport_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NavigableImport");
    private final static QName _PortRequestTableModelNoteCargo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NoteCargo");
    private final static QName _PortRequestTableModelPortRequestComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortRequestComment");
    private final static QName _PortRequestTableModelPortRequestTranses_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortRequestTranses");
    private final static QName _PortRequestTableModelRailRoadWagons_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RailRoadWagons");
    private final static QName _PortRequestTableModelRailRoadWagons1_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RailRoadWagons1");
    private final static QName _PortRequestTableModelReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Reason");
    private final static QName _PortRequestTableModelRejectReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RejectReason");
    private final static QName _PortRequestTableModelRequestIdNominChange_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestIdNominChange");
    private final static QName _PortRequestTableModelRequestIdSmg_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestIdSmg");
    private final static QName _PortRequestTableModelShipCodeNotice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipCodeNotice");
    private final static QName _PortRequestTableModelShipNameNotice_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipNameNotice");
    private final static QName _PortRequestTableModelStatusRzd_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "StatusRzd");
    private final static QName _InventOwnerModelAccountNumRelated_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AccountNumRelated");
    private final static QName _InventOwnerModelInventOwnerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventOwnerId");
    private final static QName _AgreementHeaderModelBuyingLegalentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BuyingLegalentity");
    private final static QName _AgreementHeaderModelCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Currency");
    private final static QName _AgreementHeaderModelCustomerDataAreaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustomerDataAreaId");
    private final static QName _AgreementHeaderModelDocumentExternalReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DocumentExternalReference");
    private final static QName _AgreementHeaderModelInterestBasedOnCebPsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InterestBasedOnCebPsn");
    private final static QName _AgreementHeaderModelLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Language");
    private final static QName _AgreementHeaderModelMaximumAmountPsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "MaximumAmountPsn");
    private final static QName _AgreementHeaderModelMinimumAmountPsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "MinimumAmountPsn");
    private final static QName _AgreementHeaderModelParentPurchAgreementidPsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ParentPurchAgreementidPsn");
    private final static QName _AgreementHeaderModelProcurementClassificationPsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ProcurementClassificationPsn");
    private final static QName _AgreementHeaderModelPurchAgreementTypePsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PurchAgreementTypePsn");
    private final static QName _AgreementHeaderModelPurchNumberSequence_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PurchNumberSequence");
    private final static QName _AgreementHeaderModelPurposePsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PurposePsn");
    private final static QName _AgreementHeaderModelRenewablePsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RenewablePsn");
    private final static QName _AgreementHeaderModelSalesNumberSequence_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SalesNumberSequence");
    private final static QName _AgreementHeaderModelSellingleGalentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SellingleGalentity");
    private final static QName _AgreementHeaderModelVendAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VendAccount");
    private final static QName _AgreementHeaderModelVendorDataareaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VendorDataareaId");
    private final static QName _AgreementHeaderModelWorkFlowStatusPsn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WorkFlowStatusPsn");
    private final static QName _PortShipTableModelCallSign_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CallSign");
    private final static QName _PortShipTableModelHoistingEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "HoistingEquipment");
    private final static QName _PortShipTableModelImoCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ImoCode");
    private final static QName _PortShipTableModelShip_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Ship");
    private final static QName _PortShipTableModelShipGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipGroup");
    private final static QName _PortShipTableModelShipType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipType");
    private final static QName _PortEquipmentBerth_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Berth");
    private final static QName _PortEquipmentEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Equipment");
    private final static QName _PortEquipmentEquipmentModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EquipmentModel");
    private final static QName _PortEquipmentPier_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Pier");
    private final static QName _PortEquipmentStockNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "StockNumber");
    private final static QName _PortEquipmentModelEquipmentGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EquipmentGroup");
    private final static QName _PortEquipmentGroupEquipmentGroupParent_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EquipmentGroupParent");
    private final static QName _InventLocationActivityTypeRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ActivityType_RU");
    private final static QName _InventLocationBranchNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BranchNumber");
    private final static QName _InventLocationCustAccountBR_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustAccount_BR");
    private final static QName _InventLocationCustAccountHU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CustAccount_HU");
    private final static QName _InventLocationDefaultKanbanFinishedGoodsLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DefaultKanbanFinishedGoodsLocation");
    private final static QName _InventLocationDefaultProductionFINISHGoodsLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DefaultProductionFINISHGoodsLocation");
    private final static QName _InventLocationDefaultShipMaintenanceLoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DefaultShipMaintenanceLoc");
    private final static QName _InventLocationDefaultStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DefaultStatusId");
    private final static QName _InventLocationEmptyPalletLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EmptyPalletLocation");
    private final static QName _InventLocationInventLocationIdGoodsInRouteRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationIdGoodsInRoute_RU");
    private final static QName _InventLocationInventLocationIdQuarantine_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationIdQuarantine");
    private final static QName _InventLocationInventLocationIdReqMain_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationIdReqMain");
    private final static QName _InventLocationInventLocationIdTransit_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationIdTransit");
    private final static QName _InventLocationNumberSequenceGroupRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NumberSequenceGroup_RU");
    private final static QName _InventLocationRboDefaultInventProfileIdRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RboDefaultInventProfileId_RU");
    private final static QName _InventLocationRboDefaultWmsLocationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RboDefaultWmsLocationId");
    private final static QName _InventLocationRboDefaultWmsPalletId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RboDefaultWmsPalletId");
    private final static QName _InventLocationReqCalendarId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ReqCalendarId");
    private final static QName _InventLocationRetailWmsLocationIdDefaultReturn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RetailWmsLocationIdDefaultReturn");
    private final static QName _InventLocationRetailWmsPalletIdDefaultReturn_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RetailWmsPalletIdDefaultReturn");
    private final static QName _InventLocationVendAccountCustomRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VendAccountCustom_RU");
    private final static QName _InventLocationWmsLevelFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsLevelFormat");
    private final static QName _InventLocationWmsLocationIdDefaultIssue_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsLocationIdDefaultIssue");
    private final static QName _InventLocationWmsLocationIdDefaultReceipt_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsLocationIdDefaultReceipt");
    private final static QName _InventLocationWmsLocationIdGoodsInRouteRU_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsLocationIdGoodsInRoute_RU");
    private final static QName _InventLocationWmsPositionFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsPositionFormat");
    private final static QName _InventLocationWmsRackFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsRackFormat");
    private final static QName _WMSLocationAisleId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AisleId");
    private final static QName _WMSLocationCheckText_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CheckText");
    private final static QName _WMSLocationInputBlockingCauseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InputBlockingCauseId");
    private final static QName _WMSLocationInputLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InputLocation");
    private final static QName _WMSLocationLocProfileId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "LocProfileId");
    private final static QName _WMSLocationOutputBlockingCauseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "OutputBlockingCauseId");
    private final static QName _WMSLocationPalletTypeGroupId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PalletTypeGroupId");
    private final static QName _WMSLocationPickingAreaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PickingAreaId");
    private final static QName _WMSLocationStoreAreaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "StoreAreaId");
    private final static QName _WMSLocationZoneId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ZoneId");
    private final static QName _PlanTableModelMesto_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Mesto");
    private final static QName _PlanTableModelPkVag_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PkVag");
    private final static QName _PlanTableModelPut_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Put");
    private final static QName _PlanTableModelVagStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VagStatus");
    private final static QName _PortBerthTableDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Destination");
    private final static QName _PortTimeSheetOperationTimesheetOperationsId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TimesheetOperationsId");
    private final static QName _CargoTallyReceiptJournalTransAgreementNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgreementNum");
    private final static QName _CargoTallyReceiptJournalTransAgreementOutFit_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgreementOutFit");
    private final static QName _CargoTallyReceiptJournalTransBillOfLadingId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BillOfLadingId");
    private final static QName _CargoTallyReceiptJournalTransBillOfLadingJourNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BillOfLadingJourNum");
    private final static QName _CargoTallyReceiptJournalTransBillOfLadingTransDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BillOfLadingTransDescription");
    private final static QName _CargoTallyReceiptJournalTransContainerNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ContainerNum");
    private final static QName _CargoTallyReceiptJournalTransDescriptionAttr_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DescriptionAttr");
    private final static QName _CargoTallyReceiptJournalTransEcoresItemSizeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoresItemSizeName");
    private final static QName _CargoTallyReceiptJournalTransExportInventTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ExportInventTransId");
    private final static QName _CargoTallyReceiptJournalTransInventLocationIdPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationIdPlan");
    private final static QName _CargoTallyReceiptJournalTransInventSiteIdPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventSiteIdPlan");
    private final static QName _CargoTallyReceiptJournalTransMovementInventTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "MovementInventTransId");
    private final static QName _CargoTallyReceiptJournalTransNumberPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "NumberPlace");
    private final static QName _CargoTallyReceiptJournalTransPlumbsJournalTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PlumbsJournalTransId");
    private final static QName _CargoTallyReceiptJournalTransTransferInventTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TransferInventTransId");
    private final static QName _CargoTallyReceiptJournalTransUnitOfMeasureQTYPCS_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitOfMeasureQTYPCS");
    private final static QName _CargoTallyReceiptJournalTransUnitPackagingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitPackagingType");
    private final static QName _CargoTallyReceiptJournalTransWMSLocationIdFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSLocationIdFact");
    private final static QName _CargoTallyReceiptJournalTransWMSLocationIdPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSLocationIdPlan");
    private final static QName _CargoTallyReceiptJournalTransWMSPalletFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSPalletFact");
    private final static QName _CargoTallyReceiptJournalTransWMSPalletPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WMSPalletPlan");
    private final static QName _CargoTallyReceiptJournalTableAcceptanceAct_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AcceptanceAct");
    private final static QName _CargoTallyReceiptJournalTableBrigadeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BrigadeId");
    private final static QName _CargoTallyReceiptJournalTableCargoTallyReceiptJournalTranses_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoTallyReceiptJournalTranses");
    private final static QName _CargoTallyReceiptJournalTableControlCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ControlCode");
    private final static QName _CargoTallyReceiptJournalTableDocumentNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DocumentNum");
    private final static QName _CargoTallyReceiptJournalTableExportJournalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ExportJournalId");
    private final static QName _CargoTallyReceiptJournalTableLoadedListId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "LoadedListId");
    private final static QName _CargoTallyReceiptJournalTableMovementJournalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "MovementJournalId");
    private final static QName _CargoTallyReceiptJournalTablePostedUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PostedUserId");
    private final static QName _CargoTallyReceiptJournalTableReceiptIdCreated_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ReceiptIdCreated");
    private final static QName _CargoTallyReceiptJournalTableShipCodeTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipCodeTo");
    private final static QName _CargoTallyReceiptJournalTableShipHoldNumberId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipHoldNumberId");
    private final static QName _CargoTallyReceiptJournalTableShipNameTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipNameTo");
    private final static QName _CargoTallyReceiptJournalTableTransferJournalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TransferJournalId");
    private final static QName _CargoTallyReceiptJournalTableUsedEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UsedEquipment");
    private final static QName _EcoresCategoryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Code");
    private final static QName _EcoresCategoryPkwiuCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PkwiuCode");
    private final static QName _EcoresCategoryReuseEnabled_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ReuseEnabled");
    private final static QName _DispatcherSummaryModelAgentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgentName");
    private final static QName _DispatcherSummaryModelEcoresCategoryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoresCategoryCode");
    private final static QName _DispatcherSummaryModelEcoresCategoryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoresCategoryName");
    private final static QName _DispatcherSummaryModelInventsiteShortName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventsiteShortName");
    private final static QName _DispatcherSummaryModelOperationTypeTxt_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "OperationTypeTxt");
    private final static QName _DispatcherSummaryModelProcessConditionsTxt_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ProcessConditionsTxt");
    private final static QName _DispatcherSummaryModelShipcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Shipcode");
    private final static QName _DispatcherSummaryModelTimesheetId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TimesheetId");
    private final static QName _PortCargoTimeSheetDataAreaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DataAreaId");
    private final static QName _PortCargoTimeSheetEcoResCategoryComModityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoResCategoryComModityCode");
    private final static QName _PortCargoTimeSheetTimeSheetId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TimeSheetId");
    private final static QName _PortCargoTimeSheetUnitOfMeas_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitOfMeas");
    private final static QName _PortCargoTimeSheetUnitOfMeasureSymbol_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitOfMeasureSymbol");
    private final static QName _PortTransactionsTimeSheetCargoForGrossNorms_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoForGrossNorms");
    private final static QName _PortTransactionsTimeSheetDowntimeReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DowntimeReason");
    private final static QName _PortTransactionsTimeSheetNotes_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Notes");
    private final static QName _PortTransactionsTimeSheetOldEcoresCategoryId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "OldEcoresCategoryId");
    private final static QName _PortTimeSheetCargoLiftingMechanism_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoLiftingMechanism");
    private final static QName _PortTimeSheetInventJournalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventJournalId");
    private final static QName _PortTimeSheetPortMooringOperations_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortMooringOperations");
    private final static QName _PortTimeSheetPortTransactionsTimeSheets_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "PortTransactionsTimeSheets");
    private final static QName _PortTimeSheetShipGroupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipGroupCode");
    private final static QName _PortTimeSheetShipNameEnglish_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipNameEnglish");
    private final static QName _CargoDetailedPlanTransAgreementOutfit_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "AgreementOutfit");
    private final static QName _CargoDetailedPlanTransConsignor_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Consignor");
    private final static QName _CargoDetailedPlanTransConsignorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ConsignorName");
    private final static QName _CargoDetailedPlanTransCountryregionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CountryregionId");
    private final static QName _CargoDetailedPlanTransDetailedplanId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DetailedplanId");
    private final static QName _CargoDetailedPlanTransEcoResItemLabelName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoResItemLabelName");
    private final static QName _CargoDetailedPlanTransEcoResItemSizeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "EcoResItemSizeName");
    private final static QName _CargoDetailedPlanTransIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "Identifier");
    private final static QName _CargoDetailedPlanTransInventJournalIdTransfer_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventJournalIdTransfer");
    private final static QName _CargoDetailedPlanTransInventLocationidFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "InventLocationidFact");
    private final static QName _CargoDetailedPlanTransShipBatchNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ShipBatchNum");
    private final static QName _CargoDetailedPlanTransSiteIdFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SiteIdFact");
    private final static QName _CargoDetailedPlanTransSizeBatchAttribEnumValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "SizeBatchAttribEnumValue");
    private final static QName _CargoDetailedPlanTransTechnicalDefectDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TechnicalDefectDescription");
    private final static QName _CargoDetailedPlanTransTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TransId");
    private final static QName _CargoDetailedPlanTransUnitOfMeasureQtyPcs_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitOfMeasureQtyPcs");
    private final static QName _CargoDetailedPlanTransVehicleNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "VehicleNum");
    private final static QName _CargoDetailedPlanTransWeightBatchAttribEnumValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WeightBatchAttribEnumValue");
    private final static QName _CargoDetailedPlanTransWmsLocationIdFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsLocationIdFact");
    private final static QName _CargoDetailedPlanTransWmsPalletId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsPalletId");
    private final static QName _CargoDetailedPlanTransWmsPalletIdFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WmsPalletIdFact");
    private final static QName _CargoDetailedPlanJourCargoDetailedPlanTranses_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoDetailedPlanTranses");
    private final static QName _CargoDetailedPlanJourCargoProxyId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "CargoProxyId");
    private final static QName _CargoDetailedPlanJourClientMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ClientMessage");
    private final static QName _CargoDetailedPlanJourConsigneeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ConsigneeName");
    private final static QName _CargoDetailedPlanJourDetailedPlanId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DetailedPlanId");
    private final static QName _CargoDetailedPlanJourFeaccId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "FeaccId");
    private final static QName _CargoDetailedPlanJourForwarderName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ForwarderName");
    private final static QName _CargoDetailedPlanJourItemDT_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemDT");
    private final static QName _CargoDetailedPlanJourItemDTE_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ItemDT_E");
    private final static QName _CargoDetailedPlanJourLetterNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "LetterNum");
    private final static QName _CargoDetailedPlanJourManifestJournalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "ManifestJournalId");
    private final static QName _CargoDetailedPlanJourRequestIdNomination_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestIdNomination");
    private final static QName _CargoDetailedPlanJourRequestIdPlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestIdPlan");
    private final static QName _CargoDetailedPlanJourRequestNamePlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "RequestNamePlan");
    private final static QName _CargoDetailedPlanJourTrainNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TrainNum");
    private final static QName _CargoDetailedPlanJourTransportInvoiceId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TransportInvoiceId");
    private final static QName _CargoDetailedPlanJourTransportInvoiceNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "TransportInvoiceNum");
    private final static QName _CargoDetailedPlanJourUnitLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "UnitLength");
    private final static QName _CargoDetailedPlanJourWorkerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "WorkerName");
    private final static QName _PortWorkBrigadeBrigadeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "BrigadeName");
    private final static QName _DefectDefectId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DefectId");
    private final static QName _DefectDescriptionDocum_QNAME = new QName("http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", "DescriptionDocum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ncspintegration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDefect }
     * 
     */
    public ArrayOfDefect createArrayOfDefect() {
        return new ArrayOfDefect();
    }

    /**
     * Create an instance of {@link ArrayOfPortRailRoadLoadingArea }
     * 
     */
    public ArrayOfPortRailRoadLoadingArea createArrayOfPortRailRoadLoadingArea() {
        return new ArrayOfPortRailRoadLoadingArea();
    }

    /**
     * Create an instance of {@link ArrayOfPortWorkBrigade }
     * 
     */
    public ArrayOfPortWorkBrigade createArrayOfPortWorkBrigade() {
        return new ArrayOfPortWorkBrigade();
    }

    /**
     * Create an instance of {@link ArrayOfCargoDetailedPlanJour }
     * 
     */
    public ArrayOfCargoDetailedPlanJour createArrayOfCargoDetailedPlanJour() {
        return new ArrayOfCargoDetailedPlanJour();
    }

    /**
     * Create an instance of {@link ArrayOfPortTimeSheet }
     * 
     */
    public ArrayOfPortTimeSheet createArrayOfPortTimeSheet() {
        return new ArrayOfPortTimeSheet();
    }

    /**
     * Create an instance of {@link ArrayOfPortCargoTimeSheet }
     * 
     */
    public ArrayOfPortCargoTimeSheet createArrayOfPortCargoTimeSheet() {
        return new ArrayOfPortCargoTimeSheet();
    }

    /**
     * Create an instance of {@link ArrayOfPortPierModel }
     * 
     */
    public ArrayOfPortPierModel createArrayOfPortPierModel() {
        return new ArrayOfPortPierModel();
    }

    /**
     * Create an instance of {@link ArrayOfDispatcherSummaryModel }
     * 
     */
    public ArrayOfDispatcherSummaryModel createArrayOfDispatcherSummaryModel() {
        return new ArrayOfDispatcherSummaryModel();
    }

    /**
     * Create an instance of {@link ArrayOfEcoresCategory }
     * 
     */
    public ArrayOfEcoresCategory createArrayOfEcoresCategory() {
        return new ArrayOfEcoresCategory();
    }

    /**
     * Create an instance of {@link ArrayOfPortThirdPartyShipsFact }
     * 
     */
    public ArrayOfPortThirdPartyShipsFact createArrayOfPortThirdPartyShipsFact() {
        return new ArrayOfPortThirdPartyShipsFact();
    }

    /**
     * Create an instance of {@link ArrayOfCargoTallyReceiptJournalTable }
     * 
     */
    public ArrayOfCargoTallyReceiptJournalTable createArrayOfCargoTallyReceiptJournalTable() {
        return new ArrayOfCargoTallyReceiptJournalTable();
    }

    /**
     * Create an instance of {@link ArrayOfPortTimeSheetOperation }
     * 
     */
    public ArrayOfPortTimeSheetOperation createArrayOfPortTimeSheetOperation() {
        return new ArrayOfPortTimeSheetOperation();
    }

    /**
     * Create an instance of {@link ArrayOfPortBerthTable }
     * 
     */
    public ArrayOfPortBerthTable createArrayOfPortBerthTable() {
        return new ArrayOfPortBerthTable();
    }

    /**
     * Create an instance of {@link ArrayOfEcoresCategoryHierarchy }
     * 
     */
    public ArrayOfEcoresCategoryHierarchy createArrayOfEcoresCategoryHierarchy() {
        return new ArrayOfEcoresCategoryHierarchy();
    }

    /**
     * Create an instance of {@link ArrayOfPlanTableModel }
     * 
     */
    public ArrayOfPlanTableModel createArrayOfPlanTableModel() {
        return new ArrayOfPlanTableModel();
    }

    /**
     * Create an instance of {@link ArrayOfWMSLocation }
     * 
     */
    public ArrayOfWMSLocation createArrayOfWMSLocation() {
        return new ArrayOfWMSLocation();
    }

    /**
     * Create an instance of {@link ArrayOfInventLocation }
     * 
     */
    public ArrayOfInventLocation createArrayOfInventLocation() {
        return new ArrayOfInventLocation();
    }

    /**
     * Create an instance of {@link ArrayOfPortEquipmentGroup }
     * 
     */
    public ArrayOfPortEquipmentGroup createArrayOfPortEquipmentGroup() {
        return new ArrayOfPortEquipmentGroup();
    }

    /**
     * Create an instance of {@link ArrayOfPortEquipmentModel }
     * 
     */
    public ArrayOfPortEquipmentModel createArrayOfPortEquipmentModel() {
        return new ArrayOfPortEquipmentModel();
    }

    /**
     * Create an instance of {@link ArrayOfPortEquipment }
     * 
     */
    public ArrayOfPortEquipment createArrayOfPortEquipment() {
        return new ArrayOfPortEquipment();
    }

    /**
     * Create an instance of {@link ArrayOfPortShipTableModel }
     * 
     */
    public ArrayOfPortShipTableModel createArrayOfPortShipTableModel() {
        return new ArrayOfPortShipTableModel();
    }

    /**
     * Create an instance of {@link ArrayOfAgreementHeaderModel }
     * 
     */
    public ArrayOfAgreementHeaderModel createArrayOfAgreementHeaderModel() {
        return new ArrayOfAgreementHeaderModel();
    }

    /**
     * Create an instance of {@link ArrayOfInventOwnerModel }
     * 
     */
    public ArrayOfInventOwnerModel createArrayOfInventOwnerModel() {
        return new ArrayOfInventOwnerModel();
    }

    /**
     * Create an instance of {@link ArrayOfPortRequestTableModel }
     * 
     */
    public ArrayOfPortRequestTableModel createArrayOfPortRequestTableModel() {
        return new ArrayOfPortRequestTableModel();
    }

    /**
     * Create an instance of {@link ArrayOfPortShiftDayPlanModel }
     * 
     */
    public ArrayOfPortShiftDayPlanModel createArrayOfPortShiftDayPlanModel() {
        return new ArrayOfPortShiftDayPlanModel();
    }

    /**
     * Create an instance of {@link ArrayOfAcceptanceActModel }
     * 
     */
    public ArrayOfAcceptanceActModel createArrayOfAcceptanceActModel() {
        return new ArrayOfAcceptanceActModel();
    }

    /**
     * Create an instance of {@link ArrayOfCargoTransportInvoiceJourModel }
     * 
     */
    public ArrayOfCargoTransportInvoiceJourModel createArrayOfCargoTransportInvoiceJourModel() {
        return new ArrayOfCargoTransportInvoiceJourModel();
    }

    /**
     * Create an instance of {@link ArrayOfClientListModel }
     * 
     */
    public ArrayOfClientListModel createArrayOfClientListModel() {
        return new ArrayOfClientListModel();
    }

    /**
     * Create an instance of {@link ArrayOfProcessingOfWagonModel }
     * 
     */
    public ArrayOfProcessingOfWagonModel createArrayOfProcessingOfWagonModel() {
        return new ArrayOfProcessingOfWagonModel();
    }

    /**
     * Create an instance of {@link ArrayOfCargoOnDateTableModel }
     * 
     */
    public ArrayOfCargoOnDateTableModel createArrayOfCargoOnDateTableModel() {
        return new ArrayOfCargoOnDateTableModel();
    }

    /**
     * Create an instance of {@link ArrayOfEcoResProductCategory }
     * 
     */
    public ArrayOfEcoResProductCategory createArrayOfEcoResProductCategory() {
        return new ArrayOfEcoResProductCategory();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeModel }
     * 
     */
    public ArrayOfEmployeeModel createArrayOfEmployeeModel() {
        return new ArrayOfEmployeeModel();
    }

    /**
     * Create an instance of {@link ArrayOfExMooringModel }
     * 
     */
    public ArrayOfExMooringModel createArrayOfExMooringModel() {
        return new ArrayOfExMooringModel();
    }

    /**
     * Create an instance of {@link ArrayOfTosContainerInfo }
     * 
     */
    public ArrayOfTosContainerInfo createArrayOfTosContainerInfo() {
        return new ArrayOfTosContainerInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalWork }
     * 
     */
    public ArrayOfAdditionalWork createArrayOfAdditionalWork() {
        return new ArrayOfAdditionalWork();
    }

    /**
     * Create an instance of {@link ArrayOfInventDim }
     * 
     */
    public ArrayOfInventDim createArrayOfInventDim() {
        return new ArrayOfInventDim();
    }

    /**
     * Create an instance of {@link ArrayOfInventBatch }
     * 
     */
    public ArrayOfInventBatch createArrayOfInventBatch() {
        return new ArrayOfInventBatch();
    }

    /**
     * Create an instance of {@link Defect }
     * 
     */
    public Defect createDefect() {
        return new Defect();
    }

    /**
     * Create an instance of {@link PortRailRoadLoadingArea }
     * 
     */
    public PortRailRoadLoadingArea createPortRailRoadLoadingArea() {
        return new PortRailRoadLoadingArea();
    }

    /**
     * Create an instance of {@link PortWorkBrigade }
     * 
     */
    public PortWorkBrigade createPortWorkBrigade() {
        return new PortWorkBrigade();
    }

    /**
     * Create an instance of {@link CargoDetailedPlanJour }
     * 
     */
    public CargoDetailedPlanJour createCargoDetailedPlanJour() {
        return new CargoDetailedPlanJour();
    }

    /**
     * Create an instance of {@link ArrayOfCargoDetailedPlanTrans }
     * 
     */
    public ArrayOfCargoDetailedPlanTrans createArrayOfCargoDetailedPlanTrans() {
        return new ArrayOfCargoDetailedPlanTrans();
    }

    /**
     * Create an instance of {@link CargoDetailedPlanTrans }
     * 
     */
    public CargoDetailedPlanTrans createCargoDetailedPlanTrans() {
        return new CargoDetailedPlanTrans();
    }

    /**
     * Create an instance of {@link PortTimeSheet }
     * 
     */
    public PortTimeSheet createPortTimeSheet() {
        return new PortTimeSheet();
    }

    /**
     * Create an instance of {@link ArrayOfPortMooringOperation }
     * 
     */
    public ArrayOfPortMooringOperation createArrayOfPortMooringOperation() {
        return new ArrayOfPortMooringOperation();
    }

    /**
     * Create an instance of {@link PortMooringOperation }
     * 
     */
    public PortMooringOperation createPortMooringOperation() {
        return new PortMooringOperation();
    }

    /**
     * Create an instance of {@link ArrayOfPortTransactionsTimeSheet }
     * 
     */
    public ArrayOfPortTransactionsTimeSheet createArrayOfPortTransactionsTimeSheet() {
        return new ArrayOfPortTransactionsTimeSheet();
    }

    /**
     * Create an instance of {@link PortTransactionsTimeSheet }
     * 
     */
    public PortTransactionsTimeSheet createPortTransactionsTimeSheet() {
        return new PortTransactionsTimeSheet();
    }

    /**
     * Create an instance of {@link PortCargoTimeSheet }
     * 
     */
    public PortCargoTimeSheet createPortCargoTimeSheet() {
        return new PortCargoTimeSheet();
    }

    /**
     * Create an instance of {@link PortPierModel }
     * 
     */
    public PortPierModel createPortPierModel() {
        return new PortPierModel();
    }

    /**
     * Create an instance of {@link DispatcherSummaryModel }
     * 
     */
    public DispatcherSummaryModel createDispatcherSummaryModel() {
        return new DispatcherSummaryModel();
    }

    /**
     * Create an instance of {@link EcoresCategory }
     * 
     */
    public EcoresCategory createEcoresCategory() {
        return new EcoresCategory();
    }

    /**
     * Create an instance of {@link PortThirdPartyShipsFact }
     * 
     */
    public PortThirdPartyShipsFact createPortThirdPartyShipsFact() {
        return new PortThirdPartyShipsFact();
    }

    /**
     * Create an instance of {@link CargoTallyReceiptJournalTable }
     * 
     */
    public CargoTallyReceiptJournalTable createCargoTallyReceiptJournalTable() {
        return new CargoTallyReceiptJournalTable();
    }

    /**
     * Create an instance of {@link ArrayOfCargoTallyReceiptJournalTrans }
     * 
     */
    public ArrayOfCargoTallyReceiptJournalTrans createArrayOfCargoTallyReceiptJournalTrans() {
        return new ArrayOfCargoTallyReceiptJournalTrans();
    }

    /**
     * Create an instance of {@link CargoTallyReceiptJournalTrans }
     * 
     */
    public CargoTallyReceiptJournalTrans createCargoTallyReceiptJournalTrans() {
        return new CargoTallyReceiptJournalTrans();
    }

    /**
     * Create an instance of {@link PortTimeSheetOperation }
     * 
     */
    public PortTimeSheetOperation createPortTimeSheetOperation() {
        return new PortTimeSheetOperation();
    }

    /**
     * Create an instance of {@link PortBerthTable }
     * 
     */
    public PortBerthTable createPortBerthTable() {
        return new PortBerthTable();
    }

    /**
     * Create an instance of {@link EcoresCategoryHierarchy }
     * 
     */
    public EcoresCategoryHierarchy createEcoresCategoryHierarchy() {
        return new EcoresCategoryHierarchy();
    }

    /**
     * Create an instance of {@link PlanTableModel }
     * 
     */
    public PlanTableModel createPlanTableModel() {
        return new PlanTableModel();
    }

    /**
     * Create an instance of {@link WMSLocation }
     * 
     */
    public WMSLocation createWMSLocation() {
        return new WMSLocation();
    }

    /**
     * Create an instance of {@link InventLocation }
     * 
     */
    public InventLocation createInventLocation() {
        return new InventLocation();
    }

    /**
     * Create an instance of {@link PortEquipmentGroup }
     * 
     */
    public PortEquipmentGroup createPortEquipmentGroup() {
        return new PortEquipmentGroup();
    }

    /**
     * Create an instance of {@link PortEquipmentModel }
     * 
     */
    public PortEquipmentModel createPortEquipmentModel() {
        return new PortEquipmentModel();
    }

    /**
     * Create an instance of {@link PortEquipment }
     * 
     */
    public PortEquipment createPortEquipment() {
        return new PortEquipment();
    }

    /**
     * Create an instance of {@link PortShipTableModel }
     * 
     */
    public PortShipTableModel createPortShipTableModel() {
        return new PortShipTableModel();
    }

    /**
     * Create an instance of {@link AgreementHeaderModel }
     * 
     */
    public AgreementHeaderModel createAgreementHeaderModel() {
        return new AgreementHeaderModel();
    }

    /**
     * Create an instance of {@link InventOwnerModel }
     * 
     */
    public InventOwnerModel createInventOwnerModel() {
        return new InventOwnerModel();
    }

    /**
     * Create an instance of {@link PortRequestTableModel }
     * 
     */
    public PortRequestTableModel createPortRequestTableModel() {
        return new PortRequestTableModel();
    }

    /**
     * Create an instance of {@link ArrayOfPortRequestTransModel }
     * 
     */
    public ArrayOfPortRequestTransModel createArrayOfPortRequestTransModel() {
        return new ArrayOfPortRequestTransModel();
    }

    /**
     * Create an instance of {@link PortRequestTransModel }
     * 
     */
    public PortRequestTransModel createPortRequestTransModel() {
        return new PortRequestTransModel();
    }

    /**
     * Create an instance of {@link PortShiftDayPlanModel }
     * 
     */
    public PortShiftDayPlanModel createPortShiftDayPlanModel() {
        return new PortShiftDayPlanModel();
    }

    /**
     * Create an instance of {@link ArrayOfPortShiftDayPlanFactModel }
     * 
     */
    public ArrayOfPortShiftDayPlanFactModel createArrayOfPortShiftDayPlanFactModel() {
        return new ArrayOfPortShiftDayPlanFactModel();
    }

    /**
     * Create an instance of {@link PortShiftDayPlanFactModel }
     * 
     */
    public PortShiftDayPlanFactModel createPortShiftDayPlanFactModel() {
        return new PortShiftDayPlanFactModel();
    }

    /**
     * Create an instance of {@link ArrayOfPortShiftDayPlanFactEquipmentModel }
     * 
     */
    public ArrayOfPortShiftDayPlanFactEquipmentModel createArrayOfPortShiftDayPlanFactEquipmentModel() {
        return new ArrayOfPortShiftDayPlanFactEquipmentModel();
    }

    /**
     * Create an instance of {@link PortShiftDayPlanFactEquipmentModel }
     * 
     */
    public PortShiftDayPlanFactEquipmentModel createPortShiftDayPlanFactEquipmentModel() {
        return new PortShiftDayPlanFactEquipmentModel();
    }

    /**
     * Create an instance of {@link AcceptanceActModel }
     * 
     */
    public AcceptanceActModel createAcceptanceActModel() {
        return new AcceptanceActModel();
    }

    /**
     * Create an instance of {@link CargoTransportInvoiceJourModel }
     * 
     */
    public CargoTransportInvoiceJourModel createCargoTransportInvoiceJourModel() {
        return new CargoTransportInvoiceJourModel();
    }

    /**
     * Create an instance of {@link ClientListModel }
     * 
     */
    public ClientListModel createClientListModel() {
        return new ClientListModel();
    }

    /**
     * Create an instance of {@link ProcessingOfWagonModel }
     * 
     */
    public ProcessingOfWagonModel createProcessingOfWagonModel() {
        return new ProcessingOfWagonModel();
    }

    /**
     * Create an instance of {@link CargoOnDateTableModel }
     * 
     */
    public CargoOnDateTableModel createCargoOnDateTableModel() {
        return new CargoOnDateTableModel();
    }

    /**
     * Create an instance of {@link ArrayOfCargoOnDateTransModel }
     * 
     */
    public ArrayOfCargoOnDateTransModel createArrayOfCargoOnDateTransModel() {
        return new ArrayOfCargoOnDateTransModel();
    }

    /**
     * Create an instance of {@link CargoOnDateTransModel }
     * 
     */
    public CargoOnDateTransModel createCargoOnDateTransModel() {
        return new CargoOnDateTransModel();
    }

    /**
     * Create an instance of {@link EcoResProductCategory }
     * 
     */
    public EcoResProductCategory createEcoResProductCategory() {
        return new EcoResProductCategory();
    }

    /**
     * Create an instance of {@link EmployeeModel }
     * 
     */
    public EmployeeModel createEmployeeModel() {
        return new EmployeeModel();
    }

    /**
     * Create an instance of {@link ExMooringModel }
     * 
     */
    public ExMooringModel createExMooringModel() {
        return new ExMooringModel();
    }

    /**
     * Create an instance of {@link TosContainerInfo }
     * 
     */
    public TosContainerInfo createTosContainerInfo() {
        return new TosContainerInfo();
    }

    /**
     * Create an instance of {@link AdditionalWork }
     * 
     */
    public AdditionalWork createAdditionalWork() {
        return new AdditionalWork();
    }

    /**
     * Create an instance of {@link InventDim }
     * 
     */
    public InventDim createInventDim() {
        return new InventDim();
    }

    /**
     * Create an instance of {@link ArrayOfInventSum }
     * 
     */
    public ArrayOfInventSum createArrayOfInventSum() {
        return new ArrayOfInventSum();
    }

    /**
     * Create an instance of {@link InventSum }
     * 
     */
    public InventSum createInventSum() {
        return new InventSum();
    }

    /**
     * Create an instance of {@link InventBatch }
     * 
     */
    public InventBatch createInventBatch() {
        return new InventBatch();
    }

    /**
     * Create an instance of {@link ArrayOfPDSBatchAttribute }
     * 
     */
    public ArrayOfPDSBatchAttribute createArrayOfPDSBatchAttribute() {
        return new ArrayOfPDSBatchAttribute();
    }

    /**
     * Create an instance of {@link PDSBatchAttribute }
     * 
     */
    public PDSBatchAttribute createPDSBatchAttribute() {
        return new PDSBatchAttribute();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDefect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfDefect")
    public JAXBElement<ArrayOfDefect> createArrayOfDefect(ArrayOfDefect value) {
        return new JAXBElement<ArrayOfDefect>(_ArrayOfDefect_QNAME, ArrayOfDefect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Defect")
    public JAXBElement<Defect> createDefect(Defect value) {
        return new JAXBElement<Defect>(_Defect_QNAME, Defect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRailRoadLoadingArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortRailRoadLoadingArea")
    public JAXBElement<ArrayOfPortRailRoadLoadingArea> createArrayOfPortRailRoadLoadingArea(ArrayOfPortRailRoadLoadingArea value) {
        return new JAXBElement<ArrayOfPortRailRoadLoadingArea>(_ArrayOfPortRailRoadLoadingArea_QNAME, ArrayOfPortRailRoadLoadingArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortRailRoadLoadingArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortRailRoadLoadingArea")
    public JAXBElement<PortRailRoadLoadingArea> createPortRailRoadLoadingArea(PortRailRoadLoadingArea value) {
        return new JAXBElement<PortRailRoadLoadingArea>(_PortRailRoadLoadingArea_QNAME, PortRailRoadLoadingArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortWorkBrigade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortWorkBrigade")
    public JAXBElement<ArrayOfPortWorkBrigade> createArrayOfPortWorkBrigade(ArrayOfPortWorkBrigade value) {
        return new JAXBElement<ArrayOfPortWorkBrigade>(_ArrayOfPortWorkBrigade_QNAME, ArrayOfPortWorkBrigade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortWorkBrigade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortWorkBrigade")
    public JAXBElement<PortWorkBrigade> createPortWorkBrigade(PortWorkBrigade value) {
        return new JAXBElement<PortWorkBrigade>(_PortWorkBrigade_QNAME, PortWorkBrigade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoDetailedPlanJour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoDetailedPlanJour")
    public JAXBElement<ArrayOfCargoDetailedPlanJour> createArrayOfCargoDetailedPlanJour(ArrayOfCargoDetailedPlanJour value) {
        return new JAXBElement<ArrayOfCargoDetailedPlanJour>(_ArrayOfCargoDetailedPlanJour_QNAME, ArrayOfCargoDetailedPlanJour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoDetailedPlanJour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoDetailedPlanJour")
    public JAXBElement<CargoDetailedPlanJour> createCargoDetailedPlanJour(CargoDetailedPlanJour value) {
        return new JAXBElement<CargoDetailedPlanJour>(_CargoDetailedPlanJour_QNAME, CargoDetailedPlanJour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoDetailedPlanTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoDetailedPlanTrans")
    public JAXBElement<ArrayOfCargoDetailedPlanTrans> createArrayOfCargoDetailedPlanTrans(ArrayOfCargoDetailedPlanTrans value) {
        return new JAXBElement<ArrayOfCargoDetailedPlanTrans>(_ArrayOfCargoDetailedPlanTrans_QNAME, ArrayOfCargoDetailedPlanTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoDetailedPlanTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoDetailedPlanTrans")
    public JAXBElement<CargoDetailedPlanTrans> createCargoDetailedPlanTrans(CargoDetailedPlanTrans value) {
        return new JAXBElement<CargoDetailedPlanTrans>(_CargoDetailedPlanTrans_QNAME, CargoDetailedPlanTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortTimeSheet")
    public JAXBElement<ArrayOfPortTimeSheet> createArrayOfPortTimeSheet(ArrayOfPortTimeSheet value) {
        return new JAXBElement<ArrayOfPortTimeSheet>(_ArrayOfPortTimeSheet_QNAME, ArrayOfPortTimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortTimeSheet")
    public JAXBElement<PortTimeSheet> createPortTimeSheet(PortTimeSheet value) {
        return new JAXBElement<PortTimeSheet>(_PortTimeSheet_QNAME, PortTimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortMooringOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortMooringOperation")
    public JAXBElement<ArrayOfPortMooringOperation> createArrayOfPortMooringOperation(ArrayOfPortMooringOperation value) {
        return new JAXBElement<ArrayOfPortMooringOperation>(_ArrayOfPortMooringOperation_QNAME, ArrayOfPortMooringOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortMooringOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortMooringOperation")
    public JAXBElement<PortMooringOperation> createPortMooringOperation(PortMooringOperation value) {
        return new JAXBElement<PortMooringOperation>(_PortMooringOperation_QNAME, PortMooringOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTransactionsTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortTransactionsTimeSheet")
    public JAXBElement<ArrayOfPortTransactionsTimeSheet> createArrayOfPortTransactionsTimeSheet(ArrayOfPortTransactionsTimeSheet value) {
        return new JAXBElement<ArrayOfPortTransactionsTimeSheet>(_ArrayOfPortTransactionsTimeSheet_QNAME, ArrayOfPortTransactionsTimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortTransactionsTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortTransactionsTimeSheet")
    public JAXBElement<PortTransactionsTimeSheet> createPortTransactionsTimeSheet(PortTransactionsTimeSheet value) {
        return new JAXBElement<PortTransactionsTimeSheet>(_PortTransactionsTimeSheet_QNAME, PortTransactionsTimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortCargoTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortCargoTimeSheet")
    public JAXBElement<ArrayOfPortCargoTimeSheet> createArrayOfPortCargoTimeSheet(ArrayOfPortCargoTimeSheet value) {
        return new JAXBElement<ArrayOfPortCargoTimeSheet>(_ArrayOfPortCargoTimeSheet_QNAME, ArrayOfPortCargoTimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortCargoTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortCargoTimeSheet")
    public JAXBElement<PortCargoTimeSheet> createPortCargoTimeSheet(PortCargoTimeSheet value) {
        return new JAXBElement<PortCargoTimeSheet>(_PortCargoTimeSheet_QNAME, PortCargoTimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortPierModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortPierModel")
    public JAXBElement<ArrayOfPortPierModel> createArrayOfPortPierModel(ArrayOfPortPierModel value) {
        return new JAXBElement<ArrayOfPortPierModel>(_ArrayOfPortPierModel_QNAME, ArrayOfPortPierModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortPierModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortPierModel")
    public JAXBElement<PortPierModel> createPortPierModel(PortPierModel value) {
        return new JAXBElement<PortPierModel>(_PortPierModel_QNAME, PortPierModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDispatcherSummaryModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfDispatcherSummaryModel")
    public JAXBElement<ArrayOfDispatcherSummaryModel> createArrayOfDispatcherSummaryModel(ArrayOfDispatcherSummaryModel value) {
        return new JAXBElement<ArrayOfDispatcherSummaryModel>(_ArrayOfDispatcherSummaryModel_QNAME, ArrayOfDispatcherSummaryModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispatcherSummaryModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DispatcherSummaryModel")
    public JAXBElement<DispatcherSummaryModel> createDispatcherSummaryModel(DispatcherSummaryModel value) {
        return new JAXBElement<DispatcherSummaryModel>(_DispatcherSummaryModel_QNAME, DispatcherSummaryModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEcoresCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfEcoresCategory")
    public JAXBElement<ArrayOfEcoresCategory> createArrayOfEcoresCategory(ArrayOfEcoresCategory value) {
        return new JAXBElement<ArrayOfEcoresCategory>(_ArrayOfEcoresCategory_QNAME, ArrayOfEcoresCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EcoresCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresCategory")
    public JAXBElement<EcoresCategory> createEcoresCategory(EcoresCategory value) {
        return new JAXBElement<EcoresCategory>(_EcoresCategory_QNAME, EcoresCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortThirdPartyShipsFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortThirdPartyShipsFact")
    public JAXBElement<ArrayOfPortThirdPartyShipsFact> createArrayOfPortThirdPartyShipsFact(ArrayOfPortThirdPartyShipsFact value) {
        return new JAXBElement<ArrayOfPortThirdPartyShipsFact>(_ArrayOfPortThirdPartyShipsFact_QNAME, ArrayOfPortThirdPartyShipsFact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortThirdPartyShipsFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortThirdPartyShipsFact")
    public JAXBElement<PortThirdPartyShipsFact> createPortThirdPartyShipsFact(PortThirdPartyShipsFact value) {
        return new JAXBElement<PortThirdPartyShipsFact>(_PortThirdPartyShipsFact_QNAME, PortThirdPartyShipsFact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoTallyReceiptJournalTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoTallyReceiptJournalTable")
    public JAXBElement<ArrayOfCargoTallyReceiptJournalTable> createArrayOfCargoTallyReceiptJournalTable(ArrayOfCargoTallyReceiptJournalTable value) {
        return new JAXBElement<ArrayOfCargoTallyReceiptJournalTable>(_ArrayOfCargoTallyReceiptJournalTable_QNAME, ArrayOfCargoTallyReceiptJournalTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoTallyReceiptJournalTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoTallyReceiptJournalTable")
    public JAXBElement<CargoTallyReceiptJournalTable> createCargoTallyReceiptJournalTable(CargoTallyReceiptJournalTable value) {
        return new JAXBElement<CargoTallyReceiptJournalTable>(_CargoTallyReceiptJournalTable_QNAME, CargoTallyReceiptJournalTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoTallyReceiptJournalTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoTallyReceiptJournalTrans")
    public JAXBElement<ArrayOfCargoTallyReceiptJournalTrans> createArrayOfCargoTallyReceiptJournalTrans(ArrayOfCargoTallyReceiptJournalTrans value) {
        return new JAXBElement<ArrayOfCargoTallyReceiptJournalTrans>(_ArrayOfCargoTallyReceiptJournalTrans_QNAME, ArrayOfCargoTallyReceiptJournalTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoTallyReceiptJournalTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoTallyReceiptJournalTrans")
    public JAXBElement<CargoTallyReceiptJournalTrans> createCargoTallyReceiptJournalTrans(CargoTallyReceiptJournalTrans value) {
        return new JAXBElement<CargoTallyReceiptJournalTrans>(_CargoTallyReceiptJournalTrans_QNAME, CargoTallyReceiptJournalTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTimeSheetOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortTimeSheetOperation")
    public JAXBElement<ArrayOfPortTimeSheetOperation> createArrayOfPortTimeSheetOperation(ArrayOfPortTimeSheetOperation value) {
        return new JAXBElement<ArrayOfPortTimeSheetOperation>(_ArrayOfPortTimeSheetOperation_QNAME, ArrayOfPortTimeSheetOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortTimeSheetOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortTimeSheetOperation")
    public JAXBElement<PortTimeSheetOperation> createPortTimeSheetOperation(PortTimeSheetOperation value) {
        return new JAXBElement<PortTimeSheetOperation>(_PortTimeSheetOperation_QNAME, PortTimeSheetOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortBerthTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortBerthTable")
    public JAXBElement<ArrayOfPortBerthTable> createArrayOfPortBerthTable(ArrayOfPortBerthTable value) {
        return new JAXBElement<ArrayOfPortBerthTable>(_ArrayOfPortBerthTable_QNAME, ArrayOfPortBerthTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortBerthTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortBerthTable")
    public JAXBElement<PortBerthTable> createPortBerthTable(PortBerthTable value) {
        return new JAXBElement<PortBerthTable>(_PortBerthTable_QNAME, PortBerthTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEcoresCategoryHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfEcoresCategoryHierarchy")
    public JAXBElement<ArrayOfEcoresCategoryHierarchy> createArrayOfEcoresCategoryHierarchy(ArrayOfEcoresCategoryHierarchy value) {
        return new JAXBElement<ArrayOfEcoresCategoryHierarchy>(_ArrayOfEcoresCategoryHierarchy_QNAME, ArrayOfEcoresCategoryHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EcoresCategoryHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresCategoryHierarchy")
    public JAXBElement<EcoresCategoryHierarchy> createEcoresCategoryHierarchy(EcoresCategoryHierarchy value) {
        return new JAXBElement<EcoresCategoryHierarchy>(_EcoresCategoryHierarchy_QNAME, EcoresCategoryHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlanTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPlanTableModel")
    public JAXBElement<ArrayOfPlanTableModel> createArrayOfPlanTableModel(ArrayOfPlanTableModel value) {
        return new JAXBElement<ArrayOfPlanTableModel>(_ArrayOfPlanTableModel_QNAME, ArrayOfPlanTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PlanTableModel")
    public JAXBElement<PlanTableModel> createPlanTableModel(PlanTableModel value) {
        return new JAXBElement<PlanTableModel>(_PlanTableModel_QNAME, PlanTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWMSLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfWMSLocation")
    public JAXBElement<ArrayOfWMSLocation> createArrayOfWMSLocation(ArrayOfWMSLocation value) {
        return new JAXBElement<ArrayOfWMSLocation>(_ArrayOfWMSLocation_QNAME, ArrayOfWMSLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WMSLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSLocation")
    public JAXBElement<WMSLocation> createWMSLocation(WMSLocation value) {
        return new JAXBElement<WMSLocation>(_WMSLocation_QNAME, WMSLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfInventLocation")
    public JAXBElement<ArrayOfInventLocation> createArrayOfInventLocation(ArrayOfInventLocation value) {
        return new JAXBElement<ArrayOfInventLocation>(_ArrayOfInventLocation_QNAME, ArrayOfInventLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocation")
    public JAXBElement<InventLocation> createInventLocation(InventLocation value) {
        return new JAXBElement<InventLocation>(_InventLocation_QNAME, InventLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortEquipmentGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortEquipmentGroup")
    public JAXBElement<ArrayOfPortEquipmentGroup> createArrayOfPortEquipmentGroup(ArrayOfPortEquipmentGroup value) {
        return new JAXBElement<ArrayOfPortEquipmentGroup>(_ArrayOfPortEquipmentGroup_QNAME, ArrayOfPortEquipmentGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortEquipmentGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortEquipmentGroup")
    public JAXBElement<PortEquipmentGroup> createPortEquipmentGroup(PortEquipmentGroup value) {
        return new JAXBElement<PortEquipmentGroup>(_PortEquipmentGroup_QNAME, PortEquipmentGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortEquipmentModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortEquipmentModel")
    public JAXBElement<ArrayOfPortEquipmentModel> createArrayOfPortEquipmentModel(ArrayOfPortEquipmentModel value) {
        return new JAXBElement<ArrayOfPortEquipmentModel>(_ArrayOfPortEquipmentModel_QNAME, ArrayOfPortEquipmentModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortEquipmentModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortEquipmentModel")
    public JAXBElement<PortEquipmentModel> createPortEquipmentModel(PortEquipmentModel value) {
        return new JAXBElement<PortEquipmentModel>(_PortEquipmentModel_QNAME, PortEquipmentModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortEquipment")
    public JAXBElement<ArrayOfPortEquipment> createArrayOfPortEquipment(ArrayOfPortEquipment value) {
        return new JAXBElement<ArrayOfPortEquipment>(_ArrayOfPortEquipment_QNAME, ArrayOfPortEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortEquipment")
    public JAXBElement<PortEquipment> createPortEquipment(PortEquipment value) {
        return new JAXBElement<PortEquipment>(_PortEquipment_QNAME, PortEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShipTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortShipTableModel")
    public JAXBElement<ArrayOfPortShipTableModel> createArrayOfPortShipTableModel(ArrayOfPortShipTableModel value) {
        return new JAXBElement<ArrayOfPortShipTableModel>(_ArrayOfPortShipTableModel_QNAME, ArrayOfPortShipTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortShipTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortShipTableModel")
    public JAXBElement<PortShipTableModel> createPortShipTableModel(PortShipTableModel value) {
        return new JAXBElement<PortShipTableModel>(_PortShipTableModel_QNAME, PortShipTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgreementHeaderModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfAgreementHeaderModel")
    public JAXBElement<ArrayOfAgreementHeaderModel> createArrayOfAgreementHeaderModel(ArrayOfAgreementHeaderModel value) {
        return new JAXBElement<ArrayOfAgreementHeaderModel>(_ArrayOfAgreementHeaderModel_QNAME, ArrayOfAgreementHeaderModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementHeaderModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementHeaderModel")
    public JAXBElement<AgreementHeaderModel> createAgreementHeaderModel(AgreementHeaderModel value) {
        return new JAXBElement<AgreementHeaderModel>(_AgreementHeaderModel_QNAME, AgreementHeaderModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventOwnerModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfInventOwnerModel")
    public JAXBElement<ArrayOfInventOwnerModel> createArrayOfInventOwnerModel(ArrayOfInventOwnerModel value) {
        return new JAXBElement<ArrayOfInventOwnerModel>(_ArrayOfInventOwnerModel_QNAME, ArrayOfInventOwnerModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventOwnerModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventOwnerModel")
    public JAXBElement<InventOwnerModel> createInventOwnerModel(InventOwnerModel value) {
        return new JAXBElement<InventOwnerModel>(_InventOwnerModel_QNAME, InventOwnerModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortRequestTableModel")
    public JAXBElement<ArrayOfPortRequestTableModel> createArrayOfPortRequestTableModel(ArrayOfPortRequestTableModel value) {
        return new JAXBElement<ArrayOfPortRequestTableModel>(_ArrayOfPortRequestTableModel_QNAME, ArrayOfPortRequestTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortRequestTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortRequestTableModel")
    public JAXBElement<PortRequestTableModel> createPortRequestTableModel(PortRequestTableModel value) {
        return new JAXBElement<PortRequestTableModel>(_PortRequestTableModel_QNAME, PortRequestTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTransModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortRequestTransModel")
    public JAXBElement<ArrayOfPortRequestTransModel> createArrayOfPortRequestTransModel(ArrayOfPortRequestTransModel value) {
        return new JAXBElement<ArrayOfPortRequestTransModel>(_ArrayOfPortRequestTransModel_QNAME, ArrayOfPortRequestTransModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortRequestTransModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortRequestTransModel")
    public JAXBElement<PortRequestTransModel> createPortRequestTransModel(PortRequestTransModel value) {
        return new JAXBElement<PortRequestTransModel>(_PortRequestTransModel_QNAME, PortRequestTransModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortShiftDayPlanModel")
    public JAXBElement<ArrayOfPortShiftDayPlanModel> createArrayOfPortShiftDayPlanModel(ArrayOfPortShiftDayPlanModel value) {
        return new JAXBElement<ArrayOfPortShiftDayPlanModel>(_ArrayOfPortShiftDayPlanModel_QNAME, ArrayOfPortShiftDayPlanModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortShiftDayPlanModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortShiftDayPlanModel")
    public JAXBElement<PortShiftDayPlanModel> createPortShiftDayPlanModel(PortShiftDayPlanModel value) {
        return new JAXBElement<PortShiftDayPlanModel>(_PortShiftDayPlanModel_QNAME, PortShiftDayPlanModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortShiftDayPlanFactModel")
    public JAXBElement<ArrayOfPortShiftDayPlanFactModel> createArrayOfPortShiftDayPlanFactModel(ArrayOfPortShiftDayPlanFactModel value) {
        return new JAXBElement<ArrayOfPortShiftDayPlanFactModel>(_ArrayOfPortShiftDayPlanFactModel_QNAME, ArrayOfPortShiftDayPlanFactModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortShiftDayPlanFactModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortShiftDayPlanFactModel")
    public JAXBElement<PortShiftDayPlanFactModel> createPortShiftDayPlanFactModel(PortShiftDayPlanFactModel value) {
        return new JAXBElement<PortShiftDayPlanFactModel>(_PortShiftDayPlanFactModel_QNAME, PortShiftDayPlanFactModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactEquipmentModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPortShiftDayPlanFactEquipmentModel")
    public JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel> createArrayOfPortShiftDayPlanFactEquipmentModel(ArrayOfPortShiftDayPlanFactEquipmentModel value) {
        return new JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel>(_ArrayOfPortShiftDayPlanFactEquipmentModel_QNAME, ArrayOfPortShiftDayPlanFactEquipmentModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortShiftDayPlanFactEquipmentModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortShiftDayPlanFactEquipmentModel")
    public JAXBElement<PortShiftDayPlanFactEquipmentModel> createPortShiftDayPlanFactEquipmentModel(PortShiftDayPlanFactEquipmentModel value) {
        return new JAXBElement<PortShiftDayPlanFactEquipmentModel>(_PortShiftDayPlanFactEquipmentModel_QNAME, PortShiftDayPlanFactEquipmentModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcceptanceActModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfAcceptanceActModel")
    public JAXBElement<ArrayOfAcceptanceActModel> createArrayOfAcceptanceActModel(ArrayOfAcceptanceActModel value) {
        return new JAXBElement<ArrayOfAcceptanceActModel>(_ArrayOfAcceptanceActModel_QNAME, ArrayOfAcceptanceActModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceActModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AcceptanceActModel")
    public JAXBElement<AcceptanceActModel> createAcceptanceActModel(AcceptanceActModel value) {
        return new JAXBElement<AcceptanceActModel>(_AcceptanceActModel_QNAME, AcceptanceActModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoTransportInvoiceJourModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoTransportInvoiceJourModel")
    public JAXBElement<ArrayOfCargoTransportInvoiceJourModel> createArrayOfCargoTransportInvoiceJourModel(ArrayOfCargoTransportInvoiceJourModel value) {
        return new JAXBElement<ArrayOfCargoTransportInvoiceJourModel>(_ArrayOfCargoTransportInvoiceJourModel_QNAME, ArrayOfCargoTransportInvoiceJourModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoTransportInvoiceJourModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoTransportInvoiceJourModel")
    public JAXBElement<CargoTransportInvoiceJourModel> createCargoTransportInvoiceJourModel(CargoTransportInvoiceJourModel value) {
        return new JAXBElement<CargoTransportInvoiceJourModel>(_CargoTransportInvoiceJourModel_QNAME, CargoTransportInvoiceJourModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientListModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfClientListModel")
    public JAXBElement<ArrayOfClientListModel> createArrayOfClientListModel(ArrayOfClientListModel value) {
        return new JAXBElement<ArrayOfClientListModel>(_ArrayOfClientListModel_QNAME, ArrayOfClientListModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientListModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ClientListModel")
    public JAXBElement<ClientListModel> createClientListModel(ClientListModel value) {
        return new JAXBElement<ClientListModel>(_ClientListModel_QNAME, ClientListModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessingOfWagonModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfProcessingOfWagonModel")
    public JAXBElement<ArrayOfProcessingOfWagonModel> createArrayOfProcessingOfWagonModel(ArrayOfProcessingOfWagonModel value) {
        return new JAXBElement<ArrayOfProcessingOfWagonModel>(_ArrayOfProcessingOfWagonModel_QNAME, ArrayOfProcessingOfWagonModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingOfWagonModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ProcessingOfWagonModel")
    public JAXBElement<ProcessingOfWagonModel> createProcessingOfWagonModel(ProcessingOfWagonModel value) {
        return new JAXBElement<ProcessingOfWagonModel>(_ProcessingOfWagonModel_QNAME, ProcessingOfWagonModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoOnDateTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoOnDateTableModel")
    public JAXBElement<ArrayOfCargoOnDateTableModel> createArrayOfCargoOnDateTableModel(ArrayOfCargoOnDateTableModel value) {
        return new JAXBElement<ArrayOfCargoOnDateTableModel>(_ArrayOfCargoOnDateTableModel_QNAME, ArrayOfCargoOnDateTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoOnDateTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoOnDateTableModel")
    public JAXBElement<CargoOnDateTableModel> createCargoOnDateTableModel(CargoOnDateTableModel value) {
        return new JAXBElement<CargoOnDateTableModel>(_CargoOnDateTableModel_QNAME, CargoOnDateTableModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoOnDateTransModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfCargoOnDateTransModel")
    public JAXBElement<ArrayOfCargoOnDateTransModel> createArrayOfCargoOnDateTransModel(ArrayOfCargoOnDateTransModel value) {
        return new JAXBElement<ArrayOfCargoOnDateTransModel>(_ArrayOfCargoOnDateTransModel_QNAME, ArrayOfCargoOnDateTransModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoOnDateTransModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoOnDateTransModel")
    public JAXBElement<CargoOnDateTransModel> createCargoOnDateTransModel(CargoOnDateTransModel value) {
        return new JAXBElement<CargoOnDateTransModel>(_CargoOnDateTransModel_QNAME, CargoOnDateTransModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEcoResProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfEcoResProductCategory")
    public JAXBElement<ArrayOfEcoResProductCategory> createArrayOfEcoResProductCategory(ArrayOfEcoResProductCategory value) {
        return new JAXBElement<ArrayOfEcoResProductCategory>(_ArrayOfEcoResProductCategory_QNAME, ArrayOfEcoResProductCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EcoResProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoResProductCategory")
    public JAXBElement<EcoResProductCategory> createEcoResProductCategory(EcoResProductCategory value) {
        return new JAXBElement<EcoResProductCategory>(_EcoResProductCategory_QNAME, EcoResProductCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanTableStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PlanTableStatus")
    public JAXBElement<PlanTableStatus> createPlanTableStatus(PlanTableStatus value) {
        return new JAXBElement<PlanTableStatus>(_PlanTableStatus_QNAME, PlanTableStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfEmployeeModel")
    public JAXBElement<ArrayOfEmployeeModel> createArrayOfEmployeeModel(ArrayOfEmployeeModel value) {
        return new JAXBElement<ArrayOfEmployeeModel>(_ArrayOfEmployeeModel_QNAME, ArrayOfEmployeeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EmployeeModel")
    public JAXBElement<EmployeeModel> createEmployeeModel(EmployeeModel value) {
        return new JAXBElement<EmployeeModel>(_EmployeeModel_QNAME, EmployeeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExMooringModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfExMooringModel")
    public JAXBElement<ArrayOfExMooringModel> createArrayOfExMooringModel(ArrayOfExMooringModel value) {
        return new JAXBElement<ArrayOfExMooringModel>(_ArrayOfExMooringModel_QNAME, ArrayOfExMooringModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExMooringModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ExMooringModel")
    public JAXBElement<ExMooringModel> createExMooringModel(ExMooringModel value) {
        return new JAXBElement<ExMooringModel>(_ExMooringModel_QNAME, ExMooringModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTosContainerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfTosContainerInfo")
    public JAXBElement<ArrayOfTosContainerInfo> createArrayOfTosContainerInfo(ArrayOfTosContainerInfo value) {
        return new JAXBElement<ArrayOfTosContainerInfo>(_ArrayOfTosContainerInfo_QNAME, ArrayOfTosContainerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TosContainerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TosContainerInfo")
    public JAXBElement<TosContainerInfo> createTosContainerInfo(TosContainerInfo value) {
        return new JAXBElement<TosContainerInfo>(_TosContainerInfo_QNAME, TosContainerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfAdditionalWork")
    public JAXBElement<ArrayOfAdditionalWork> createArrayOfAdditionalWork(ArrayOfAdditionalWork value) {
        return new JAXBElement<ArrayOfAdditionalWork>(_ArrayOfAdditionalWork_QNAME, ArrayOfAdditionalWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AdditionalWork")
    public JAXBElement<AdditionalWork> createAdditionalWork(AdditionalWork value) {
        return new JAXBElement<AdditionalWork>(_AdditionalWork_QNAME, AdditionalWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventDim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfInventDim")
    public JAXBElement<ArrayOfInventDim> createArrayOfInventDim(ArrayOfInventDim value) {
        return new JAXBElement<ArrayOfInventDim>(_ArrayOfInventDim_QNAME, ArrayOfInventDim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventDim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventDim")
    public JAXBElement<InventDim> createInventDim(InventDim value) {
        return new JAXBElement<InventDim>(_InventDim_QNAME, InventDim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfInventSum")
    public JAXBElement<ArrayOfInventSum> createArrayOfInventSum(ArrayOfInventSum value) {
        return new JAXBElement<ArrayOfInventSum>(_ArrayOfInventSum_QNAME, ArrayOfInventSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSum")
    public JAXBElement<InventSum> createInventSum(InventSum value) {
        return new JAXBElement<InventSum>(_InventSum_QNAME, InventSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfInventBatch")
    public JAXBElement<ArrayOfInventBatch> createArrayOfInventBatch(ArrayOfInventBatch value) {
        return new JAXBElement<ArrayOfInventBatch>(_ArrayOfInventBatch_QNAME, ArrayOfInventBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventBatch")
    public JAXBElement<InventBatch> createInventBatch(InventBatch value) {
        return new JAXBElement<InventBatch>(_InventBatch_QNAME, InventBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPDSBatchAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ArrayOfPDSBatchAttribute")
    public JAXBElement<ArrayOfPDSBatchAttribute> createArrayOfPDSBatchAttribute(ArrayOfPDSBatchAttribute value) {
        return new JAXBElement<ArrayOfPDSBatchAttribute>(_ArrayOfPDSBatchAttribute_QNAME, ArrayOfPDSBatchAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDSBatchAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSBatchAttribute")
    public JAXBElement<PDSBatchAttribute> createPDSBatchAttribute(PDSBatchAttribute value) {
        return new JAXBElement<PDSBatchAttribute>(_PDSBatchAttribute_QNAME, PDSBatchAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventBatchId", scope = PDSBatchAttribute.class)
    public JAXBElement<String> createPDSBatchAttributeInventBatchId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeInventBatchId_QNAME, String.class, PDSBatchAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = PDSBatchAttribute.class)
    public JAXBElement<String> createPDSBatchAttributeItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, PDSBatchAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSBatchAttribId", scope = PDSBatchAttribute.class)
    public JAXBElement<String> createPDSBatchAttributePDSBatchAttribId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributePDSBatchAttribId_QNAME, String.class, PDSBatchAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSBatchAttribQualityOrderId", scope = PDSBatchAttribute.class)
    public JAXBElement<String> createPDSBatchAttributePDSBatchAttribQualityOrderId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributePDSBatchAttribQualityOrderId_QNAME, String.class, PDSBatchAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSBatchAttribValue", scope = PDSBatchAttribute.class)
    public JAXBElement<String> createPDSBatchAttributePDSBatchAttribValue(String value) {
        return new JAXBElement<String>(_PDSBatchAttributePDSBatchAttribValue_QNAME, String.class, PDSBatchAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventBatchId", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchInventBatchId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeInventBatchId_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPDSBatchAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSBatchAttributes", scope = InventBatch.class)
    public JAXBElement<ArrayOfPDSBatchAttribute> createInventBatchPDSBatchAttributes(ArrayOfPDSBatchAttribute value) {
        return new JAXBElement<ArrayOfPDSBatchAttribute>(_InventBatchPDSBatchAttributes_QNAME, ArrayOfPDSBatchAttribute.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSCountryOforigin1", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchPDSCountryOforigin1(String value) {
        return new JAXBElement<String>(_InventBatchPDSCountryOforigin1_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSCountryOforigin2", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchPDSCountryOforigin2(String value) {
        return new JAXBElement<String>(_InventBatchPDSCountryOforigin2_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSDIsPositionCode", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchPDSDIsPositionCode(String value) {
        return new JAXBElement<String>(_InventBatchPDSDIsPositionCode_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PDSVendBatchId", scope = InventBatch.class)
    public JAXBElement<String> createInventBatchPDSVendBatchId(String value) {
        return new JAXBElement<String>(_InventBatchPDSVendBatchId_QNAME, String.class, InventBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventDimId", scope = InventSum.class)
    public JAXBElement<String> createInventSumInventDimId(String value) {
        return new JAXBElement<String>(_InventSumInventDimId_QNAME, String.class, InventSum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = InventSum.class)
    public JAXBElement<String> createInventSumItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, InventSum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoBillOfLadingId", scope = InventDim.class)
    public JAXBElement<String> createInventDimCargoBillOfLadingId(String value) {
        return new JAXBElement<String>(_InventDimCargoBillOfLadingId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoPlaceTypeId", scope = InventDim.class)
    public JAXBElement<String> createInventDimCargoPlaceTypeId(String value) {
        return new JAXBElement<String>(_InventDimCargoPlaceTypeId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ConfigId", scope = InventDim.class)
    public JAXBElement<String> createInventDimConfigId(String value) {
        return new JAXBElement<String>(_InventDimConfigId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventBatchId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventBatchId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeInventBatchId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventColorId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventColorId(String value) {
        return new JAXBElement<String>(_InventDimInventColorId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventDimId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventDimId(String value) {
        return new JAXBElement<String>(_InventSumInventDimId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventGtdId_RU", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventGtdIdRU(String value) {
        return new JAXBElement<String>(_InventDimInventGtdIdRU_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventOwnerId_RU", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventOwnerIdRU(String value) {
        return new JAXBElement<String>(_InventDimInventOwnerIdRU_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventProfileId_RU", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventProfileIdRU(String value) {
        return new JAXBElement<String>(_InventDimInventProfileIdRU_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSerialId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventSerialId(String value) {
        return new JAXBElement<String>(_InventDimInventSerialId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventSiteId(String value) {
        return new JAXBElement<String>(_InventDimInventSiteId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSizeId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventSizeId(String value) {
        return new JAXBElement<String>(_InventDimInventSizeId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventStatusId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventStatusId(String value) {
        return new JAXBElement<String>(_InventDimInventStatusId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventStyleId", scope = InventDim.class)
    public JAXBElement<String> createInventDimInventStyleId(String value) {
        return new JAXBElement<String>(_InventDimInventStyleId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSums", scope = InventDim.class)
    public JAXBElement<ArrayOfInventSum> createInventDimInventSums(ArrayOfInventSum value) {
        return new JAXBElement<ArrayOfInventSum>(_InventDimInventSums_QNAME, ArrayOfInventSum.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LicensePlateId", scope = InventDim.class)
    public JAXBElement<String> createInventDimLicensePlateId(String value) {
        return new JAXBElement<String>(_InventDimLicensePlateId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = InventDim.class)
    public JAXBElement<String> createInventDimModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Sha1Hash", scope = InventDim.class)
    public JAXBElement<byte[]> createInventDimSha1Hash(byte[] value) {
        return new JAXBElement<byte[]>(_InventDimSha1Hash_QNAME, byte[].class, InventDim.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSLocationId", scope = InventDim.class)
    public JAXBElement<String> createInventDimWMSLocationId(String value) {
        return new JAXBElement<String>(_InventDimWMSLocationId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSPalletId", scope = InventDim.class)
    public JAXBElement<String> createInventDimWMSPalletId(String value) {
        return new JAXBElement<String>(_InventDimWMSPalletId_QNAME, String.class, InventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AcceptanceActNum", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkAcceptanceActNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkAcceptanceActNum_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ActNum", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkActNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkActNum_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementId", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkAgreementId(String value) {
        return new JAXBElement<String>(_AdditionalWorkAgreementId_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLadingNum", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkBillOfLadingNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkBillOfLadingNum_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoSize", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkCargoSize(String value) {
        return new JAXBElement<String>(_AdditionalWorkCargoSize_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustAccount", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkCustAccount(String value) {
        return new JAXBElement<String>(_AdditionalWorkCustAccount_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustName", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkCustName(String value) {
        return new JAXBElement<String>(_AdditionalWorkCustName_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustomsRegime", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkCustomsRegime(String value) {
        return new JAXBElement<String>(_AdditionalWorkCustomsRegime_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DirectionStr", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkDirectionStr(String value) {
        return new JAXBElement<String>(_AdditionalWorkDirectionStr_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DocumentTitle", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkDocumentTitle(String value) {
        return new JAXBElement<String>(_AdditionalWorkDocumentTitle_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoResCategoryCode", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkEcoResCategoryCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkEcoResCategoryCode_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoResCategoryName", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkEcoResCategoryName(String value) {
        return new JAXBElement<String>(_AdditionalWorkEcoResCategoryName_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EndTime", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkEndTime(String value) {
        return new JAXBElement<String>(_AdditionalWorkEndTime_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemIdTally", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkItemIdTally(String value) {
        return new JAXBElement<String>(_AdditionalWorkItemIdTally_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemName", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkItemName(String value) {
        return new JAXBElement<String>(_AdditionalWorkItemName_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemNameTally", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkItemNameTally(String value) {
        return new JAXBElement<String>(_AdditionalWorkItemNameTally_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemTypeId", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkItemTypeId(String value) {
        return new JAXBElement<String>(_AdditionalWorkItemTypeId_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemTypeStr", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkItemTypeStr(String value) {
        return new JAXBElement<String>(_AdditionalWorkItemTypeStr_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ManifestNum", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkManifestNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkManifestNum_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NameAlias", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkNameAlias(String value) {
        return new JAXBElement<String>(_AdditionalWorkNameAlias_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NameEnglish", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkNameEnglish(String value) {
        return new JAXBElement<String>(_AdditionalWorkNameEnglish_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "OrderNum", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkOrderNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkOrderNum_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortCallId", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkPortCallId(String value) {
        return new JAXBElement<String>(_AdditionalWorkPortCallId_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortCargoType", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkPortCargoType(String value) {
        return new JAXBElement<String>(_AdditionalWorkPortCargoType_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ProcessStatusStr", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkProcessStatusStr(String value) {
        return new JAXBElement<String>(_AdditionalWorkProcessStatusStr_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestStatusStr", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkRequestStatusStr(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestStatusStr_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestTypeStr", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkRequestTypeStr(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestTypeStr_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SalesId", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkSalesId(String value) {
        return new JAXBElement<String>(_AdditionalWorkSalesId_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "StartTime", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkStartTime(String value) {
        return new JAXBElement<String>(_AdditionalWorkStartTime_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitOfMeasure", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkUnitOfMeasure(String value) {
        return new JAXBElement<String>(_AdditionalWorkUnitOfMeasure_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Vehicle", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkVehicle(String value) {
        return new JAXBElement<String>(_AdditionalWorkVehicle_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VehicleType", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkVehicleType(String value) {
        return new JAXBElement<String>(_AdditionalWorkVehicleType_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantStr", scope = AdditionalWork.class)
    public JAXBElement<String> createAdditionalWorkWorkVariantStr(String value) {
        return new JAXBElement<String>(_AdditionalWorkWorkVariantStr_QNAME, String.class, AdditionalWork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLandingNumber", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoBillOfLandingNumber(String value) {
        return new JAXBElement<String>(_TosContainerInfoBillOfLandingNumber_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoName", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoCargoName(String value) {
        return new JAXBElement<String>(_TosContainerInfoCargoName_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CntSealDoc", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoCntSealDoc(String value) {
        return new JAXBElement<String>(_TosContainerInfoCntSealDoc_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CntSealFact", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoCntSealFact(String value) {
        return new JAXBElement<String>(_TosContainerInfoCntSealFact_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ContainerNumber", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoContainerNumber(String value) {
        return new JAXBElement<String>(_TosContainerInfoContainerNumber_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Contract", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoContract(String value) {
        return new JAXBElement<String>(_TosContainerInfoContract_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CurrentPlace", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoCurrentPlace(String value) {
        return new JAXBElement<String>(_TosContainerInfoCurrentPlace_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Location", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoLocation(String value) {
        return new JAXBElement<String>(_TosContainerInfoLocation_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TermOutDate", scope = TosContainerInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTosContainerInfoTermOutDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TosContainerInfoTermOutDate_QNAME, XMLGregorianCalendar.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VesselCommingDate", scope = TosContainerInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTosContainerInfoVesselCommingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TosContainerInfoVesselCommingDate_QNAME, XMLGregorianCalendar.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VesselNameEng", scope = TosContainerInfo.class)
    public JAXBElement<String> createTosContainerInfoVesselNameEng(String value) {
        return new JAXBElement<String>(_TosContainerInfoVesselNameEng_QNAME, String.class, TosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Moorage", scope = ExMooringModel.class)
    public JAXBElement<String> createExMooringModelMoorage(String value) {
        return new JAXBElement<String>(_ExMooringModelMoorage_QNAME, String.class, ExMooringModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Tanker", scope = ExMooringModel.class)
    public JAXBElement<String> createExMooringModelTanker(String value) {
        return new JAXBElement<String>(_ExMooringModelTanker_QNAME, String.class, ExMooringModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DisplayName", scope = EmployeeModel.class)
    public JAXBElement<String> createEmployeeModelDisplayName(String value) {
        return new JAXBElement<String>(_EmployeeModelDisplayName_QNAME, String.class, EmployeeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "FullName", scope = EmployeeModel.class)
    public JAXBElement<String> createEmployeeModelFullName(String value) {
        return new JAXBElement<String>(_EmployeeModelFullName_QNAME, String.class, EmployeeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TabelNumber", scope = EmployeeModel.class)
    public JAXBElement<String> createEmployeeModelTabelNumber(String value) {
        return new JAXBElement<String>(_EmployeeModelTabelNumber_QNAME, String.class, EmployeeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoPlaceTypeId", scope = CargoOnDateTransModel.class)
    public JAXBElement<String> createCargoOnDateTransModelCargoPlaceTypeId(String value) {
        return new JAXBElement<String>(_InventDimCargoPlaceTypeId_QNAME, String.class, CargoOnDateTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresItemLabelName", scope = CargoOnDateTransModel.class)
    public JAXBElement<String> createCargoOnDateTransModelEcoresItemLabelName(String value) {
        return new JAXBElement<String>(_CargoOnDateTransModelEcoresItemLabelName_QNAME, String.class, CargoOnDateTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventOwnerIdRu", scope = CargoOnDateTransModel.class)
    public JAXBElement<String> createCargoOnDateTransModelInventOwnerIdRu(String value) {
        return new JAXBElement<String>(_CargoOnDateTransModelInventOwnerIdRu_QNAME, String.class, CargoOnDateTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoOnDateTransModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoesOnDateTrans", scope = CargoOnDateTableModel.class)
    public JAXBElement<ArrayOfCargoOnDateTransModel> createCargoOnDateTableModelCargoesOnDateTrans(ArrayOfCargoOnDateTransModel value) {
        return new JAXBElement<ArrayOfCargoOnDateTransModel>(_CargoOnDateTableModelCargoesOnDateTrans_QNAME, ArrayOfCargoOnDateTransModel.class, CargoOnDateTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = CargoOnDateTableModel.class)
    public JAXBElement<String> createCargoOnDateTableModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, CargoOnDateTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = CargoOnDateTableModel.class)
    public JAXBElement<String> createCargoOnDateTableModelInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, CargoOnDateTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = CargoOnDateTableModel.class)
    public JAXBElement<String> createCargoOnDateTableModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, CargoOnDateTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLocationId", scope = CargoOnDateTableModel.class)
    public JAXBElement<String> createCargoOnDateTableModelWmsLocationId(String value) {
        return new JAXBElement<String>(_CargoOnDateTableModelWmsLocationId_QNAME, String.class, CargoOnDateTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkShiftId", scope = CargoOnDateTableModel.class)
    public JAXBElement<String> createCargoOnDateTableModelWorkShiftId(String value) {
        return new JAXBElement<String>(_CargoOnDateTableModelWorkShiftId_QNAME, String.class, CargoOnDateTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoName", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelCargoName(String value) {
        return new JAXBElement<String>(_TosContainerInfoCargoName_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EmailTo", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelEmailTo(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelEmailTo_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdFact", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelInventLocationIdFact(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInventLocationIdFact_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteIdFact", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelInventSiteIdFact(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInventSiteIdFact_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteIdFact1", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelInventSiteIdFact1(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInventSiteIdFact1_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InvoicEid", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelInvoicEid(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInvoicEid_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InvoiceNum", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelInvoiceNum(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInvoiceNum_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NameModifyingTimeProcessingWagons", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelNameModifyingTimeProcessingWagons(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelNameModifyingTimeProcessingWagons_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NotificationText", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelNotificationText(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelNotificationText_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReceiptId", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelReceiptId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelReceiptId_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReturnConsigmentStatus", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelReturnConsigmentStatus(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelReturnConsigmentStatus_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SalesAgreementId", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelSalesAgreementId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelSalesAgreementId_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WagonCode", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelWagonCode(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWagonCode_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WagonNum", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelWagonNum(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWagonNum_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantId", scope = ProcessingOfWagonModel.class)
    public JAXBElement<String> createProcessingOfWagonModelWorkVariantId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWorkVariantId_QNAME, String.class, ProcessingOfWagonModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AccountNum", scope = ClientListModel.class)
    public JAXBElement<String> createClientListModelAccountNum(String value) {
        return new JAXBElement<String>(_ClientListModelAccountNum_QNAME, String.class, ClientListModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = ClientListModel.class)
    public JAXBElement<String> createClientListModelName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, ClientListModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NameAlias", scope = ClientListModel.class)
    public JAXBElement<String> createClientListModelNameAlias(String value) {
        return new JAXBElement<String>(_AdditionalWorkNameAlias_QNAME, String.class, ClientListModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementId", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelAgreementId(String value) {
        return new JAXBElement<String>(_AdditionalWorkAgreementId_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ClearanceUserName", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelClearanceUserName(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelClearanceUserName_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Consignee", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelConsignee(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelConsignee_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ConsignorAccount", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelConsignorAccount(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelConsignorAccount_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CountryRegionId", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelCountryRegionId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCountryRegionId_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustomsDeclarationList", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelCustomsDeclarationList(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCustomsDeclarationList_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Forwarder", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelForwarder(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelForwarder_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventsiteId", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelInventsiteId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelInventsiteId_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InvoiceId", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelInvoiceId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelInvoiceId_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InvoiceNum", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelInvoiceNum(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInvoiceNum_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Payer", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelPayer(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelPayer_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RailRoadStationFrom", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelRailRoadStationFrom(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelRailRoadStationFrom_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RailRoadStationTo", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelRailRoadStationTo(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelRailRoadStationTo_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TransitDeclarationNum", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelTransitDeclarationNum(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelTransitDeclarationNum_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkshiftId", scope = CargoTransportInvoiceJourModel.class)
    public JAXBElement<String> createCargoTransportInvoiceJourModelWorkshiftId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelWorkshiftId_QNAME, String.class, CargoTransportInvoiceJourModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AcceptanceActNum", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelAcceptanceActNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkAcceptanceActNum_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CheckedBy", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelCheckedBy(String value) {
        return new JAXBElement<String>(_AcceptanceActModelCheckedBy_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CheckedByDeputyStoreKeeper", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelCheckedByDeputyStoreKeeper(String value) {
        return new JAXBElement<String>(_AcceptanceActModelCheckedByDeputyStoreKeeper_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Comment", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelComment(String value) {
        return new JAXBElement<String>(_AcceptanceActModelComment_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CountryRegionId", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelCountryRegionId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCountryRegionId_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = AcceptanceActModel.class)
    public JAXBElement<String> createAcceptanceActModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, AcceptanceActModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentCode", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelEquipmentCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelEquipmentCode_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentGroupCode", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelEquipmentGroupCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelEquipmentGroupCode_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentModelCode", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelEquipmentModelCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelEquipmentModelCode_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "FleetNumber", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelFleetNumber(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelFleetNumber_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShiftDayPlanId", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelShiftDayPlanId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelShiftDayPlanId_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShiftDayPlanIdPrev", scope = PortShiftDayPlanFactEquipmentModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactEquipmentModelShiftDayPlanIdPrev(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelShiftDayPlanIdPrev_QNAME, String.class, PortShiftDayPlanFactEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Comment", scope = PortShiftDayPlanFactModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactModelComment(String value) {
        return new JAXBElement<String>(_AcceptanceActModelComment_QNAME, String.class, PortShiftDayPlanFactModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortShiftDayPlanFactModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortShiftDayPlanFactModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DownTimeReasonId", scope = PortShiftDayPlanFactModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactModelDownTimeReasonId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactModelDownTimeReasonId_QNAME, String.class, PortShiftDayPlanFactModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortShiftDayPlanFactModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortShiftDayPlanFactModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShiftDayPlanId", scope = PortShiftDayPlanFactModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactModelShiftDayPlanId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelShiftDayPlanId_QNAME, String.class, PortShiftDayPlanFactModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TaskNotes", scope = PortShiftDayPlanFactModel.class)
    public JAXBElement<String> createPortShiftDayPlanFactModelTaskNotes(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactModelTaskNotes_QNAME, String.class, PortShiftDayPlanFactModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventsiteId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelInventsiteId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelInventsiteId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelNavigableId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelNavigableId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PierCode", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelPierCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelPierCode_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortImocode", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelPortImocode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelPortImocode_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortShiftDayPlansFact", scope = PortShiftDayPlanModel.class)
    public JAXBElement<ArrayOfPortShiftDayPlanFactModel> createPortShiftDayPlanModelPortShiftDayPlansFact(ArrayOfPortShiftDayPlanFactModel value) {
        return new JAXBElement<ArrayOfPortShiftDayPlanFactModel>(_PortShiftDayPlanModelPortShiftDayPlansFact_QNAME, ArrayOfPortShiftDayPlanFactModel.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanFactEquipmentModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortShiftDayPlansFactEquipment", scope = PortShiftDayPlanModel.class)
    public JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel> createPortShiftDayPlanModelPortShiftDayPlansFactEquipment(ArrayOfPortShiftDayPlanFactEquipmentModel value) {
        return new JAXBElement<ArrayOfPortShiftDayPlanFactEquipmentModel>(_PortShiftDayPlanModelPortShiftDayPlansFactEquipment_QNAME, ArrayOfPortShiftDayPlanFactEquipmentModel.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RailRoadLoadingAreaCode", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelRailRoadLoadingAreaCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelRailRoadLoadingAreaCode_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShiftDayPlanId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelShiftDayPlanId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelShiftDayPlanId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkShiftId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelWorkShiftId(String value) {
        return new JAXBElement<String>(_CargoOnDateTableModelWorkShiftId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantId", scope = PortShiftDayPlanModel.class)
    public JAXBElement<String> createPortShiftDayPlanModelWorkVariantId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWorkVariantId_QNAME, String.class, PortShiftDayPlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Agent", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelAgent(String value) {
        return new JAXBElement<String>(_PortRequestTransModelAgent_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementClassification", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelAgreementClassification(String value) {
        return new JAXBElement<String>(_PortRequestTransModelAgreementClassification_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelAgreementId(String value) {
        return new JAXBElement<String>(_AdditionalWorkAgreementId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Consignee", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelConsignee(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelConsignee_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ConsigneeCountryRegionId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelConsigneeCountryRegionId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelConsigneeCountryRegionId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ContainerType", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelContainerType(String value) {
        return new JAXBElement<String>(_PortRequestTransModelContainerType_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Createdby", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelCreatedby(String value) {
        return new JAXBElement<String>(_PortRequestTransModelCreatedby_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DangerClassid", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelDangerClassid(String value) {
        return new JAXBElement<String>(_PortRequestTransModelDangerClassid_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Forwarder", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelForwarder(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelForwarder_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "GrossRateId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelGrossRateId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelGrossRateId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventDimId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelInventDimId(String value) {
        return new JAXBElement<String>(_InventSumInventDimId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemIdService", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelItemIdService(String value) {
        return new JAXBElement<String>(_PortRequestTransModelItemIdService_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LoadingArea", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelLoadingArea(String value) {
        return new JAXBElement<String>(_PortRequestTransModelLoadingArea_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LocationId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelLocationId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelLocationId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Modifiedby", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelModifiedby(String value) {
        return new JAXBElement<String>(_PortRequestTransModelModifiedby_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Note", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelNote(String value) {
        return new JAXBElement<String>(_PortRequestTransModelNote_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NoteLc", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelNoteLc(String value) {
        return new JAXBElement<String>(_PortRequestTransModelNoteLc_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NoteShip", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelNoteShip(String value) {
        return new JAXBElement<String>(_PortRequestTransModelNoteShip_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PierCode", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelPierCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelPierCode_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortCodeFrom", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelPortCodeFrom(String value) {
        return new JAXBElement<String>(_PortRequestTransModelPortCodeFrom_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortCodeTo", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelPortCodeTo(String value) {
        return new JAXBElement<String>(_PortRequestTransModelPortCodeTo_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortDestination", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelPortDestination(String value) {
        return new JAXBElement<String>(_PortRequestTransModelPortDestination_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReceiptId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelReceiptId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelReceiptId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Sequence", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelSequence(String value) {
        return new JAXBElement<String>(_PortRequestTransModelSequence_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Shipper", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelShipper(String value) {
        return new JAXBElement<String>(_PortRequestTransModelShipper_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipperCountryRegionId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelShipperCountryRegionId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelShipperCountryRegionId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipperSmg", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelShipperSmg(String value) {
        return new JAXBElement<String>(_PortRequestTransModelShipperSmg_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SiteId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelSiteId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelSiteId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "StationCode", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelStationCode(String value) {
        return new JAXBElement<String>(_PortRequestTransModelStationCode_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "StatusStr", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelStatusStr(String value) {
        return new JAXBElement<String>(_PortRequestTransModelStatusStr_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Teu", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelTeu(String value) {
        return new JAXBElement<String>(_PortRequestTransModelTeu_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ToInventDimId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelToInventDimId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelToInventDimId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitVolume", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelUnitVolume(String value) {
        return new JAXBElement<String>(_PortRequestTransModelUnitVolume_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitWeight", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelUnitWeight(String value) {
        return new JAXBElement<String>(_PortRequestTransModelUnitWeight_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WagonType", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelWagonType(String value) {
        return new JAXBElement<String>(_PortRequestTransModelWagonType_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantId", scope = PortRequestTransModel.class)
    public JAXBElement<String> createPortRequestTransModelWorkVariantId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWorkVariantId_QNAME, String.class, PortRequestTransModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Agent", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelAgent(String value) {
        return new JAXBElement<String>(_PortRequestTransModelAgent_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementId", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelAgreementId(String value) {
        return new JAXBElement<String>(_AdditionalWorkAgreementId_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ChangedRequestId", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelChangedRequestId(String value) {
        return new JAXBElement<String>(_PortRequestTableModelChangedRequestId_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Comment", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelComment(String value) {
        return new JAXBElement<String>(_AcceptanceActModelComment_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ContactPersonId", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelContactPersonId(String value) {
        return new JAXBElement<String>(_PortRequestTableModelContactPersonId_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustAccount", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelCustAccount(String value) {
        return new JAXBElement<String>(_AdditionalWorkCustAccount_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Forwarder", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelForwarder(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelForwarder_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ImoCodeNotice", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelImoCodeNotice(String value) {
        return new JAXBElement<String>(_PortRequestTableModelImoCodeNotice_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "MainRequestId", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelMainRequestId(String value) {
        return new JAXBElement<String>(_PortRequestTableModelMainRequestId_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableContainer", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelNavigableContainer(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableContainer_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableExport", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelNavigableExport(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableExport_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableImport", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelNavigableImport(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableImport_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NoteCargo", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelNoteCargo(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNoteCargo_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "OrderNum", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelOrderNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkOrderNum_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortRequestComment", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelPortRequestComment(String value) {
        return new JAXBElement<String>(_PortRequestTableModelPortRequestComment_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTransModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortRequestTranses", scope = PortRequestTableModel.class)
    public JAXBElement<ArrayOfPortRequestTransModel> createPortRequestTableModelPortRequestTranses(ArrayOfPortRequestTransModel value) {
        return new JAXBElement<ArrayOfPortRequestTransModel>(_PortRequestTableModelPortRequestTranses_QNAME, ArrayOfPortRequestTransModel.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RailRoadWagons", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelRailRoadWagons(String value) {
        return new JAXBElement<String>(_PortRequestTableModelRailRoadWagons_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RailRoadWagons1", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelRailRoadWagons1(String value) {
        return new JAXBElement<String>(_PortRequestTableModelRailRoadWagons1_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Reason", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelReason(String value) {
        return new JAXBElement<String>(_PortRequestTableModelReason_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RejectReason", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelRejectReason(String value) {
        return new JAXBElement<String>(_PortRequestTableModelRejectReason_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestIdNominChange", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelRequestIdNominChange(String value) {
        return new JAXBElement<String>(_PortRequestTableModelRequestIdNominChange_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestIdSmg", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelRequestIdSmg(String value) {
        return new JAXBElement<String>(_PortRequestTableModelRequestIdSmg_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCodeNotice", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelShipCodeNotice(String value) {
        return new JAXBElement<String>(_PortRequestTableModelShipCodeNotice_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipNameNotice", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelShipNameNotice(String value) {
        return new JAXBElement<String>(_PortRequestTableModelShipNameNotice_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Shipper", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelShipper(String value) {
        return new JAXBElement<String>(_PortRequestTransModelShipper_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "StatusRzd", scope = PortRequestTableModel.class)
    public JAXBElement<String> createPortRequestTableModelStatusRzd(String value) {
        return new JAXBElement<String>(_PortRequestTableModelStatusRzd_QNAME, String.class, PortRequestTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AccountNum", scope = InventOwnerModel.class)
    public JAXBElement<String> createInventOwnerModelAccountNum(String value) {
        return new JAXBElement<String>(_ClientListModelAccountNum_QNAME, String.class, InventOwnerModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AccountNumRelated", scope = InventOwnerModel.class)
    public JAXBElement<String> createInventOwnerModelAccountNumRelated(String value) {
        return new JAXBElement<String>(_InventOwnerModelAccountNumRelated_QNAME, String.class, InventOwnerModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventOwnerId", scope = InventOwnerModel.class)
    public JAXBElement<String> createInventOwnerModelInventOwnerId(String value) {
        return new JAXBElement<String>(_InventOwnerModelInventOwnerId_QNAME, String.class, InventOwnerModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BuyingLegalentity", scope = AgreementHeaderModel.class)
    public JAXBElement<Long> createAgreementHeaderModelBuyingLegalentity(Long value) {
        return new JAXBElement<Long>(_AgreementHeaderModelBuyingLegalentity_QNAME, Long.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Currency", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelCurrency(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelCurrency_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustAccount", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelCustAccount(String value) {
        return new JAXBElement<String>(_AdditionalWorkCustAccount_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustomerDataAreaId", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelCustomerDataAreaId(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelCustomerDataAreaId_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DocumentExternalReference", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelDocumentExternalReference(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelDocumentExternalReference_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DocumentTitle", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelDocumentTitle(String value) {
        return new JAXBElement<String>(_AdditionalWorkDocumentTitle_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InterestBasedOnCebPsn", scope = AgreementHeaderModel.class)
    public JAXBElement<Integer> createAgreementHeaderModelInterestBasedOnCebPsn(Integer value) {
        return new JAXBElement<Integer>(_AgreementHeaderModelInterestBasedOnCebPsn_QNAME, Integer.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Language", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelLanguage(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelLanguage_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "MaximumAmountPsn", scope = AgreementHeaderModel.class)
    public JAXBElement<BigDecimal> createAgreementHeaderModelMaximumAmountPsn(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AgreementHeaderModelMaximumAmountPsn_QNAME, BigDecimal.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "MinimumAmountPsn", scope = AgreementHeaderModel.class)
    public JAXBElement<BigDecimal> createAgreementHeaderModelMinimumAmountPsn(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AgreementHeaderModelMinimumAmountPsn_QNAME, BigDecimal.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ParentPurchAgreementidPsn", scope = AgreementHeaderModel.class)
    public JAXBElement<Long> createAgreementHeaderModelParentPurchAgreementidPsn(Long value) {
        return new JAXBElement<Long>(_AgreementHeaderModelParentPurchAgreementidPsn_QNAME, Long.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ProcurementClassificationPsn", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelProcurementClassificationPsn(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelProcurementClassificationPsn_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PurchAgreementTypePsn", scope = AgreementHeaderModel.class)
    public JAXBElement<Integer> createAgreementHeaderModelPurchAgreementTypePsn(Integer value) {
        return new JAXBElement<Integer>(_AgreementHeaderModelPurchAgreementTypePsn_QNAME, Integer.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PurchNumberSequence", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelPurchNumberSequence(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelPurchNumberSequence_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PurposePsn", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelPurposePsn(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelPurposePsn_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RenewablePsn", scope = AgreementHeaderModel.class)
    public JAXBElement<Integer> createAgreementHeaderModelRenewablePsn(Integer value) {
        return new JAXBElement<Integer>(_AgreementHeaderModelRenewablePsn_QNAME, Integer.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SalesNumberSequence", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelSalesNumberSequence(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelSalesNumberSequence_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SellingleGalentity", scope = AgreementHeaderModel.class)
    public JAXBElement<Long> createAgreementHeaderModelSellingleGalentity(Long value) {
        return new JAXBElement<Long>(_AgreementHeaderModelSellingleGalentity_QNAME, Long.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VendAccount", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelVendAccount(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelVendAccount_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VendorDataareaId", scope = AgreementHeaderModel.class)
    public JAXBElement<String> createAgreementHeaderModelVendorDataareaId(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelVendorDataareaId_QNAME, String.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkFlowStatusPsn", scope = AgreementHeaderModel.class)
    public JAXBElement<Integer> createAgreementHeaderModelWorkFlowStatusPsn(Integer value) {
        return new JAXBElement<Integer>(_AgreementHeaderModelWorkFlowStatusPsn_QNAME, Integer.class, AgreementHeaderModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CallSign", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelCallSign(String value) {
        return new JAXBElement<String>(_PortShipTableModelCallSign_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CountryRegionId", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelCountryRegionId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCountryRegionId_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustAccount", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelCustAccount(String value) {
        return new JAXBElement<String>(_AdditionalWorkCustAccount_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "HoistingEquipment", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelHoistingEquipment(String value) {
        return new JAXBElement<String>(_PortShipTableModelHoistingEquipment_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ImoCode", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelImoCode(String value) {
        return new JAXBElement<String>(_PortShipTableModelImoCode_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NameEnglish", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelNameEnglish(String value) {
        return new JAXBElement<String>(_AdditionalWorkNameEnglish_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Ship", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelShip(String value) {
        return new JAXBElement<String>(_PortShipTableModelShip_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipGroup", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelShipGroup(String value) {
        return new JAXBElement<String>(_PortShipTableModelShipGroup_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipType", scope = PortShipTableModel.class)
    public JAXBElement<String> createPortShipTableModelShipType(String value) {
        return new JAXBElement<String>(_PortShipTableModelShipType_QNAME, String.class, PortShipTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Berth", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentBerth(String value) {
        return new JAXBElement<String>(_PortEquipmentBerth_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Comment", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentComment(String value) {
        return new JAXBElement<String>(_AcceptanceActModelComment_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Equipment", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentEquipment(String value) {
        return new JAXBElement<String>(_PortEquipmentEquipment_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentModel", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentEquipmentModel(String value) {
        return new JAXBElement<String>(_PortEquipmentEquipmentModel_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "FleetNumber", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentFleetNumber(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelFleetNumber_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Pier", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentPier(String value) {
        return new JAXBElement<String>(_PortEquipmentPier_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "StockNumber", scope = PortEquipment.class)
    public JAXBElement<String> createPortEquipmentStockNumber(String value) {
        return new JAXBElement<String>(_PortEquipmentStockNumber_QNAME, String.class, PortEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortEquipmentModel.class)
    public JAXBElement<String> createPortEquipmentModelDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentGroup", scope = PortEquipmentModel.class)
    public JAXBElement<String> createPortEquipmentModelEquipmentGroup(String value) {
        return new JAXBElement<String>(_PortEquipmentModelEquipmentGroup_QNAME, String.class, PortEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentModel", scope = PortEquipmentModel.class)
    public JAXBElement<String> createPortEquipmentModelEquipmentModel(String value) {
        return new JAXBElement<String>(_PortEquipmentEquipmentModel_QNAME, String.class, PortEquipmentModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortEquipmentGroup.class)
    public JAXBElement<String> createPortEquipmentGroupDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortEquipmentGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentGroup", scope = PortEquipmentGroup.class)
    public JAXBElement<String> createPortEquipmentGroupEquipmentGroup(String value) {
        return new JAXBElement<String>(_PortEquipmentModelEquipmentGroup_QNAME, String.class, PortEquipmentGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EquipmentGroupParent", scope = PortEquipmentGroup.class)
    public JAXBElement<String> createPortEquipmentGroupEquipmentGroupParent(String value) {
        return new JAXBElement<String>(_PortEquipmentGroupEquipmentGroupParent_QNAME, String.class, PortEquipmentGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NameAlias", scope = PortEquipmentGroup.class)
    public JAXBElement<String> createPortEquipmentGroupNameAlias(String value) {
        return new JAXBElement<String>(_AdditionalWorkNameAlias_QNAME, String.class, PortEquipmentGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ActivityType_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationActivityTypeRU(String value) {
        return new JAXBElement<String>(_InventLocationActivityTypeRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BranchNumber", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationBranchNumber(String value) {
        return new JAXBElement<String>(_InventLocationBranchNumber_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustAccount_BR", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationCustAccountBR(String value) {
        return new JAXBElement<String>(_InventLocationCustAccountBR_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustAccount_HU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationCustAccountHU(String value) {
        return new JAXBElement<String>(_InventLocationCustAccountHU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DefaultKanbanFinishedGoodsLocation", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationDefaultKanbanFinishedGoodsLocation(String value) {
        return new JAXBElement<String>(_InventLocationDefaultKanbanFinishedGoodsLocation_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DefaultProductionFINISHGoodsLocation", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationDefaultProductionFINISHGoodsLocation(String value) {
        return new JAXBElement<String>(_InventLocationDefaultProductionFINISHGoodsLocation_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DefaultShipMaintenanceLoc", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationDefaultShipMaintenanceLoc(String value) {
        return new JAXBElement<String>(_InventLocationDefaultShipMaintenanceLoc_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DefaultStatusId", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationDefaultStatusId(String value) {
        return new JAXBElement<String>(_InventLocationDefaultStatusId_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EmptyPalletLocation", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationEmptyPalletLocation(String value) {
        return new JAXBElement<String>(_InventLocationEmptyPalletLocation_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdGoodsInRoute_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventLocationIdGoodsInRouteRU(String value) {
        return new JAXBElement<String>(_InventLocationInventLocationIdGoodsInRouteRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdQuarantine", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventLocationIdQuarantine(String value) {
        return new JAXBElement<String>(_InventLocationInventLocationIdQuarantine_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdReqMain", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventLocationIdReqMain(String value) {
        return new JAXBElement<String>(_InventLocationInventLocationIdReqMain_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdTransit", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventLocationIdTransit(String value) {
        return new JAXBElement<String>(_InventLocationInventLocationIdTransit_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventProfileId_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventProfileIdRU(String value) {
        return new JAXBElement<String>(_InventDimInventProfileIdRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteId", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationInventSiteId(String value) {
        return new JAXBElement<String>(_InventDimInventSiteId_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NumberSequenceGroup_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationNumberSequenceGroupRU(String value) {
        return new JAXBElement<String>(_InventLocationNumberSequenceGroupRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Pier", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationPier(String value) {
        return new JAXBElement<String>(_PortEquipmentPier_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RboDefaultInventProfileId_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationRboDefaultInventProfileIdRU(String value) {
        return new JAXBElement<String>(_InventLocationRboDefaultInventProfileIdRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RboDefaultWmsLocationId", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationRboDefaultWmsLocationId(String value) {
        return new JAXBElement<String>(_InventLocationRboDefaultWmsLocationId_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RboDefaultWmsPalletId", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationRboDefaultWmsPalletId(String value) {
        return new JAXBElement<String>(_InventLocationRboDefaultWmsPalletId_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReqCalendarId", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationReqCalendarId(String value) {
        return new JAXBElement<String>(_InventLocationReqCalendarId_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RetailWmsLocationIdDefaultReturn", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationRetailWmsLocationIdDefaultReturn(String value) {
        return new JAXBElement<String>(_InventLocationRetailWmsLocationIdDefaultReturn_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RetailWmsPalletIdDefaultReturn", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationRetailWmsPalletIdDefaultReturn(String value) {
        return new JAXBElement<String>(_InventLocationRetailWmsPalletIdDefaultReturn_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VendAccount", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationVendAccount(String value) {
        return new JAXBElement<String>(_AgreementHeaderModelVendAccount_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VendAccountCustom_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationVendAccountCustomRU(String value) {
        return new JAXBElement<String>(_InventLocationVendAccountCustomRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLevelFormat", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationWmsLevelFormat(String value) {
        return new JAXBElement<String>(_InventLocationWmsLevelFormat_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLocationIdDefaultIssue", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationWmsLocationIdDefaultIssue(String value) {
        return new JAXBElement<String>(_InventLocationWmsLocationIdDefaultIssue_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLocationIdDefaultReceipt", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationWmsLocationIdDefaultReceipt(String value) {
        return new JAXBElement<String>(_InventLocationWmsLocationIdDefaultReceipt_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLocationIdGoodsInRoute_RU", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationWmsLocationIdGoodsInRouteRU(String value) {
        return new JAXBElement<String>(_InventLocationWmsLocationIdGoodsInRouteRU_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsPositionFormat", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationWmsPositionFormat(String value) {
        return new JAXBElement<String>(_InventLocationWmsPositionFormat_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsRackFormat", scope = InventLocation.class)
    public JAXBElement<String> createInventLocationWmsRackFormat(String value) {
        return new JAXBElement<String>(_InventLocationWmsRackFormat_QNAME, String.class, InventLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AisleId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationAisleId(String value) {
        return new JAXBElement<String>(_WMSLocationAisleId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CheckText", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationCheckText(String value) {
        return new JAXBElement<String>(_WMSLocationCheckText_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InputBlockingCauseId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationInputBlockingCauseId(String value) {
        return new JAXBElement<String>(_WMSLocationInputBlockingCauseId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InputLocation", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationInputLocation(String value) {
        return new JAXBElement<String>(_WMSLocationInputLocation_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LocProfileId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationLocProfileId(String value) {
        return new JAXBElement<String>(_WMSLocationLocProfileId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "OutputBlockingCauseId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationOutputBlockingCauseId(String value) {
        return new JAXBElement<String>(_WMSLocationOutputBlockingCauseId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PalletTypeGroupId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationPalletTypeGroupId(String value) {
        return new JAXBElement<String>(_WMSLocationPalletTypeGroupId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PickingAreaId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationPickingAreaId(String value) {
        return new JAXBElement<String>(_WMSLocationPickingAreaId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "StoreAreaId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationStoreAreaId(String value) {
        return new JAXBElement<String>(_WMSLocationStoreAreaId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSLocationId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationWMSLocationId(String value) {
        return new JAXBElement<String>(_InventDimWMSLocationId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ZoneId", scope = WMSLocation.class)
    public JAXBElement<String> createWMSLocationZoneId(String value) {
        return new JAXBElement<String>(_WMSLocationZoneId_QNAME, String.class, WMSLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Mesto", scope = PlanTableModel.class)
    public JAXBElement<String> createPlanTableModelMesto(String value) {
        return new JAXBElement<String>(_PlanTableModelMesto_QNAME, String.class, PlanTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PkVag", scope = PlanTableModel.class)
    public JAXBElement<String> createPlanTableModelPkVag(String value) {
        return new JAXBElement<String>(_PlanTableModelPkVag_QNAME, String.class, PlanTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Put", scope = PlanTableModel.class)
    public JAXBElement<String> createPlanTableModelPut(String value) {
        return new JAXBElement<String>(_PlanTableModelPut_QNAME, String.class, PlanTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VagStatus", scope = PlanTableModel.class)
    public JAXBElement<String> createPlanTableModelVagStatus(String value) {
        return new JAXBElement<String>(_PlanTableModelVagStatus_QNAME, String.class, PlanTableModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = EcoresCategoryHierarchy.class)
    public JAXBElement<String> createEcoresCategoryHierarchyCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, EcoresCategoryHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = EcoresCategoryHierarchy.class)
    public JAXBElement<String> createEcoresCategoryHierarchyModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, EcoresCategoryHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = EcoresCategoryHierarchy.class)
    public JAXBElement<String> createEcoresCategoryHierarchyName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, EcoresCategoryHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Berth", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTableBerth(String value) {
        return new JAXBElement<String>(_PortEquipmentBerth_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTableCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTableDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Destination", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTableDestination(String value) {
        return new JAXBElement<String>(_PortBerthTableDestination_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTableInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTableModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Pier", scope = PortBerthTable.class)
    public JAXBElement<String> createPortBerthTablePier(String value) {
        return new JAXBElement<String>(_PortEquipmentPier_QNAME, String.class, PortBerthTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortTimeSheetOperation.class)
    public JAXBElement<String> createPortTimeSheetOperationCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortTimeSheetOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortTimeSheetOperation.class)
    public JAXBElement<String> createPortTimeSheetOperationDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortTimeSheetOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortTimeSheetOperation.class)
    public JAXBElement<String> createPortTimeSheetOperationModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortTimeSheetOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = PortTimeSheetOperation.class)
    public JAXBElement<String> createPortTimeSheetOperationName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, PortTimeSheetOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimesheetOperationsId", scope = PortTimeSheetOperation.class)
    public JAXBElement<String> createPortTimeSheetOperationTimesheetOperationsId(String value) {
        return new JAXBElement<String>(_PortTimeSheetOperationTimesheetOperationsId_QNAME, String.class, PortTimeSheetOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AcceptanceActNum", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransAcceptanceActNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkAcceptanceActNum_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementNum", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransAgreementNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransAgreementNum_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementOutFit", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransAgreementOutFit(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransAgreementOutFit_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLadingId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransBillOfLadingId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransBillOfLadingId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLadingJourNum", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransBillOfLadingJourNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransBillOfLadingJourNum_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLadingTransDescription", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransBillOfLadingTransDescription(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransBillOfLadingTransDescription_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoTallyReceiptJournalTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoTallyReceiptJournalTable", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<CargoTallyReceiptJournalTable> createCargoTallyReceiptJournalTransCargoTallyReceiptJournalTable(CargoTallyReceiptJournalTable value) {
        return new JAXBElement<CargoTallyReceiptJournalTable>(_CargoTallyReceiptJournalTable_QNAME, CargoTallyReceiptJournalTable.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ContainerNum", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransContainerNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransContainerNum_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustomsDeclarationList", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransCustomsDeclarationList(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCustomsDeclarationList_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DescriptionAttr", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransDescriptionAttr(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransDescriptionAttr_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresItemLabelName", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransEcoresItemLabelName(String value) {
        return new JAXBElement<String>(_CargoOnDateTransModelEcoresItemLabelName_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresItemSizeName", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransEcoresItemSizeName(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransEcoresItemSizeName_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ExportInventTransId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransExportInventTransId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransExportInventTransId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventBatchId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransInventBatchId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeInventBatchId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventDimId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransInventDimId(String value) {
        return new JAXBElement<String>(_InventSumInventDimId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdFact", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransInventLocationIdFact(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInventLocationIdFact_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationIdPlan", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransInventLocationIdPlan(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransInventLocationIdPlan_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteIdFact", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransInventSiteIdFact(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelInventSiteIdFact_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteIdPlan", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransInventSiteIdPlan(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransInventSiteIdPlan_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "MovementInventTransId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransMovementInventTransId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransMovementInventTransId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NumberPlace", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransNumberPlace(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransNumberPlace_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PlumbsJournalTransId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransPlumbsJournalTransId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransPlumbsJournalTransId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReceiptId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransReceiptId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelReceiptId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShiftDayPlanId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransShiftDayPlanId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanFactEquipmentModelShiftDayPlanId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ToInventDimId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransToInventDimId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelToInventDimId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TransferInventTransId", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransTransferInventTransId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransTransferInventTransId_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitOfMeasureQTYPCS", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransUnitOfMeasureQTYPCS(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransUnitOfMeasureQTYPCS_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitPackagingType", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransUnitPackagingType(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransUnitPackagingType_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitWeight", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransUnitWeight(String value) {
        return new JAXBElement<String>(_PortRequestTransModelUnitWeight_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSLocationIdFact", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransWMSLocationIdFact(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransWMSLocationIdFact_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSLocationIdPlan", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransWMSLocationIdPlan(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransWMSLocationIdPlan_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSPalletFact", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransWMSPalletFact(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransWMSPalletFact_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WMSPalletPlan", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransWMSPalletPlan(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransWMSPalletPlan_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WagonCode", scope = CargoTallyReceiptJournalTrans.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTransWagonCode(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWagonCode_QNAME, String.class, CargoTallyReceiptJournalTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AcceptanceAct", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableAcceptanceAct(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableAcceptanceAct_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BrigadeId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableBrigadeId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableBrigadeId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoTallyReceiptJournalTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoTallyReceiptJournalTranses", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<ArrayOfCargoTallyReceiptJournalTrans> createCargoTallyReceiptJournalTableCargoTallyReceiptJournalTranses(ArrayOfCargoTallyReceiptJournalTrans value) {
        return new JAXBElement<ArrayOfCargoTallyReceiptJournalTrans>(_CargoTallyReceiptJournalTableCargoTallyReceiptJournalTranses_QNAME, ArrayOfCargoTallyReceiptJournalTrans.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ControlCode", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableControlCode(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableControlCode_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DocumentNum", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableDocumentNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableDocumentNum_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ExportJournalId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableExportJournalId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableExportJournalId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventsiteId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableInventsiteId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelInventsiteId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LoadedListId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableLoadedListId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableLoadedListId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "MovementJournalId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableMovementJournalId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableMovementJournalId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableExport", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableNavigableExport(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableExport_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableImport", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableNavigableImport(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableImport_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PostedUserId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTablePostedUserId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTablePostedUserId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReceiptId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableReceiptId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelReceiptId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReceiptIdCreated", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableReceiptIdCreated(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableReceiptIdCreated_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCodeTo", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableShipCodeTo(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableShipCodeTo_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipHoldNumberId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableShipHoldNumberId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableShipHoldNumberId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipNameTo", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableShipNameTo(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableShipNameTo_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TransferJournalId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableTransferJournalId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableTransferJournalId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UsedEquipment", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableUsedEquipment(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableUsedEquipment_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkShiftId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableWorkShiftId(String value) {
        return new JAXBElement<String>(_CargoOnDateTableModelWorkShiftId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantId", scope = CargoTallyReceiptJournalTable.class)
    public JAXBElement<String> createCargoTallyReceiptJournalTableWorkVariantId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWorkVariantId_QNAME, String.class, CargoTallyReceiptJournalTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Code", scope = EcoresCategory.class)
    public JAXBElement<String> createEcoresCategoryCode(String value) {
        return new JAXBElement<String>(_EcoresCategoryCode_QNAME, String.class, EcoresCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = EcoresCategory.class)
    public JAXBElement<String> createEcoresCategoryCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, EcoresCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = EcoresCategory.class)
    public JAXBElement<String> createEcoresCategoryModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, EcoresCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Name", scope = EcoresCategory.class)
    public JAXBElement<String> createEcoresCategoryName(String value) {
        return new JAXBElement<String>(_AdditionalWorkName_QNAME, String.class, EcoresCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PkwiuCode", scope = EcoresCategory.class)
    public JAXBElement<String> createEcoresCategoryPkwiuCode(String value) {
        return new JAXBElement<String>(_EcoresCategoryPkwiuCode_QNAME, String.class, EcoresCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ReuseEnabled", scope = EcoresCategory.class)
    public JAXBElement<Integer> createEcoresCategoryReuseEnabled(Integer value) {
        return new JAXBElement<Integer>(_EcoresCategoryReuseEnabled_QNAME, Integer.class, EcoresCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Agent", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelAgent(String value) {
        return new JAXBElement<String>(_PortRequestTransModelAgent_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgentName", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelAgentName(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelAgentName_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresCategoryCode", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelEcoresCategoryCode(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelEcoresCategoryCode_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoresCategoryName", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelEcoresCategoryName(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelEcoresCategoryName_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventsiteId", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelInventsiteId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelInventsiteId_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventsiteShortName", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelInventsiteShortName(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelInventsiteShortName_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableId", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelNavigableId(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelNavigableId_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "OperationTypeTxt", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelOperationTypeTxt(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelOperationTypeTxt_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ProcessConditionsTxt", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelProcessConditionsTxt(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelProcessConditionsTxt_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Shipcode", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelShipcode(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelShipcode_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimesheetId", scope = DispatcherSummaryModel.class)
    public JAXBElement<String> createDispatcherSummaryModelTimesheetId(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelTimesheetId_QNAME, String.class, DispatcherSummaryModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortPierModel.class)
    public JAXBElement<String> createPortPierModelDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortPierModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventSiteId", scope = PortPierModel.class)
    public JAXBElement<String> createPortPierModelInventSiteId(String value) {
        return new JAXBElement<String>(_InventDimInventSiteId_QNAME, String.class, PortPierModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Pier", scope = PortPierModel.class)
    public JAXBElement<String> createPortPierModelPier(String value) {
        return new JAXBElement<String>(_PortEquipmentPier_QNAME, String.class, PortPierModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementClassification", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetAgreementClassification(String value) {
        return new JAXBElement<String>(_PortRequestTransModelAgreementClassification_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementId", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetAgreementId(String value) {
        return new JAXBElement<String>(_AdditionalWorkAgreementId_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DataAreaId", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetDataAreaId(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetDataAreaId_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoResCategoryComModityCode", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetEcoResCategoryComModityCode(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetEcoResCategoryComModityCode_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Forwarder", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetForwarder(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelForwarder_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "GrossRateId", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetGrossRateId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelGrossRateId_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimeSheetId", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetTimeSheetId(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetTimeSheetId_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitOfMeas", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetUnitOfMeas(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetUnitOfMeas_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitOfMeasureSymbol", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetUnitOfMeasureSymbol(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetUnitOfMeasureSymbol_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitPackagingType", scope = PortCargoTimeSheet.class)
    public JAXBElement<String> createPortCargoTimeSheetUnitPackagingType(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransUnitPackagingType_QNAME, String.class, PortCargoTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoForGrossNorms", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetCargoForGrossNorms(String value) {
        return new JAXBElement<String>(_PortTransactionsTimeSheetCargoForGrossNorms_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DowntimeReason", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetDowntimeReason(String value) {
        return new JAXBElement<String>(_PortTransactionsTimeSheetDowntimeReason_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Modifiedby", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetModifiedby(String value) {
        return new JAXBElement<String>(_PortRequestTransModelModifiedby_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Notes", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetNotes(String value) {
        return new JAXBElement<String>(_PortTransactionsTimeSheetNotes_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "OldEcoresCategoryId", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetOldEcoresCategoryId(String value) {
        return new JAXBElement<String>(_PortTransactionsTimeSheetOldEcoresCategoryId_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimesheetId", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetTimesheetId(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelTimesheetId_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimesheetOperationsId", scope = PortTransactionsTimeSheet.class)
    public JAXBElement<String> createPortTransactionsTimeSheetTimesheetOperationsId(String value) {
        return new JAXBElement<String>(_PortTimeSheetOperationTimesheetOperationsId_QNAME, String.class, PortTransactionsTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = PortMooringOperation.class)
    public JAXBElement<String> createPortMooringOperationBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, PortMooringOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortMooringOperation.class)
    public JAXBElement<String> createPortMooringOperationCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortMooringOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortMooringOperation.class)
    public JAXBElement<String> createPortMooringOperationModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortMooringOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimesheetId", scope = PortMooringOperation.class)
    public JAXBElement<String> createPortMooringOperationTimesheetId(String value) {
        return new JAXBElement<String>(_DispatcherSummaryModelTimesheetId_QNAME, String.class, PortMooringOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Agent", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetAgent(String value) {
        return new JAXBElement<String>(_PortRequestTransModelAgent_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BerthCode", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetBerthCode(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelBerthCode_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoLiftingMechanism", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetCargoLiftingMechanism(String value) {
        return new JAXBElement<String>(_PortTimeSheetCargoLiftingMechanism_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CountryRegionId", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetCountryRegionId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCountryRegionId_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CreatedBy", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetCreatedBy(String value) {
        return new JAXBElement<String>(_AdditionalWorkCreatedBy_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DataAreaId", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetDataAreaId(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetDataAreaId_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventJournalId", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetInventJournalId(String value) {
        return new JAXBElement<String>(_PortTimeSheetInventJournalId_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ModifiedBy", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetModifiedBy(String value) {
        return new JAXBElement<String>(_InventDimModifiedBy_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NoteCargo", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetNoteCargo(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNoteCargo_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortMooringOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortMooringOperations", scope = PortTimeSheet.class)
    public JAXBElement<ArrayOfPortMooringOperation> createPortTimeSheetPortMooringOperations(ArrayOfPortMooringOperation value) {
        return new JAXBElement<ArrayOfPortMooringOperation>(_PortTimeSheetPortMooringOperations_QNAME, ArrayOfPortMooringOperation.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTransactionsTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortTransactionsTimeSheets", scope = PortTimeSheet.class)
    public JAXBElement<ArrayOfPortTransactionsTimeSheet> createPortTimeSheetPortTransactionsTimeSheets(ArrayOfPortTransactionsTimeSheet value) {
        return new JAXBElement<ArrayOfPortTransactionsTimeSheet>(_PortTimeSheetPortTransactionsTimeSheets_QNAME, ArrayOfPortTransactionsTimeSheet.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipGroupCode", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetShipGroupCode(String value) {
        return new JAXBElement<String>(_PortTimeSheetShipGroupCode_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipNameEnglish", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetShipNameEnglish(String value) {
        return new JAXBElement<String>(_PortTimeSheetShipNameEnglish_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TimeSheetId", scope = PortTimeSheet.class)
    public JAXBElement<String> createPortTimeSheetTimeSheetId(String value) {
        return new JAXBElement<String>(_PortCargoTimeSheetTimeSheetId_QNAME, String.class, PortTimeSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AcceptanceActNum", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransAcceptanceActNum(String value) {
        return new JAXBElement<String>(_AdditionalWorkAcceptanceActNum_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementNum", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransAgreementNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransAgreementNum_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "AgreementOutfit", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransAgreementOutfit(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransAgreementOutfit_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLadingId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransBillOfLadingId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransBillOfLadingId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BrigadeId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransBrigadeId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableBrigadeId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoDetailedPlanJour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoDetailedPlanJour", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<CargoDetailedPlanJour> createCargoDetailedPlanTransCargoDetailedPlanJour(CargoDetailedPlanJour value) {
        return new JAXBElement<CargoDetailedPlanJour>(_CargoDetailedPlanJour_QNAME, CargoDetailedPlanJour.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Consignee", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransConsignee(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelConsignee_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Consignor", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransConsignor(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransConsignor_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ConsignorName", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransConsignorName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransConsignorName_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ContainerNum", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransContainerNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransContainerNum_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CountryregionId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransCountryregionId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransCountryregionId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CustomsDeclarationList", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransCustomsDeclarationList(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCustomsDeclarationList_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DescriptionAttr", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransDescriptionAttr(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransDescriptionAttr_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DetailedplanId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransDetailedplanId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransDetailedplanId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoResItemLabelName", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransEcoResItemLabelName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransEcoResItemLabelName_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "EcoResItemSizeName", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransEcoResItemSizeName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransEcoResItemSizeName_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Identifier", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransIdentifier(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransIdentifier_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventJournalIdTransfer", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransInventJournalIdTransfer(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransInventJournalIdTransfer_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationidFact", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransInventLocationidFact(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransInventLocationidFact_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InvoiceId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransInvoiceId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelInvoiceId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NumberPlace", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransNumberPlace(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransNumberPlace_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransRequestId(String value) {
        return new JAXBElement<String>(_AdditionalWorkRequestId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipBatchNum", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransShipBatchNum(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransShipBatchNum_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SiteId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransSiteId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelSiteId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SiteIdFact", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransSiteIdFact(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransSiteIdFact_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SizeBatchAttribEnumValue", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransSizeBatchAttribEnumValue(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransSizeBatchAttribEnumValue_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TechnicalDefectDescription", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransTechnicalDefectDescription(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransTechnicalDefectDescription_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TransId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransTransId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransTransId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitOfMeasureQtyPcs", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransUnitOfMeasureQtyPcs(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransUnitOfMeasureQtyPcs_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitPackagingType", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransUnitPackagingType(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransUnitPackagingType_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitWeight", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransUnitWeight(String value) {
        return new JAXBElement<String>(_PortRequestTransModelUnitWeight_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "VehicleNum", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransVehicleNum(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransVehicleNum_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WeightBatchAttribEnumValue", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransWeightBatchAttribEnumValue(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransWeightBatchAttribEnumValue_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLocationId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransWmsLocationId(String value) {
        return new JAXBElement<String>(_CargoOnDateTableModelWmsLocationId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsLocationIdFact", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransWmsLocationIdFact(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransWmsLocationIdFact_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsPalletId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransWmsPalletId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransWmsPalletId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WmsPalletIdFact", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransWmsPalletIdFact(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransWmsPalletIdFact_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantId", scope = CargoDetailedPlanTrans.class)
    public JAXBElement<String> createCargoDetailedPlanTransWorkVariantId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWorkVariantId_QNAME, String.class, CargoDetailedPlanTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Berth", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourBerth(String value) {
        return new JAXBElement<String>(_PortEquipmentBerth_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BillOfLadingId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourBillOfLadingId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransBillOfLadingId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoDetailedPlanTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoDetailedPlanTranses", scope = CargoDetailedPlanJour.class)
    public JAXBElement<ArrayOfCargoDetailedPlanTrans> createCargoDetailedPlanJourCargoDetailedPlanTranses(ArrayOfCargoDetailedPlanTrans value) {
        return new JAXBElement<ArrayOfCargoDetailedPlanTrans>(_CargoDetailedPlanJourCargoDetailedPlanTranses_QNAME, ArrayOfCargoDetailedPlanTrans.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CargoProxyId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourCargoProxyId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourCargoProxyId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ClientMessage", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourClientMessage(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourClientMessage_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Consignee", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourConsignee(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelConsignee_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ConsigneeName", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourConsigneeName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourConsigneeName_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Consignor", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourConsignor(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransConsignor_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ConsignorName", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourConsignorName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransConsignorName_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "CountryRegionId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourCountryRegionId(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelCountryRegionId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DetailedPlanId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourDetailedPlanId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourDetailedPlanId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DocumentNum", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourDocumentNum(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableDocumentNum_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "FeaccId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourFeaccId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourFeaccId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Forwarder", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourForwarder(String value) {
        return new JAXBElement<String>(_CargoTransportInvoiceJourModelForwarder_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ForwarderName", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourForwarderName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourForwarderName_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemDT", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourItemDT(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourItemDT_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemDT_E", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourItemDTE(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourItemDTE_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ItemId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourItemId(String value) {
        return new JAXBElement<String>(_PDSBatchAttributeItemId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LetterNum", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourLetterNum(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourLetterNum_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ManifestJournalId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourManifestJournalId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourManifestJournalId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableExport", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourNavigableExport(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableExport_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "NavigableImport", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourNavigableImport(String value) {
        return new JAXBElement<String>(_PortRequestTableModelNavigableImport_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "PortCodeTo", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourPortCodeTo(String value) {
        return new JAXBElement<String>(_PortRequestTransModelPortCodeTo_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestIdNomination", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourRequestIdNomination(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourRequestIdNomination_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestIdPlan", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourRequestIdPlan(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourRequestIdPlan_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "RequestNamePlan", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourRequestNamePlan(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourRequestNamePlan_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SalesAgreementId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourSalesAgreementId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelSalesAgreementId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipBatchNum", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourShipBatchNum(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanTransShipBatchNum_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCode", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourShipCode(String value) {
        return new JAXBElement<String>(_AdditionalWorkShipCode_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipCodeTo", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourShipCodeTo(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableShipCodeTo_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipName", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourShipName(String value) {
        return new JAXBElement<String>(_PortShiftDayPlanModelShipName_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "ShipNameTo", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourShipNameTo(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableShipNameTo_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "SiteId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourSiteId(String value) {
        return new JAXBElement<String>(_PortRequestTransModelSiteId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TrainNum", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourTrainNum(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourTrainNum_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TransportInvoiceId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourTransportInvoiceId(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourTransportInvoiceId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "TransportInvoiceNum", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourTransportInvoiceNum(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourTransportInvoiceNum_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitLength", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourUnitLength(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourUnitLength_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitPackagingType", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourUnitPackagingType(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTransUnitPackagingType_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "UnitWeight", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourUnitWeight(String value) {
        return new JAXBElement<String>(_PortRequestTransModelUnitWeight_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkVariantId", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourWorkVariantId(String value) {
        return new JAXBElement<String>(_ProcessingOfWagonModelWorkVariantId_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "WorkerName", scope = CargoDetailedPlanJour.class)
    public JAXBElement<String> createCargoDetailedPlanJourWorkerName(String value) {
        return new JAXBElement<String>(_CargoDetailedPlanJourWorkerName_QNAME, String.class, CargoDetailedPlanJour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BrigadeId", scope = PortWorkBrigade.class)
    public JAXBElement<String> createPortWorkBrigadeBrigadeId(String value) {
        return new JAXBElement<String>(_CargoTallyReceiptJournalTableBrigadeId_QNAME, String.class, PortWorkBrigade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "BrigadeName", scope = PortWorkBrigade.class)
    public JAXBElement<String> createPortWorkBrigadeBrigadeName(String value) {
        return new JAXBElement<String>(_PortWorkBrigadeBrigadeName_QNAME, String.class, PortWorkBrigade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Comment", scope = PortRailRoadLoadingArea.class)
    public JAXBElement<String> createPortRailRoadLoadingAreaComment(String value) {
        return new JAXBElement<String>(_AcceptanceActModelComment_QNAME, String.class, PortRailRoadLoadingArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = PortRailRoadLoadingArea.class)
    public JAXBElement<String> createPortRailRoadLoadingAreaDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, PortRailRoadLoadingArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "InventLocationId", scope = PortRailRoadLoadingArea.class)
    public JAXBElement<String> createPortRailRoadLoadingAreaInventLocationId(String value) {
        return new JAXBElement<String>(_InventDimInventLocationId_QNAME, String.class, PortRailRoadLoadingArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "LoadingArea", scope = PortRailRoadLoadingArea.class)
    public JAXBElement<String> createPortRailRoadLoadingAreaLoadingArea(String value) {
        return new JAXBElement<String>(_PortRequestTransModelLoadingArea_QNAME, String.class, PortRailRoadLoadingArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Pier", scope = PortRailRoadLoadingArea.class)
    public JAXBElement<String> createPortRailRoadLoadingAreaPier(String value) {
        return new JAXBElement<String>(_PortEquipmentPier_QNAME, String.class, PortRailRoadLoadingArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DefectId", scope = Defect.class)
    public JAXBElement<String> createDefectDefectId(String value) {
        return new JAXBElement<String>(_DefectDefectId_QNAME, String.class, Defect.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "Description", scope = Defect.class)
    public JAXBElement<String> createDefectDescription(String value) {
        return new JAXBElement<String>(_InventBatchDescription_QNAME, String.class, Defect.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", name = "DescriptionDocum", scope = Defect.class)
    public JAXBElement<String> createDefectDescriptionDocum(String value) {
        return new JAXBElement<String>(_DefectDescriptionDocum_QNAME, String.class, Defect.class, value);
    }

}
