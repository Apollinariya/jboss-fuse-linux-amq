
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
 * <p>Java class for InventBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventBatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptanceInventLocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AcceptanceInventLocationTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InventBatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDSBatchAttributes" type="{http://schemas.datacontract.org/2004/07/NCSPIntegration.Models}ArrayOfPDSBatchAttribute" minOccurs="0"/&gt;
 *         &lt;element name="PDSBestBeforeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PDSCountryOforigin1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDSCountryOforigin2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDSDIsPositionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDSFinishedGoodsDateTested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PDSInheritBatchAttrib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PDSInheritedShelfLife" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PDSSAMELOT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PDSShelfAdviceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PDSUseVendBatchDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PDSUseVendBatchExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PDSVendBatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PDSVendBatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDSVendExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ParentInventBatch" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ProdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "InventBatch", propOrder = {
    "acceptanceInventLocationDate",
    "acceptanceInventLocationTime",
    "description",
    "expDate",
    "inventBatchId",
    "itemId",
    "pdsBatchAttributes",
    "pdsBestBeforeDate",
    "pdsCountryOforigin1",
    "pdsCountryOforigin2",
    "pdsdIsPositionCode",
    "pdsFinishedGoodsDateTested",
    "pdsInheritBatchAttrib",
    "pdsInheritedShelfLife",
    "pdssamelot",
    "pdsShelfAdviceDate",
    "pdsUseVendBatchDate",
    "pdsUseVendBatchExp",
    "pdsVendBatchDate",
    "pdsVendBatchId",
    "pdsVendExpiryDate",
    "parentInventBatch",
    "prodDate",
    "recId"
})
public class InventBatch {

