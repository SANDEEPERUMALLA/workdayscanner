
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the qualification data for a Position Restriction or Job Profile.
 * 
 * <p>Java class for Qualification_Data_for_Position_Restriction_or_Job_ProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Qualification_Data_for_Position_Restriction_or_Job_ProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Responsibility_Qualification_Replacement" type="{urn:com.workday/bsvc}Responsibility_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Work_Experience_Qualification_Replacement" type="{urn:com.workday/bsvc}Work_Experience_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Education_Qualification_Replacement" type="{urn:com.workday/bsvc}Education_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Language_Qualification_Replacement" type="{urn:com.workday/bsvc}Language_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Competency_Qualification_Replacement" type="{urn:com.workday/bsvc}Competency_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Certification_Qualification_Replacement" type="{urn:com.workday/bsvc}Certification_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Training_Qualification_Replacement" type="{urn:com.workday/bsvc}Training_Qualification_ReplacementType" minOccurs="0"/>
 *         &lt;element name="Skill_Qualification_Replacement" type="{urn:com.workday/bsvc}Skill_Qualification_ReplacementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Qualification_Data_for_Position_Restriction_or_Job_ProfileType", propOrder = {
    "responsibilityQualificationReplacement",
    "workExperienceQualificationReplacement",
    "educationQualificationReplacement",
    "languageQualificationReplacement",
    "competencyQualificationReplacement",
    "certificationQualificationReplacement",
    "trainingQualificationReplacement",
    "skillQualificationReplacement"
})
public class QualificationDataForPositionRestrictionOrJobProfileType {

    @XmlElement(name = "Responsibility_Qualification_Replacement")
    protected ResponsibilityQualificationReplacementType responsibilityQualificationReplacement;
    @XmlElement(name = "Work_Experience_Qualification_Replacement")
    protected WorkExperienceQualificationReplacementType workExperienceQualificationReplacement;
    @XmlElement(name = "Education_Qualification_Replacement")
    protected EducationQualificationReplacementType educationQualificationReplacement;
    @XmlElement(name = "Language_Qualification_Replacement")
    protected LanguageQualificationReplacementType languageQualificationReplacement;
    @XmlElement(name = "Competency_Qualification_Replacement")
    protected CompetencyQualificationReplacementType competencyQualificationReplacement;
    @XmlElement(name = "Certification_Qualification_Replacement")
    protected CertificationQualificationReplacementType certificationQualificationReplacement;
    @XmlElement(name = "Training_Qualification_Replacement")
    protected TrainingQualificationReplacementType trainingQualificationReplacement;
    @XmlElement(name = "Skill_Qualification_Replacement")
    protected SkillQualificationReplacementType skillQualificationReplacement;

    /**
     * Gets the value of the responsibilityQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityQualificationReplacementType }
     *     
     */
    public ResponsibilityQualificationReplacementType getResponsibilityQualificationReplacement() {
        return responsibilityQualificationReplacement;
    }

    /**
     * Sets the value of the responsibilityQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityQualificationReplacementType }
     *     
     */
    public void setResponsibilityQualificationReplacement(ResponsibilityQualificationReplacementType value) {
        this.responsibilityQualificationReplacement = value;
    }

    /**
     * Gets the value of the workExperienceQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceQualificationReplacementType }
     *     
     */
    public WorkExperienceQualificationReplacementType getWorkExperienceQualificationReplacement() {
        return workExperienceQualificationReplacement;
    }

    /**
     * Sets the value of the workExperienceQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceQualificationReplacementType }
     *     
     */
    public void setWorkExperienceQualificationReplacement(WorkExperienceQualificationReplacementType value) {
        this.workExperienceQualificationReplacement = value;
    }

    /**
     * Gets the value of the educationQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link EducationQualificationReplacementType }
     *     
     */
    public EducationQualificationReplacementType getEducationQualificationReplacement() {
        return educationQualificationReplacement;
    }

    /**
     * Sets the value of the educationQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationQualificationReplacementType }
     *     
     */
    public void setEducationQualificationReplacement(EducationQualificationReplacementType value) {
        this.educationQualificationReplacement = value;
    }

    /**
     * Gets the value of the languageQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageQualificationReplacementType }
     *     
     */
    public LanguageQualificationReplacementType getLanguageQualificationReplacement() {
        return languageQualificationReplacement;
    }

    /**
     * Sets the value of the languageQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageQualificationReplacementType }
     *     
     */
    public void setLanguageQualificationReplacement(LanguageQualificationReplacementType value) {
        this.languageQualificationReplacement = value;
    }

    /**
     * Gets the value of the competencyQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link CompetencyQualificationReplacementType }
     *     
     */
    public CompetencyQualificationReplacementType getCompetencyQualificationReplacement() {
        return competencyQualificationReplacement;
    }

    /**
     * Sets the value of the competencyQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetencyQualificationReplacementType }
     *     
     */
    public void setCompetencyQualificationReplacement(CompetencyQualificationReplacementType value) {
        this.competencyQualificationReplacement = value;
    }

    /**
     * Gets the value of the certificationQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationQualificationReplacementType }
     *     
     */
    public CertificationQualificationReplacementType getCertificationQualificationReplacement() {
        return certificationQualificationReplacement;
    }

    /**
     * Sets the value of the certificationQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationQualificationReplacementType }
     *     
     */
    public void setCertificationQualificationReplacement(CertificationQualificationReplacementType value) {
        this.certificationQualificationReplacement = value;
    }

    /**
     * Gets the value of the trainingQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingQualificationReplacementType }
     *     
     */
    public TrainingQualificationReplacementType getTrainingQualificationReplacement() {
        return trainingQualificationReplacement;
    }

    /**
     * Sets the value of the trainingQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingQualificationReplacementType }
     *     
     */
    public void setTrainingQualificationReplacement(TrainingQualificationReplacementType value) {
        this.trainingQualificationReplacement = value;
    }

    /**
     * Gets the value of the skillQualificationReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link SkillQualificationReplacementType }
     *     
     */
    public SkillQualificationReplacementType getSkillQualificationReplacement() {
        return skillQualificationReplacement;
    }

    /**
     * Sets the value of the skillQualificationReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillQualificationReplacementType }
     *     
     */
    public void setSkillQualificationReplacement(SkillQualificationReplacementType value) {
        this.skillQualificationReplacement = value;
    }

}
