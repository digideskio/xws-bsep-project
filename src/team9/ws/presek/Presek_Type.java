
package team9.ws.presek;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="zaglavlje">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broj_racuna">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="broj_preseka">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="prethodno_stanje">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="korist" type="{http://team9/ws/presek}promene"/>
 *                   &lt;element name="teret" type="{http://team9/ws/presek}promene"/>
 *                   &lt;element name="novo_stanje">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stavka" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="duznik_nalogodavac" type="{http://team9/ws/presek}ucesnik"/>
 *                   &lt;element name="primalac_poverilac" type="{http://team9/ws/presek}ucesnik"/>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="svrha">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zaduzenje" type="{http://team9/ws/presek}podaci_o_uplati"/>
 *                   &lt;element name="odobrenje" type="{http://team9/ws/presek}podaci_o_uplati"/>
 *                   &lt;element name="iznos">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="smer">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "zaglavlje",
    "stavka"
})
@XmlRootElement(name = "presek")
public class Presek_Type {

    @XmlElement(required = true)
    protected Presek_Type.Zaglavlje zaglavlje;
    @XmlElement(required = true)
    protected List<Presek_Type.Stavka> stavka;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link Presek_Type.Zaglavlje }
     *     
     */
    public Presek_Type.Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presek_Type.Zaglavlje }
     *     
     */
    public void setZaglavlje(Presek_Type.Zaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the stavka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Presek_Type.Stavka }
     * 
     * 
     */
    public List<Presek_Type.Stavka> getStavka() {
        if (stavka == null) {
            stavka = new ArrayList<Presek_Type.Stavka>();
        }
        return this.stavka;
    }


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
     *         &lt;element name="duznik_nalogodavac" type="{http://team9/ws/presek}ucesnik"/>
     *         &lt;element name="primalac_poverilac" type="{http://team9/ws/presek}ucesnik"/>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="svrha">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zaduzenje" type="{http://team9/ws/presek}podaci_o_uplati"/>
     *         &lt;element name="odobrenje" type="{http://team9/ws/presek}podaci_o_uplati"/>
     *         &lt;element name="iznos">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="smer">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
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
        "datumNaloga",
        "datumValute",
        "svrha",
        "zaduzenje",
        "odobrenje",
        "iznos",
        "smer"
    })
    public static class Stavka {

        @XmlElement(name = "duznik_nalogodavac", required = true)
        protected Ucesnik duznikNalogodavac;
        @XmlElement(name = "primalac_poverilac", required = true)
        protected Ucesnik primalacPoverilac;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "datum_valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;
        @XmlElement(required = true)
        protected String svrha;
        @XmlElement(required = true)
        protected PodaciOUplati zaduzenje;
        @XmlElement(required = true)
        protected PodaciOUplati odobrenje;
        @XmlElement(required = true)
        protected BigDecimal iznos;
        @XmlElement(required = true)
        protected String smer;

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

        /**
         * Gets the value of the smer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmer() {
            return smer;
        }

        /**
         * Sets the value of the smer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmer(String value) {
            this.smer = value;
        }

    }


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
     *         &lt;element name="broj_racuna">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="broj_preseka">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="prethodno_stanje">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="korist" type="{http://team9/ws/presek}promene"/>
     *         &lt;element name="teret" type="{http://team9/ws/presek}promene"/>
     *         &lt;element name="novo_stanje">
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
        "brojRacuna",
        "datumNaloga",
        "brojPreseka",
        "prethodnoStanje",
        "korist",
        "teret",
        "novoStanje"
    })
    public static class Zaglavlje {

        @XmlElement(name = "broj_racuna", required = true)
        protected String brojRacuna;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "broj_preseka", required = true)
        protected BigInteger brojPreseka;
        @XmlElement(name = "prethodno_stanje", required = true)
        protected BigDecimal prethodnoStanje;
        @XmlElement(required = true)
        protected Promene korist;
        @XmlElement(required = true)
        protected Promene teret;
        @XmlElement(name = "novo_stanje", required = true)
        protected BigDecimal novoStanje;

        /**
         * Gets the value of the brojRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrojRacuna() {
            return brojRacuna;
        }

        /**
         * Sets the value of the brojRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrojRacuna(String value) {
            this.brojRacuna = value;
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
         * Gets the value of the brojPreseka property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPreseka() {
            return brojPreseka;
        }

        /**
         * Sets the value of the brojPreseka property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPreseka(BigInteger value) {
            this.brojPreseka = value;
        }

        /**
         * Gets the value of the prethodnoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrethodnoStanje() {
            return prethodnoStanje;
        }

        /**
         * Sets the value of the prethodnoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrethodnoStanje(BigDecimal value) {
            this.prethodnoStanje = value;
        }

        /**
         * Gets the value of the korist property.
         * 
         * @return
         *     possible object is
         *     {@link Promene }
         *     
         */
        public Promene getKorist() {
            return korist;
        }

        /**
         * Sets the value of the korist property.
         * 
         * @param value
         *     allowed object is
         *     {@link Promene }
         *     
         */
        public void setKorist(Promene value) {
            this.korist = value;
        }

        /**
         * Gets the value of the teret property.
         * 
         * @return
         *     possible object is
         *     {@link Promene }
         *     
         */
        public Promene getTeret() {
            return teret;
        }

        /**
         * Sets the value of the teret property.
         * 
         * @param value
         *     allowed object is
         *     {@link Promene }
         *     
         */
        public void setTeret(Promene value) {
            this.teret = value;
        }

        /**
         * Gets the value of the novoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNovoStanje() {
            return novoStanje;
        }

        /**
         * Sets the value of the novoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNovoStanje(BigDecimal value) {
            this.novoStanje = value;
        }

    }

}
