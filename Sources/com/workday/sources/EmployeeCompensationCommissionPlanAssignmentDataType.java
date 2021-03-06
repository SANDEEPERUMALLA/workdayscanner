
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Commission Plan Compensation data.
 * 
 * <p>Java class for Employee_Compensation_Commission_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Commission_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Commission_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Commission_Plan_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Commission_Plan_Assignment_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Commission_Plan_Assignment_DataType", propOrder = {
    "commissionPlanName",
    "compensationElementValuesForCommissionPlanData"
})
public class EmployeeCompensationCommissionPlanAssignmentDataType {

    @XmlElement(name = "Commission_Plan_Name", required = true)
    protected String commissionPlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Commission_Plan_Data", required = true)
    protected EmployeeCompensationCommissionPlanAssignmentDetailDataType compensationElementValuesForCommissionPlanData;

    /**
     * Gets the value of the commissionPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPlanName() {
        return commissionPlanName;
    }

    /**
     * Sets the value of the commissionPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPlanName(String value) {
        this.commissionPlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForCommissionPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationCommissionPlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationCommissionPlanAssignmentDetailDataType getCompensationElementValuesForCommissionPlanData() {
        return compensationElementValuesForCommissionPlanData;
    }

    /**
     * Sets the value of the compensationElementValuesForCommissionPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationCommissionPlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForCommissionPlanData(EmployeeCompensationCommissionPlanAssignmentDetailDataType value) {
        this.compensationElementValuesForCommissionPlanData = value;
    }

}
