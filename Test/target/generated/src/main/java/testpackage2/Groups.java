//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.27 at 07:48:35 PM CEST 
//


package testpackage2;

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
 *         &lt;element name="Group" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://pathvisio.org/GPML/2021}Xref" minOccurs="0"/&gt;
 *                   &lt;group ref="{http://pathvisio.org/GPML/2021}CommentGroup"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="elementRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="textLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="groupType" default="Group"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;union&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;enumeration value="Group"/&gt;
 *                           &lt;enumeration value="Complex"/&gt;
 *                           &lt;enumeration value="Pathway"/&gt;
 *                           &lt;enumeration value="Analog"/&gt;
 *                           &lt;enumeration value="Paralog"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/union&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
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
    "group"
})
@XmlRootElement(name = "Groups")
public class Groups {

    @XmlElement(name = "Group")
    protected List<Groups.Group> group;

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Groups.Group }
     * 
     * 
     */
    public List<Groups.Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Groups.Group>();
        }
        return this.group;
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
     *         &lt;group ref="{http://pathvisio.org/GPML/2021}CommentGroup"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="elementRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="textLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="groupType" default="Group"&gt;
     *         &lt;simpleType&gt;
     *           &lt;union&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                 &lt;enumeration value="Group"/&gt;
     *                 &lt;enumeration value="Complex"/&gt;
     *                 &lt;enumeration value="Pathway"/&gt;
     *                 &lt;enumeration value="Analog"/&gt;
     *                 &lt;enumeration value="Paralog"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/union&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xref",
        "comment",
        "property",
        "annotationRef",
        "citationRef"
    })
    public static class Group {

        @XmlElement(name = "Xref")
        protected Xref xref;
        @XmlElement(name = "Comment")
        protected List<testpackage2.Pathway.Comment> comment;
        @XmlElement(name = "Property")
        protected List<testpackage2.Pathway.Property> property;
        @XmlElement(name = "AnnotationRef")
        protected List<testpackage2.Pathway.AnnotationRef> annotationRef;
        @XmlElement(name = "CitationRef")
        protected List<testpackage2.Pathway.CitationRef> citationRef;
        @XmlAttribute(name = "elementId", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String elementId;
        @XmlAttribute(name = "elementRef")
        protected String elementRef;
        @XmlAttribute(name = "textLabel")
        protected String textLabel;
        @XmlAttribute(name = "groupType")
        protected String groupType;

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
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link testpackage2.Pathway.Comment }
         * 
         * 
         */
        public List<testpackage2.Pathway.Comment> getComment() {
            if (comment == null) {
                comment = new ArrayList<testpackage2.Pathway.Comment>();
            }
            return this.comment;
        }

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link testpackage2.Pathway.Property }
         * 
         * 
         */
        public List<testpackage2.Pathway.Property> getProperty() {
            if (property == null) {
                property = new ArrayList<testpackage2.Pathway.Property>();
            }
            return this.property;
        }

        /**
         * Gets the value of the annotationRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotationRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotationRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link testpackage2.Pathway.AnnotationRef }
         * 
         * 
         */
        public List<testpackage2.Pathway.AnnotationRef> getAnnotationRef() {
            if (annotationRef == null) {
                annotationRef = new ArrayList<testpackage2.Pathway.AnnotationRef>();
            }
            return this.annotationRef;
        }

        /**
         * Gets the value of the citationRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citationRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCitationRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link testpackage2.Pathway.CitationRef }
         * 
         * 
         */
        public List<testpackage2.Pathway.CitationRef> getCitationRef() {
            if (citationRef == null) {
                citationRef = new ArrayList<testpackage2.Pathway.CitationRef>();
            }
            return this.citationRef;
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
         * Gets the value of the elementRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementRef() {
            return elementRef;
        }

        /**
         * Sets the value of the elementRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElementRef(String value) {
            this.elementRef = value;
        }

        /**
         * Gets the value of the textLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextLabel() {
            return textLabel;
        }

        /**
         * Sets the value of the textLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextLabel(String value) {
            this.textLabel = value;
        }

        /**
         * Gets the value of the groupType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupType() {
            if (groupType == null) {
                return "Group";
            } else {
                return groupType;
            }
        }

        /**
         * Sets the value of the groupType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupType(String value) {
            this.groupType = value;
        }

    }

}
