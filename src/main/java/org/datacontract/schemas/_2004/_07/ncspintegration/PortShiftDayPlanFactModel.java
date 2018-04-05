
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
 * <p>Java class for PortShiftDayPlanFactModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortShiftDayPlanFactModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DockerPlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DownTimeReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactPackingUnitQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FactVehicleQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FactWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IdleTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsCompleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ShiftDayPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaskNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechLineQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkEndTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkStartTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortShiftDayPlanFactModel", propOrder = {
    "comment",
    "createdBy",
    "createdDatetime",
    "dockerPlan",
    "downTimeReasonId",
    "factPackingUnitQty",
    "factVehicleQty",
    "factWeight",
    "idleTime",
    "isCompleted",
    "modifiedBy",
    "modifiedDatetime",
    "recId",
    "shiftDayPlanId",
    "taskNotes",
    "techLineQty",
    "workEndDate",
    "workEndTime",
    "workStartDate",
    "workStartTime"
})
public class PortShiftDayPlanFactModel {

    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "DockerPlan")
    protected Integer dockerPlan;
    @XmlElementRef(name = "DownTimeReasonId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downTimeReasonId;
    @XmlElement(name = "FactPackingUnitQty")
    protected BigDecimal factPackingUnitQty;
    @XmlElement(name = "FactVehicleQty")
    protected Integer factVehicleQty;
    @XmlElement(name = "FactWeight")
    protected BigDecimal factWeight;
    @XmlElement(name = "IdleTime")
    protected BigDecimal idleTime;
    @XmlElement(name = "IsCompleted")
    protected Integer isCompleted;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElementRef(name = "ShiftDayPlanId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftDayPlanId;
    @XmlElementRef(name = "TaskNotes", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskNotes;
    @XmlElement(name = "TechLineQty")
    protected Integer techLineQty;
    @XmlElement(name = "WorkEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workEndDate;
    @XmlElement(name = "WorkEndTime")
    protected Integer workEndTime;
    @XmlElement(name = "WorkStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workStartDate;
    @XmlElement(name = "WorkStartTime")
    protected Integer workStartTime;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
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
     * Gets the value of the dockerPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDockerPlan() {
        return dockerPlan;
    }

    /**
     * Sets the value of the dockerPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDockerPlan(Integer value) {
        this.dockerPlan = value;
    }

    /**
     * Gets the value of the downTimeReasonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownTimeReasonId() {
        return downTimeReasonId;
    }

    /**
     * Sets the value of the downTimeReasonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownTimeReasonId(JAXBElement<String> value) {
        this.downTimeReasonId = value;
    }

    /**
     * Gets the value of the factPackingUnitQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactPackingUnitQty() {
        return factPackingUnitQty;
    }

    /**
     * Sets the value of the factPackingUnitQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactPackingUnitQty(BigDecimal value) {
        this.factPackingUnitQty = value;
    }

    /**
     * Gets the value of the factVehicleQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFactVehicleQty() {
        return factVehicleQty;
    }

    /**
     * Sets the value of the factVehicleQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFactVehicleQty(Integer value) {
        this.factVehicleQty = value;
    }

    /**
     * Gets the value of the factWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactWeight() {
        return factWeight;
    }

    /**
     * Sets the value of the factWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactWeight(BigDecimal value) {
        this.factWeight = value;
    }

    /**
     * Gets the value of the idleTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdleTime() {
        return idleTime;
    }

    /**
     * Sets the value of the idleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdleTime(BigDecimal value) {
        this.idleTime = value;
    }

    /**
     * Gets the value of the isCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsCompleted(Integer value) {
        this.isCompleted = value;
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
     * Gets the value of the taskNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskNotes() {
        return taskNotes;
    }

    /**
     * Sets the value of the taskNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskNotes(JAXBElement<String> value) {
        this.taskNotes = value;
    }

    /**
     * Gets the value of the techLineQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTechLineQty() {
        return techLineQty;
    }

    /**
     * Sets the value of the techLineQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTechLineQty(Integer value) {
        this.techLineQty = value;
    }

    /**
     * Gets the value of the workEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkEndDate() {
        return workEndDate;
    }

    /**
     * Sets the value of the workEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkEndDate(XMLGregorianCalendar value) {
        this.workEndDate = value;
    }

    /**
     * Gets the value of the workEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkEndTime() {
        return workEndTime;
    }

    /**
     * Sets the value of the workEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkEndTime(Integer value) {
        this.workEndTime = value;
    }

    /**
     * Gets the value of the workStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkStartDate() {
        return workStartDate;
    }

    /**
     * Sets the value of the workStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkStartDate(XMLGregorianCalendar value) {
        this.workStartDate = value;
    }

    /**
     * Gets the value of the workStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkStartTime() {
        return workStartTime;
    }

    /**
     * Sets the value of the workStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkStartTime(Integer value) {
        this.workStartTime = value;
    }

}
