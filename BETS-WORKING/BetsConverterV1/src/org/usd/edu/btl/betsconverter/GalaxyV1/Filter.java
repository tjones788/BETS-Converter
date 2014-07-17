//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.23 at 04:45:00 PM CDT 
//


package org.usd.edu.btl.betsconverter.GalaxyV1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{}FilterType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="separator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compare" type="{}CompareType" />
 *       &lt;attribute name="keep" type="{}PermissiveBoolean" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref_attribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filter")
public class Filter {

    /**
     *
     */
    @XmlAttribute(name = "type", required = true)
    protected FilterType type;

    /**
     *
     */
    @XmlAttribute(name = "name")
    protected String name;

    /**
     *
     */
    @XmlAttribute(name = "column", required = true)
    protected BigInteger column;

    /**
     *
     */
    @XmlAttribute(name = "ref")
    protected String ref;

    /**
     *
     */
    @XmlAttribute(name = "key")
    protected String key;

    /**
     *
     */
    @XmlAttribute(name = "separator")
    protected String separator;

    /**
     *
     */
    @XmlAttribute(name = "compare")
    protected CompareType compare;

    /**
     *
     */
    @XmlAttribute(name = "keep")
    protected String keep;

    /**
     *
     */
    @XmlAttribute(name = "value")
    protected String value;

    /**
     *
     */
    @XmlAttribute(name = "ref_attribute")
    protected String refAttribute;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setType(FilterType value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumn(BigInteger value) {
        this.column = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the compare property.
     * 
     * @return
     *     possible object is
     *     {@link CompareType }
     *     
     */
    public CompareType getCompare() {
        return compare;
    }

    /**
     * Sets the value of the compare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareType }
     *     
     */
    public void setCompare(CompareType value) {
        this.compare = value;
    }

    /**
     * Gets the value of the keep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeep() {
        return keep;
    }

    /**
     * Sets the value of the keep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeep(String value) {
        this.keep = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the refAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefAttribute() {
        return refAttribute;
    }

    /**
     * Sets the value of the refAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefAttribute(String value) {
        this.refAttribute = value;
    }

}