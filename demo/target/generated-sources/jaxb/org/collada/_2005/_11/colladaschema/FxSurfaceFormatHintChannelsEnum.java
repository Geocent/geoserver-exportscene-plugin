//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.27 at 11:54:03 AM CST 
//


package org.collada._2005._11.colladaschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fx_surface_format_hint_channels_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fx_surface_format_hint_channels_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RGB"/>
 *     &lt;enumeration value="RGBA"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="XYZ"/>
 *     &lt;enumeration value="XYZW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_surface_format_hint_channels_enum")
@XmlEnum
public enum FxSurfaceFormatHintChannelsEnum {


    /**
     * RGB color  map
     * 
     */
    RGB,

    /**
     * RGB color + Alpha map often used for color + transparency or other things packed into channel A like specular power 
     * 
     */
    RGBA,

    /**
     * Luminance map often used for light mapping 
     * 
     */
    L,

    /**
     * Luminance+Alpha map often used for light mapping 
     * 
     */
    LA,

    /**
     * Depth map often used for displacement, parellax, relief, or shadow mapping 
     * 
     */
    D,

    /**
     * Typically used for normal maps or 3component displacement maps.
     * 
     */
    XYZ,

    /**
     * Typically used for normal maps where W is the depth for relief or parrallax mapping 
     * 
     */
    XYZW;

    public String value() {
        return name();
    }

    public static FxSurfaceFormatHintChannelsEnum fromValue(String v) {
        return valueOf(v);
    }

}
