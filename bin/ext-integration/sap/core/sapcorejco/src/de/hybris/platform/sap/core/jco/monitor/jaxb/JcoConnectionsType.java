//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.07 at 11:25:49 AM CEST 
//


package de.hybris.platform.sap.core.jco.monitor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jcoConnectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jcoConnectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jcoConnection" type="{}jcoConnectionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jcoConnectionsType", propOrder = {
    "jcoConnection"
})
public class JcoConnectionsType {

    @XmlElement(required = true)
    protected List<JcoConnectionType> jcoConnection;

    /**
     * Gets the value of the jcoConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jcoConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJcoConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JcoConnectionType }
     * 
     * 
     */
    public List<JcoConnectionType> getJcoConnection() {
        if (jcoConnection == null) {
            jcoConnection = new ArrayList<JcoConnectionType>();
        }
        return this.jcoConnection;
    }

}