    @XmlElement(name = "AcceptanceInventLocationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptanceInventLocationDate;
    @XmlElement(name = "AcceptanceInventLocationTime")
    protected Integer acceptanceInventLocationTime;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "ExpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    @XmlElementRef(name = "InventBatchId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventBatchId;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemId;
    @XmlElementRef(name = "PDSBatchAttributes", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPDSBatchAttribute> pdsBatchAttributes;
    @XmlElement(name = "PDSBestBeforeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdsBestBeforeDate;
    @XmlElementRef(name = "PDSCountryOforigin1", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdsCountryOforigin1;
    @XmlElementRef(name = "PDSCountryOforigin2", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdsCountryOforigin2;
    @XmlElementRef(name = "PDSDIsPositionCode", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdsdIsPositionCode;
    @XmlElement(name = "PDSFinishedGoodsDateTested")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdsFinishedGoodsDateTested;
    @XmlElement(name = "PDSInheritBatchAttrib")
    protected Integer pdsInheritBatchAttrib;
    @XmlElement(name = "PDSInheritedShelfLife")
    protected Integer pdsInheritedShelfLife;
    @XmlElement(name = "PDSSAMELOT")
    protected Integer pdssamelot;
    @XmlElement(name = "PDSShelfAdviceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdsShelfAdviceDate;
    @XmlElement(name = "PDSUseVendBatchDate")
    protected Integer pdsUseVendBatchDate;
    @XmlElement(name = "PDSUseVendBatchExp")
    protected Integer pdsUseVendBatchExp;
    @XmlElement(name = "PDSVendBatchDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdsVendBatchDate;
    @XmlElementRef(name = "PDSVendBatchId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdsVendBatchId;
    @XmlElement(name = "PDSVendExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdsVendExpiryDate;
    @XmlElement(name = "ParentInventBatch")
    protected Long parentInventBatch;
    @XmlElement(name = "ProdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prodDate;
    @XmlElement(name = "RecId")
    protected Long recId;

    /**
     * Gets the value of the acceptanceInventLocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceInventLocationDate() {
        return acceptanceInventLocationDate;
    }

    /**
     * Sets the value of the acceptanceInventLocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptanceInventLocationDate(XMLGregorianCalendar value) {
        this.acceptanceInventLocationDate = value;
    }

    /**
     * Gets the value of the acceptanceInventLocationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptanceInventLocationTime() {
        return acceptanceInventLocationTime;
    }

    /**
     * Sets the value of the acceptanceInventLocationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptanceInventLocationTime(Integer value) {
        this.acceptanceInventLocationTime = value;
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
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the inventBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventBatchId() {
        return inventBatchId;
    }

    /**
     * Sets the value of the inventBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventBatchId(JAXBElement<String> value) {
        this.inventBatchId = value;
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
     * Gets the value of the pdsBatchAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPDSBatchAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPDSBatchAttribute> getPDSBatchAttributes() {
        return pdsBatchAttributes;
    }

    /**
     * Sets the value of the pdsBatchAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPDSBatchAttribute }{@code >}
     *     
     */
    public void setPDSBatchAttributes(JAXBElement<ArrayOfPDSBatchAttribute> value) {
        this.pdsBatchAttributes = value;
    }

    /**
     * Gets the value of the pdsBestBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDSBestBeforeDate() {
        return pdsBestBeforeDate;
    }

    /**
     * Sets the value of the pdsBestBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDSBestBeforeDate(XMLGregorianCalendar value) {
        this.pdsBestBeforeDate = value;
    }

    /**
     * Gets the value of the pdsCountryOforigin1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDSCountryOforigin1() {
        return pdsCountryOforigin1;
    }

    /**
     * Sets the value of the pdsCountryOforigin1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDSCountryOforigin1(JAXBElement<String> value) {
        this.pdsCountryOforigin1 = value;
    }

    /**
     * Gets the value of the pdsCountryOforigin2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDSCountryOforigin2() {
        return pdsCountryOforigin2;
    }

    /**
     * Sets the value of the pdsCountryOforigin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDSCountryOforigin2(JAXBElement<String> value) {
        this.pdsCountryOforigin2 = value;
    }

    /**
     * Gets the value of the pdsdIsPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDSDIsPositionCode() {
        return pdsdIsPositionCode;
    }

    /**
     * Sets the value of the pdsdIsPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDSDIsPositionCode(JAXBElement<String> value) {
        this.pdsdIsPositionCode = value;
    }

    /**
     * Gets the value of the pdsFinishedGoodsDateTested property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDSFinishedGoodsDateTested() {
        return pdsFinishedGoodsDateTested;
    }

    /**
     * Sets the value of the pdsFinishedGoodsDateTested property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDSFinishedGoodsDateTested(XMLGregorianCalendar value) {
        this.pdsFinishedGoodsDateTested = value;
    }

    /**
     * Gets the value of the pdsInheritBatchAttrib property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDSInheritBatchAttrib() {
        return pdsInheritBatchAttrib;
    }

    /**
     * Sets the value of the pdsInheritBatchAttrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDSInheritBatchAttrib(Integer value) {
        this.pdsInheritBatchAttrib = value;
    }

    /**
     * Gets the value of the pdsInheritedShelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDSInheritedShelfLife() {
        return pdsInheritedShelfLife;
    }

    /**
     * Sets the value of the pdsInheritedShelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDSInheritedShelfLife(Integer value) {
        this.pdsInheritedShelfLife = value;
    }

    /**
     * Gets the value of the pdssamelot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDSSAMELOT() {
        return pdssamelot;
    }

    /**
     * Sets the value of the pdssamelot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDSSAMELOT(Integer value) {
        this.pdssamelot = value;
    }

    /**
     * Gets the value of the pdsShelfAdviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDSShelfAdviceDate() {
        return pdsShelfAdviceDate;
    }

    /**
     * Sets the value of the pdsShelfAdviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDSShelfAdviceDate(XMLGregorianCalendar value) {
        this.pdsShelfAdviceDate = value;
    }

    /**
     * Gets the value of the pdsUseVendBatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDSUseVendBatchDate() {
        return pdsUseVendBatchDate;
    }

    /**
     * Sets the value of the pdsUseVendBatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDSUseVendBatchDate(Integer value) {
        this.pdsUseVendBatchDate = value;
    }

    /**
     * Gets the value of the pdsUseVendBatchExp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPDSUseVendBatchExp() {
        return pdsUseVendBatchExp;
    }

    /**
     * Sets the value of the pdsUseVendBatchExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPDSUseVendBatchExp(Integer value) {
        this.pdsUseVendBatchExp = value;
    }

    /**
     * Gets the value of the pdsVendBatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDSVendBatchDate() {
        return pdsVendBatchDate;
    }

    /**
     * Sets the value of the pdsVendBatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDSVendBatchDate(XMLGregorianCalendar value) {
        this.pdsVendBatchDate = value;
    }

    /**
     * Gets the value of the pdsVendBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDSVendBatchId() {
        return pdsVendBatchId;
    }

    /**
     * Sets the value of the pdsVendBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDSVendBatchId(JAXBElement<String> value) {
        this.pdsVendBatchId = value;
    }

    /**
     * Gets the value of the pdsVendExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDSVendExpiryDate() {
        return pdsVendExpiryDate;
    }

    /**
     * Sets the value of the pdsVendExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDSVendExpiryDate(XMLGregorianCalendar value) {
        this.pdsVendExpiryDate = value;
    }

    /**
     * Gets the value of the parentInventBatch property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentInventBatch() {
        return parentInventBatch;
    }

    /**
     * Sets the value of the parentInventBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentInventBatch(Long value) {
        this.parentInventBatch = value;
    }

    /**
     * Gets the value of the prodDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProdDate() {
        return prodDate;
    }

    /**
     * Sets the value of the prodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProdDate(XMLGregorianCalendar value) {
        this.prodDate = value;
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
