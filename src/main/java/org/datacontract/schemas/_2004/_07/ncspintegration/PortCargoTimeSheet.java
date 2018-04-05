
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
 * <p>Java class for PortCargoTimeSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortCargoTimeSheet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgreementClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BerthEmployment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedGrossTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedWaitingBerth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CargoTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CargoTimePure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateLcFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateLcTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Demurrage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DemurrageRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Dispatch" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DispatchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EcoResCategoryComModityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EcoResCategoryIdContract" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EcoResCategoryIdGrossRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EconomyOverRun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Forwarder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrossRateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrossRateValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MooringNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NetWeight_Del" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Partition" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyPieces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequestOperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShipIdLeTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TimeSheetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitOfMeasureSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPackagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PortCargoTimeSheet", propOrder = {
    "agreementClassification",
    "agreementId",
    "berthCode",
    "berthEmployment",
    "calculatedGrossTime",
    "calculatedWaitingBerth",
    "cargoTime",
    "cargoTimePure",
    "createdBy",
    "createdDatetime",
    "dataAreaId",
    "dateLcFrom",
    "dateLcTo",
    "demurrage",
    "demurrageRate",
    "direction",
    "dispatch",
    "dispatchRate",
    "ecoResCategoryComModityCode",
    "ecoResCategoryIdContract",
    "ecoResCategoryIdGrossRate",
    "economyOverRun",
    "forwarder",
    "grossRateId",
    "grossRateValue",
    "grossWeight",
    "modifiedBy",
    "modifiedDatetime",
    "mooringNum",
    "netWeightDel",
    "numberOfPieces",
    "partition",
    "qty",
    "qtyPieces",
    "recId",
    "recVersion",
    "requestOperationType",
    "shipIdLeTime",
    "timeSheetId",
    "unitOfMeas",
    "unitOfMeasureSymbol",
    "unitPackagingType",
    "used"
})
public class PortCargoTimeSheet {

