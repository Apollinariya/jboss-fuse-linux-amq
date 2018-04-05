
package org.datacontract.schemas._2004._07.ncspintegration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanTableStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanTableStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnloadBegin"/&gt;
 *     &lt;enumeration value="UnloadEnd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlanTableStatus")
@XmlEnum
public enum PlanTableStatus {

    @XmlEnumValue("UnloadBegin")
    UNLOAD_BEGIN("UnloadBegin"),
    @XmlEnumValue("UnloadEnd")
    UNLOAD_END("UnloadEnd");
    private final String value;

    PlanTableStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanTableStatus fromValue(String v) {
        for (PlanTableStatus c: PlanTableStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
