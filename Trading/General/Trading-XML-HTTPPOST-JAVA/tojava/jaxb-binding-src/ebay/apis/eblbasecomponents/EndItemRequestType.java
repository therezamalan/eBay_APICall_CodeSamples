//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Ends the specified item listing before the date and time at which
 * 				it would normally end (per the listing duration).
 * 			
 * 
 * <p>Java class for EndItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="EndingReason" type="{urn:ebay:apis:eBLBaseComponents}EndReasonCodeType" minOccurs="0"/>
 *         &lt;element name="SellerInventoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemRequestType", propOrder = {
    "itemID",
    "endingReason",
    "sellerInventoryID"
})
public class EndItemRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "EndingReason")
    protected EndReasonCodeType endingReason;
    @XmlElement(name = "SellerInventoryID")
    protected String sellerInventoryID;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the endingReason property.
     * 
     * @return
     *     possible object is
     *     {@link EndReasonCodeType }
     *     
     */
    public EndReasonCodeType getEndingReason() {
        return endingReason;
    }

    /**
     * Sets the value of the endingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndReasonCodeType }
     *     
     */
    public void setEndingReason(EndReasonCodeType value) {
        this.endingReason = value;
    }

    /**
     * Gets the value of the sellerInventoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerInventoryID() {
        return sellerInventoryID;
    }

    /**
     * Sets the value of the sellerInventoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerInventoryID(String value) {
        this.sellerInventoryID = value;
    }

}
