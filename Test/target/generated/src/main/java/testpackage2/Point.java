//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.27 at 07:48:35 PM CEST 
//


package testpackage2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="relX" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="relY" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="elementRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="arrowHead" type="{http://www.w3.org/2001/XMLSchema}string" default="Line" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Point")
public class Point {

    @XmlAttribute(name = "x", required = true)
    protected float x;
    @XmlAttribute(name = "y", required = true)
    protected float y;
    @XmlAttribute(name = "relX")
    protected Float relX;
    @XmlAttribute(name = "relY")
    protected Float relY;
    @XmlAttribute(name = "elementRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object elementRef;
    @XmlAttribute(name = "elementId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String elementId;
    @XmlAttribute(name = "arrowHead")
    protected String arrowHead;

    /**
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * Gets the value of the relX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRelX() {
        return relX;
    }

    /**
     * Sets the value of the relX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRelX(Float value) {
        this.relX = value;
    }

    /**
     * Gets the value of the relY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRelY() {
        return relY;
    }

    /**
     * Sets the value of the relY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRelY(Float value) {
        this.relY = value;
    }

    /**
     * Gets the value of the elementRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getElementRef() {
        return elementRef;
    }

    /**
     * Sets the value of the elementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setElementRef(Object value) {
        this.elementRef = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the arrowHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowHead() {
        if (arrowHead == null) {
            return "Line";
        } else {
            return arrowHead;
        }
    }

    /**
     * Sets the value of the arrowHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowHead(String value) {
        this.arrowHead = value;
    }

}
