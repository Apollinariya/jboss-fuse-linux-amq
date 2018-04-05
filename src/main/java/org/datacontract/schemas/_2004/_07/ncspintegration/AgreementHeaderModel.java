
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
 * <p>Java class for AgreementHeaderModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementHeaderModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgreementClassification" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AgreementState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BuyingLegalentity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDataAreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultAgreementLineEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DefaultAgreementLineExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DefaultAgreementLineType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultDimension" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DocumentExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarliestLineEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InstanceRelationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InterestBasedOnCebPsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LatestLineExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaximumAmountPsn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MinimumAmountPsn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Originator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ParentPurchAgreementidPsn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ProcurementClassificationPsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchAgreementTypePsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PurchNumberSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurposePsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RelationType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RenewablePsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SalesNumberSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellingleGalentity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VendAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorDataareaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkFlowStatusPsn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementHeaderModel", propOrder = {
    "agreementClassification",
    "agreementState",
    "buyingLegalentity",
    "createdDatetime",
    "currency",
    "custAccount",
    "customerDataAreaId",
    "defaultAgreementLineEffectiveDate",
    "defaultAgreementLineExpirationDate",
    "defaultAgreementLineType",
    "defaultDimension",
    "documentExternalReference",
    "documentTitle",
    "earliestLineEffectiveDate",
    "instanceRelationType",
    "interestBasedOnCebPsn",
    "isDeleted",
    "language",
    "latestLineExpirationDate",
    "maximumAmountPsn",
    "minimumAmountPsn",
    "modifiedBy",
    "modifiedDatetime",
    "originator",
    "parentPurchAgreementidPsn",
    "procurementClassificationPsn",
    "purchAgreementTypePsn",
    "purchNumberSequence",
    "purposePsn",
    "recId",
    "relationType",
    "renewablePsn",
    "salesNumberSequence",
    "sellingleGalentity",
    "vendAccount",
    "vendorDataareaId",
    "workFlowStatusPsn"
})
public class AgreementHeaderModel {

