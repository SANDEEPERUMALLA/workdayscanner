
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Change Home Contact Information Business Process Data element.
 * 
 * <p>Java class for Change_Home_Contact_Information_Response_WrapperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Home_Contact_Information_Response_WrapperType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Change_Home_Contact_Information_Data" type="{urn:com.workday/bsvc}Change_Home_Contact_Information_Business_Process_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Home_Contact_Information_Response_WrapperType", propOrder = {
    "personReference",
    "changeHomeContactInformationData"
})
public class ChangeHomeContactInformationResponseWrapperType {

    @XmlElement(name = "Person_Reference")
    protected RoleObjectType personReference;
    @XmlElement(name = "Change_Home_Contact_Information_Data")
    protected List<ChangeHomeContactInformationBusinessProcessDataType> changeHomeContactInformationData;

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setPersonReference(RoleObjectType value) {
        this.personReference = value;
    }

    /**
     * Gets the value of the changeHomeContactInformationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeHomeContactInformationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeHomeContactInformationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeHomeContactInformationBusinessProcessDataType }
     * 
     * 
     */
    public List<ChangeHomeContactInformationBusinessProcessDataType> getChangeHomeContactInformationData() {
        if (changeHomeContactInformationData == null) {
            changeHomeContactInformationData = new ArrayList<ChangeHomeContactInformationBusinessProcessDataType>();
        }
        return this.changeHomeContactInformationData;
    }

}
