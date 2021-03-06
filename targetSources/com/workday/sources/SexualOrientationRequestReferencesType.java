
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to the sexual orientation of the person.
 * 
 * <p>Java class for Sexual_Orientation_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sexual_Orientation_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sexual_Orientation_Reference" type="{urn:com.workday/bsvc}Sexual_OrientationObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sexual_Orientation_Request_ReferencesType", propOrder = {
    "sexualOrientationReference"
})
public class SexualOrientationRequestReferencesType {

    @XmlElement(name = "Sexual_Orientation_Reference", required = true)
    protected List<SexualOrientationObjectType> sexualOrientationReference;

    /**
     * Gets the value of the sexualOrientationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sexualOrientationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSexualOrientationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SexualOrientationObjectType }
     * 
     * 
     */
    public List<SexualOrientationObjectType> getSexualOrientationReference() {
        if (sexualOrientationReference == null) {
            sexualOrientationReference = new ArrayList<SexualOrientationObjectType>();
        }
        return this.sexualOrientationReference;
    }

}
