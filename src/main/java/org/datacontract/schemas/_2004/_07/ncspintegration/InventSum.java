
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
 * <p>Java class for InventSum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventSum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arrived" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AvailOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AvailPhysical" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClosedQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Deducted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InventDimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpddateExpected" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpddatePhysical" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OnOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWArrived" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWAvailOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWAvailPhysical" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWDeducted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWOnOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWPhysicalInvent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWPicked" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWPostedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWQUotationReceipt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWQuotationIssue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWREgistered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWReceived" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWReservOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PDSCWReservPhysical" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalInvent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalValueSecCur_RU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Picked" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PostedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PostedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PostedValueSecCur_RU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QuotationIssue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QuotationReceipt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Received" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Registered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ReservOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ReservPhysical" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventSum", propOrder = {
    "arrived",
    "availOrdered",
    "availPhysical",
    "closed",
    "closedQty",
    "deducted",
    "inventDimId",
    "itemId",
    "lastUpddateExpected",
    "lastUpddatePhysical",
    "modifiedDateTime",
    "onOrder",
    "ordered",
    "pdscwArrived",
    "pdscwAvailOrdered",
    "pdscwAvailPhysical",
    "pdscwDeducted",
    "pdscwOnOrder",
    "pdscwOrdered",
    "pdscwPhysicalInvent",
    "pdscwPicked",
    "pdscwPostedQty",
    "pdscwqUotationReceipt",
    "pdscwQuotationIssue",
    "pdscwrEgistered",
    "pdscwReceived",
    "pdscwReservOrdered",
    "pdscwReservPhysical",
    "physicalInvent",
    "physicalValue",
    "physicalValueSecCurRU",
    "picked",
    "postedQty",
    "postedValue",
    "postedValueSecCurRU",
    "quotationIssue",
    "quotationReceipt",
    "recId",
    "received",
    "registered",
    "reservOrdered",
    "reservPhysical"
})
public class InventSum {

