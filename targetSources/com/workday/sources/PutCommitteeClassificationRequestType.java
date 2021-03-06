
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the instructions for adding or updating a committee classification.
 * 
 * <p>Java class for Put_Committee_Classification_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Committee_Classification_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Classification_Reference" type="{urn:com.workday/bsvc}Committee_ClassificationObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Classification_Data" type="{urn:com.workday/bsvc}Committee_Classification_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Committee_Classification_RequestType", propOrder = {
    "committeeClassificationReference",
    "committeeClassificationData"
})
public class PutCommitteeClassificationRequestType {

    @XmlElement(name = "Committee_Classification_Reference")
    protected CommitteeClassificationObjectType committeeClassificationReference;
    @XmlElement(name = "Committee_Classification_Data")
    protected CommitteeClassificationDataType committeeClassificationData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeClassificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeClassificationObjectType }
     *     
     */
    public CommitteeClassificationObjectType getCommitteeClassificationReference() {
        return committeeClassificationReference;
    }

    /**
     * Sets the value of the committeeClassificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeClassificationObjectType }
     *     
     */
    public void setCommitteeClassificationReference(CommitteeClassificationObjectType value) {
        this.committeeClassificationReference = value;
    }

    /**
     * Gets the value of the committeeClassificationData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeClassificationDataType }
     *     
     */
    public CommitteeClassificationDataType getCommitteeClassificationData() {
        return committeeClassificationData;
    }

    /**
     * Sets the value of the committeeClassificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeClassificationDataType }
     *     
     */
    public void setCommitteeClassificationData(CommitteeClassificationDataType value) {
        this.committeeClassificationData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
