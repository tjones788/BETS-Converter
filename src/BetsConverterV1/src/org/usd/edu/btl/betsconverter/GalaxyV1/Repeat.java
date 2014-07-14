//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.23 at 04:45:00 PM CDT 
//

package org.usd.edu.btl.betsconverter.GalaxyV1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Repeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repeat">
 *   &lt;complexContent>
 *     &lt;extension base="{}InputType">
 *       &lt;sequence>
 *         &lt;group ref="{}InputElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repeat", propOrder = {
    "inputElement"
})
public class Repeat
    extends InputType
{

    /**
     *
     */
    @XmlElement(name = "param", type = Param.class)
    protected List<Param> inputElement;

    /**
     *
     */
    @XmlAttribute(name = "title")
    protected String title;

    /**
     *
     */
    @XmlAttribute(name = "min")
    protected BigInteger min;

    /**
     *
     */
    @XmlAttribute(name = "max")
    protected BigInteger max;
    
    //need to add "default" look at XML tool docs

    /**
     * Gets the value of the inputElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Param }
     * {@link Repeat }
     * {@link Conditional }
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<Param> getInputElement() {
        if (inputElement == null) {
            inputElement = new ArrayList<Param>();
        }
        return this.inputElement;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMin(BigInteger value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMax(BigInteger value) {
        this.max = value;
    }

}
