
package team9.ws.rtgs_nalog;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duznik_nalogodavac" type="{http://team9/ws/RTGS_nalog}ucesnik"/>
 *         &lt;element name="primalac_poverilac" type="{http://team9/ws/RTGS_nalog}ucesnik"/>
 *         &lt;element name="svrha">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="zaduzenje" type="{http://team9/ws/RTGS_nalog}podaci_o_uplati"/>
 *         &lt;element name="odobrenje" type="{http://team9/ws/RTGS_nalog}podaci_o_uplati"/>
 *         &lt;element name="iznos">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "duznikNalogodavac",
    "primalacPoverilac",
    "svrha",
    "datumNaloga",
    "datumValute",
    "zaduzenje",
    "odobrenje",
    "iznos"
})
@XmlRootElement(name = "RTGS_nalog")
public class RTGSNalog_Type {

    @XmlElement(name = "duznik_nalogodavac", required = true)
    protected Ucesnik duznikNalogodavac;
    @XmlElement(name = "primalac_poverilac", required = true)
    protected Ucesnik primalacPoverilac;
    @XmlElement(required = true)
    protected String svrha;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "datum_valute", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(required = true)
    protected PodaciOUplati zaduzenje;
    @XmlElement(required = true)
    protected PodaciOUplati odobrenje;
    @XmlElement(required = true)
    protected BigDecimal iznos;

    /**
     * Gets the value of the duznikNalogodavac property.
     * 
     * @return
     *     possible object is
     *     {@link Ucesnik }
     *     
     */
    public Ucesnik getDuznikNalogodavac() {
        return duznikNalogodavac;
    }

    /**
     * Sets the value of the duznikNalogodavac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ucesnik }
     *     
     */
    public void setDuznikNalogodavac(Ucesnik value) {
        this.duznikNalogodavac = value;
    }

    /**
     * Gets the value of the primalacPoverilac property.
     * 
     * @return
     *     possible object is
     *     {@link Ucesnik }
     *     
     */
    public Ucesnik getPrimalacPoverilac() {
        return primalacPoverilac;
    }

    /**
     * Sets the value of the primalacPoverilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ucesnik }
     *     
     */
    public void setPrimalacPoverilac(Ucesnik value) {
        this.primalacPoverilac = value;
    }

    /**
     * Gets the value of the svrha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrha() {
        return svrha;
    }

    /**
     * Sets the value of the svrha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrha(String value) {
        this.svrha = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the zaduzenje property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOUplati }
     *     
     */
    public PodaciOUplati getZaduzenje() {
        return zaduzenje;
    }

    /**
     * Sets the value of the zaduzenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOUplati }
     *     
     */
    public void setZaduzenje(PodaciOUplati value) {
        this.zaduzenje = value;
    }

    /**
     * Gets the value of the odobrenje property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOUplati }
     *     
     */
    public PodaciOUplati getOdobrenje() {
        return odobrenje;
    }

    /**
     * Sets the value of the odobrenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOUplati }
     *     
     */
    public void setOdobrenje(PodaciOUplati value) {
        this.odobrenje = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznos(BigDecimal value) {
        this.iznos = value;
    }

}
