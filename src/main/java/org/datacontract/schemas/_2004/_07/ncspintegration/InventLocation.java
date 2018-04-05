
package org.datacontract.schemas._2004._07.ncspintegration;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityType_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AllowLAborStandards" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllowMarkingReservationRemoval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BranchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsolidateShipAtrTW" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CustAccount_BR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustAccount_HU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CycleCountAllowPalletMove" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DecrementLoadLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultKanbanFinishedGoodsLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultProductionFINISHGoodsLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultShipMaintenanceLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultStatusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmptyPalletLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSHStore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventCountingGroup_BR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdGoodsInRoute_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdQuarantine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdReqMain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationIdTransit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventLocationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventProfileId_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventProfileType_RU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventSiteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Manual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxPickingRouteTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxPickingRouteVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotIsPortResponsibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberSequenceGroup_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickingLineTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Pier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintBolBeforeShipCONFIRM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProdReserveOnlyWHSE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RboDefaultInventProfileId_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RboDefaultWmsLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RboDefaultWmsPalletId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RemoveInventBlockingOnStatusChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqCalendarId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReqRefill" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReserveAtLoadPost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RetailInventNegFinancial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RetailInventNegPhysical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RetailWeightEX1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RetailWmsLocationIdDefaultReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetailWmsPalletIdDefaultReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UniqueCheckDigits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UseWmsOrders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VendAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendAccountCustom_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WHSEnabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseAutoReleaseReservation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseHeadworker" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WmsAisleNameActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WmsLevelFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsLevelNameActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WmsLocationIdDefaultIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsLocationIdDefaultReceipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsLocationIdGoodsInRoute_RU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsPositionFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsPositionNameActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WmsRackFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WmsRackNameActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventLocation", propOrder = {
    "activityTypeRU",
    "allowLAborStandards",
    "allowMarkingReservationRemoval",
    "branchNumber",
    "consolidateShipAtrTW",
    "custAccountBR",
    "custAccountHU",
    "cycleCountAllowPalletMove",
    "decrementLoadLine",
    "defaultKanbanFinishedGoodsLocation",
    "defaultProductionFINISHGoodsLocation",
    "defaultShipMaintenanceLoc",
    "defaultStatusId",
    "emptyPalletLocation",
    "fshStore",
    "inventCountingGroupBR",
    "inventLocationId",
    "inventLocationIdGoodsInRouteRU",
    "inventLocationIdQuarantine",
    "inventLocationIdReqMain",
    "inventLocationIdTransit",
    "inventLocationLevel",
    "inventLocationType",
    "inventProfileIdRU",
    "inventProfileTypeRU",
    "inventSiteId",
    "manual",
    "maxPickingRouteTime",
    "maxPickingRouteVolume",
    "name",
    "notIsPortResponsibility",
    "numberSequenceGroupRU",
    "pickingLineTime",
    "pier",
    "printBolBeforeShipCONFIRM",
    "prodReserveOnlyWHSE",
    "rboDefaultInventProfileIdRU",
    "rboDefaultWmsLocationId",
    "rboDefaultWmsPalletId",
    "recId",
    "removeInventBlockingOnStatusChange",
    "reqCalendarId",
    "reqRefill",
    "reserveAtLoadPost",
    "retailInventNegFinancial",
    "retailInventNegPhysical",
    "retailWeightEX1",
    "retailWmsLocationIdDefaultReturn",
    "retailWmsPalletIdDefaultReturn",
    "uniqueCheckDigits",
    "useWmsOrders",
    "vendAccount",
    "vendAccountCustomRU",
    "whsEnabled",
    "warehouseAutoReleaseReservation",
    "warehouseHeadworker",
    "wmsAisleNameActive",
    "wmsLevelFormat",
    "wmsLevelNameActive",
    "wmsLocationIdDefaultIssue",
    "wmsLocationIdDefaultReceipt",
    "wmsLocationIdGoodsInRouteRU",
    "wmsPositionFormat",
    "wmsPositionNameActive",
    "wmsRackFormat",
    "wmsRackNameActive"
})
public class InventLocation {

