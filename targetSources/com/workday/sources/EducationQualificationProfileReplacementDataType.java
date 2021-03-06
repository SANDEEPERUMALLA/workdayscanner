
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement element containing Education Qualifications for the Job Profile
 * When updating a Job Profile, all Education Qualifications for the Job Profile will be replaced by the submitted data. If no data is submitted, then the existing Education Qualifications are not changed.
 * 
 * <p>Java class for Education_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Education_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Degree_Reference" type="{urn:com.workday/bsvc}DegreeObjectType" minOccurs="0"/>
 *         &lt;element name="Field_Of_Study_Reference" type="{urn:com.workday/bsvc}Field_of_StudyObjectType" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Education_Qualification_Profile_Replacement_DataType", propOrder = {
    "degreeReference",
    "fieldOfStudyReference",
    "required"
})
public class EducationQualificationProfileReplacementDataType {

    @XmlElement(name = "Degree_Reference")
    protected DegreeObjectType degreeReference;
    @XmlElement(name = "Field_Of_Study_Reference")
    protected FieldOfStudyObjectType fieldOfStudyReference;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the degreeReference property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeObjectType }
     *     
     */
    public DegreeObjectType getDegreeReference() {
        return degreeReference;
    }

    /**
     * Sets the value of the degreeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeObjectType }
     *     
     */
    public void setDegreeReference(DegreeObjectType value) {
        this.degreeReference = value;
    }

    /**
     * Gets the value of the fieldOfStudyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOfStudyObjectType }
     *     
     */
    public FieldOfStudyObjectType getFieldOfStudyReference() {
        return fieldOfStudyReference;
    }

    /**
     * Sets the value of the fieldOfStudyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOfStudyObjectType }
     *     
     */
    public void setFieldOfStudyReference(FieldOfStudyObjectType value) {
        this.fieldOfStudyReference = value;
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

}
