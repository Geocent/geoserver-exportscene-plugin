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
 * <p>Java class for gles_sampler_wrap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gles_sampler_wrap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="REPEAT"/>
 *     &lt;enumeration value="CLAMP"/>
 *     &lt;enumeration value="CLAMP_TO_EDGE"/>
 *     &lt;enumeration value="MIRRORED_REPEAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gles_sampler_wrap")
@XmlEnum
public enum GlesSamplerWrap {

    REPEAT,
    CLAMP,
    CLAMP_TO_EDGE,

    /**
     * 
     * 					supported by GLES 1.1 only
     * 					
     * 
     */
    MIRRORED_REPEAT;

    public String value() {
        return name();
    }

    public static GlesSamplerWrap fromValue(String v) {
        return valueOf(v);
    }

}