    @XmlElementRef(name = "ActivityType_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activityTypeRU;
    @XmlElement(name = "AllowLAborStandards")
    protected Integer allowLAborStandards;
    @XmlElement(name = "AllowMarkingReservationRemoval")
    protected Integer allowMarkingReservationRemoval;
    @XmlElementRef(name = "BranchNumber", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchNumber;
    @XmlElement(name = "ConsolidateShipAtrTW")
    protected Integer consolidateShipAtrTW;
    @XmlElementRef(name = "CustAccount_BR", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custAccountBR;
    @XmlElementRef(name = "CustAccount_HU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custAccountHU;
    @XmlElement(name = "CycleCountAllowPalletMove")
    protected Integer cycleCountAllowPalletMove;
    @XmlElement(name = "DecrementLoadLine")
    protected Integer decrementLoadLine;
    @XmlElementRef(name = "DefaultKanbanFinishedGoodsLocation", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultKanbanFinishedGoodsLocation;
    @XmlElementRef(name = "DefaultProductionFINISHGoodsLocation", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultProductionFINISHGoodsLocation;
    @XmlElementRef(name = "DefaultShipMaintenanceLoc", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultShipMaintenanceLoc;
    @XmlElementRef(name = "DefaultStatusId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultStatusId;
    @XmlElementRef(name = "EmptyPalletLocation", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emptyPalletLocation;
    @XmlElement(name = "FSHStore")
    protected Integer fshStore;
    @XmlElement(name = "InventCountingGroup_BR")
    protected Integer inventCountingGroupBR;
    @XmlElementRef(name = "InventLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationId;
    @XmlElementRef(name = "InventLocationIdGoodsInRoute_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdGoodsInRouteRU;
    @XmlElementRef(name = "InventLocationIdQuarantine", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdQuarantine;
    @XmlElementRef(name = "InventLocationIdReqMain", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdReqMain;
    @XmlElementRef(name = "InventLocationIdTransit", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventLocationIdTransit;
    @XmlElement(name = "InventLocationLevel")
    protected Integer inventLocationLevel;
    @XmlElement(name = "InventLocationType")
    protected Integer inventLocationType;
    @XmlElementRef(name = "InventProfileId_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventProfileIdRU;
    @XmlElement(name = "InventProfileType_RU")
    protected Integer inventProfileTypeRU;
    @XmlElementRef(name = "InventSiteId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventSiteId;
    @XmlElement(name = "Manual")
    protected Integer manual;
    @XmlElement(name = "MaxPickingRouteTime")
    protected Integer maxPickingRouteTime;
    @XmlElement(name = "MaxPickingRouteVolume")
    protected BigDecimal maxPickingRouteVolume;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NotIsPortResponsibility")
    protected Integer notIsPortResponsibility;
    @XmlElementRef(name = "NumberSequenceGroup_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberSequenceGroupRU;
    @XmlElement(name = "PickingLineTime")
    protected Integer pickingLineTime;
    @XmlElementRef(name = "Pier", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pier;
    @XmlElement(name = "PrintBolBeforeShipCONFIRM")
    protected Integer printBolBeforeShipCONFIRM;
    @XmlElement(name = "ProdReserveOnlyWHSE")
    protected Integer prodReserveOnlyWHSE;
    @XmlElementRef(name = "RboDefaultInventProfileId_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rboDefaultInventProfileIdRU;
    @XmlElementRef(name = "RboDefaultWmsLocationId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rboDefaultWmsLocationId;
    @XmlElementRef(name = "RboDefaultWmsPalletId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rboDefaultWmsPalletId;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RemoveInventBlockingOnStatusChange")
    protected Integer removeInventBlockingOnStatusChange;
    @XmlElementRef(name = "ReqCalendarId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reqCalendarId;
    @XmlElement(name = "ReqRefill")
    protected Integer reqRefill;
    @XmlElement(name = "ReserveAtLoadPost")
    protected Integer reserveAtLoadPost;
    @XmlElement(name = "RetailInventNegFinancial")
    protected Integer retailInventNegFinancial;
    @XmlElement(name = "RetailInventNegPhysical")
    protected Integer retailInventNegPhysical;
    @XmlElement(name = "RetailWeightEX1")
    protected BigDecimal retailWeightEX1;
    @XmlElementRef(name = "RetailWmsLocationIdDefaultReturn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailWmsLocationIdDefaultReturn;
    @XmlElementRef(name = "RetailWmsPalletIdDefaultReturn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retailWmsPalletIdDefaultReturn;
    @XmlElement(name = "UniqueCheckDigits")
    protected Integer uniqueCheckDigits;
    @XmlElement(name = "UseWmsOrders")
    protected Integer useWmsOrders;
    @XmlElementRef(name = "VendAccount", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendAccount;
    @XmlElementRef(name = "VendAccountCustom_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendAccountCustomRU;
    @XmlElement(name = "WHSEnabled")
    protected Integer whsEnabled;
    @XmlElement(name = "WarehouseAutoReleaseReservation")
    protected Integer warehouseAutoReleaseReservation;
    @XmlElement(name = "WarehouseHeadworker")
    protected Long warehouseHeadworker;
    @XmlElement(name = "WmsAisleNameActive")
    protected Integer wmsAisleNameActive;
    @XmlElementRef(name = "WmsLevelFormat", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLevelFormat;
    @XmlElement(name = "WmsLevelNameActive")
    protected Integer wmsLevelNameActive;
    @XmlElementRef(name = "WmsLocationIdDefaultIssue", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationIdDefaultIssue;
    @XmlElementRef(name = "WmsLocationIdDefaultReceipt", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationIdDefaultReceipt;
    @XmlElementRef(name = "WmsLocationIdGoodsInRoute_RU", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsLocationIdGoodsInRouteRU;
    @XmlElementRef(name = "WmsPositionFormat", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsPositionFormat;
    @XmlElement(name = "WmsPositionNameActive")
    protected Integer wmsPositionNameActive;
    @XmlElementRef(name = "WmsRackFormat", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wmsRackFormat;
    @XmlElement(name = "WmsRackNameActive")
    protected Integer wmsRackNameActive;

    /**
     * Gets the value of the activityTypeRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityTypeRU() {
        return activityTypeRU;
    }

    /**
     * Sets the value of the activityTypeRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityTypeRU(JAXBElement<String> value) {
        this.activityTypeRU = value;
    }

    /**
     * Gets the value of the allowLAborStandards property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllowLAborStandards() {
        return allowLAborStandards;
    }

    /**
     * Sets the value of the allowLAborStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowLAborStandards(Integer value) {
        this.allowLAborStandards = value;
    }

    /**
     * Gets the value of the allowMarkingReservationRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllowMarkingReservationRemoval() {
        return allowMarkingReservationRemoval;
    }

    /**
     * Sets the value of the allowMarkingReservationRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowMarkingReservationRemoval(Integer value) {
        this.allowMarkingReservationRemoval = value;
    }

    /**
     * Gets the value of the branchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchNumber() {
        return branchNumber;
    }

    /**
     * Sets the value of the branchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchNumber(JAXBElement<String> value) {
        this.branchNumber = value;
    }

    /**
     * Gets the value of the consolidateShipAtrTW property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsolidateShipAtrTW() {
        return consolidateShipAtrTW;
    }

    /**
     * Sets the value of the consolidateShipAtrTW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsolidateShipAtrTW(Integer value) {
        this.consolidateShipAtrTW = value;
    }

    /**
     * Gets the value of the custAccountBR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustAccountBR() {
        return custAccountBR;
    }

    /**
     * Sets the value of the custAccountBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustAccountBR(JAXBElement<String> value) {
        this.custAccountBR = value;
    }

    /**
     * Gets the value of the custAccountHU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustAccountHU() {
        return custAccountHU;
    }

    /**
     * Sets the value of the custAccountHU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustAccountHU(JAXBElement<String> value) {
        this.custAccountHU = value;
    }

    /**
     * Gets the value of the cycleCountAllowPalletMove property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleCountAllowPalletMove() {
        return cycleCountAllowPalletMove;
    }

    /**
     * Sets the value of the cycleCountAllowPalletMove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleCountAllowPalletMove(Integer value) {
        this.cycleCountAllowPalletMove = value;
    }

    /**
     * Gets the value of the decrementLoadLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecrementLoadLine() {
        return decrementLoadLine;
    }

    /**
     * Sets the value of the decrementLoadLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecrementLoadLine(Integer value) {
        this.decrementLoadLine = value;
    }

    /**
     * Gets the value of the defaultKanbanFinishedGoodsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultKanbanFinishedGoodsLocation() {
        return defaultKanbanFinishedGoodsLocation;
    }

    /**
     * Sets the value of the defaultKanbanFinishedGoodsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultKanbanFinishedGoodsLocation(JAXBElement<String> value) {
        this.defaultKanbanFinishedGoodsLocation = value;
    }

    /**
     * Gets the value of the defaultProductionFINISHGoodsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultProductionFINISHGoodsLocation() {
        return defaultProductionFINISHGoodsLocation;
    }

    /**
     * Sets the value of the defaultProductionFINISHGoodsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultProductionFINISHGoodsLocation(JAXBElement<String> value) {
        this.defaultProductionFINISHGoodsLocation = value;
    }

    /**
     * Gets the value of the defaultShipMaintenanceLoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultShipMaintenanceLoc() {
        return defaultShipMaintenanceLoc;
    }

    /**
     * Sets the value of the defaultShipMaintenanceLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultShipMaintenanceLoc(JAXBElement<String> value) {
        this.defaultShipMaintenanceLoc = value;
    }

    /**
     * Gets the value of the defaultStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultStatusId() {
        return defaultStatusId;
    }

    /**
     * Sets the value of the defaultStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultStatusId(JAXBElement<String> value) {
        this.defaultStatusId = value;
    }

    /**
     * Gets the value of the emptyPalletLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmptyPalletLocation() {
        return emptyPalletLocation;
    }

    /**
     * Sets the value of the emptyPalletLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmptyPalletLocation(JAXBElement<String> value) {
        this.emptyPalletLocation = value;
    }

    /**
     * Gets the value of the fshStore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFSHStore() {
        return fshStore;
    }

    /**
     * Sets the value of the fshStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFSHStore(Integer value) {
        this.fshStore = value;
    }

    /**
     * Gets the value of the inventCountingGroupBR property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventCountingGroupBR() {
        return inventCountingGroupBR;
    }

    /**
     * Sets the value of the inventCountingGroupBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventCountingGroupBR(Integer value) {
        this.inventCountingGroupBR = value;
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
     * Gets the value of the inventLocationIdGoodsInRouteRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationIdGoodsInRouteRU() {
        return inventLocationIdGoodsInRouteRU;
    }

    /**
     * Sets the value of the inventLocationIdGoodsInRouteRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationIdGoodsInRouteRU(JAXBElement<String> value) {
        this.inventLocationIdGoodsInRouteRU = value;
    }

    /**
     * Gets the value of the inventLocationIdQuarantine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationIdQuarantine() {
        return inventLocationIdQuarantine;
    }

    /**
     * Sets the value of the inventLocationIdQuarantine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationIdQuarantine(JAXBElement<String> value) {
        this.inventLocationIdQuarantine = value;
    }

    /**
     * Gets the value of the inventLocationIdReqMain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationIdReqMain() {
        return inventLocationIdReqMain;
    }

    /**
     * Sets the value of the inventLocationIdReqMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationIdReqMain(JAXBElement<String> value) {
        this.inventLocationIdReqMain = value;
    }

    /**
     * Gets the value of the inventLocationIdTransit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventLocationIdTransit() {
        return inventLocationIdTransit;
    }

    /**
     * Sets the value of the inventLocationIdTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventLocationIdTransit(JAXBElement<String> value) {
        this.inventLocationIdTransit = value;
    }

    /**
     * Gets the value of the inventLocationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventLocationLevel() {
        return inventLocationLevel;
    }

    /**
     * Sets the value of the inventLocationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventLocationLevel(Integer value) {
        this.inventLocationLevel = value;
    }

    /**
     * Gets the value of the inventLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventLocationType() {
        return inventLocationType;
    }

    /**
     * Sets the value of the inventLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventLocationType(Integer value) {
        this.inventLocationType = value;
    }

    /**
     * Gets the value of the inventProfileIdRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventProfileIdRU() {
        return inventProfileIdRU;
    }

    /**
     * Sets the value of the inventProfileIdRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventProfileIdRU(JAXBElement<String> value) {
        this.inventProfileIdRU = value;
    }

    /**
     * Gets the value of the inventProfileTypeRU property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventProfileTypeRU() {
        return inventProfileTypeRU;
    }

    /**
     * Sets the value of the inventProfileTypeRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventProfileTypeRU(Integer value) {
        this.inventProfileTypeRU = value;
    }

    /**
     * Gets the value of the inventSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventSiteId() {
        return inventSiteId;
    }

    /**
     * Sets the value of the inventSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventSiteId(JAXBElement<String> value) {
        this.inventSiteId = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManual(Integer value) {
        this.manual = value;
    }

    /**
     * Gets the value of the maxPickingRouteTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPickingRouteTime() {
        return maxPickingRouteTime;
    }

    /**
     * Sets the value of the maxPickingRouteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPickingRouteTime(Integer value) {
        this.maxPickingRouteTime = value;
    }

    /**
     * Gets the value of the maxPickingRouteVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPickingRouteVolume() {
        return maxPickingRouteVolume;
    }

    /**
     * Sets the value of the maxPickingRouteVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPickingRouteVolume(BigDecimal value) {
        this.maxPickingRouteVolume = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the notIsPortResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotIsPortResponsibility() {
        return notIsPortResponsibility;
    }

    /**
     * Sets the value of the notIsPortResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotIsPortResponsibility(Integer value) {
        this.notIsPortResponsibility = value;
    }

    /**
     * Gets the value of the numberSequenceGroupRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberSequenceGroupRU() {
        return numberSequenceGroupRU;
    }

    /**
     * Sets the value of the numberSequenceGroupRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberSequenceGroupRU(JAXBElement<String> value) {
        this.numberSequenceGroupRU = value;
    }

    /**
     * Gets the value of the pickingLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickingLineTime() {
        return pickingLineTime;
    }

    /**
     * Sets the value of the pickingLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickingLineTime(Integer value) {
        this.pickingLineTime = value;
    }

    /**
     * Gets the value of the pier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPier() {
        return pier;
    }

    /**
     * Sets the value of the pier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPier(JAXBElement<String> value) {
        this.pier = value;
    }

    /**
     * Gets the value of the printBolBeforeShipCONFIRM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrintBolBeforeShipCONFIRM() {
        return printBolBeforeShipCONFIRM;
    }

    /**
     * Sets the value of the printBolBeforeShipCONFIRM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrintBolBeforeShipCONFIRM(Integer value) {
        this.printBolBeforeShipCONFIRM = value;
    }

    /**
     * Gets the value of the prodReserveOnlyWHSE property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdReserveOnlyWHSE() {
        return prodReserveOnlyWHSE;
    }

    /**
     * Sets the value of the prodReserveOnlyWHSE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdReserveOnlyWHSE(Integer value) {
        this.prodReserveOnlyWHSE = value;
    }

    /**
     * Gets the value of the rboDefaultInventProfileIdRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRboDefaultInventProfileIdRU() {
        return rboDefaultInventProfileIdRU;
    }

    /**
     * Sets the value of the rboDefaultInventProfileIdRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRboDefaultInventProfileIdRU(JAXBElement<String> value) {
        this.rboDefaultInventProfileIdRU = value;
    }

    /**
     * Gets the value of the rboDefaultWmsLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRboDefaultWmsLocationId() {
        return rboDefaultWmsLocationId;
    }

    /**
     * Sets the value of the rboDefaultWmsLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRboDefaultWmsLocationId(JAXBElement<String> value) {
        this.rboDefaultWmsLocationId = value;
    }

    /**
     * Gets the value of the rboDefaultWmsPalletId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRboDefaultWmsPalletId() {
        return rboDefaultWmsPalletId;
    }

    /**
     * Sets the value of the rboDefaultWmsPalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRboDefaultWmsPalletId(JAXBElement<String> value) {
        this.rboDefaultWmsPalletId = value;
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
     * Gets the value of the removeInventBlockingOnStatusChange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemoveInventBlockingOnStatusChange() {
        return removeInventBlockingOnStatusChange;
    }

    /**
     * Sets the value of the removeInventBlockingOnStatusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemoveInventBlockingOnStatusChange(Integer value) {
        this.removeInventBlockingOnStatusChange = value;
    }

    /**
     * Gets the value of the reqCalendarId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReqCalendarId() {
        return reqCalendarId;
    }

    /**
     * Sets the value of the reqCalendarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReqCalendarId(JAXBElement<String> value) {
        this.reqCalendarId = value;
    }

    /**
     * Gets the value of the reqRefill property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqRefill() {
        return reqRefill;
    }

    /**
     * Sets the value of the reqRefill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqRefill(Integer value) {
        this.reqRefill = value;
    }

    /**
     * Gets the value of the reserveAtLoadPost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReserveAtLoadPost() {
        return reserveAtLoadPost;
    }

    /**
     * Sets the value of the reserveAtLoadPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReserveAtLoadPost(Integer value) {
        this.reserveAtLoadPost = value;
    }

    /**
     * Gets the value of the retailInventNegFinancial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetailInventNegFinancial() {
        return retailInventNegFinancial;
    }

    /**
     * Sets the value of the retailInventNegFinancial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetailInventNegFinancial(Integer value) {
        this.retailInventNegFinancial = value;
    }

    /**
     * Gets the value of the retailInventNegPhysical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetailInventNegPhysical() {
        return retailInventNegPhysical;
    }

    /**
     * Sets the value of the retailInventNegPhysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetailInventNegPhysical(Integer value) {
        this.retailInventNegPhysical = value;
    }

    /**
     * Gets the value of the retailWeightEX1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetailWeightEX1() {
        return retailWeightEX1;
    }

    /**
     * Sets the value of the retailWeightEX1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetailWeightEX1(BigDecimal value) {
        this.retailWeightEX1 = value;
    }

    /**
     * Gets the value of the retailWmsLocationIdDefaultReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailWmsLocationIdDefaultReturn() {
        return retailWmsLocationIdDefaultReturn;
    }

    /**
     * Sets the value of the retailWmsLocationIdDefaultReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailWmsLocationIdDefaultReturn(JAXBElement<String> value) {
        this.retailWmsLocationIdDefaultReturn = value;
    }

    /**
     * Gets the value of the retailWmsPalletIdDefaultReturn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetailWmsPalletIdDefaultReturn() {
        return retailWmsPalletIdDefaultReturn;
    }

    /**
     * Sets the value of the retailWmsPalletIdDefaultReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetailWmsPalletIdDefaultReturn(JAXBElement<String> value) {
        this.retailWmsPalletIdDefaultReturn = value;
    }

    /**
     * Gets the value of the uniqueCheckDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueCheckDigits() {
        return uniqueCheckDigits;
    }

    /**
     * Sets the value of the uniqueCheckDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueCheckDigits(Integer value) {
        this.uniqueCheckDigits = value;
    }

    /**
     * Gets the value of the useWmsOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseWmsOrders() {
        return useWmsOrders;
    }

    /**
     * Sets the value of the useWmsOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseWmsOrders(Integer value) {
        this.useWmsOrders = value;
    }

    /**
     * Gets the value of the vendAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendAccount() {
        return vendAccount;
    }

    /**
     * Sets the value of the vendAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendAccount(JAXBElement<String> value) {
        this.vendAccount = value;
    }

    /**
     * Gets the value of the vendAccountCustomRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendAccountCustomRU() {
        return vendAccountCustomRU;
    }

    /**
     * Sets the value of the vendAccountCustomRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendAccountCustomRU(JAXBElement<String> value) {
        this.vendAccountCustomRU = value;
    }

    /**
     * Gets the value of the whsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWHSEnabled() {
        return whsEnabled;
    }

    /**
     * Sets the value of the whsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWHSEnabled(Integer value) {
        this.whsEnabled = value;
    }

    /**
     * Gets the value of the warehouseAutoReleaseReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWarehouseAutoReleaseReservation() {
        return warehouseAutoReleaseReservation;
    }

    /**
     * Sets the value of the warehouseAutoReleaseReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWarehouseAutoReleaseReservation(Integer value) {
        this.warehouseAutoReleaseReservation = value;
    }

    /**
     * Gets the value of the warehouseHeadworker property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarehouseHeadworker() {
        return warehouseHeadworker;
    }

    /**
     * Sets the value of the warehouseHeadworker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarehouseHeadworker(Long value) {
        this.warehouseHeadworker = value;
    }

    /**
     * Gets the value of the wmsAisleNameActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWmsAisleNameActive() {
        return wmsAisleNameActive;
    }

    /**
     * Sets the value of the wmsAisleNameActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWmsAisleNameActive(Integer value) {
        this.wmsAisleNameActive = value;
    }

    /**
     * Gets the value of the wmsLevelFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsLevelFormat() {
        return wmsLevelFormat;
    }

    /**
     * Sets the value of the wmsLevelFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsLevelFormat(JAXBElement<String> value) {
        this.wmsLevelFormat = value;
    }

    /**
     * Gets the value of the wmsLevelNameActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWmsLevelNameActive() {
        return wmsLevelNameActive;
    }

    /**
     * Sets the value of the wmsLevelNameActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWmsLevelNameActive(Integer value) {
        this.wmsLevelNameActive = value;
    }

    /**
     * Gets the value of the wmsLocationIdDefaultIssue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsLocationIdDefaultIssue() {
        return wmsLocationIdDefaultIssue;
    }

    /**
     * Sets the value of the wmsLocationIdDefaultIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsLocationIdDefaultIssue(JAXBElement<String> value) {
        this.wmsLocationIdDefaultIssue = value;
    }

    /**
     * Gets the value of the wmsLocationIdDefaultReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsLocationIdDefaultReceipt() {
        return wmsLocationIdDefaultReceipt;
    }

    /**
     * Sets the value of the wmsLocationIdDefaultReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsLocationIdDefaultReceipt(JAXBElement<String> value) {
        this.wmsLocationIdDefaultReceipt = value;
    }

    /**
     * Gets the value of the wmsLocationIdGoodsInRouteRU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsLocationIdGoodsInRouteRU() {
        return wmsLocationIdGoodsInRouteRU;
    }

    /**
     * Sets the value of the wmsLocationIdGoodsInRouteRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsLocationIdGoodsInRouteRU(JAXBElement<String> value) {
        this.wmsLocationIdGoodsInRouteRU = value;
    }

    /**
     * Gets the value of the wmsPositionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsPositionFormat() {
        return wmsPositionFormat;
    }

    /**
     * Sets the value of the wmsPositionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsPositionFormat(JAXBElement<String> value) {
        this.wmsPositionFormat = value;
    }

    /**
     * Gets the value of the wmsPositionNameActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWmsPositionNameActive() {
        return wmsPositionNameActive;
    }

    /**
     * Sets the value of the wmsPositionNameActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWmsPositionNameActive(Integer value) {
        this.wmsPositionNameActive = value;
    }

    /**
     * Gets the value of the wmsRackFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWmsRackFormat() {
        return wmsRackFormat;
    }

    /**
     * Sets the value of the wmsRackFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWmsRackFormat(JAXBElement<String> value) {
        this.wmsRackFormat = value;
    }

    /**
     * Gets the value of the wmsRackNameActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWmsRackNameActive() {
        return wmsRackNameActive;
    }

    /**
     * Sets the value of the wmsRackNameActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWmsRackNameActive(Integer value) {
        this.wmsRackNameActive = value;
    }

}
