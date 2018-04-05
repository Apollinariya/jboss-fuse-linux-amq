
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
 * <p>Java class for AcceptanceActModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptanceActModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptanceActNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Checked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CheckedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckedByDeputyStoreKeeper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CheckedDatetimeTzid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CheckedDeputyStoreKeeper" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryRegionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptanceActModel", propOrder = {
    "acceptanceActNum",
    "checked",
    "checkedBy",
    "checkedByDeputyStoreKeeper",
    "checkedDatetime",
    "checkedDatetimeTzid",
    "checkedDeputyStoreKeeper",
    "comment",
    "countryRegionId",
    "createdBy",
    "createdDatetime",
    "date",
    "modifiedBy",
    "modifiedDatetime",
    "recId"
})
public class AcceptanceActModel {

    @XmlElementRef(name = "AcceptanceActNum", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acceptanceActNum;
    @XmlElement(name = "Checked")
    protected Integer checked;
    @XmlElementRef(name = "CheckedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkedBy;
    @XmlElementRef(name = "CheckedByDeputyStoreKeeper", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkedByDeputyStoreKeeper;
    @XmlElement(name = "CheckedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkedDatetime;
    @XmlElement(name = "CheckedDatetimeTzid")
    protected Integer checkedDatetimeTzid;
    @XmlElement(name = "CheckedDeputyStoreKeeper")
    protected Integer checkedDeputyStoreKeeper;
    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "CountryRegionId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryRegionId;
    @XmlElementRef(name = "CreatedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElement(name = "RecId")
    protected Long recId;

    /**
     * Gets the value of the acceptanceActNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcceptanceActNum() {
        return acceptanceActNum;
    }

    /**
     * Sets the value of the acceptanceActNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcceptanceActNum(JAXBElement<String> value) {
        this.acceptanceActNum = value;
    }

    /**
     * Gets the value of the checked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChecked() {
        return checked;
    }

    /**
     * Sets the value of the checked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChecked(Integer value) {
        this.checked = value;
    }

    /**
     * Gets the value of the checkedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckedBy() {
        return checkedBy;
    }

    /**
     * Sets the value of the checkedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckedBy(JAXBElement<String> value) {
        this.checkedBy = value;
    }

    /**
     * Gets the value of the checkedByDeputyStoreKeeper property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckedByDeputyStoreKeeper() {
        return checkedByDeputyStoreKeeper;
    }

    /**
     * Sets the value of the checkedByDeputyStoreKeeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckedByDeputyStoreKeeper(JAXBElement<String> value) {
        this.checkedByDeputyStoreKeeper = value;
    }

    /**
     * Gets the value of the checkedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckedDatetime() {
        return checkedDatetime;
    }

    /**
     * Sets the value of the checkedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckedDatetime(XMLGregorianCalendar value) {
        this.checkedDatetime = value;
    }

    /**
     * Gets the value of the checkedDatetimeTzid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckedDatetimeTzid() {
        return checkedDatetimeTzid;
    }

    /**
     * Sets the value of the checkedDatetimeTzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckedDatetimeTzid(Integer value) {
        this.checkedDatetimeTzid = value;
    }

    /**
     * Gets the value of the checkedDeputyStoreKeeper property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckedDeputyStoreKeeper() {
        return checkedDeputyStoreKeeper;
    }

    /**
     * Sets the value of the checkedDeputyStoreKeeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckedDeputyStoreKeeper(Integer value) {
        this.checkedDeputyStoreKeeper = value;
    }

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
     * Gets the value of the countryRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryRegionId() {
        return countryRegionId;
    }

    /**
     * Sets the value of the countryRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryRegionId(JAXBElement<String> value) {
        this.countryRegionId = value;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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

}
