
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the spending account election information including the contribution, payroll interface contribution, goal, and annual contribution information.
 * 
 * <p>Java class for Employee_Contribution_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Contribution_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contribution_Data" type="{urn:com.workday/bsvc}Contribution_DataType" minOccurs="0"/>
 *         &lt;element name="Payroll_Interface_Contribution_Data" type="{urn:com.workday/bsvc}Payroll_Interface_Contribution_DataType" minOccurs="0"/>
 *         &lt;element name="Goal_Data" type="{urn:com.workday/bsvc}Goal_DataType" minOccurs="0"/>
 *         &lt;element name="Annual_Contribution_Data" type="{urn:com.workday/bsvc}Annual_Contribution_DataType" minOccurs="0"/>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Contribution_DataType", propOrder = {
    "contributionData",
    "payrollInterfaceContributionData",
    "goalData",
    "annualContributionData",
    "currencyReference"
})
public class EmployeeContributionDataType {

    @XmlElement(name = "Contribution_Data")
    protected ContributionDataType contributionData;
    @XmlElement(name = "Payroll_Interface_Contribution_Data")
    protected PayrollInterfaceContributionDataType payrollInterfaceContributionData;
    @XmlElement(name = "Goal_Data")
    protected GoalDataType goalData;
    @XmlElement(name = "Annual_Contribution_Data")
    protected AnnualContributionDataType annualContributionData;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;

    /**
     * Gets the value of the contributionData property.
     * 
     * @return
     *     possible object is
     *     {@link ContributionDataType }
     *     
     */
    public ContributionDataType getContributionData() {
        return contributionData;
    }

    /**
     * Sets the value of the contributionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionDataType }
     *     
     */
    public void setContributionData(ContributionDataType value) {
        this.contributionData = value;
    }

    /**
     * Gets the value of the payrollInterfaceContributionData property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollInterfaceContributionDataType }
     *     
     */
    public PayrollInterfaceContributionDataType getPayrollInterfaceContributionData() {
        return payrollInterfaceContributionData;
    }

    /**
     * Sets the value of the payrollInterfaceContributionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollInterfaceContributionDataType }
     *     
     */
    public void setPayrollInterfaceContributionData(PayrollInterfaceContributionDataType value) {
        this.payrollInterfaceContributionData = value;
    }

    /**
     * Gets the value of the goalData property.
     * 
     * @return
     *     possible object is
     *     {@link GoalDataType }
     *     
     */
    public GoalDataType getGoalData() {
        return goalData;
    }

    /**
     * Sets the value of the goalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalDataType }
     *     
     */
    public void setGoalData(GoalDataType value) {
        this.goalData = value;
    }

    /**
     * Gets the value of the annualContributionData property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualContributionDataType }
     *     
     */
    public AnnualContributionDataType getAnnualContributionData() {
        return annualContributionData;
    }

    /**
     * Sets the value of the annualContributionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualContributionDataType }
     *     
     */
    public void setAnnualContributionData(AnnualContributionDataType value) {
        this.annualContributionData = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setCurrencyReference(CurrencyObjectType value) {
        this.currencyReference = value;
    }

}
