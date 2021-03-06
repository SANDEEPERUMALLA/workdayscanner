
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for Put Training Type
 * 
 * <p>Java class for Put_Training_Type_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Training_Type_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Training_Type_Reference" type="{urn:com.workday/bsvc}Training_TypeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Training_Type_ResponseType", propOrder = {
    "trainingTypeReference"
})
public class PutTrainingTypeResponseType {

    @XmlElement(name = "Training_Type_Reference")
    protected TrainingTypeObjectType trainingTypeReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the trainingTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingTypeObjectType }
     *     
     */
    public TrainingTypeObjectType getTrainingTypeReference() {
        return trainingTypeReference;
    }

    /**
     * Sets the value of the trainingTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingTypeObjectType }
     *     
     */
    public void setTrainingTypeReference(TrainingTypeObjectType value) {
        this.trainingTypeReference = value;
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
