
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Organization data.
 * 
 * <p>Java class for Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Organization_ID_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Organization_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Availability_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Include_Organization_Code_In_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Organization_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Leader_In_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Frozen_Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Job_Management_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Position_Management_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Superior_Organization_Reference" type="{urn:com.workday/bsvc}Superior_Organization_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Organization_Type_Reference" type="{urn:com.workday/bsvc}Organization_Type_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Organization_Subtype_Reference" type="{urn:com.workday/bsvc}Organization_Subtype_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Organization_Visibility_Reference" type="{urn:com.workday/bsvc}Organization_Visibility_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Primary_Business_Site_Reference" type="{urn:com.workday/bsvc}Primary_Business_Site_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Container_Organization_Reference" type="{urn:com.workday/bsvc}Container_Organization_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_DataType", propOrder = {
    "organizationReferenceID",
    "includeOrganizationIDInName",
    "integrationIDData",
    "organizationName",
    "availabilityDate",
    "includeOrganizationCodeInName",
    "organizationCode",
    "includeLeaderInName",
    "frozenStatus",
    "jobManagementEnabled",
    "positionManagementEnabled",
    "superiorOrganizationReference",
    "organizationTypeReference",
    "organizationSubtypeReference",
    "organizationVisibilityReference",
    "primaryBusinessSiteReference",
    "containerOrganizationReference"
})
public class OrganizationDataType {