    @XmlElementRef(name = "AgreementClassification", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementClassification;
    @XmlElementRef(name = "AgreementId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementId;
    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElement(name = "BerthEmployment")
    protected BigDecimal berthEmployment;
    @XmlElement(name = "CalculatedGrossTime")
    protected BigDecimal calculatedGrossTime;
    @XmlElement(name = "CalculatedWaitingBerth")
    protected BigDecimal calculatedWaitingBerth;
    @XmlElement(name = "CargoTime")
    protected BigDecimal cargoTime;
    @XmlElement(name = "CargoTimePure")
    protected BigDecimal cargoTimePure;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElementRef(name = "DataAreaId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAreaId;
    @XmlElement(name = "DateLcFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLcFrom;
    @XmlElement(name = "DateLcTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLcTo;
    @XmlElement(name = "Demurrage")
    protected BigDecimal demurrage;
    @XmlElement(name = "DemurrageRate")
    protected BigDecimal demurrageRate;
    @XmlElement(name = "Direction")
    protected Integer direction;
    @XmlElement(name = "Dispatch")
    protected BigDecimal dispatch;
    @XmlElement(name = "DispatchRate")
    protected BigDecimal dispatchRate;
    @XmlElementRef(name = "EcoResCategoryComModityCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ecoResCategoryComModityCode;
    @XmlElement(name = "EcoResCategoryIdContract")
    protected Long ecoResCategoryIdContract;
    @XmlElement(name = "EcoResCategoryIdGrossRate")
    protected Long ecoResCategoryIdGrossRate;
    @XmlElement(name = "EconomyOverRun")
    protected BigDecimal economyOverRun;
    @XmlElementRef(name = "Forwarder", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forwarder;
    @XmlElementRef(name = "GrossRateId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grossRateId;
    @XmlElement(name = "GrossRateValue")
    protected BigDecimal grossRateValue;
    @XmlElement(name = "GrossWeight")
    protected BigDecimal grossWeight;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElement(name = "MooringNum")
    protected Integer mooringNum;
    @XmlElement(name = "NetWeight_Del")
    protected BigDecimal netWeightDel;
    @XmlElement(name = "NumberOfPieces")
    protected Long numberOfPieces;
    @XmlElement(name = "Partition")
    protected Long partition;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "QtyPieces")
    protected Integer qtyPieces;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RecVersion")
    protected Integer recVersion;
    @XmlElement(name = "RequestOperationType")
    protected Integer requestOperationType;
    @XmlElement(name = "ShipIdLeTime")
    protected BigDecimal shipIdLeTime;
    @XmlElementRef(name = "TimeSheetId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeSheetId;
    @XmlElementRef(name = "UnitOfMeas", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeas;
    @XmlElementRef(name = "UnitOfMeasureSymbol", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasureSymbol;
    @XmlElementRef(name = "UnitPackagingType", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitPackagingType;
    @XmlElement(name = "Used")
    protected BigDecimal used;

    /**
     * Gets the value of the agreementClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementClassification() {
        return agreementClassification;
    }

    /**
     * Sets the value of the agreementClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementClassification(JAXBElement<String> value) {
        this.agreementClassification = value;
    }

    /**
     * Gets the value of the agreementId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementId(JAXBElement<String> value) {
        this.agreementId = value;
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
     * Gets the value of the dateLcFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLcFrom() {
        return dateLcFrom;
    }

    /**
     * Sets the value of the dateLcFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLcFrom(XMLGregorianCalendar value) {
        this.dateLcFrom = value;
    }

    /**
     * Gets the value of the dateLcTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLcTo() {
        return dateLcTo;
    }

    /**
     * Sets the value of the dateLcTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLcTo(XMLGregorianCalendar value) {
        this.dateLcTo = value;
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
     * Gets the value of the demurrageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDemurrageRate() {
        return demurrageRate;
    }

    /**
     * Sets the value of the demurrageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDemurrageRate(BigDecimal value) {
        this.demurrageRate = value;
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
     * Gets the value of the dispatchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDispatchRate() {
        return dispatchRate;
    }

    /**
     * Sets the value of the dispatchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDispatchRate(BigDecimal value) {
        this.dispatchRate = value;
    }

    /**
     * Gets the value of the ecoResCategoryComModityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEcoResCategoryComModityCode() {
        return ecoResCategoryComModityCode;
    }

    /**
     * Sets the value of the ecoResCategoryComModityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEcoResCategoryComModityCode(JAXBElement<String> value) {
        this.ecoResCategoryComModityCode = value;
    }

    /**
     * Gets the value of the ecoResCategoryIdContract property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEcoResCategoryIdContract() {
        return ecoResCategoryIdContract;
    }

    /**
     * Sets the value of the ecoResCategoryIdContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEcoResCategoryIdContract(Long value) {
        this.ecoResCategoryIdContract = value;
    }

    /**
     * Gets the value of the ecoResCategoryIdGrossRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEcoResCategoryIdGrossRate() {
        return ecoResCategoryIdGrossRate;
    }

    /**
     * Sets the value of the ecoResCategoryIdGrossRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEcoResCategoryIdGrossRate(Long value) {
        this.ecoResCategoryIdGrossRate = value;
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
     * Gets the value of the forwarder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForwarder() {
        return forwarder;
    }

    /**
     * Sets the value of the forwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForwarder(JAXBElement<String> value) {
        this.forwarder = value;
    }

    /**
     * Gets the value of the grossRateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrossRateId() {
        return grossRateId;
    }

    /**
     * Sets the value of the grossRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrossRateId(JAXBElement<String> value) {
        this.grossRateId = value;
    }

    /**
     * Gets the value of the grossRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossRateValue() {
        return grossRateValue;
    }

    /**
     * Sets the value of the grossRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossRateValue(BigDecimal value) {
        this.grossRateValue = value;
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
     * Gets the value of the netWeightDel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeightDel() {
        return netWeightDel;
    }

    /**
     * Sets the value of the netWeightDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeightDel(BigDecimal value) {
        this.netWeightDel = value;
    }

    /**
     * Gets the value of the numberOfPieces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Sets the value of the numberOfPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfPieces(Long value) {
        this.numberOfPieces = value;
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
     * Gets the value of the unitOfMeas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeas() {
        return unitOfMeas;
    }

    /**
     * Sets the value of the unitOfMeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeas(JAXBElement<String> value) {
        this.unitOfMeas = value;
    }

    /**
     * Gets the value of the unitOfMeasureSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasureSymbol() {
        return unitOfMeasureSymbol;
    }

    /**
     * Sets the value of the unitOfMeasureSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasureSymbol(JAXBElement<String> value) {
        this.unitOfMeasureSymbol = value;
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
