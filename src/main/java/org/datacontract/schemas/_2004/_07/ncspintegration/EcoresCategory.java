
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
 * <p>Java class for EcoresCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcoresCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryHierarchy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DefaultProjectGlobalCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultThresHoldPsn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPlanReportSorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstanceRelationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsCategoryAttributesInherited" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsGrouping" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsTangible" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NestedSetLeft" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NestedSetRight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NotInReportPlanDelivery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParentCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PkwiuCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortCargoType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrintNumberPiecesLocationImport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrintNumberPiecesNoticeAct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RelationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Reporting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReuseEnabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sorting" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcoresCategory", propOrder = {
    "categoryHierarchy",
    "changeStatus",
    "code",
    "color",
    "createdBy",
    "createdDatetime",
    "defaultProjectGlobalCategory",
    "defaultThresHoldPsn",
    "deliveryPlanReportSorting",
    "instanceRelationType",
    "isActive",
    "isCategoryAttributesInherited",
    "isGrouping",
    "isTangible",
    "level",
    "modifiedBy",
    "modifiedDatetime",
    "name",
    "nestedSetLeft",
    "nestedSetRight",
    "notInReportPlanDelivery",
    "parentCategory",
    "pkwiuCode",
    "portCargoType",
    "printNumberPiecesLocationImport",
    "printNumberPiecesNoticeAct",
    "recId",
    "relationType",
    "reporting",
    "reuseEnabled",
    "sorting"
})
public class EcoresCategory {

