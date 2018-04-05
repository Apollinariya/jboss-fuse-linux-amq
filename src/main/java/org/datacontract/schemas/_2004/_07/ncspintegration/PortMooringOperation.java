
package org.datacontract.schemas._2004._07.ncspintegration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PortMooringOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortMooringOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BerthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeBerthing" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeBerthingTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeDeberting" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeDebertingtzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishGrossTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFinishGrossTimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstGrossTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DatetimeFirstGrossTimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MooringNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MooringOperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TimesheetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortMooringOperation", propOrder = {
    "berthCode",
    "createdBy",
    "createdDatetime",
    "datetimeBerthing",
    "datetimeBerthingTzid",
    "datetimeDeberting",
    "datetimeDebertingtzid",
    "datetimeFinishGrossTime",
    "datetimeFinishGrossTimeTzid",
    "datetimeFirstGrossTime",
    "datetimeFirstGrossTimeTzid",
    "modifiedBy",
    "modifiedDatetime",
    "mooringNum",
    "mooringOperationType",
    "recId",
    "timesheetId"
})
public class PortMooringOperation {

    @XmlElementRef(name = "BerthCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> berthCode;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "DatetimeBerthing")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeBerthing;
    @XmlElement(name = "DatetimeBerthingTzid")
    protected Integer datetimeBerthingTzid;
    @XmlElement(name = "DatetimeDeberting")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeDeberting;
    @XmlElement(name = "DatetimeDebertingtzid")
    protected Integer datetimeDebertingtzid;
    @XmlElement(name = "DatetimeFinishGrossTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFinishGrossTime;
    @XmlElement(name = "DatetimeFinishGrossTimeTzid")
    protected Integer datetimeFinishGrossTimeTzid;
    @XmlElement(name = "DatetimeFirstGrossTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeFirstGrossTime;
    @XmlElement(name = "DatetimeFirstGrossTimeTzid")
    protected Integer datetimeFirstGrossTimeTzid;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElement(name = "MooringNum")
    protected Integer mooringNum;
    @XmlElement(name = "MooringOperationType")
    protected Integer mooringOperationType;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElementRef(name = "TimesheetId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timesheetId;

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
     * Gets the value of the datetimeBerthing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeBerthing() {
        return datetimeBerthing;
    }

    /**
     * Sets the value of the datetimeBerthing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeBerthing(XMLGregorianCalendar value) {
        this.datetimeBerthing = value;
    }

    /**
     * Gets the value of the datetimeBerthingTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeBerthingTzid() {
        return datetimeBerthingTzid;
    }

    /**
     * Sets the value of the datetimeBerthingTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeBerthingTzid(Integer value) {
        this.datetimeBerthingTzid = value;
    }

    /**
     * Gets the value of the datetimeDeberting property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeDeberting() {
        return datetimeDeberting;
    }

    /**
     * Sets the value of the datetimeDeberting property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeDeberting(XMLGregorianCalendar value) {
        this.datetimeDeberting = value;
    }

    /**
     * Gets the value of the datetimeDebertingtzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeDebertingtzid() {
        return datetimeDebertingtzid;
    }

    /**
     * Sets the value of the datetimeDebertingtzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeDebertingtzid(Integer value) {
        this.datetimeDebertingtzid = value;
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
     * Gets the value of the datetimeFinishGrossTimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFinishGrossTimeTzid() {
        return datetimeFinishGrossTimeTzid;
    }

    /**
     * Sets the value of the datetimeFinishGrossTimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFinishGrossTimeTzid(Integer value) {
        this.datetimeFinishGrossTimeTzid = value;
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
     * Gets the value of the datetimeFirstGrossTimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatetimeFirstGrossTimeTzid() {
        return datetimeFirstGrossTimeTzid;
    }

    /**
     * Sets the value of the datetimeFirstGrossTimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatetimeFirstGrossTimeTzid(Integer value) {
        this.datetimeFirstGrossTimeTzid = value;
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
     * Gets the value of the mooringOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMooringOperationType() {
        return mooringOperationType;
    }

    /**
     * Sets the value of the mooringOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMooringOperationType(Integer value) {
        this.mooringOperationType = value;
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

}
