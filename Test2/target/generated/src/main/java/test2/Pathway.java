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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Author" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;group ref="{http://pathvisio.org/GPML/2021}CommentGroup"/&gt;
 *         &lt;element name="Graphics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="boardWidth" use="required" type="{http://pathvisio.org/GPML/2021}Dimension" /&gt;
 *                 &lt;attribute name="boardHeight" use="required" type="{http://pathvisio.org/GPML/2021}Dimension" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}DataNodes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}States" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Interactions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}GraphicalLines" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Labels" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Shapes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Groups" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}InfoBox"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Legend" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Annotations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://pathvisio.org/GPML/2021}Citations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="organism" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="license" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "author",
    "comment",
    "property",
    "annotationRef",
    "citationRef",
    "graphics",
    "dataNodes",
    "states",
    "interactions",
    "graphicalLines",
    "labels",
    "shapes",
    "groups",
    "infoBox",
    "legend",
    "annotations",
    "citations"
})
@XmlRootElement(name = "Pathway")
public class Pathway {

    @XmlElement(name = "Xref")
    protected Xref xref;
    @XmlElement(name = "Author")
    protected List<Pathway.Author> author;
    @XmlElement(name = "Comment")
    protected List<Pathway.Comment> comment;
    @XmlElement(name = "Property")
    protected List<Pathway.Property> property;
    @XmlElement(name = "AnnotationRef")
    protected List<Pathway.AnnotationRef> annotationRef;
    @XmlElement(name = "CitationRef")
    protected List<Pathway.CitationRef> citationRef;
    @XmlElement(name = "Graphics")
    protected Pathway.Graphics graphics;
    @XmlElement(name = "DataNodes")
    protected DataNodes dataNodes;
    @XmlElement(name = "States")
    protected States states;
    @XmlElement(name = "Interactions")
    protected Interactions interactions;
    @XmlElement(name = "GraphicalLines")
    protected GraphicalLines graphicalLines;
    @XmlElement(name = "Labels")
    protected Labels labels;
    @XmlElement(name = "Shapes")
    protected Shapes shapes;
    @XmlElement(name = "Groups")
    protected Groups groups;
    @XmlElement(name = "InfoBox", required = true)
    protected InfoBox infoBox;
    @XmlElement(name = "Legend")
    protected Legend legend;
    @XmlElement(name = "Annotations")
    protected Annotations annotations;
    @XmlElement(name = "Citations")
    protected Citations citations;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "organism")
    protected String organism;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "license")
    protected String license;

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
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pathway.Author }
     * 
     * 
     */
    public List<Pathway.Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<Pathway.Author>();
        }
        return this.author;
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
     * {@link Pathway.Comment }
     * 
     * 
     */
    public List<Pathway.Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Pathway.Comment>();
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
     * {@link Pathway.Property }
     * 
     * 
     */
    public List<Pathway.Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Pathway.Property>();
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
     * {@link Pathway.AnnotationRef }
     * 
     * 
     */
    public List<Pathway.AnnotationRef> getAnnotationRef() {
        if (annotationRef == null) {
            annotationRef = new ArrayList<Pathway.AnnotationRef>();
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
     * {@link Pathway.CitationRef }
     * 
     * 
     */
    public List<Pathway.CitationRef> getCitationRef() {
        if (citationRef == null) {
            citationRef = new ArrayList<Pathway.CitationRef>();
        }
        return this.citationRef;
    }

    /**
     * Gets the value of the graphics property.
     * 
     * @return
     *     possible object is
     *     {@link Pathway.Graphics }
     *     
     */
    public Pathway.Graphics getGraphics() {
        return graphics;
    }

    /**
     * Sets the value of the graphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pathway.Graphics }
     *     
     */
    public void setGraphics(Pathway.Graphics value) {
        this.graphics = value;
    }

    /**
     * Gets the value of the dataNodes property.
     * 
     * @return
     *     possible object is
     *     {@link DataNodes }
     *     
     */
    public DataNodes getDataNodes() {
        return dataNodes;
    }

    /**
     * Sets the value of the dataNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNodes }
     *     
     */
    public void setDataNodes(DataNodes value) {
        this.dataNodes = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link States }
     *     
     */
    public States getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link States }
     *     
     */
    public void setStates(States value) {
        this.states = value;
    }

    /**
     * Gets the value of the interactions property.
     * 
     * @return
     *     possible object is
     *     {@link Interactions }
     *     
     */
    public Interactions getInteractions() {
        return interactions;
    }

    /**
     * Sets the value of the interactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interactions }
     *     
     */
    public void setInteractions(Interactions value) {
        this.interactions = value;
    }

    /**
     * Gets the value of the graphicalLines property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicalLines }
     *     
     */
    public GraphicalLines getGraphicalLines() {
        return graphicalLines;
    }

    /**
     * Sets the value of the graphicalLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicalLines }
     *     
     */
    public void setGraphicalLines(GraphicalLines value) {
        this.graphicalLines = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link Labels }
     *     
     */
    public Labels getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Labels }
     *     
     */
    public void setLabels(Labels value) {
        this.labels = value;
    }

    /**
     * Gets the value of the shapes property.
     * 
     * @return
     *     possible object is
     *     {@link Shapes }
     *     
     */
    public Shapes getShapes() {
        return shapes;
    }

    /**
     * Sets the value of the shapes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shapes }
     *     
     */
    public void setShapes(Shapes value) {
        this.shapes = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * Gets the value of the infoBox property.
     * 
     * @return
     *     possible object is
     *     {@link InfoBox }
     *     
     */
    public InfoBox getInfoBox() {
        return infoBox;
    }

    /**
     * Sets the value of the infoBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoBox }
     *     
     */
    public void setInfoBox(InfoBox value) {
        this.infoBox = value;
    }

    /**
     * Gets the value of the legend property.
     * 
     * @return
     *     possible object is
     *     {@link Legend }
     *     
     */
    public Legend getLegend() {
        return legend;
    }

    /**
     * Sets the value of the legend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Legend }
     *     
     */
    public void setLegend(Legend value) {
        this.legend = value;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link Annotations }
     *     
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotations }
     *     
     */
    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the citations property.
     * 
     * @return
     *     possible object is
     *     {@link Citations }
     *     
     */
    public Citations getCitations() {
        return citations;
    }

    /**
     * Sets the value of the citations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citations }
     *     
     */
    public void setCitations(Citations value) {
        this.citations = value;
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
     * Gets the value of the organism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganism() {
        return organism;
    }

    /**
     * Sets the value of the organism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganism(String value) {
        this.organism = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
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
     *       &lt;attribute name="elementRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AnnotationRef {

        @XmlAttribute(name = "elementRef", required = true)
        protected String elementRef;

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
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Author {

        @XmlAttribute(name = "name", required = true)
        protected String name;

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
     *       &lt;attribute name="elementRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CitationRef {

        @XmlAttribute(name = "elementRef", required = true)
        protected String elementRef;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Comment {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;

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
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

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
     *       &lt;attribute name="boardWidth" use="required" type="{http://pathvisio.org/GPML/2021}Dimension" /&gt;
     *       &lt;attribute name="boardHeight" use="required" type="{http://pathvisio.org/GPML/2021}Dimension" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Graphics {

        @XmlAttribute(name = "boardWidth", required = true)
        protected float boardWidth;
        @XmlAttribute(name = "boardHeight", required = true)
        protected float boardHeight;

        /**
         * Gets the value of the boardWidth property.
         * 
         */
        public float getBoardWidth() {
            return boardWidth;
        }

        /**
         * Sets the value of the boardWidth property.
         * 
         */
        public void setBoardWidth(float value) {
            this.boardWidth = value;
        }

        /**
         * Gets the value of the boardHeight property.
         * 
         */
        public float getBoardHeight() {
            return boardHeight;
        }

        /**
         * Sets the value of the boardHeight property.
         * 
         */
        public void setBoardHeight(float value) {
            this.boardHeight = value;
        }

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
     *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Property {

        @XmlAttribute(name = "key", required = true)
        protected String key;
        @XmlAttribute(name = "value", required = true)
        protected String value;

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

    }

}