    @XmlElement(name = "Organization_Reference_ID")
    protected String organizationReferenceID;
    @XmlElement(name = "Include_Organization_ID_in_Name")
    protected Boolean includeOrganizationIDInName;
    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Organization_Name")
    protected String organizationName;
    @XmlElement(name = "Availability_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar availabilityDate;
    @XmlElement(name = "Include_Organization_Code_In_Name")
    protected Boolean includeOrganizationCodeInName;
    @XmlElement(name = "Organization_Code")
    protected String organizationCode;
    @XmlElement(name = "Include_Leader_In_Name")
    protected Boolean includeLeaderInName;
    @XmlElement(name = "Frozen_Status")
    protected Boolean frozenStatus;
    @XmlElement(name = "Job_Management_Enabled")
    protected Boolean jobManagementEnabled;
    @XmlElement(name = "Position_Management_Enabled")
    protected Boolean positionManagementEnabled;
    @XmlElement(name = "Superior_Organization_Reference")
    protected SuperiorOrganizationReferenceDataType superiorOrganizationReference;
    @XmlElement(name = "Organization_Type_Reference")
    protected OrganizationTypeReferenceDataType organizationTypeReference;
    @XmlElement(name = "Organization_Subtype_Reference")
    protected OrganizationSubtypeReferenceDataType organizationSubtypeReference;
    @XmlElement(name = "Organization_Visibility_Reference")
    protected OrganizationVisibilityReferenceDataType organizationVisibilityReference;
    @XmlElement(name = "Primary_Business_Site_Reference")
    protected PrimaryBusinessSiteReferenceDataType primaryBusinessSiteReference;
    @XmlElement(name = "Container_Organization_Reference")
    protected List<ContainerOrganizationReferenceDataType> containerOrganizationReference;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the organizationReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationReferenceID() {
        return organizationReferenceID;
    }

    /**
     * Sets the value of the organizationReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationReferenceID(String value) {
        this.organizationReferenceID = value;
    }

    /**
     * Gets the value of the includeOrganizationIDInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrganizationIDInName() {
        return includeOrganizationIDInName;
    }

    /**
     * Sets the value of the includeOrganizationIDInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrganizationIDInName(Boolean value) {
        this.includeOrganizationIDInName = value;
    }

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the availabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailabilityDate() {
        return availabilityDate;
    }

    /**
     * Sets the value of the availabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailabilityDate(XMLGregorianCalendar value) {
        this.availabilityDate = value;
    }

    /**
     * Gets the value of the includeOrganizationCodeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrganizationCodeInName() {
        return includeOrganizationCodeInName;
    }

    /**
     * Sets the value of the includeOrganizationCodeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrganizationCodeInName(Boolean value) {
        this.includeOrganizationCodeInName = value;
    }

    /**
     * Gets the value of the organizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Gets the value of the includeLeaderInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLeaderInName() {
        return includeLeaderInName;
    }

    /**
     * Sets the value of the includeLeaderInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLeaderInName(Boolean value) {
        this.includeLeaderInName = value;
    }

    /**
     * Gets the value of the frozenStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrozenStatus() {
        return frozenStatus;
    }

    /**
     * Sets the value of the frozenStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrozenStatus(Boolean value) {
        this.frozenStatus = value;
    }

    /**
     * Gets the value of the jobManagementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobManagementEnabled() {
        return jobManagementEnabled;
    }

    /**
     * Sets the value of the jobManagementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobManagementEnabled(Boolean value) {
        this.jobManagementEnabled = value;
    }

    /**
     * Gets the value of the positionManagementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPositionManagementEnabled() {
        return positionManagementEnabled;
    }

    /**
     * Sets the value of the positionManagementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPositionManagementEnabled(Boolean value) {
        this.positionManagementEnabled = value;
    }

    /**
     * Gets the value of the superiorOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link SuperiorOrganizationReferenceDataType }
     *     
     */
    public SuperiorOrganizationReferenceDataType getSuperiorOrganizationReference() {
        return superiorOrganizationReference;
    }

    /**
     * Sets the value of the superiorOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperiorOrganizationReferenceDataType }
     *     
     */
    public void setSuperiorOrganizationReference(SuperiorOrganizationReferenceDataType value) {
        this.superiorOrganizationReference = value;
    }

    /**
     * Gets the value of the organizationTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationTypeReferenceDataType }
     *     
     */
    public OrganizationTypeReferenceDataType getOrganizationTypeReference() {
        return organizationTypeReference;
    }

    /**
     * Sets the value of the organizationTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationTypeReferenceDataType }
     *     
     */
    public void setOrganizationTypeReference(OrganizationTypeReferenceDataType value) {
        this.organizationTypeReference = value;
    }

    /**
     * Gets the value of the organizationSubtypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSubtypeReferenceDataType }
     *     
     */
    public OrganizationSubtypeReferenceDataType getOrganizationSubtypeReference() {
        return organizationSubtypeReference;
    }

    /**
     * Sets the value of the organizationSubtypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSubtypeReferenceDataType }
     *     
     */
    public void setOrganizationSubtypeReference(OrganizationSubtypeReferenceDataType value) {
        this.organizationSubtypeReference = value;
    }

    /**
     * Gets the value of the organizationVisibilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationVisibilityReferenceDataType }
     *     
     */
    public OrganizationVisibilityReferenceDataType getOrganizationVisibilityReference() {
        return organizationVisibilityReference;
    }

    /**
     * Sets the value of the organizationVisibilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationVisibilityReferenceDataType }
     *     
     */
    public void setOrganizationVisibilityReference(OrganizationVisibilityReferenceDataType value) {
        this.organizationVisibilityReference = value;
    }

    /**
     * Gets the value of the primaryBusinessSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryBusinessSiteReferenceDataType }
     *     
     */
    public PrimaryBusinessSiteReferenceDataType getPrimaryBusinessSiteReference() {
        return primaryBusinessSiteReference;
    }

    /**
     * Sets the value of the primaryBusinessSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryBusinessSiteReferenceDataType }
     *     
     */
    public void setPrimaryBusinessSiteReference(PrimaryBusinessSiteReferenceDataType value) {
        this.primaryBusinessSiteReference = value;
    }

    /**
     * Gets the value of the containerOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerOrganizationReferenceDataType }
     * 
     * 
     */
    public List<ContainerOrganizationReferenceDataType> getContainerOrganizationReference() {
        if (containerOrganizationReference == null) {
            containerOrganizationReference = new ArrayList<ContainerOrganizationReferenceDataType>();
        }
        return this.containerOrganizationReference;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

}
