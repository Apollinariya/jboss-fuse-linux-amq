
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfAcceptanceActModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfAdditionalWork;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfAgreementHeaderModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfCargoDetailedPlanJour;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfCargoOnDateTableModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfCargoTallyReceiptJournalTable;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfCargoTransportInvoiceJourModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfClientListModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfDefect;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfDispatcherSummaryModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfEcoResProductCategory;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfEcoresCategory;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfEcoresCategoryHierarchy;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfEmployeeModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfExMooringModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfInventBatch;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfInventDim;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfInventLocation;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfInventOwnerModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPlanTableModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortBerthTable;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortCargoTimeSheet;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortEquipment;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortEquipmentGroup;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortEquipmentModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortPierModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortRailRoadLoadingArea;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortRequestTableModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortShiftDayPlanModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortShipTableModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortThirdPartyShipsFact;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortTimeSheet;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortTimeSheetOperation;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfPortWorkBrigade;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfProcessingOfWagonModel;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfTosContainerInfo;
import org.datacontract.schemas._2004._07.ncspintegration.ArrayOfWMSLocation;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetDefectsResponseGetDefectsResult_QNAME = new QName("http://tempuri.org/", "GetDefectsResult");
    private final static QName _GetPortRailRoadLoadingAreasResponseGetPortRailRoadLoadingAreasResult_QNAME = new QName("http://tempuri.org/", "GetPortRailRoadLoadingAreasResult");
    private final static QName _GetPortWorkBrigadesResponseGetPortWorkBrigadesResult_QNAME = new QName("http://tempuri.org/", "GetPortWorkBrigadesResult");
    private final static QName _GetDetailedPlanJoursResponseGetDetailedPlanJoursResult_QNAME = new QName("http://tempuri.org/", "GetDetailedPlanJoursResult");
    private final static QName _GetPortTimeSheetsResponseGetPortTimeSheetsResult_QNAME = new QName("http://tempuri.org/", "GetPortTimeSheetsResult");
    private final static QName _GetPortCargoTimeSheetsResponseGetPortCargoTimeSheetsResult_QNAME = new QName("http://tempuri.org/", "GetPortCargoTimeSheetsResult");
    private final static QName _GetPortPiersResponseGetPortPiersResult_QNAME = new QName("http://tempuri.org/", "GetPortPiersResult");
    private final static QName _GetDispatcherSummarysResponseGetDispatcherSummarysResult_QNAME = new QName("http://tempuri.org/", "GetDispatcherSummarysResult");
    private final static QName _GetPortTimeSheetsByPeriodResponseGetPortTimeSheetsByPeriodResult_QNAME = new QName("http://tempuri.org/", "GetPortTimeSheetsByPeriodResult");
    private final static QName _GetEcoresCategoryesResponseGetEcoresCategoryesResult_QNAME = new QName("http://tempuri.org/", "GetEcoresCategoryesResult");
    private final static QName _GetPortThirdPartyShipsFactsResponseGetPortThirdPartyShipsFactsResult_QNAME = new QName("http://tempuri.org/", "GetPortThirdPartyShipsFactsResult");
    private final static QName _GetCargoTallyReceiptJournalTablesResponseGetCargoTallyReceiptJournalTablesResult_QNAME = new QName("http://tempuri.org/", "GetCargoTallyReceiptJournalTablesResult");
    private final static QName _GetPortTimeSheetOperationsResponseGetPortTimeSheetOperationsResult_QNAME = new QName("http://tempuri.org/", "GetPortTimeSheetOperationsResult");
    private final static QName _GetPortBerthesResponseGetPortBerthesResult_QNAME = new QName("http://tempuri.org/", "GetPortBerthesResult");
    private final static QName _GetEcoresCategoryHierarchyesResponseGetEcoresCategoryHierarchyesResult_QNAME = new QName("http://tempuri.org/", "GetEcoresCategoryHierarchyesResult");
    private final static QName _GetPlanTablesResponseGetPlanTablesResult_QNAME = new QName("http://tempuri.org/", "GetPlanTablesResult");
    private final static QName _GetWMSLocationsResponseGetWMSLocationsResult_QNAME = new QName("http://tempuri.org/", "GetWMSLocationsResult");
    private final static QName _GetInventLocationsResponseGetInventLocationsResult_QNAME = new QName("http://tempuri.org/", "GetInventLocationsResult");
    private final static QName _GetPortEquipmentGroupsResponseGetPortEquipmentGroupsResult_QNAME = new QName("http://tempuri.org/", "GetPortEquipmentGroupsResult");
    private final static QName _GetPortEquipmentModelsResponseGetPortEquipmentModelsResult_QNAME = new QName("http://tempuri.org/", "GetPortEquipmentModelsResult");
    private final static QName _GetPortEquipmentsResponseGetPortEquipmentsResult_QNAME = new QName("http://tempuri.org/", "GetPortEquipmentsResult");
    private final static QName _GetPortShipsResponseGetPortShipsResult_QNAME = new QName("http://tempuri.org/", "GetPortShipsResult");
    private final static QName _GetAgreementsHeaderResponseGetAgreementsHeaderResult_QNAME = new QName("http://tempuri.org/", "GetAgreementsHeaderResult");
    private final static QName _GetInventOwnersResponseGetInventOwnersResult_QNAME = new QName("http://tempuri.org/", "GetInventOwnersResult");
    private final static QName _GetPortRequestTablesResponseGetPortRequestTablesResult_QNAME = new QName("http://tempuri.org/", "GetPortRequestTablesResult");
    private final static QName _GetDeliveryPlanResponseGetDeliveryPlanResult_QNAME = new QName("http://tempuri.org/", "GetDeliveryPlanResult");
    private final static QName _GetPortShiftDayPlansResponseGetPortShiftDayPlansResult_QNAME = new QName("http://tempuri.org/", "GetPortShiftDayPlansResult");
    private final static QName _GetAcceptanceActsResponseGetAcceptanceActsResult_QNAME = new QName("http://tempuri.org/", "GetAcceptanceActsResult");
    private final static QName _GetCargoTransportInvoiceJoursResponseGetCargoTransportInvoiceJoursResult_QNAME = new QName("http://tempuri.org/", "GetCargoTransportInvoiceJoursResult");
    private final static QName _GetClientsListResponseGetClientsListResult_QNAME = new QName("http://tempuri.org/", "GetClientsListResult");
    private final static QName _GetProcessingOfWagonsResponseGetProcessingOfWagonsResult_QNAME = new QName("http://tempuri.org/", "GetProcessingOfWagonsResult");
    private final static QName _GetCargoesOnDateResponseGetCargoesOnDateResult_QNAME = new QName("http://tempuri.org/", "GetCargoesOnDateResult");
    private final static QName _GetEcoResProductCategoriesResponseGetEcoResProductCategoriesResult_QNAME = new QName("http://tempuri.org/", "GetEcoResProductCategoriesResult");
    private final static QName _SetWagonStatusWagonId_QNAME = new QName("http://tempuri.org/", "wagonId");
    private final static QName _SetWagonStatusComment_QNAME = new QName("http://tempuri.org/", "comment");
    private final static QName _SetWagonStatusUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _GetEmployeesTableResponseGetEmployeesTableResult_QNAME = new QName("http://tempuri.org/", "GetEmployeesTableResult");
    private final static QName _GetExMooringsResponseGetExMooringsResult_QNAME = new QName("http://tempuri.org/", "GetExMooringsResult");
    private final static QName _GetTosContainerInfoContainerNumber_QNAME = new QName("http://tempuri.org/", "containerNumber");
    private final static QName _GetTosContainerInfoResponseGetTosContainerInfoResult_QNAME = new QName("http://tempuri.org/", "GetTosContainerInfoResult");
    private final static QName _GetAdditionalWorksResponseGetAdditionalWorksResult_QNAME = new QName("http://tempuri.org/", "GetAdditionalWorksResult");
    private final static QName _GetInventDimsResponseGetInventDimsResult_QNAME = new QName("http://tempuri.org/", "GetInventDimsResult");
    private final static QName _GetInventBatchsResponseGetInventBatchsResult_QNAME = new QName("http://tempuri.org/", "GetInventBatchsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDefects }
     * 
     */
    public GetDefects createGetDefects() {
        return new GetDefects();
    }

    /**
     * Create an instance of {@link GetDefectsResponse }
     * 
     */
    public GetDefectsResponse createGetDefectsResponse() {
        return new GetDefectsResponse();
    }

    /**
     * Create an instance of {@link GetPortRailRoadLoadingAreas }
     * 
     */
    public GetPortRailRoadLoadingAreas createGetPortRailRoadLoadingAreas() {
        return new GetPortRailRoadLoadingAreas();
    }

    /**
     * Create an instance of {@link GetPortRailRoadLoadingAreasResponse }
     * 
     */
    public GetPortRailRoadLoadingAreasResponse createGetPortRailRoadLoadingAreasResponse() {
        return new GetPortRailRoadLoadingAreasResponse();
    }

    /**
     * Create an instance of {@link GetPortWorkBrigades }
     * 
     */
    public GetPortWorkBrigades createGetPortWorkBrigades() {
        return new GetPortWorkBrigades();
    }

    /**
     * Create an instance of {@link GetPortWorkBrigadesResponse }
     * 
     */
    public GetPortWorkBrigadesResponse createGetPortWorkBrigadesResponse() {
        return new GetPortWorkBrigadesResponse();
    }

    /**
     * Create an instance of {@link GetDetailedPlanJours }
     * 
     */
    public GetDetailedPlanJours createGetDetailedPlanJours() {
        return new GetDetailedPlanJours();
    }

    /**
     * Create an instance of {@link GetDetailedPlanJoursResponse }
     * 
     */
    public GetDetailedPlanJoursResponse createGetDetailedPlanJoursResponse() {
        return new GetDetailedPlanJoursResponse();
    }

    /**
     * Create an instance of {@link GetPortTimeSheets }
     * 
     */
    public GetPortTimeSheets createGetPortTimeSheets() {
        return new GetPortTimeSheets();
    }

    /**
     * Create an instance of {@link GetPortTimeSheetsResponse }
     * 
     */
    public GetPortTimeSheetsResponse createGetPortTimeSheetsResponse() {
        return new GetPortTimeSheetsResponse();
    }

    /**
     * Create an instance of {@link GetPortCargoTimeSheets }
     * 
     */
    public GetPortCargoTimeSheets createGetPortCargoTimeSheets() {
        return new GetPortCargoTimeSheets();
    }

    /**
     * Create an instance of {@link GetPortCargoTimeSheetsResponse }
     * 
     */
    public GetPortCargoTimeSheetsResponse createGetPortCargoTimeSheetsResponse() {
        return new GetPortCargoTimeSheetsResponse();
    }

    /**
     * Create an instance of {@link GetPortPiers }
     * 
     */
    public GetPortPiers createGetPortPiers() {
        return new GetPortPiers();
    }

    /**
     * Create an instance of {@link GetPortPiersResponse }
     * 
     */
    public GetPortPiersResponse createGetPortPiersResponse() {
        return new GetPortPiersResponse();
    }

    /**
     * Create an instance of {@link GetDispatcherSummarys }
     * 
     */
    public GetDispatcherSummarys createGetDispatcherSummarys() {
        return new GetDispatcherSummarys();
    }

    /**
     * Create an instance of {@link GetDispatcherSummarysResponse }
     * 
     */
    public GetDispatcherSummarysResponse createGetDispatcherSummarysResponse() {
        return new GetDispatcherSummarysResponse();
    }

    /**
     * Create an instance of {@link GetPortTimeSheetsByPeriod }
     * 
     */
    public GetPortTimeSheetsByPeriod createGetPortTimeSheetsByPeriod() {
        return new GetPortTimeSheetsByPeriod();
    }

    /**
     * Create an instance of {@link GetPortTimeSheetsByPeriodResponse }
     * 
     */
    public GetPortTimeSheetsByPeriodResponse createGetPortTimeSheetsByPeriodResponse() {
        return new GetPortTimeSheetsByPeriodResponse();
    }

    /**
     * Create an instance of {@link GetEcoresCategoryes }
     * 
     */
    public GetEcoresCategoryes createGetEcoresCategoryes() {
        return new GetEcoresCategoryes();
    }

    /**
     * Create an instance of {@link GetEcoresCategoryesResponse }
     * 
     */
    public GetEcoresCategoryesResponse createGetEcoresCategoryesResponse() {
        return new GetEcoresCategoryesResponse();
    }

    /**
     * Create an instance of {@link GetPortThirdPartyShipsFacts }
     * 
     */
    public GetPortThirdPartyShipsFacts createGetPortThirdPartyShipsFacts() {
        return new GetPortThirdPartyShipsFacts();
    }

    /**
     * Create an instance of {@link GetPortThirdPartyShipsFactsResponse }
     * 
     */
    public GetPortThirdPartyShipsFactsResponse createGetPortThirdPartyShipsFactsResponse() {
        return new GetPortThirdPartyShipsFactsResponse();
    }

    /**
     * Create an instance of {@link GetCargoTallyReceiptJournalTables }
     * 
     */
    public GetCargoTallyReceiptJournalTables createGetCargoTallyReceiptJournalTables() {
        return new GetCargoTallyReceiptJournalTables();
    }

    /**
     * Create an instance of {@link GetCargoTallyReceiptJournalTablesResponse }
     * 
     */
    public GetCargoTallyReceiptJournalTablesResponse createGetCargoTallyReceiptJournalTablesResponse() {
        return new GetCargoTallyReceiptJournalTablesResponse();
    }

    /**
     * Create an instance of {@link GetPortTimeSheetOperations }
     * 
     */
    public GetPortTimeSheetOperations createGetPortTimeSheetOperations() {
        return new GetPortTimeSheetOperations();
    }

    /**
     * Create an instance of {@link GetPortTimeSheetOperationsResponse }
     * 
     */
    public GetPortTimeSheetOperationsResponse createGetPortTimeSheetOperationsResponse() {
        return new GetPortTimeSheetOperationsResponse();
    }

    /**
     * Create an instance of {@link GetPortBerthes }
     * 
     */
    public GetPortBerthes createGetPortBerthes() {
        return new GetPortBerthes();
    }

    /**
     * Create an instance of {@link GetPortBerthesResponse }
     * 
     */
    public GetPortBerthesResponse createGetPortBerthesResponse() {
        return new GetPortBerthesResponse();
    }

    /**
     * Create an instance of {@link GetEcoresCategoryHierarchyes }
     * 
     */
    public GetEcoresCategoryHierarchyes createGetEcoresCategoryHierarchyes() {
        return new GetEcoresCategoryHierarchyes();
    }

    /**
     * Create an instance of {@link GetEcoresCategoryHierarchyesResponse }
     * 
     */
    public GetEcoresCategoryHierarchyesResponse createGetEcoresCategoryHierarchyesResponse() {
        return new GetEcoresCategoryHierarchyesResponse();
    }

    /**
     * Create an instance of {@link GetPlanTables }
     * 
     */
    public GetPlanTables createGetPlanTables() {
        return new GetPlanTables();
    }

    /**
     * Create an instance of {@link GetPlanTablesResponse }
     * 
     */
    public GetPlanTablesResponse createGetPlanTablesResponse() {
        return new GetPlanTablesResponse();
    }

    /**
     * Create an instance of {@link GetWMSLocations }
     * 
     */
    public GetWMSLocations createGetWMSLocations() {
        return new GetWMSLocations();
    }

    /**
     * Create an instance of {@link GetWMSLocationsResponse }
     * 
     */
    public GetWMSLocationsResponse createGetWMSLocationsResponse() {
        return new GetWMSLocationsResponse();
    }

    /**
     * Create an instance of {@link GetInventLocations }
     * 
     */
    public GetInventLocations createGetInventLocations() {
        return new GetInventLocations();
    }

    /**
     * Create an instance of {@link GetInventLocationsResponse }
     * 
     */
    public GetInventLocationsResponse createGetInventLocationsResponse() {
        return new GetInventLocationsResponse();
    }

    /**
     * Create an instance of {@link GetPortEquipmentGroups }
     * 
     */
    public GetPortEquipmentGroups createGetPortEquipmentGroups() {
        return new GetPortEquipmentGroups();
    }

    /**
     * Create an instance of {@link GetPortEquipmentGroupsResponse }
     * 
     */
    public GetPortEquipmentGroupsResponse createGetPortEquipmentGroupsResponse() {
        return new GetPortEquipmentGroupsResponse();
    }

    /**
     * Create an instance of {@link GetPortEquipmentModels }
     * 
     */
    public GetPortEquipmentModels createGetPortEquipmentModels() {
        return new GetPortEquipmentModels();
    }

    /**
     * Create an instance of {@link GetPortEquipmentModelsResponse }
     * 
     */
    public GetPortEquipmentModelsResponse createGetPortEquipmentModelsResponse() {
        return new GetPortEquipmentModelsResponse();
    }

    /**
     * Create an instance of {@link GetPortEquipments }
     * 
     */
    public GetPortEquipments createGetPortEquipments() {
        return new GetPortEquipments();
    }

    /**
     * Create an instance of {@link GetPortEquipmentsResponse }
     * 
     */
    public GetPortEquipmentsResponse createGetPortEquipmentsResponse() {
        return new GetPortEquipmentsResponse();
    }

    /**
     * Create an instance of {@link GetPortShips }
     * 
     */
    public GetPortShips createGetPortShips() {
        return new GetPortShips();
    }

    /**
     * Create an instance of {@link GetPortShipsResponse }
     * 
     */
    public GetPortShipsResponse createGetPortShipsResponse() {
        return new GetPortShipsResponse();
    }

    /**
     * Create an instance of {@link GetAgreementsHeader }
     * 
     */
    public GetAgreementsHeader createGetAgreementsHeader() {
        return new GetAgreementsHeader();
    }

    /**
     * Create an instance of {@link GetAgreementsHeaderResponse }
     * 
     */
    public GetAgreementsHeaderResponse createGetAgreementsHeaderResponse() {
        return new GetAgreementsHeaderResponse();
    }

    /**
     * Create an instance of {@link GetInventOwners }
     * 
     */
    public GetInventOwners createGetInventOwners() {
        return new GetInventOwners();
    }

    /**
     * Create an instance of {@link GetInventOwnersResponse }
     * 
     */
    public GetInventOwnersResponse createGetInventOwnersResponse() {
        return new GetInventOwnersResponse();
    }

    /**
     * Create an instance of {@link GetPortRequestTables }
     * 
     */
    public GetPortRequestTables createGetPortRequestTables() {
        return new GetPortRequestTables();
    }

    /**
     * Create an instance of {@link GetPortRequestTablesResponse }
     * 
     */
    public GetPortRequestTablesResponse createGetPortRequestTablesResponse() {
        return new GetPortRequestTablesResponse();
    }

    /**
     * Create an instance of {@link GetDeliveryPlan }
     * 
     */
    public GetDeliveryPlan createGetDeliveryPlan() {
        return new GetDeliveryPlan();
    }

    /**
     * Create an instance of {@link GetDeliveryPlanResponse }
     * 
     */
    public GetDeliveryPlanResponse createGetDeliveryPlanResponse() {
        return new GetDeliveryPlanResponse();
    }

    /**
     * Create an instance of {@link GetPortShiftDayPlans }
     * 
     */
    public GetPortShiftDayPlans createGetPortShiftDayPlans() {
        return new GetPortShiftDayPlans();
    }

    /**
     * Create an instance of {@link GetPortShiftDayPlansResponse }
     * 
     */
    public GetPortShiftDayPlansResponse createGetPortShiftDayPlansResponse() {
        return new GetPortShiftDayPlansResponse();
    }

    /**
     * Create an instance of {@link GetAcceptanceActs }
     * 
     */
    public GetAcceptanceActs createGetAcceptanceActs() {
        return new GetAcceptanceActs();
    }

    /**
     * Create an instance of {@link GetAcceptanceActsResponse }
     * 
     */
    public GetAcceptanceActsResponse createGetAcceptanceActsResponse() {
        return new GetAcceptanceActsResponse();
    }

    /**
     * Create an instance of {@link GetCargoTransportInvoiceJours }
     * 
     */
    public GetCargoTransportInvoiceJours createGetCargoTransportInvoiceJours() {
        return new GetCargoTransportInvoiceJours();
    }

    /**
     * Create an instance of {@link GetCargoTransportInvoiceJoursResponse }
     * 
     */
    public GetCargoTransportInvoiceJoursResponse createGetCargoTransportInvoiceJoursResponse() {
        return new GetCargoTransportInvoiceJoursResponse();
    }

    /**
     * Create an instance of {@link GetClientsList }
     * 
     */
    public GetClientsList createGetClientsList() {
        return new GetClientsList();
    }

    /**
     * Create an instance of {@link GetClientsListResponse }
     * 
     */
    public GetClientsListResponse createGetClientsListResponse() {
        return new GetClientsListResponse();
    }

    /**
     * Create an instance of {@link GetProcessingOfWagons }
     * 
     */
    public GetProcessingOfWagons createGetProcessingOfWagons() {
        return new GetProcessingOfWagons();
    }

    /**
     * Create an instance of {@link GetProcessingOfWagonsResponse }
     * 
     */
    public GetProcessingOfWagonsResponse createGetProcessingOfWagonsResponse() {
        return new GetProcessingOfWagonsResponse();
    }

    /**
     * Create an instance of {@link GetCargoesOnDate }
     * 
     */
    public GetCargoesOnDate createGetCargoesOnDate() {
        return new GetCargoesOnDate();
    }

    /**
     * Create an instance of {@link GetCargoesOnDateResponse }
     * 
     */
    public GetCargoesOnDateResponse createGetCargoesOnDateResponse() {
        return new GetCargoesOnDateResponse();
    }

    /**
     * Create an instance of {@link GetEcoResProductCategories }
     * 
     */
    public GetEcoResProductCategories createGetEcoResProductCategories() {
        return new GetEcoResProductCategories();
    }

    /**
     * Create an instance of {@link GetEcoResProductCategoriesResponse }
     * 
     */
    public GetEcoResProductCategoriesResponse createGetEcoResProductCategoriesResponse() {
        return new GetEcoResProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link SetWagonStatus }
     * 
     */
    public SetWagonStatus createSetWagonStatus() {
        return new SetWagonStatus();
    }

    /**
     * Create an instance of {@link SetWagonStatusResponse }
     * 
     */
    public SetWagonStatusResponse createSetWagonStatusResponse() {
        return new SetWagonStatusResponse();
    }

    /**
     * Create an instance of {@link GetEmployeesTable }
     * 
     */
    public GetEmployeesTable createGetEmployeesTable() {
        return new GetEmployeesTable();
    }

    /**
     * Create an instance of {@link GetEmployeesTableResponse }
     * 
     */
    public GetEmployeesTableResponse createGetEmployeesTableResponse() {
        return new GetEmployeesTableResponse();
    }

    /**
     * Create an instance of {@link GetExMoorings }
     * 
     */
    public GetExMoorings createGetExMoorings() {
        return new GetExMoorings();
    }

    /**
     * Create an instance of {@link GetExMooringsResponse }
     * 
     */
    public GetExMooringsResponse createGetExMooringsResponse() {
        return new GetExMooringsResponse();
    }

    /**
     * Create an instance of {@link GetTosContainerInfo }
     * 
     */
    public GetTosContainerInfo createGetTosContainerInfo() {
        return new GetTosContainerInfo();
    }

    /**
     * Create an instance of {@link GetTosContainerInfoResponse }
     * 
     */
    public GetTosContainerInfoResponse createGetTosContainerInfoResponse() {
        return new GetTosContainerInfoResponse();
    }

    /**
     * Create an instance of {@link GetAdditionalWorks }
     * 
     */
    public GetAdditionalWorks createGetAdditionalWorks() {
        return new GetAdditionalWorks();
    }

    /**
     * Create an instance of {@link GetAdditionalWorksResponse }
     * 
     */
    public GetAdditionalWorksResponse createGetAdditionalWorksResponse() {
        return new GetAdditionalWorksResponse();
    }

    /**
     * Create an instance of {@link GetInventDims }
     * 
     */
    public GetInventDims createGetInventDims() {
        return new GetInventDims();
    }

    /**
     * Create an instance of {@link GetInventDimsResponse }
     * 
     */
    public GetInventDimsResponse createGetInventDimsResponse() {
        return new GetInventDimsResponse();
    }

    /**
     * Create an instance of {@link GetInventBatchs }
     * 
     */
    public GetInventBatchs createGetInventBatchs() {
        return new GetInventBatchs();
    }

    /**
     * Create an instance of {@link GetInventBatchsResponse }
     * 
     */
    public GetInventBatchsResponse createGetInventBatchsResponse() {
        return new GetInventBatchsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDefect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDefectsResult", scope = GetDefectsResponse.class)
    public JAXBElement<ArrayOfDefect> createGetDefectsResponseGetDefectsResult(ArrayOfDefect value) {
        return new JAXBElement<ArrayOfDefect>(_GetDefectsResponseGetDefectsResult_QNAME, ArrayOfDefect.class, GetDefectsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRailRoadLoadingArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortRailRoadLoadingAreasResult", scope = GetPortRailRoadLoadingAreasResponse.class)
    public JAXBElement<ArrayOfPortRailRoadLoadingArea> createGetPortRailRoadLoadingAreasResponseGetPortRailRoadLoadingAreasResult(ArrayOfPortRailRoadLoadingArea value) {
        return new JAXBElement<ArrayOfPortRailRoadLoadingArea>(_GetPortRailRoadLoadingAreasResponseGetPortRailRoadLoadingAreasResult_QNAME, ArrayOfPortRailRoadLoadingArea.class, GetPortRailRoadLoadingAreasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortWorkBrigade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortWorkBrigadesResult", scope = GetPortWorkBrigadesResponse.class)
    public JAXBElement<ArrayOfPortWorkBrigade> createGetPortWorkBrigadesResponseGetPortWorkBrigadesResult(ArrayOfPortWorkBrigade value) {
        return new JAXBElement<ArrayOfPortWorkBrigade>(_GetPortWorkBrigadesResponseGetPortWorkBrigadesResult_QNAME, ArrayOfPortWorkBrigade.class, GetPortWorkBrigadesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoDetailedPlanJour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDetailedPlanJoursResult", scope = GetDetailedPlanJoursResponse.class)
    public JAXBElement<ArrayOfCargoDetailedPlanJour> createGetDetailedPlanJoursResponseGetDetailedPlanJoursResult(ArrayOfCargoDetailedPlanJour value) {
        return new JAXBElement<ArrayOfCargoDetailedPlanJour>(_GetDetailedPlanJoursResponseGetDetailedPlanJoursResult_QNAME, ArrayOfCargoDetailedPlanJour.class, GetDetailedPlanJoursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortTimeSheetsResult", scope = GetPortTimeSheetsResponse.class)
    public JAXBElement<ArrayOfPortTimeSheet> createGetPortTimeSheetsResponseGetPortTimeSheetsResult(ArrayOfPortTimeSheet value) {
        return new JAXBElement<ArrayOfPortTimeSheet>(_GetPortTimeSheetsResponseGetPortTimeSheetsResult_QNAME, ArrayOfPortTimeSheet.class, GetPortTimeSheetsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortCargoTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortCargoTimeSheetsResult", scope = GetPortCargoTimeSheetsResponse.class)
    public JAXBElement<ArrayOfPortCargoTimeSheet> createGetPortCargoTimeSheetsResponseGetPortCargoTimeSheetsResult(ArrayOfPortCargoTimeSheet value) {
        return new JAXBElement<ArrayOfPortCargoTimeSheet>(_GetPortCargoTimeSheetsResponseGetPortCargoTimeSheetsResult_QNAME, ArrayOfPortCargoTimeSheet.class, GetPortCargoTimeSheetsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortPierModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortPiersResult", scope = GetPortPiersResponse.class)
    public JAXBElement<ArrayOfPortPierModel> createGetPortPiersResponseGetPortPiersResult(ArrayOfPortPierModel value) {
        return new JAXBElement<ArrayOfPortPierModel>(_GetPortPiersResponseGetPortPiersResult_QNAME, ArrayOfPortPierModel.class, GetPortPiersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDispatcherSummaryModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDispatcherSummarysResult", scope = GetDispatcherSummarysResponse.class)
    public JAXBElement<ArrayOfDispatcherSummaryModel> createGetDispatcherSummarysResponseGetDispatcherSummarysResult(ArrayOfDispatcherSummaryModel value) {
        return new JAXBElement<ArrayOfDispatcherSummaryModel>(_GetDispatcherSummarysResponseGetDispatcherSummarysResult_QNAME, ArrayOfDispatcherSummaryModel.class, GetDispatcherSummarysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortTimeSheetsByPeriodResult", scope = GetPortTimeSheetsByPeriodResponse.class)
    public JAXBElement<ArrayOfPortTimeSheet> createGetPortTimeSheetsByPeriodResponseGetPortTimeSheetsByPeriodResult(ArrayOfPortTimeSheet value) {
        return new JAXBElement<ArrayOfPortTimeSheet>(_GetPortTimeSheetsByPeriodResponseGetPortTimeSheetsByPeriodResult_QNAME, ArrayOfPortTimeSheet.class, GetPortTimeSheetsByPeriodResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEcoresCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEcoresCategoryesResult", scope = GetEcoresCategoryesResponse.class)
    public JAXBElement<ArrayOfEcoresCategory> createGetEcoresCategoryesResponseGetEcoresCategoryesResult(ArrayOfEcoresCategory value) {
        return new JAXBElement<ArrayOfEcoresCategory>(_GetEcoresCategoryesResponseGetEcoresCategoryesResult_QNAME, ArrayOfEcoresCategory.class, GetEcoresCategoryesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortThirdPartyShipsFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortThirdPartyShipsFactsResult", scope = GetPortThirdPartyShipsFactsResponse.class)
    public JAXBElement<ArrayOfPortThirdPartyShipsFact> createGetPortThirdPartyShipsFactsResponseGetPortThirdPartyShipsFactsResult(ArrayOfPortThirdPartyShipsFact value) {
        return new JAXBElement<ArrayOfPortThirdPartyShipsFact>(_GetPortThirdPartyShipsFactsResponseGetPortThirdPartyShipsFactsResult_QNAME, ArrayOfPortThirdPartyShipsFact.class, GetPortThirdPartyShipsFactsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoTallyReceiptJournalTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCargoTallyReceiptJournalTablesResult", scope = GetCargoTallyReceiptJournalTablesResponse.class)
    public JAXBElement<ArrayOfCargoTallyReceiptJournalTable> createGetCargoTallyReceiptJournalTablesResponseGetCargoTallyReceiptJournalTablesResult(ArrayOfCargoTallyReceiptJournalTable value) {
        return new JAXBElement<ArrayOfCargoTallyReceiptJournalTable>(_GetCargoTallyReceiptJournalTablesResponseGetCargoTallyReceiptJournalTablesResult_QNAME, ArrayOfCargoTallyReceiptJournalTable.class, GetCargoTallyReceiptJournalTablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortTimeSheetOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortTimeSheetOperationsResult", scope = GetPortTimeSheetOperationsResponse.class)
    public JAXBElement<ArrayOfPortTimeSheetOperation> createGetPortTimeSheetOperationsResponseGetPortTimeSheetOperationsResult(ArrayOfPortTimeSheetOperation value) {
        return new JAXBElement<ArrayOfPortTimeSheetOperation>(_GetPortTimeSheetOperationsResponseGetPortTimeSheetOperationsResult_QNAME, ArrayOfPortTimeSheetOperation.class, GetPortTimeSheetOperationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortBerthTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortBerthesResult", scope = GetPortBerthesResponse.class)
    public JAXBElement<ArrayOfPortBerthTable> createGetPortBerthesResponseGetPortBerthesResult(ArrayOfPortBerthTable value) {
        return new JAXBElement<ArrayOfPortBerthTable>(_GetPortBerthesResponseGetPortBerthesResult_QNAME, ArrayOfPortBerthTable.class, GetPortBerthesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEcoresCategoryHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEcoresCategoryHierarchyesResult", scope = GetEcoresCategoryHierarchyesResponse.class)
    public JAXBElement<ArrayOfEcoresCategoryHierarchy> createGetEcoresCategoryHierarchyesResponseGetEcoresCategoryHierarchyesResult(ArrayOfEcoresCategoryHierarchy value) {
        return new JAXBElement<ArrayOfEcoresCategoryHierarchy>(_GetEcoresCategoryHierarchyesResponseGetEcoresCategoryHierarchyesResult_QNAME, ArrayOfEcoresCategoryHierarchy.class, GetEcoresCategoryHierarchyesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlanTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPlanTablesResult", scope = GetPlanTablesResponse.class)
    public JAXBElement<ArrayOfPlanTableModel> createGetPlanTablesResponseGetPlanTablesResult(ArrayOfPlanTableModel value) {
        return new JAXBElement<ArrayOfPlanTableModel>(_GetPlanTablesResponseGetPlanTablesResult_QNAME, ArrayOfPlanTableModel.class, GetPlanTablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWMSLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetWMSLocationsResult", scope = GetWMSLocationsResponse.class)
    public JAXBElement<ArrayOfWMSLocation> createGetWMSLocationsResponseGetWMSLocationsResult(ArrayOfWMSLocation value) {
        return new JAXBElement<ArrayOfWMSLocation>(_GetWMSLocationsResponseGetWMSLocationsResult_QNAME, ArrayOfWMSLocation.class, GetWMSLocationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInventLocationsResult", scope = GetInventLocationsResponse.class)
    public JAXBElement<ArrayOfInventLocation> createGetInventLocationsResponseGetInventLocationsResult(ArrayOfInventLocation value) {
        return new JAXBElement<ArrayOfInventLocation>(_GetInventLocationsResponseGetInventLocationsResult_QNAME, ArrayOfInventLocation.class, GetInventLocationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortEquipmentGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortEquipmentGroupsResult", scope = GetPortEquipmentGroupsResponse.class)
    public JAXBElement<ArrayOfPortEquipmentGroup> createGetPortEquipmentGroupsResponseGetPortEquipmentGroupsResult(ArrayOfPortEquipmentGroup value) {
        return new JAXBElement<ArrayOfPortEquipmentGroup>(_GetPortEquipmentGroupsResponseGetPortEquipmentGroupsResult_QNAME, ArrayOfPortEquipmentGroup.class, GetPortEquipmentGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortEquipmentModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortEquipmentModelsResult", scope = GetPortEquipmentModelsResponse.class)
    public JAXBElement<ArrayOfPortEquipmentModel> createGetPortEquipmentModelsResponseGetPortEquipmentModelsResult(ArrayOfPortEquipmentModel value) {
        return new JAXBElement<ArrayOfPortEquipmentModel>(_GetPortEquipmentModelsResponseGetPortEquipmentModelsResult_QNAME, ArrayOfPortEquipmentModel.class, GetPortEquipmentModelsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortEquipmentsResult", scope = GetPortEquipmentsResponse.class)
    public JAXBElement<ArrayOfPortEquipment> createGetPortEquipmentsResponseGetPortEquipmentsResult(ArrayOfPortEquipment value) {
        return new JAXBElement<ArrayOfPortEquipment>(_GetPortEquipmentsResponseGetPortEquipmentsResult_QNAME, ArrayOfPortEquipment.class, GetPortEquipmentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShipTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortShipsResult", scope = GetPortShipsResponse.class)
    public JAXBElement<ArrayOfPortShipTableModel> createGetPortShipsResponseGetPortShipsResult(ArrayOfPortShipTableModel value) {
        return new JAXBElement<ArrayOfPortShipTableModel>(_GetPortShipsResponseGetPortShipsResult_QNAME, ArrayOfPortShipTableModel.class, GetPortShipsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgreementHeaderModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAgreementsHeaderResult", scope = GetAgreementsHeaderResponse.class)
    public JAXBElement<ArrayOfAgreementHeaderModel> createGetAgreementsHeaderResponseGetAgreementsHeaderResult(ArrayOfAgreementHeaderModel value) {
        return new JAXBElement<ArrayOfAgreementHeaderModel>(_GetAgreementsHeaderResponseGetAgreementsHeaderResult_QNAME, ArrayOfAgreementHeaderModel.class, GetAgreementsHeaderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventOwnerModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInventOwnersResult", scope = GetInventOwnersResponse.class)
    public JAXBElement<ArrayOfInventOwnerModel> createGetInventOwnersResponseGetInventOwnersResult(ArrayOfInventOwnerModel value) {
        return new JAXBElement<ArrayOfInventOwnerModel>(_GetInventOwnersResponseGetInventOwnersResult_QNAME, ArrayOfInventOwnerModel.class, GetInventOwnersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortRequestTablesResult", scope = GetPortRequestTablesResponse.class)
    public JAXBElement<ArrayOfPortRequestTableModel> createGetPortRequestTablesResponseGetPortRequestTablesResult(ArrayOfPortRequestTableModel value) {
        return new JAXBElement<ArrayOfPortRequestTableModel>(_GetPortRequestTablesResponseGetPortRequestTablesResult_QNAME, ArrayOfPortRequestTableModel.class, GetPortRequestTablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortRequestTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDeliveryPlanResult", scope = GetDeliveryPlanResponse.class)
    public JAXBElement<ArrayOfPortRequestTableModel> createGetDeliveryPlanResponseGetDeliveryPlanResult(ArrayOfPortRequestTableModel value) {
        return new JAXBElement<ArrayOfPortRequestTableModel>(_GetDeliveryPlanResponseGetDeliveryPlanResult_QNAME, ArrayOfPortRequestTableModel.class, GetDeliveryPlanResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPortShiftDayPlanModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPortShiftDayPlansResult", scope = GetPortShiftDayPlansResponse.class)
    public JAXBElement<ArrayOfPortShiftDayPlanModel> createGetPortShiftDayPlansResponseGetPortShiftDayPlansResult(ArrayOfPortShiftDayPlanModel value) {
        return new JAXBElement<ArrayOfPortShiftDayPlanModel>(_GetPortShiftDayPlansResponseGetPortShiftDayPlansResult_QNAME, ArrayOfPortShiftDayPlanModel.class, GetPortShiftDayPlansResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcceptanceActModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAcceptanceActsResult", scope = GetAcceptanceActsResponse.class)
    public JAXBElement<ArrayOfAcceptanceActModel> createGetAcceptanceActsResponseGetAcceptanceActsResult(ArrayOfAcceptanceActModel value) {
        return new JAXBElement<ArrayOfAcceptanceActModel>(_GetAcceptanceActsResponseGetAcceptanceActsResult_QNAME, ArrayOfAcceptanceActModel.class, GetAcceptanceActsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoTransportInvoiceJourModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCargoTransportInvoiceJoursResult", scope = GetCargoTransportInvoiceJoursResponse.class)
    public JAXBElement<ArrayOfCargoTransportInvoiceJourModel> createGetCargoTransportInvoiceJoursResponseGetCargoTransportInvoiceJoursResult(ArrayOfCargoTransportInvoiceJourModel value) {
        return new JAXBElement<ArrayOfCargoTransportInvoiceJourModel>(_GetCargoTransportInvoiceJoursResponseGetCargoTransportInvoiceJoursResult_QNAME, ArrayOfCargoTransportInvoiceJourModel.class, GetCargoTransportInvoiceJoursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClientListModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetClientsListResult", scope = GetClientsListResponse.class)
    public JAXBElement<ArrayOfClientListModel> createGetClientsListResponseGetClientsListResult(ArrayOfClientListModel value) {
        return new JAXBElement<ArrayOfClientListModel>(_GetClientsListResponseGetClientsListResult_QNAME, ArrayOfClientListModel.class, GetClientsListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProcessingOfWagonModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProcessingOfWagonsResult", scope = GetProcessingOfWagonsResponse.class)
    public JAXBElement<ArrayOfProcessingOfWagonModel> createGetProcessingOfWagonsResponseGetProcessingOfWagonsResult(ArrayOfProcessingOfWagonModel value) {
        return new JAXBElement<ArrayOfProcessingOfWagonModel>(_GetProcessingOfWagonsResponseGetProcessingOfWagonsResult_QNAME, ArrayOfProcessingOfWagonModel.class, GetProcessingOfWagonsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargoOnDateTableModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCargoesOnDateResult", scope = GetCargoesOnDateResponse.class)
    public JAXBElement<ArrayOfCargoOnDateTableModel> createGetCargoesOnDateResponseGetCargoesOnDateResult(ArrayOfCargoOnDateTableModel value) {
        return new JAXBElement<ArrayOfCargoOnDateTableModel>(_GetCargoesOnDateResponseGetCargoesOnDateResult_QNAME, ArrayOfCargoOnDateTableModel.class, GetCargoesOnDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEcoResProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEcoResProductCategoriesResult", scope = GetEcoResProductCategoriesResponse.class)
    public JAXBElement<ArrayOfEcoResProductCategory> createGetEcoResProductCategoriesResponseGetEcoResProductCategoriesResult(ArrayOfEcoResProductCategory value) {
        return new JAXBElement<ArrayOfEcoResProductCategory>(_GetEcoResProductCategoriesResponseGetEcoResProductCategoriesResult_QNAME, ArrayOfEcoResProductCategory.class, GetEcoResProductCategoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "wagonId", scope = SetWagonStatus.class)
    public JAXBElement<String> createSetWagonStatusWagonId(String value) {
        return new JAXBElement<String>(_SetWagonStatusWagonId_QNAME, String.class, SetWagonStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comment", scope = SetWagonStatus.class)
    public JAXBElement<String> createSetWagonStatusComment(String value) {
        return new JAXBElement<String>(_SetWagonStatusComment_QNAME, String.class, SetWagonStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = SetWagonStatus.class)
    public JAXBElement<String> createSetWagonStatusUser(String value) {
        return new JAXBElement<String>(_SetWagonStatusUser_QNAME, String.class, SetWagonStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEmployeesTableResult", scope = GetEmployeesTableResponse.class)
    public JAXBElement<ArrayOfEmployeeModel> createGetEmployeesTableResponseGetEmployeesTableResult(ArrayOfEmployeeModel value) {
        return new JAXBElement<ArrayOfEmployeeModel>(_GetEmployeesTableResponseGetEmployeesTableResult_QNAME, ArrayOfEmployeeModel.class, GetEmployeesTableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExMooringModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetExMooringsResult", scope = GetExMooringsResponse.class)
    public JAXBElement<ArrayOfExMooringModel> createGetExMooringsResponseGetExMooringsResult(ArrayOfExMooringModel value) {
        return new JAXBElement<ArrayOfExMooringModel>(_GetExMooringsResponseGetExMooringsResult_QNAME, ArrayOfExMooringModel.class, GetExMooringsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "containerNumber", scope = GetTosContainerInfo.class)
    public JAXBElement<String> createGetTosContainerInfoContainerNumber(String value) {
        return new JAXBElement<String>(_GetTosContainerInfoContainerNumber_QNAME, String.class, GetTosContainerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTosContainerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTosContainerInfoResult", scope = GetTosContainerInfoResponse.class)
    public JAXBElement<ArrayOfTosContainerInfo> createGetTosContainerInfoResponseGetTosContainerInfoResult(ArrayOfTosContainerInfo value) {
        return new JAXBElement<ArrayOfTosContainerInfo>(_GetTosContainerInfoResponseGetTosContainerInfoResult_QNAME, ArrayOfTosContainerInfo.class, GetTosContainerInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAdditionalWorksResult", scope = GetAdditionalWorksResponse.class)
    public JAXBElement<ArrayOfAdditionalWork> createGetAdditionalWorksResponseGetAdditionalWorksResult(ArrayOfAdditionalWork value) {
        return new JAXBElement<ArrayOfAdditionalWork>(_GetAdditionalWorksResponseGetAdditionalWorksResult_QNAME, ArrayOfAdditionalWork.class, GetAdditionalWorksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventDim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInventDimsResult", scope = GetInventDimsResponse.class)
    public JAXBElement<ArrayOfInventDim> createGetInventDimsResponseGetInventDimsResult(ArrayOfInventDim value) {
        return new JAXBElement<ArrayOfInventDim>(_GetInventDimsResponseGetInventDimsResult_QNAME, ArrayOfInventDim.class, GetInventDimsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInventBatchsResult", scope = GetInventBatchsResponse.class)
    public JAXBElement<ArrayOfInventBatch> createGetInventBatchsResponseGetInventBatchsResult(ArrayOfInventBatch value) {
        return new JAXBElement<ArrayOfInventBatch>(_GetInventBatchsResponseGetInventBatchsResult_QNAME, ArrayOfInventBatch.class, GetInventBatchsResponse.class, value);
    }

}