    @XmlElement(name = "CategoryHierarchy")
    protected Long categoryHierarchy;
    @XmlElement(name = "ChangeStatus")
    protected Integer changeStatus;
    @XmlElementRef(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElement(name = "Color")
    protected Integer color;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "DefaultProjectGlobalCategory")
    protected Long defaultProjectGlobalCategory;
    @XmlElement(name = "DefaultThresHoldPsn")
    protected BigDecimal defaultThresHoldPsn;
    @XmlElement(name = "DeliveryPlanReportSorting")
    protected Integer deliveryPlanReportSorting;
    @XmlElement(name = "InstanceRelationType")
    protected Long instanceRelationType;
    @XmlElement(name = "IsActive")
    protected Integer isActive;
    @XmlElement(name = "IsCategoryAttributesInherited")
    protected Integer isCategoryAttributesInherited;
    @XmlElement(name = "IsGrouping")
    protected Integer isGrouping;
    @XmlElement(name = "IsTangible")
    protected Integer isTangible;
    @XmlElement(name = "Level")
    protected Long level;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NestedSetLeft")
    protected Long nestedSetLeft;
    @XmlElement(name = "NestedSetRight")
    protected Long nestedSetRight;
    @XmlElement(name = "NotInReportPlanDelivery")
    protected Integer notInReportPlanDelivery;
    @XmlElement(name = "ParentCategory")
    protected Long parentCategory;
    @XmlElementRef(name = "PkwiuCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pkwiuCode;
    @XmlElement(name = "PortCargoType")
    protected Integer portCargoType;
    @XmlElement(name = "PrintNumberPiecesLocationImport")
    protected Integer printNumberPiecesLocationImport;
    @XmlElement(name = "PrintNumberPiecesNoticeAct")
    protected Integer printNumberPiecesNoticeAct;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RelationType")
    protected Long relationType;
    @XmlElement(name = "Reporting")
    protected Integer reporting;
    @XmlElementRef(name = "ReuseEnabled", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reuseEnabled;
    @XmlElement(name = "Sorting")
    protected Integer sorting;

    /**
     * Gets the value of the categoryHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategoryHierarchy() {
        return categoryHierarchy;
    }

    /**
     * Sets the value of the categoryHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategoryHierarchy(Long value) {
        this.categoryHierarchy = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeStatus(Integer value) {
        this.changeStatus = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColor(Integer value) {
        this.color = value;
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
     * Gets the value of the defaultProjectGlobalCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultProjectGlobalCategory() {
        return defaultProjectGlobalCategory;
    }

    /**
     * Sets the value of the defaultProjectGlobalCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultProjectGlobalCategory(Long value) {
        this.defaultProjectGlobalCategory = value;
    }

    /**
     * Gets the value of the defaultThresHoldPsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultThresHoldPsn() {
        return defaultThresHoldPsn;
    }

    /**
     * Sets the value of the defaultThresHoldPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultThresHoldPsn(BigDecimal value) {
        this.defaultThresHoldPsn = value;
    }

    /**
     * Gets the value of the deliveryPlanReportSorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryPlanReportSorting() {
        return deliveryPlanReportSorting;
    }

    /**
     * Sets the value of the deliveryPlanReportSorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryPlanReportSorting(Integer value) {
        this.deliveryPlanReportSorting = value;
    }

    /**
     * Gets the value of the instanceRelationType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstanceRelationType() {
        return instanceRelationType;
    }

    /**
     * Sets the value of the instanceRelationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstanceRelationType(Long value) {
        this.instanceRelationType = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsActive(Integer value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isCategoryAttributesInherited property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsCategoryAttributesInherited() {
        return isCategoryAttributesInherited;
    }

    /**
     * Sets the value of the isCategoryAttributesInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsCategoryAttributesInherited(Integer value) {
        this.isCategoryAttributesInherited = value;
    }

    /**
     * Gets the value of the isGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsGrouping() {
        return isGrouping;
    }

    /**
     * Sets the value of the isGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsGrouping(Integer value) {
        this.isGrouping = value;
    }

    /**
     * Gets the value of the isTangible property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsTangible() {
        return isTangible;
    }

    /**
     * Sets the value of the isTangible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsTangible(Integer value) {
        this.isTangible = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLevel(Long value) {
        this.level = value;
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
     * Gets the value of the nestedSetLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNestedSetLeft() {
        return nestedSetLeft;
    }

    /**
     * Sets the value of the nestedSetLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNestedSetLeft(Long value) {
        this.nestedSetLeft = value;
    }

    /**
     * Gets the value of the nestedSetRight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNestedSetRight() {
        return nestedSetRight;
    }

    /**
     * Sets the value of the nestedSetRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNestedSetRight(Long value) {
        this.nestedSetRight = value;
    }

    /**
     * Gets the value of the notInReportPlanDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotInReportPlanDelivery() {
        return notInReportPlanDelivery;
    }

    /**
     * Sets the value of the notInReportPlanDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotInReportPlanDelivery(Integer value) {
        this.notInReportPlanDelivery = value;
    }

    /**
     * Gets the value of the parentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCategory() {
        return parentCategory;
    }

    /**
     * Sets the value of the parentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCategory(Long value) {
        this.parentCategory = value;
    }

    /**
     * Gets the value of the pkwiuCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPkwiuCode() {
        return pkwiuCode;
    }

    /**
     * Sets the value of the pkwiuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPkwiuCode(JAXBElement<String> value) {
        this.pkwiuCode = value;
    }

    /**
     * Gets the value of the portCargoType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortCargoType() {
        return portCargoType;
    }

    /**
     * Sets the value of the portCargoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortCargoType(Integer value) {
        this.portCargoType = value;
    }

    /**
     * Gets the value of the printNumberPiecesLocationImport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrintNumberPiecesLocationImport() {
        return printNumberPiecesLocationImport;
    }

    /**
     * Sets the value of the printNumberPiecesLocationImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrintNumberPiecesLocationImport(Integer value) {
        this.printNumberPiecesLocationImport = value;
    }

    /**
     * Gets the value of the printNumberPiecesNoticeAct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrintNumberPiecesNoticeAct() {
        return printNumberPiecesNoticeAct;
    }

    /**
     * Sets the value of the printNumberPiecesNoticeAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrintNumberPiecesNoticeAct(Integer value) {
        this.printNumberPiecesNoticeAct = value;
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
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelationType(Long value) {
        this.relationType = value;
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReporting(Integer value) {
        this.reporting = value;
    }

    /**
     * Gets the value of the reuseEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReuseEnabled() {
        return reuseEnabled;
    }

    /**
     * Sets the value of the reuseEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReuseEnabled(JAXBElement<Integer> value) {
        this.reuseEnabled = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSorting(Integer value) {
        this.sorting = value;
    }

}
