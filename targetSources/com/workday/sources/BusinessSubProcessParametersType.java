
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the processing options for sub-business processes within a business process. If no options are submitted (or the options are submitted as 'false') then the sub-business process is simply initiated as if it where submitted on-line with approvals, reviews, notifications and to-do's in place. If the Initiator is an Integration System User, any validations you configured on the Initiation step are ignored.
 * 
 * <p>Java class for Business_Sub_Process_ParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_Sub_Process_ParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Auto_Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Skip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Business_Process_Comment_Data" type="{urn:com.workday/bsvc}Business_Process_Comment_DataType" minOccurs="0"/>
 *         &lt;element name="Business_Process_Attachment_Data" type="{urn:com.workday/bsvc}Business_Process_Attachment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Business_Sub_Process_ParametersType", propOrder = {
    "autoComplete",
    "skip",
    "businessProcessCommentData",
    "businessProcessAttachmentData"
})
public class BusinessSubProcessParametersType {

    @XmlElement(name = "Auto_Complete")
    protected Boolean autoComplete;
    @XmlElement(name = "Skip")
    protected Boolean skip;
    @XmlElement(name = "Business_Process_Comment_Data")
    protected BusinessProcessCommentDataType businessProcessCommentData;
    @XmlElement(name = "Business_Process_Attachment_Data")
    protected List<BusinessProcessAttachmentDataType> businessProcessAttachmentData;

    /**
     * Gets the value of the autoComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoComplete() {
        return autoComplete;
    }

    /**
     * Sets the value of the autoComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoComplete(Boolean value) {
        this.autoComplete = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkip(Boolean value) {
        this.skip = value;
    }

    /**
     * Gets the value of the businessProcessCommentData property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessCommentDataType }
     *     
     */
    public BusinessProcessCommentDataType getBusinessProcessCommentData() {
        return businessProcessCommentData;
    }

    /**
     * Sets the value of the businessProcessCommentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessCommentDataType }
     *     
     */
    public void setBusinessProcessCommentData(BusinessProcessCommentDataType value) {
        this.businessProcessCommentData = value;
    }

    /**
     * Gets the value of the businessProcessAttachmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessProcessAttachmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessProcessAttachmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessProcessAttachmentDataType }
     * 
     * 
     */
    public List<BusinessProcessAttachmentDataType> getBusinessProcessAttachmentData() {
        if (businessProcessAttachmentData == null) {
            businessProcessAttachmentData = new ArrayList<BusinessProcessAttachmentDataType>();
        }
        return this.businessProcessAttachmentData;
    }

}
