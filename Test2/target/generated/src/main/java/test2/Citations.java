//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.31 at 10:38:04 PM CET 
//


package test2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;sequence&gt;
 *         &lt;element name="Citation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://pathvisio.org/GPML/2021}Xref" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citation"
})
@XmlRootElement(name = "Citations")
public class Citations {

    @XmlElement(name = "Citation")
    protected List<Citations.Citation> citation;

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citations.Citation }
     * 
     * 
     */
    public List<Citations.Citation> getCitation() {
        if (citation == null) {
            citation = new ArrayList<Citations.Citation>();
        }
        return this.citation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://pathvisio.org/GPML/2021}Xref" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xref"
    })
    public static class Citation {

        @XmlElement(name = "Xref")
        protected Xref xref;
        @XmlAttribute(name = "url")
        protected String url;
        @XmlAttribute(name = "elementId", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String elementId;

        /**
         * Gets the value of the xref property.
         * 
         * @return
         *     possible object is
         *     {@link Xref }
         *     
         */
        public Xref getXref() {
            return xref;
        }

        /**
         * Sets the value of the xref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Xref }
         *     
         */
        public void setXref(Xref value) {
            this.xref = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
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

    }

}