    @XmlElement(name = "AgreementClassification")
    protected Long agreementClassification;
    @XmlElement(name = "AgreementState")
    protected Integer agreementState;
    @XmlElementRef(name = "BuyingLegalentity", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> buyingLegalentity;
    @XmlElement(name = "CreatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDatetime;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "CustAccount", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custAccount;
    @XmlElementRef(name = "CustomerDataAreaId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerDataAreaId;
    @XmlElement(name = "DefaultAgreementLineEffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar defaultAgreementLineEffectiveDate;
    @XmlElement(name = "DefaultAgreementLineExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar defaultAgreementLineExpirationDate;
    @XmlElement(name = "DefaultAgreementLineType")
    protected Integer defaultAgreementLineType;
    @XmlElement(name = "DefaultDimension")
    protected Long defaultDimension;
    @XmlElementRef(name = "DocumentExternalReference", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentExternalReference;
    @XmlElementRef(name = "DocumentTitle", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentTitle;
    @XmlElement(name = "EarliestLineEffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestLineEffectiveDate;
    @XmlElement(name = "InstanceRelationType")
    protected Long instanceRelationType;
    @XmlElementRef(name = "InterestBasedOnCebPsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interestBasedOnCebPsn;
    @XmlElement(name = "IsDeleted")
    protected Integer isDeleted;
    @XmlElementRef(name = "Language", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElement(name = "LatestLineExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestLineExpirationDate;
    @XmlElementRef(name = "MaximumAmountPsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> maximumAmountPsn;
    @XmlElementRef(name = "MinimumAmountPsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> minimumAmountPsn;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDatetime;
    @XmlElement(name = "Originator")
    protected Long originator;
    @XmlElementRef(name = "ParentPurchAgreementidPsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentPurchAgreementidPsn;
    @XmlElementRef(name = "ProcurementClassificationPsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> procurementClassificationPsn;
    @XmlElementRef(name = "PurchAgreementTypePsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> purchAgreementTypePsn;
    @XmlElementRef(name = "PurchNumberSequence", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchNumberSequence;
    @XmlElementRef(name = "PurposePsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purposePsn;
    @XmlElement(name = "RecId")
    protected Long recId;
    @XmlElement(name = "RelationType")
    protected Long relationType;
    @XmlElementRef(name = "RenewablePsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> renewablePsn;
    @XmlElementRef(name = "SalesNumberSequence", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesNumberSequence;
    @XmlElementRef(name = "SellingleGalentity", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sellingleGalentity;
    @XmlElementRef(name = "VendAccount", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendAccount;
    @XmlElementRef(name = "VendorDataareaId", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorDataareaId;
    @XmlElementRef(name = "WorkFlowStatusPsn", namespace = "http://schemas.datacontract.org/2004/07/NCSPIntegration.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> workFlowStatusPsn;

    /**
     * Gets the value of the agreementClassification property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgreementClassification() {
        return agreementClassification;
    }

    /**
     * Sets the value of the agreementClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgreementClassification(Long value) {
        this.agreementClassification = value;
    }

    /**
     * Gets the value of the agreementState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgreementState() {
        return agreementState;
    }

    /**
     * Sets the value of the agreementState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgreementState(Integer value) {
        this.agreementState = value;
    }

    /**
     * Gets the value of the buyingLegalentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBuyingLegalentity() {
        return buyingLegalentity;
    }

    /**
     * Sets the value of the buyingLegalentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBuyingLegalentity(JAXBElement<Long> value) {
        this.buyingLegalentity = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the custAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustAccount() {
        return custAccount;
    }

    /**
     * Sets the value of the custAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustAccount(JAXBElement<String> value) {
        this.custAccount = value;
    }

    /**
     * Gets the value of the customerDataAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerDataAreaId() {
        return customerDataAreaId;
    }

    /**
     * Sets the value of the customerDataAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerDataAreaId(JAXBElement<String> value) {
        this.customerDataAreaId = value;
    }

    /**
     * Gets the value of the defaultAgreementLineEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefaultAgreementLineEffectiveDate() {
        return defaultAgreementLineEffectiveDate;
    }

    /**
     * Sets the value of the defaultAgreementLineEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefaultAgreementLineEffectiveDate(XMLGregorianCalendar value) {
        this.defaultAgreementLineEffectiveDate = value;
    }

    /**
     * Gets the value of the defaultAgreementLineExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefaultAgreementLineExpirationDate() {
        return defaultAgreementLineExpirationDate;
    }

    /**
     * Sets the value of the defaultAgreementLineExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefaultAgreementLineExpirationDate(XMLGregorianCalendar value) {
        this.defaultAgreementLineExpirationDate = value;
    }

    /**
     * Gets the value of the defaultAgreementLineType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultAgreementLineType() {
        return defaultAgreementLineType;
    }

    /**
     * Sets the value of the defaultAgreementLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultAgreementLineType(Integer value) {
        this.defaultAgreementLineType = value;
    }

    /**
     * Gets the value of the defaultDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultDimension() {
        return defaultDimension;
    }

    /**
     * Sets the value of the defaultDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultDimension(Long value) {
        this.defaultDimension = value;
    }

    /**
     * Gets the value of the documentExternalReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentExternalReference() {
        return documentExternalReference;
    }

    /**
     * Sets the value of the documentExternalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentExternalReference(JAXBElement<String> value) {
        this.documentExternalReference = value;
    }

    /**
     * Gets the value of the documentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentTitle(JAXBElement<String> value) {
        this.documentTitle = value;
    }

    /**
     * Gets the value of the earliestLineEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestLineEffectiveDate() {
        return earliestLineEffectiveDate;
    }

    /**
     * Sets the value of the earliestLineEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestLineEffectiveDate(XMLGregorianCalendar value) {
        this.earliestLineEffectiveDate = value;
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
     * Gets the value of the interestBasedOnCebPsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterestBasedOnCebPsn() {
        return interestBasedOnCebPsn;
    }

    /**
     * Sets the value of the interestBasedOnCebPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterestBasedOnCebPsn(JAXBElement<Integer> value) {
        this.interestBasedOnCebPsn = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsDeleted(Integer value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Gets the value of the latestLineExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestLineExpirationDate() {
        return latestLineExpirationDate;
    }

    /**
     * Sets the value of the latestLineExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestLineExpirationDate(XMLGregorianCalendar value) {
        this.latestLineExpirationDate = value;
    }

    /**
     * Gets the value of the maximumAmountPsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMaximumAmountPsn() {
        return maximumAmountPsn;
    }

    /**
     * Sets the value of the maximumAmountPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMaximumAmountPsn(JAXBElement<BigDecimal> value) {
        this.maximumAmountPsn = value;
    }

    /**
     * Gets the value of the minimumAmountPsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMinimumAmountPsn() {
        return minimumAmountPsn;
    }

    /**
     * Sets the value of the minimumAmountPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMinimumAmountPsn(JAXBElement<BigDecimal> value) {
        this.minimumAmountPsn = value;
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
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginator(Long value) {
        this.originator = value;
    }

    /**
     * Gets the value of the parentPurchAgreementidPsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentPurchAgreementidPsn() {
        return parentPurchAgreementidPsn;
    }

    /**
     * Sets the value of the parentPurchAgreementidPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentPurchAgreementidPsn(JAXBElement<Long> value) {
        this.parentPurchAgreementidPsn = value;
    }

    /**
     * Gets the value of the procurementClassificationPsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcurementClassificationPsn() {
        return procurementClassificationPsn;
    }

    /**
     * Sets the value of the procurementClassificationPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcurementClassificationPsn(JAXBElement<String> value) {
        this.procurementClassificationPsn = value;
    }

    /**
     * Gets the value of the purchAgreementTypePsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPurchAgreementTypePsn() {
        return purchAgreementTypePsn;
    }

    /**
     * Sets the value of the purchAgreementTypePsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPurchAgreementTypePsn(JAXBElement<Integer> value) {
        this.purchAgreementTypePsn = value;
    }

    /**
     * Gets the value of the purchNumberSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchNumberSequence() {
        return purchNumberSequence;
    }

    /**
     * Sets the value of the purchNumberSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchNumberSequence(JAXBElement<String> value) {
        this.purchNumberSequence = value;
    }

    /**
     * Gets the value of the purposePsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurposePsn() {
        return purposePsn;
    }

    /**
     * Sets the value of the purposePsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurposePsn(JAXBElement<String> value) {
        this.purposePsn = value;
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
     * Gets the value of the renewablePsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRenewablePsn() {
        return renewablePsn;
    }

    /**
     * Sets the value of the renewablePsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRenewablePsn(JAXBElement<Integer> value) {
        this.renewablePsn = value;
    }

    /**
     * Gets the value of the salesNumberSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesNumberSequence() {
        return salesNumberSequence;
    }

    /**
     * Sets the value of the salesNumberSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesNumberSequence(JAXBElement<String> value) {
        this.salesNumberSequence = value;
    }

    /**
     * Gets the value of the sellingleGalentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSellingleGalentity() {
        return sellingleGalentity;
    }

    /**
     * Sets the value of the sellingleGalentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSellingleGalentity(JAXBElement<Long> value) {
        this.sellingleGalentity = value;
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
     * Gets the value of the vendorDataareaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorDataareaId() {
        return vendorDataareaId;
    }

    /**
     * Sets the value of the vendorDataareaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorDataareaId(JAXBElement<String> value) {
        this.vendorDataareaId = value;
    }

    /**
     * Gets the value of the workFlowStatusPsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWorkFlowStatusPsn() {
        return workFlowStatusPsn;
    }

    /**
     * Sets the value of the workFlowStatusPsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWorkFlowStatusPsn(JAXBElement<Integer> value) {
        this.workFlowStatusPsn = value;
    }

}
