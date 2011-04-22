
package team9.ws.nalog_za_placanje;

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
 *                   &lt;element name="firma">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="naziv">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="adresa">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="broj_promena" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                   &lt;element name="ukupno_za_placanje">
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
 *                   &lt;element name="duznik_nalogodavac" type="{http://team9/ws/nalog_za_placanje}ucesnik"/>
 *                   &lt;element name="primalac_poverilac" type="{http://team9/ws/nalog_za_placanje}ucesnik"/>
 *                   &lt;element name="svrha">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="zaduzenje" type="{http://team9/ws/nalog_za_placanje}podaci_o_uplati"/>
 *                   &lt;element name="odobrenje" type="{http://team9/ws/nalog_za_placanje}podaci_o_uplati"/>
 *                   &lt;element name="iznos">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="hitno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "nalog_za_placanje")
public class NalogZaPlacanje_Type {

    @XmlElement(required = true)
    protected NalogZaPlacanje_Type.Zaglavlje zaglavlje;
    @XmlElement(required = true)
    protected List<NalogZaPlacanje_Type.Stavka> stavka;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link NalogZaPlacanje_Type.Zaglavlje }
     *     
     */
    public NalogZaPlacanje_Type.Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link NalogZaPlacanje_Type.Zaglavlje }
     *     
     */
    public void setZaglavlje(NalogZaPlacanje_Type.Zaglavlje value) {
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
     * {@link NalogZaPlacanje_Type.Stavka }
     * 
     * 
     */
    public List<NalogZaPlacanje_Type.Stavka> getStavka() {
        if (stavka == null) {
            stavka = new ArrayList<NalogZaPlacanje_Type.Stavka>();
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
     *         &lt;element name="duznik_nalogodavac" type="{http://team9/ws/nalog_za_placanje}ucesnik"/>
     *         &lt;element name="primalac_poverilac" type="{http://team9/ws/nalog_za_placanje}ucesnik"/>
     *         &lt;element name="svrha">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="zaduzenje" type="{http://team9/ws/nalog_za_placanje}podaci_o_uplati"/>
     *         &lt;element name="odobrenje" type="{http://team9/ws/nalog_za_placanje}podaci_o_uplati"/>
     *         &lt;element name="iznos">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="hitno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "iznos",
        "hitno"
    })
    public static class Stavka {

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
        protected boolean hitno;

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

        /**
         * Gets the value of the hitno property.
         * 
         */
        public boolean isHitno() {
            return hitno;
        }

        /**
         * Sets the value of the hitno property.
         * 
         */
        public void setHitno(boolean value) {
            this.hitno = value;
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
     *         &lt;element name="firma">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="naziv">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="adresa">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="broj_promena" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *         &lt;element name="ukupno_za_placanje">
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
        "firma",
        "datumNaloga",
        "brojPromena",
        "ukupnoZaPlacanje"
    })
    public static class Zaglavlje {

        @XmlElement(required = true)
        protected NalogZaPlacanje_Type.Zaglavlje.Firma firma;
        @XmlElement(name = "datum_naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "broj_promena", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger brojPromena;
        @XmlElement(name = "ukupno_za_placanje", required = true)
        protected BigDecimal ukupnoZaPlacanje;

        /**
         * Gets the value of the firma property.
         * 
         * @return
         *     possible object is
         *     {@link NalogZaPlacanje_Type.Zaglavlje.Firma }
         *     
         */
        public NalogZaPlacanje_Type.Zaglavlje.Firma getFirma() {
            return firma;
        }

        /**
         * Sets the value of the firma property.
         * 
         * @param value
         *     allowed object is
         *     {@link NalogZaPlacanje_Type.Zaglavlje.Firma }
         *     
         */
        public void setFirma(NalogZaPlacanje_Type.Zaglavlje.Firma value) {
            this.firma = value;
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
         * Gets the value of the brojPromena property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPromena() {
            return brojPromena;
        }

        /**
         * Sets the value of the brojPromena property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPromena(BigInteger value) {
            this.brojPromena = value;
        }

        /**
         * Gets the value of the ukupnoZaPlacanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoZaPlacanje() {
            return ukupnoZaPlacanje;
        }

        /**
         * Sets the value of the ukupnoZaPlacanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoZaPlacanje(BigDecimal value) {
            this.ukupnoZaPlacanje = value;
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
         *         &lt;element name="naziv">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="adresa">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
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
            "naziv",
            "adresa"
        })
        public static class Firma {

            @XmlElement(required = true)
            protected String naziv;
            @XmlElement(required = true)
            protected String adresa;

            /**
             * Gets the value of the naziv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaziv() {
                return naziv;
            }

            /**
             * Sets the value of the naziv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaziv(String value) {
                this.naziv = value;
            }

            /**
             * Gets the value of the adresa property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresa() {
                return adresa;
            }

            /**
             * Sets the value of the adresa property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresa(String value) {
                this.adresa = value;
            }

        }

    }

}
