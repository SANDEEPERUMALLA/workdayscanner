
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement element containing Certification Qualifications for the Job Profile
 * When updating a Job Profile, all Certifications for the Job Profile will be replaced by the submitted data. If no data is submitted, then the existing Certifications are not changed.
 * 
 * <p>Java class for Certification_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certification_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Certification_Reference" type="{urn:com.workday/bsvc}CertificationObjectType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Specialty_Achievement_Reference" type="{urn:com.workday/bsvc}Specialty_Achievement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certification_Qualification_Profile_Replacement_DataType", propOrder = {
    "countryReference",
    "certificationReference",
    "name",
    "issuer",
    "required",
    "specialtyAchievementReference"
})
public class CertificationQualificationProfileReplacementDataType {

    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Certification_Reference")
    protected CertificationObjectType certificationReference;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Issuer")
    protected String issuer;
    @XmlElement(name = "Required")
    protected Boolean required;
    @XmlElement(name = "Specialty_Achievement_Reference")
    protected List<SpecialtyAchievementDataType> specialtyAchievementReference;

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryReference(CountryObjectType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the certificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationObjectType }
     *     
     */
    public CertificationObjectType getCertificationReference() {
        return certificationReference;
    }

    /**
     * Sets the value of the certificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationObjectType }
     *     
     */
    public void setCertificationReference(CertificationObjectType value) {
        this.certificationReference = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the specialtyAchievementReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialtyAchievementReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialtyAchievementReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialtyAchievementDataType }
     * 
     * 
     */
    public List<SpecialtyAchievementDataType> getSpecialtyAchievementReference() {
        if (specialtyAchievementReference == null) {
            specialtyAchievementReference = new ArrayList<SpecialtyAchievementDataType>();
        }
        return this.specialtyAchievementReference;
    }

}
