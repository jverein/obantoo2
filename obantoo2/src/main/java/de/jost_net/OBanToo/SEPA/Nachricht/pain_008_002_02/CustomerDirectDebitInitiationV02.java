//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.28 at 07:14:46 PM CET 
//

package de.jost_net.OBanToo.SEPA.Nachricht.pain_008_002_02;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CustomerDirectDebitInitiationV02 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDirectDebitInitiationV02">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}GroupHeaderSDD"/>
 *         &lt;element name="PmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}PaymentInstructionInformationSDD" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDirectDebitInitiationV02", propOrder = { "grpHdr",
    "pmtInf" })
public class CustomerDirectDebitInitiationV02
{

  @XmlElement(name = "GrpHdr", required = true)
  protected GroupHeaderSDD grpHdr;

  @XmlElement(name = "PmtInf", required = true)
  protected List<PaymentInstructionInformationSDD> pmtInf;

  /**
   * Gets the value of the grpHdr property.
   * 
   * @return possible object is {@link GroupHeaderSDD }
   * 
   */
  public GroupHeaderSDD getGrpHdr()
  {
    return grpHdr;
  }

  /**
   * Sets the value of the grpHdr property.
   * 
   * @param value
   *          allowed object is {@link GroupHeaderSDD }
   * 
   */
  public void setGrpHdr(GroupHeaderSDD value)
  {
    this.grpHdr = value;
  }

  /**
   * Gets the value of the pmtInf property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pmtInf property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getPmtInf().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link PaymentInstructionInformationSDD }
   * 
   * 
   */
  public List<PaymentInstructionInformationSDD> getPmtInf()
  {
    if (pmtInf == null)
    {
      pmtInf = new ArrayList<>();
    }
    return this.pmtInf;
  }

}
