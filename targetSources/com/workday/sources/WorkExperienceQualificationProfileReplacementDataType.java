
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement element containing Work Experience Qualifications for the Job Profile
 * When updating a Job Profile, all Work Experiences for the Job Profile will be replaced by the submitted data. If no data is submitted, then the existing Work Experiences are not changed.
 * 
 * <p>Java class for Work_Experience_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Experience_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Experience_Reference" type="{urn:com.workday/bsvc}Work_Experience_SkillObjectType"/>
 *         &lt;element name="Work_Experience_Rating_Reference" type="{urn:com.workday/bsvc}Work_Experience_RatingObjectType" minOccurs="0"/>
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
@XmlType(name = "Work_Experience_Qualification_Profile_Replacement_DataType", propOrder = {
    "workerExperienceReference",
    "workExperienceRatingReference",
    "required"
})
public class WorkExperienceQualificationProfileReplacementDataType {

    @XmlElement(name = "Worker_Experience_Reference", required = true)
    protected WorkExperienceSkillObjectType workerExperienceReference;
    @XmlElement(name = "Work_Experience_Rating_Reference")
    protected WorkExperienceRatingObjectType workExperienceRatingReference;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the workerExperienceReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceSkillObjectType }
     *     
     */
    public WorkExperienceSkillObjectType getWorkerExperienceReference() {
        return workerExperienceReference;
    }

    /**
     * Sets the value of the workerExperienceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceSkillObjectType }
     *     
     */
    public void setWorkerExperienceReference(WorkExperienceSkillObjectType value) {
        this.workerExperienceReference = value;
    }

    /**
     * Gets the value of the workExperienceRatingReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceRatingObjectType }
     *     
     */
    public WorkExperienceRatingObjectType getWorkExperienceRatingReference() {
        return workExperienceRatingReference;
    }

    /**
     * Sets the value of the workExperienceRatingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceRatingObjectType }
     *     
     */
    public void setWorkExperienceRatingReference(WorkExperienceRatingObjectType value) {
        this.workExperienceRatingReference = value;
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