    @XmlElement(name = "Arrived")
    protected BigDecimal arrived;
    @XmlElement(name = "AvailOrdered")
    protected BigDecimal availOrdered;
    @XmlElement(name = "AvailPhysical")
    protected BigDecimal availPhysical;
    @XmlElement(name = "Closed")
    protected Integer closed;
    @XmlElement(name = "ClosedQty")
    protected Integer closedQty;
    @XmlElement(name = "Deducted")
    protected BigDecimal deducted;
    @XmlElementRef(name = "InventDimId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventDimId;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemId;
    @XmlElement(name = "LastUpddateExpected")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpddateExpected;
    @XmlElement(name = "LastUpddatePhysical")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpddatePhysical;
    @XmlElement(name = "ModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDateTime;
    @XmlElement(name = "OnOrder")
    protected BigDecimal onOrder;
    @XmlElement(name = "Ordered")
    protected BigDecimal ordered;
    @XmlElement(name = "PDSCWArrived")
    protected BigDecimal pdscwArrived;
    @XmlElement(name = "PDSCWAvailOrdered")
    protected BigDecimal pdscwAvailOrdered;
    @XmlElement(name = "PDSCWAvailPhysical")
    protected BigDecimal pdscwAvailPhysical;
    @XmlElement(name = "PDSCWDeducted")
    protected BigDecimal pdscwDeducted;
    @XmlElement(name = "PDSCWOnOrder")
    protected BigDecimal pdscwOnOrder;
    @XmlElement(name = "PDSCWOrdered")
    protected BigDecimal pdscwOrdered;
    @XmlElement(name = "PDSCWPhysicalInvent")
    protected BigDecimal pdscwPhysicalInvent;
    @XmlElement(name = "PDSCWPicked")
    protected BigDecimal pdscwPicked;
    @XmlElement(name = "PDSCWPostedQty")
    protected BigDecimal pdscwPostedQty;
    @XmlElement(name = "PDSCWQUotationReceipt")
    protected BigDecimal pdscwqUotationReceipt;
    @XmlElement(name = "PDSCWQuotationIssue")
    protected BigDecimal pdscwQuotationIssue;
    @XmlElement(name = "PDSCWREgistered")
    protected BigDecimal pdscwrEgistered;
    @XmlElement(name = "PDSCWReceived")
    protected BigDecimal pdscwReceived;
    @XmlElement(name = "PDSCWReservOrdered")
    protected BigDecimal pdscwReservOrdered;
    @XmlElement(name = "PDSCWReservPhysical")
    protected BigDecimal pdscwReservPhysical;
    @XmlElement(name = "PhysicalInvent")
    protected BigDecimal physicalInvent;
    @XmlElement(name = "PhysicalValue")
    protected BigDecimal physicalValue;
    @XmlElement(name = "PhysicalValueSecCur_RU")
    protected BigDecimal physicalValueSecCurRU;
    @XmlElement(name = "Picked")
    protected BigDecimal picked;
    @XmlElement(name = "PostedQty")
    protected BigDecimal postedQty;
    @XmlElement(name = "PostedValue")
    protected BigDecimal postedValue;
    @XmlElement(name = "PostedValueSecCur_RU")
    protected BigDecimal postedValueSecCurRU;
    @XmlElement(name = "QuotationIssue")
    protected BigDecimal quotationIssue;
    @XmlElement(name = "QuotationReceipt")
    protected BigDecimal quotationReceipt;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "Received")
    protected BigDecimal received;
    @XmlElement(name = "Registered")
    protected BigDecimal registered;
    @XmlElement(name = "ReservOrdered")
    protected BigDecimal reservOrdered;
    @XmlElement(name = "ReservPhysical")
    protected BigDecimal reservPhysical;

    /**
     * Gets the value of the arrived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArrived() {
        return arrived;
    }

    /**
     * Sets the value of the arrived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArrived(BigDecimal value) {
        this.arrived = value;
    }

    /**
     * Gets the value of the availOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailOrdered() {
        return availOrdered;
    }

    /**
     * Sets the value of the availOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailOrdered(BigDecimal value) {
        this.availOrdered = value;
    }

    /**
     * Gets the value of the availPhysical property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailPhysical() {
        return availPhysical;
    }

    /**
     * Sets the value of the availPhysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailPhysical(BigDecimal value) {
        this.availPhysical = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClosed(Integer value) {
        this.closed = value;
    }

    /**
     * Gets the value of the closedQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClosedQty() {
        return closedQty;
    }

    /**
     * Sets the value of the closedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClosedQty(Integer value) {
        this.closedQty = value;
    }

    /**
     * Gets the value of the deducted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeducted() {
        return deducted;
    }

    /**
     * Sets the value of the deducted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeducted(BigDecimal value) {
        this.deducted = value;
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
     * Gets the value of the lastUpddateExpected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpddateExpected() {
        return lastUpddateExpected;
    }

    /**
     * Sets the value of the lastUpddateExpected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpddateExpected(XMLGregorianCalendar value) {
        this.lastUpddateExpected = value;
    }

    /**
     * Gets the value of the lastUpddatePhysical property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpddatePhysical() {
        return lastUpddatePhysical;
    }

    /**
     * Sets the value of the lastUpddatePhysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpddatePhysical(XMLGregorianCalendar value) {
        this.lastUpddatePhysical = value;
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
     * Gets the value of the onOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnOrder() {
        return onOrder;
    }

    /**
     * Sets the value of the onOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnOrder(BigDecimal value) {
        this.onOrder = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdered(BigDecimal value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the pdscwArrived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWArrived() {
        return pdscwArrived;
    }

    /**
     * Sets the value of the pdscwArrived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWArrived(BigDecimal value) {
        this.pdscwArrived = value;
    }

    /**
     * Gets the value of the pdscwAvailOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWAvailOrdered() {
        return pdscwAvailOrdered;
    }

    /**
     * Sets the value of the pdscwAvailOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWAvailOrdered(BigDecimal value) {
        this.pdscwAvailOrdered = value;
    }

    /**
     * Gets the value of the pdscwAvailPhysical property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWAvailPhysical() {
        return pdscwAvailPhysical;
    }

    /**
     * Sets the value of the pdscwAvailPhysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWAvailPhysical(BigDecimal value) {
        this.pdscwAvailPhysical = value;
    }

    /**
     * Gets the value of the pdscwDeducted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWDeducted() {
        return pdscwDeducted;
    }

    /**
     * Sets the value of the pdscwDeducted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWDeducted(BigDecimal value) {
        this.pdscwDeducted = value;
    }

    /**
     * Gets the value of the pdscwOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWOnOrder() {
        return pdscwOnOrder;
    }

    /**
     * Sets the value of the pdscwOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWOnOrder(BigDecimal value) {
        this.pdscwOnOrder = value;
    }

    /**
     * Gets the value of the pdscwOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWOrdered() {
        return pdscwOrdered;
    }

    /**
     * Sets the value of the pdscwOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWOrdered(BigDecimal value) {
        this.pdscwOrdered = value;
    }

    /**
     * Gets the value of the pdscwPhysicalInvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWPhysicalInvent() {
        return pdscwPhysicalInvent;
    }

    /**
     * Sets the value of the pdscwPhysicalInvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWPhysicalInvent(BigDecimal value) {
        this.pdscwPhysicalInvent = value;
    }

    /**
     * Gets the value of the pdscwPicked property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWPicked() {
        return pdscwPicked;
    }

    /**
     * Sets the value of the pdscwPicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWPicked(BigDecimal value) {
        this.pdscwPicked = value;
    }

    /**
     * Gets the value of the pdscwPostedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWPostedQty() {
        return pdscwPostedQty;
    }

    /**
     * Sets the value of the pdscwPostedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWPostedQty(BigDecimal value) {
        this.pdscwPostedQty = value;
    }

    /**
     * Gets the value of the pdscwqUotationReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWQUotationReceipt() {
        return pdscwqUotationReceipt;
    }

    /**
     * Sets the value of the pdscwqUotationReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWQUotationReceipt(BigDecimal value) {
        this.pdscwqUotationReceipt = value;
    }

    /**
     * Gets the value of the pdscwQuotationIssue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWQuotationIssue() {
        return pdscwQuotationIssue;
    }

    /**
     * Sets the value of the pdscwQuotationIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWQuotationIssue(BigDecimal value) {
        this.pdscwQuotationIssue = value;
    }

    /**
     * Gets the value of the pdscwrEgistered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWREgistered() {
        return pdscwrEgistered;
    }

    /**
     * Sets the value of the pdscwrEgistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWREgistered(BigDecimal value) {
        this.pdscwrEgistered = value;
    }

    /**
     * Gets the value of the pdscwReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWReceived() {
        return pdscwReceived;
    }

    /**
     * Sets the value of the pdscwReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWReceived(BigDecimal value) {
        this.pdscwReceived = value;
    }

    /**
     * Gets the value of the pdscwReservOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWReservOrdered() {
        return pdscwReservOrdered;
    }

    /**
     * Sets the value of the pdscwReservOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWReservOrdered(BigDecimal value) {
        this.pdscwReservOrdered = value;
    }

    /**
     * Gets the value of the pdscwReservPhysical property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPDSCWReservPhysical() {
        return pdscwReservPhysical;
    }

    /**
     * Sets the value of the pdscwReservPhysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPDSCWReservPhysical(BigDecimal value) {
        this.pdscwReservPhysical = value;
    }

    /**
     * Gets the value of the physicalInvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhysicalInvent() {
        return physicalInvent;
    }

    /**
     * Sets the value of the physicalInvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhysicalInvent(BigDecimal value) {
        this.physicalInvent = value;
    }

    /**
     * Gets the value of the physicalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhysicalValue() {
        return physicalValue;
    }

    /**
     * Sets the value of the physicalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhysicalValue(BigDecimal value) {
        this.physicalValue = value;
    }

    /**
     * Gets the value of the physicalValueSecCurRU property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhysicalValueSecCurRU() {
        return physicalValueSecCurRU;
    }

    /**
     * Sets the value of the physicalValueSecCurRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhysicalValueSecCurRU(BigDecimal value) {
        this.physicalValueSecCurRU = value;
    }

    /**
     * Gets the value of the picked property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPicked() {
        return picked;
    }

    /**
     * Sets the value of the picked property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPicked(BigDecimal value) {
        this.picked = value;
    }

    /**
     * Gets the value of the postedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostedQty() {
        return postedQty;
    }

    /**
     * Sets the value of the postedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostedQty(BigDecimal value) {
        this.postedQty = value;
    }

    /**
     * Gets the value of the postedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostedValue() {
        return postedValue;
    }

    /**
     * Sets the value of the postedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostedValue(BigDecimal value) {
        this.postedValue = value;
    }

    /**
     * Gets the value of the postedValueSecCurRU property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostedValueSecCurRU() {
        return postedValueSecCurRU;
    }

    /**
     * Sets the value of the postedValueSecCurRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostedValueSecCurRU(BigDecimal value) {
        this.postedValueSecCurRU = value;
    }

    /**
     * Gets the value of the quotationIssue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationIssue() {
        return quotationIssue;
    }

    /**
     * Sets the value of the quotationIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationIssue(BigDecimal value) {
        this.quotationIssue = value;
    }

    /**
     * Gets the value of the quotationReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotationReceipt() {
        return quotationReceipt;
    }

    /**
     * Sets the value of the quotationReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotationReceipt(BigDecimal value) {
        this.quotationReceipt = value;
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
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceived(BigDecimal value) {
        this.received = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegistered(BigDecimal value) {
        this.registered = value;
    }

    /**
     * Gets the value of the reservOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservOrdered() {
        return reservOrdered;
    }

    /**
     * Sets the value of the reservOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservOrdered(BigDecimal value) {
        this.reservOrdered = value;
    }

    /**
     * Gets the value of the reservPhysical property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservPhysical() {
        return reservPhysical;
    }

    /**
     * Sets the value of the reservPhysical property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservPhysical(BigDecimal value) {
        this.reservPhysical = value;
    }

}
