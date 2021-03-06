
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows retrieving government IDs based on request criteria. Request Criteria is only used when government ID reference is not provided
 * 
 * <p>Java class for Change_Government_ID_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Government_ID_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Type_Criteria_Data" type="{urn:com.workday/bsvc}Person_Type_CriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Government_ID_Request_CriteriaType", propOrder = {
    "personTypeCriteriaData"
})
public class ChangeGovernmentIDRequestCriteriaType {

    @XmlElement(name = "Person_Type_Criteria_Data")
    protected PersonTypeCriteriaType personTypeCriteriaData;

    /**
     * Gets the value of the personTypeCriteriaData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonTypeCriteriaType }
     *     
     */
    public PersonTypeCriteriaType getPersonTypeCriteriaData() {
        return personTypeCriteriaData;
    }

    /**
     * Sets the value of the personTypeCriteriaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTypeCriteriaType }
     *     
     */
    public void setPersonTypeCriteriaData(PersonTypeCriteriaType value) {
        this.personTypeCriteriaData = value;
    }

}
