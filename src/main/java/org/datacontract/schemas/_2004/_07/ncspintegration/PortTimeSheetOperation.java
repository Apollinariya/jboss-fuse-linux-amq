
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
 * <p>Java class for PortTimeSheetOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortTimeSheetOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MechanizedLinesMandatory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Meteo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonProductionDownTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NotCalculatedGrossTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParkingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Responsibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimesheetOperationsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimesheetOperationsType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WatingCar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortTimeSheetOperation", propOrder = {
    "createdBy",
    "createdDatetime",
    "description",
    "duration",
    "mechanizedLinesMandatory",
    "meteo",
    "modifiedBy",
    "modifiedDatetime",
    "name",
    "nonProductionDownTime",
    "notCalculatedGrossTime",
    "parkingTime",
    "recId",
    "responsibility",
    "timesheetOperationsId",
    "timesheetOperationsType",
    "watingCar"
})
public class PortTimeSheetOperation {

    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Duration")
    protected BigDecimal duration;
    @XmlElement(name = "MechanizedLinesMandatory")
    protected Integer mechanizedLinesMandatory;
    @XmlElement(name = "Meteo")
    protected Integer meteo;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NonProductionDownTime")
    protected Integer nonProductionDownTime;
    @XmlElement(name = "NotCalculatedGrossTime")
    protected Integer notCalculatedGrossTime;
    @XmlElement(name = "ParkingTime")
    protected Integer parkingTime;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "Responsibility")
    protected Integer responsibility;
    @XmlElementRef(name = "TimesheetOperationsId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timesheetOperationsId;
    @XmlElement(name = "TimesheetOperationsType")
    protected Integer timesheetOperationsType;
    @XmlElement(name = "WatingCar")
    protected Integer watingCar;

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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuration(BigDecimal value) {
        this.duration = value;
    }

    /**
     * Gets the value of the mechanizedLinesMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMechanizedLinesMandatory() {
        return mechanizedLinesMandatory;
    }

    /**
     * Sets the value of the mechanizedLinesMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMechanizedLinesMandatory(Integer value) {
        this.mechanizedLinesMandatory = value;
    }

    /**
     * Gets the value of the meteo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeteo() {
        return meteo;
    }

    /**
     * Sets the value of the meteo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeteo(Integer value) {
        this.meteo = value;
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
     * Gets the value of the nonProductionDownTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonProductionDownTime() {
        return nonProductionDownTime;
    }

    /**
     * Sets the value of the nonProductionDownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonProductionDownTime(Integer value) {
        this.nonProductionDownTime = value;
    }

    /**
     * Gets the value of the notCalculatedGrossTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotCalculatedGrossTime() {
        return notCalculatedGrossTime;
    }

    /**
     * Sets the value of the notCalculatedGrossTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotCalculatedGrossTime(Integer value) {
        this.notCalculatedGrossTime = value;
    }

    /**
     * Gets the value of the parkingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParkingTime() {
        return parkingTime;
    }

    /**
     * Sets the value of the parkingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParkingTime(Integer value) {
        this.parkingTime = value;
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
     * Gets the value of the responsibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponsibility() {
        return responsibility;
    }

    /**
     * Sets the value of the responsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponsibility(Integer value) {
        this.responsibility = value;
    }

    /**
     * Gets the value of the timesheetOperationsId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimesheetOperationsId() {
        return timesheetOperationsId;
    }

    /**
     * Sets the value of the timesheetOperationsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimesheetOperationsId(JAXBElement<String> value) {
        this.timesheetOperationsId = value;
    }

    /**
     * Gets the value of the timesheetOperationsType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimesheetOperationsType() {
        return timesheetOperationsType;
    }

    /**
     * Sets the value of the timesheetOperationsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimesheetOperationsType(Integer value) {
        this.timesheetOperationsType = value;
    }

    /**
     * Gets the value of the watingCar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatingCar() {
        return watingCar;
    }

    /**
     * Sets the value of the watingCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatingCar(Integer value) {
        this.watingCar = value;
    }

}
