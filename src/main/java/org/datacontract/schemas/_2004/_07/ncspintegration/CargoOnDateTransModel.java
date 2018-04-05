
package org.datacontract.schemas._2004._07.ncspintegration;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CargoOnDateTransModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoOnDateTransModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CargoExportImport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CargoExportImportCabotage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CargoOnHandOnDateTable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CargoPlaceTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EcoresItemLabelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InventOwnerIdRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyPcs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StorageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasureClassGeneral" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoOnDateTransModel", propOrder = {
    "cargoExportImport",
    "cargoExportImportCabotage",
    "cargoOnHandOnDateTable",
    "cargoPlaceTypeId",
    "ecoresItemLabelName",
    "grossWeight",
    "inventOwnerIdRu",
    "netWeight",
    "qty",
    "qtyPcs",
    "recId",
    "storageType",
    "unitOfMeasureClassGeneral"
})
public class CargoOnDateTransModel {

    @XmlElement(name = "CargoExportImport")
    protected Integer cargoExportImport;
    @XmlElement(name = "CargoExportImportCabotage")
    protected Integer cargoExportImportCabotage;
    @XmlElement(name = "CargoOnHandOnDateTable")
    protected Long cargoOnHandOnDateTable;
    @XmlElementRef(name = "CargoPlaceTypeId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoPlaceTypeId;
    @XmlElementRef(name = "EcoresItemLabelName", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoresItemLabelName;
    @XmlElement(name = "GrossWeight")
    protected BigDecimal grossWeight;
    @XmlElementRef(name = "InventOwnerIdRu", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventOwnerIdRu;
    @XmlElement(name = "NetWeight")
    protected BigDecimal netWeight;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "QtyPcs")
    protected BigDecimal qtyPcs;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "StorageType")
    protected Integer storageType;
    @XmlElement(name = "UnitOfMeasureClassGeneral")
    protected Integer unitOfMeasureClassGeneral;

    /**
     * Gets the value of the cargoExportImport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCargoExportImport() {
        return cargoExportImport;
    }

    /**
     * Sets the value of the cargoExportImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCargoExportImport(Integer value) {
        this.cargoExportImport = value;
    }

    /**
     * Gets the value of the cargoExportImportCabotage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCargoExportImportCabotage() {
        return cargoExportImportCabotage;
    }

    /**
     * Sets the value of the cargoExportImportCabotage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCargoExportImportCabotage(Integer value) {
        this.cargoExportImportCabotage = value;
    }

    /**
     * Gets the value of the cargoOnHandOnDateTable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoOnHandOnDateTable() {
        return cargoOnHandOnDateTable;
    }

    /**
     * Sets the value of the cargoOnHandOnDateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoOnHandOnDateTable(Long value) {
        this.cargoOnHandOnDateTable = value;
    }

    /**
     * Gets the value of the cargoPlaceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoPlaceTypeId() {
        return cargoPlaceTypeId;
    }

    /**
     * Sets the value of the cargoPlaceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoPlaceTypeId(JAXBElement<String> value) {
        this.cargoPlaceTypeId = value;
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
     * Gets the value of the inventOwnerIdRu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventOwnerIdRu() {
        return inventOwnerIdRu;
    }

    /**
     * Sets the value of the inventOwnerIdRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventOwnerIdRu(JAXBElement<String> value) {
        this.inventOwnerIdRu = value;
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
     * Gets the value of the qtyPcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyPcs() {
        return qtyPcs;
    }

    /**
     * Sets the value of the qtyPcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyPcs(BigDecimal value) {
        this.qtyPcs = value;
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
     * Gets the value of the unitOfMeasureClassGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitOfMeasureClassGeneral() {
        return unitOfMeasureClassGeneral;
    }

    /**
     * Sets the value of the unitOfMeasureClassGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitOfMeasureClassGeneral(Integer value) {
        this.unitOfMeasureClassGeneral = value;
    }

}
