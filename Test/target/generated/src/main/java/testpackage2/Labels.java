//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.27 at 07:48:35 PM CEST 
//


package testpackage2;

import java.math.BigInteger;
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
 *         &lt;element name="Label" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Graphics"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://pathvisio.org/GPML/2021}ShapeStyleAttributes"/&gt;
 *                           &lt;attGroup ref="{http://pathvisio.org/GPML/2021}RectAttributes"/&gt;
 *                           &lt;attGroup ref="{http://pathvisio.org/GPML/2021}FontAttributes"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;group ref="{http://pathvisio.org/GPML/2021}CommentGroup"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                 &lt;attribute name="elementRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="textLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "label"
})
@XmlRootElement(name = "Labels")
public class Labels {

    @XmlElement(name = "Label")
    protected List<Labels.Label> label;

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Labels.Label }
     * 
     * 
     */
    public List<Labels.Label> getLabel() {
        if (label == null) {
            label = new ArrayList<Labels.Label>();
        }
        return this.label;
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
     *         &lt;element name="Graphics"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://pathvisio.org/GPML/2021}ShapeStyleAttributes"/&gt;
     *                 &lt;attGroup ref="{http://pathvisio.org/GPML/2021}RectAttributes"/&gt;
     *                 &lt;attGroup ref="{http://pathvisio.org/GPML/2021}FontAttributes"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;group ref="{http://pathvisio.org/GPML/2021}CommentGroup"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="elementId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *       &lt;attribute name="elementRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="textLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "graphics",
        "comment",
        "property",
        "annotationRef",
        "citationRef"
    })
    public static class Label {

        @XmlElement(name = "Graphics", required = true)
        protected Labels.Label.Graphics graphics;
        @XmlElement(name = "Comment")
        protected List<testpackage2.Pathway.Comment> comment;
        @XmlElement(name = "Property")
        protected List<testpackage2.Pathway.Property> property;
        @XmlElement(name = "AnnotationRef")
        protected List<testpackage2.Pathway.AnnotationRef> annotationRef;
        @XmlElement(name = "CitationRef")
        protected List<testpackage2.Pathway.CitationRef> citationRef;
        @XmlAttribute(name = "href")
        protected String href;
        @XmlAttribute(name = "elementId", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String elementId;
        @XmlAttribute(name = "elementRef")
        protected String elementRef;
        @XmlAttribute(name = "textLabel", required = true)
        protected String textLabel;

        /**
         * Gets the value of the graphics property.
         * 
         * @return
         *     possible object is
         *     {@link Labels.Label.Graphics }
         *     
         */
        public Labels.Label.Graphics getGraphics() {
            return graphics;
        }

        /**
         * Sets the value of the graphics property.
         * 
         * @param value
         *     allowed object is
         *     {@link Labels.Label.Graphics }
         *     
         */
        public void setGraphics(Labels.Label.Graphics value) {
            this.graphics = value;
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
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attGroup ref="{http://pathvisio.org/GPML/2021}ShapeStyleAttributes"/&gt;
         *       &lt;attGroup ref="{http://pathvisio.org/GPML/2021}RectAttributes"/&gt;
         *       &lt;attGroup ref="{http://pathvisio.org/GPML/2021}FontAttributes"/&gt;
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

            @XmlAttribute(name = "borderColor")
            protected String borderColor;
            @XmlAttribute(name = "borderStyle")
            protected StyleType borderStyle;
            @XmlAttribute(name = "borderWidth")
            protected Float borderWidth;
            @XmlAttribute(name = "fillColor")
            protected String fillColor;
            @XmlAttribute(name = "shapeType")
            protected String shapeType;
            @XmlAttribute(name = "zOrder")
            protected BigInteger zOrder;
            @XmlAttribute(name = "centerX", required = true)
            protected float centerX;
            @XmlAttribute(name = "centerY", required = true)
            protected float centerY;
            @XmlAttribute(name = "width", required = true)
            protected float width;
            @XmlAttribute(name = "height", required = true)
            protected float height;
            @XmlAttribute(name = "textColor")
            protected String textColor;
            @XmlAttribute(name = "fontName")
            protected String fontName;
            @XmlAttribute(name = "fontStyle")
            protected String fontStyle;
            @XmlAttribute(name = "fontDecoration")
            protected String fontDecoration;
            @XmlAttribute(name = "fontStrikethru")
            protected String fontStrikethru;
            @XmlAttribute(name = "fontWeight")
            protected String fontWeight;
            @XmlAttribute(name = "fontSize")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger fontSize;
            @XmlAttribute(name = "hAlign")
            protected String hAlign;
            @XmlAttribute(name = "vAlign")
            protected String vAlign;

            /**
             * Gets the value of the borderColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBorderColor() {
                if (borderColor == null) {
                    return "Black";
                } else {
                    return borderColor;
                }
            }

            /**
             * Sets the value of the borderColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBorderColor(String value) {
                this.borderColor = value;
            }

            /**
             * Gets the value of the borderStyle property.
             * 
             * @return
             *     possible object is
             *     {@link StyleType }
             *     
             */
            public StyleType getBorderStyle() {
                if (borderStyle == null) {
                    return StyleType.SOLID;
                } else {
                    return borderStyle;
                }
            }

            /**
             * Sets the value of the borderStyle property.
             * 
             * @param value
             *     allowed object is
             *     {@link StyleType }
             *     
             */
            public void setBorderStyle(StyleType value) {
                this.borderStyle = value;
            }

            /**
             * Gets the value of the borderWidth property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public float getBorderWidth() {
                if (borderWidth == null) {
                    return  1.0F;
                } else {
                    return borderWidth;
                }
            }

            /**
             * Sets the value of the borderWidth property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setBorderWidth(Float value) {
                this.borderWidth = value;
            }

            /**
             * Gets the value of the fillColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFillColor() {
                if (fillColor == null) {
                    return "White";
                } else {
                    return fillColor;
                }
            }

            /**
             * Sets the value of the fillColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFillColor(String value) {
                this.fillColor = value;
            }

            /**
             * Gets the value of the shapeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShapeType() {
                if (shapeType == null) {
                    return "Rectangle";
                } else {
                    return shapeType;
                }
            }

            /**
             * Sets the value of the shapeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShapeType(String value) {
                this.shapeType = value;
            }

            /**
             * Gets the value of the zOrder property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getZOrder() {
                return zOrder;
            }

            /**
             * Sets the value of the zOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setZOrder(BigInteger value) {
                this.zOrder = value;
            }

            /**
             * Gets the value of the centerX property.
             * 
             */
            public float getCenterX() {
                return centerX;
            }

            /**
             * Sets the value of the centerX property.
             * 
             */
            public void setCenterX(float value) {
                this.centerX = value;
            }

            /**
             * Gets the value of the centerY property.
             * 
             */
            public float getCenterY() {
                return centerY;
            }

            /**
             * Sets the value of the centerY property.
             * 
             */
            public void setCenterY(float value) {
                this.centerY = value;
            }

            /**
             * Gets the value of the width property.
             * 
             */
            public float getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             */
            public void setWidth(float value) {
                this.width = value;
            }

            /**
             * Gets the value of the height property.
             * 
             */
            public float getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             */
            public void setHeight(float value) {
                this.height = value;
            }

            /**
             * Gets the value of the textColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextColor() {
                if (textColor == null) {
                    return "White";
                } else {
                    return textColor;
                }
            }

            /**
             * Sets the value of the textColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextColor(String value) {
                this.textColor = value;
            }

            /**
             * Gets the value of the fontName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFontName() {
                if (fontName == null) {
                    return "Arial";
                } else {
                    return fontName;
                }
            }

            /**
             * Sets the value of the fontName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFontName(String value) {
                this.fontName = value;
            }

            /**
             * Gets the value of the fontStyle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFontStyle() {
                if (fontStyle == null) {
                    return "Normal";
                } else {
                    return fontStyle;
                }
            }

            /**
             * Sets the value of the fontStyle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFontStyle(String value) {
                this.fontStyle = value;
            }

            /**
             * Gets the value of the fontDecoration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFontDecoration() {
                if (fontDecoration == null) {
                    return "Normal";
                } else {
                    return fontDecoration;
                }
            }

            /**
             * Sets the value of the fontDecoration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFontDecoration(String value) {
                this.fontDecoration = value;
            }

            /**
             * Gets the value of the fontStrikethru property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFontStrikethru() {
                if (fontStrikethru == null) {
                    return "Normal";
                } else {
                    return fontStrikethru;
                }
            }

            /**
             * Sets the value of the fontStrikethru property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFontStrikethru(String value) {
                this.fontStrikethru = value;
            }

            /**
             * Gets the value of the fontWeight property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFontWeight() {
                if (fontWeight == null) {
                    return "Normal";
                } else {
                    return fontWeight;
                }
            }

            /**
             * Sets the value of the fontWeight property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFontWeight(String value) {
                this.fontWeight = value;
            }

            /**
             * Gets the value of the fontSize property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFontSize() {
                if (fontSize == null) {
                    return new BigInteger("12");
                } else {
                    return fontSize;
                }
            }

            /**
             * Sets the value of the fontSize property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFontSize(BigInteger value) {
                this.fontSize = value;
            }

            /**
             * Gets the value of the hAlign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHAlign() {
                if (hAlign == null) {
                    return "Center";
                } else {
                    return hAlign;
                }
            }

            /**
             * Sets the value of the hAlign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHAlign(String value) {
                this.hAlign = value;
            }

            /**
             * Gets the value of the vAlign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVAlign() {
                if (vAlign == null) {
                    return "Middle";
                } else {
                    return vAlign;
                }
            }

            /**
             * Sets the value of the vAlign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVAlign(String value) {
                this.vAlign = value;
            }

        }

    }

}
