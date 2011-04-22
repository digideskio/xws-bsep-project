
package team9.ws.faktura;

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
 *                   &lt;element name="dobavljac" type="{http://team9/ws/faktura}ucesnik"/>
 *                   &lt;element name="kupac" type="{http://team9/ws/faktura}ucesnik"/>
 *                   &lt;element name="racun">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vrednost_robe">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vrednost_usluga">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ukupno_roba_i_usluge">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="rabat">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="porez">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="iznos_za_uplatu">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="uplata_na_racun">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="broj_racuna" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
 *                   &lt;element name="redni_broj">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="naziv">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kolicina">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jedinica_mere">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jedinicna_cena">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vrednost">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="rabat">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procenat">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="iznos">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="umanjeno_za">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="porez">
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
@XmlRootElement(name = "faktura")
public class Faktura_Type {

    @XmlElement(required = true)
    protected Faktura_Type.Zaglavlje zaglavlje;
    @XmlElement(required = true)
    protected List<Faktura_Type.Stavka> stavka;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link Faktura_Type.Zaglavlje }
     *     
     */
    public Faktura_Type.Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faktura_Type.Zaglavlje }
     *     
     */
    public void setZaglavlje(Faktura_Type.Zaglavlje value) {
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
     * {@link Faktura_Type.Stavka }
     * 
     * 
     */
    public List<Faktura_Type.Stavka> getStavka() {
        if (stavka == null) {
            stavka = new ArrayList<Faktura_Type.Stavka>();
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
     *         &lt;element name="redni_broj">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="naziv">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kolicina">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jedinica_mere">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jedinicna_cena">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vrednost">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="rabat">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procenat">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="iznos">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="umanjeno_za">
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
     *         &lt;element name="porez">
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
        "redniBroj",
        "naziv",
        "kolicina",
        "jedinicaMere",
        "jedinicnaCena",
        "vrednost",
        "rabat",
        "porez"
    })
    public static class Stavka {

        @XmlElement(name = "redni_broj", required = true)
        protected BigInteger redniBroj;
        @XmlElement(required = true)
        protected String naziv;
        @XmlElement(required = true)
        protected BigDecimal kolicina;
        @XmlElement(name = "jedinica_mere", required = true)
        protected String jedinicaMere;
        @XmlElement(name = "jedinicna_cena", required = true)
        protected BigDecimal jedinicnaCena;
        @XmlElement(required = true)
        protected BigDecimal vrednost;
        @XmlElement(required = true)
        protected Faktura_Type.Stavka.Rabat rabat;
        @XmlElement(required = true)
        protected BigDecimal porez;

        /**
         * Gets the value of the redniBroj property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRedniBroj() {
            return redniBroj;
        }

        /**
         * Sets the value of the redniBroj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRedniBroj(BigInteger value) {
            this.redniBroj = value;
        }

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
         * Gets the value of the kolicina property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getKolicina() {
            return kolicina;
        }

        /**
         * Sets the value of the kolicina property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setKolicina(BigDecimal value) {
            this.kolicina = value;
        }

        /**
         * Gets the value of the jedinicaMere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJedinicaMere() {
            return jedinicaMere;
        }

        /**
         * Sets the value of the jedinicaMere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJedinicaMere(String value) {
            this.jedinicaMere = value;
        }

        /**
         * Gets the value of the jedinicnaCena property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getJedinicnaCena() {
            return jedinicnaCena;
        }

        /**
         * Sets the value of the jedinicnaCena property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setJedinicnaCena(BigDecimal value) {
            this.jedinicnaCena = value;
        }

        /**
         * Gets the value of the vrednost property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrednost() {
            return vrednost;
        }

        /**
         * Sets the value of the vrednost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrednost(BigDecimal value) {
            this.vrednost = value;
        }

        /**
         * Gets the value of the rabat property.
         * 
         * @return
         *     possible object is
         *     {@link Faktura_Type.Stavka.Rabat }
         *     
         */
        public Faktura_Type.Stavka.Rabat getRabat() {
            return rabat;
        }

        /**
         * Sets the value of the rabat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Faktura_Type.Stavka.Rabat }
         *     
         */
        public void setRabat(Faktura_Type.Stavka.Rabat value) {
            this.rabat = value;
        }

        /**
         * Gets the value of the porez property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPorez() {
            return porez;
        }

        /**
         * Sets the value of the porez property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPorez(BigDecimal value) {
            this.porez = value;
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
         *         &lt;element name="procenat">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="iznos">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="umanjeno_za">
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
            "procenat",
            "iznos",
            "umanjenoZa"
        })
        public static class Rabat {

            @XmlElement(required = true)
            protected BigDecimal procenat;
            @XmlElement(required = true)
            protected BigDecimal iznos;
            @XmlElement(name = "umanjeno_za", required = true)
            protected BigDecimal umanjenoZa;

            /**
             * Gets the value of the procenat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getProcenat() {
                return procenat;
            }

            /**
             * Sets the value of the procenat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setProcenat(BigDecimal value) {
                this.procenat = value;
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
             * Gets the value of the umanjenoZa property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUmanjenoZa() {
                return umanjenoZa;
            }

            /**
             * Sets the value of the umanjenoZa property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUmanjenoZa(BigDecimal value) {
                this.umanjenoZa = value;
            }

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
     *         &lt;element name="dobavljac" type="{http://team9/ws/faktura}ucesnik"/>
     *         &lt;element name="kupac" type="{http://team9/ws/faktura}ucesnik"/>
     *         &lt;element name="racun">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vrednost_robe">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vrednost_usluga">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ukupno_roba_i_usluge">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="rabat">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="porez">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="iznos_za_uplatu">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="uplata_na_racun">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="broj_racuna" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "dobavljac",
        "kupac",
        "racun"
    })
    public static class Zaglavlje {

        @XmlElement(required = true)
        protected Ucesnik dobavljac;
        @XmlElement(required = true)
        protected Ucesnik kupac;
        @XmlElement(required = true)
        protected Faktura_Type.Zaglavlje.Racun racun;

        /**
         * Gets the value of the dobavljac property.
         * 
         * @return
         *     possible object is
         *     {@link Ucesnik }
         *     
         */
        public Ucesnik getDobavljac() {
            return dobavljac;
        }

        /**
         * Sets the value of the dobavljac property.
         * 
         * @param value
         *     allowed object is
         *     {@link Ucesnik }
         *     
         */
        public void setDobavljac(Ucesnik value) {
            this.dobavljac = value;
        }

        /**
         * Gets the value of the kupac property.
         * 
         * @return
         *     possible object is
         *     {@link Ucesnik }
         *     
         */
        public Ucesnik getKupac() {
            return kupac;
        }

        /**
         * Sets the value of the kupac property.
         * 
         * @param value
         *     allowed object is
         *     {@link Ucesnik }
         *     
         */
        public void setKupac(Ucesnik value) {
            this.kupac = value;
        }

        /**
         * Gets the value of the racun property.
         * 
         * @return
         *     possible object is
         *     {@link Faktura_Type.Zaglavlje.Racun }
         *     
         */
        public Faktura_Type.Zaglavlje.Racun getRacun() {
            return racun;
        }

        /**
         * Sets the value of the racun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Faktura_Type.Zaglavlje.Racun }
         *     
         */
        public void setRacun(Faktura_Type.Zaglavlje.Racun value) {
            this.racun = value;
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
         *         &lt;element name="vrednost_robe">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vrednost_usluga">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ukupno_roba_i_usluge">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="rabat">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="porez">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="iznos_za_uplatu">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="uplata_na_racun">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="broj_racuna" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="datum_racuna" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "vrednostRobe",
            "vrednostUsluga",
            "ukupnoRobaIUsluge",
            "rabat",
            "porez",
            "iznosZaUplatu",
            "uplataNaRacun",
            "datumValute",
            "brojRacuna",
            "datumRacuna"
        })
        public static class Racun {

            @XmlElement(name = "vrednost_robe", required = true)
            protected BigDecimal vrednostRobe;
            @XmlElement(name = "vrednost_usluga", required = true)
            protected BigDecimal vrednostUsluga;
            @XmlElement(name = "ukupno_roba_i_usluge", required = true)
            protected BigDecimal ukupnoRobaIUsluge;
            @XmlElement(required = true)
            protected BigDecimal rabat;
            @XmlElement(required = true)
            protected BigDecimal porez;
            @XmlElement(name = "iznos_za_uplatu", required = true)
            protected BigDecimal iznosZaUplatu;
            @XmlElement(name = "uplata_na_racun", required = true)
            protected String uplataNaRacun;
            @XmlElement(name = "datum_valute", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumValute;
            @XmlElement(name = "broj_racuna", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger brojRacuna;
            @XmlElement(name = "datum_racuna", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumRacuna;

            /**
             * Gets the value of the vrednostRobe property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrednostRobe() {
                return vrednostRobe;
            }

            /**
             * Sets the value of the vrednostRobe property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrednostRobe(BigDecimal value) {
                this.vrednostRobe = value;
            }

            /**
             * Gets the value of the vrednostUsluga property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrednostUsluga() {
                return vrednostUsluga;
            }

            /**
             * Sets the value of the vrednostUsluga property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrednostUsluga(BigDecimal value) {
                this.vrednostUsluga = value;
            }

            /**
             * Gets the value of the ukupnoRobaIUsluge property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUkupnoRobaIUsluge() {
                return ukupnoRobaIUsluge;
            }

            /**
             * Sets the value of the ukupnoRobaIUsluge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUkupnoRobaIUsluge(BigDecimal value) {
                this.ukupnoRobaIUsluge = value;
            }

            /**
             * Gets the value of the rabat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRabat() {
                return rabat;
            }

            /**
             * Sets the value of the rabat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRabat(BigDecimal value) {
                this.rabat = value;
            }

            /**
             * Gets the value of the porez property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPorez() {
                return porez;
            }

            /**
             * Sets the value of the porez property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPorez(BigDecimal value) {
                this.porez = value;
            }

            /**
             * Gets the value of the iznosZaUplatu property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIznosZaUplatu() {
                return iznosZaUplatu;
            }

            /**
             * Sets the value of the iznosZaUplatu property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setIznosZaUplatu(BigDecimal value) {
                this.iznosZaUplatu = value;
            }

            /**
             * Gets the value of the uplataNaRacun property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUplataNaRacun() {
                return uplataNaRacun;
            }

            /**
             * Sets the value of the uplataNaRacun property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUplataNaRacun(String value) {
                this.uplataNaRacun = value;
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
             * Gets the value of the brojRacuna property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBrojRacuna() {
                return brojRacuna;
            }

            /**
             * Sets the value of the brojRacuna property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBrojRacuna(BigInteger value) {
                this.brojRacuna = value;
            }

            /**
             * Gets the value of the datumRacuna property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatumRacuna() {
                return datumRacuna;
            }

            /**
             * Sets the value of the datumRacuna property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatumRacuna(XMLGregorianCalendar value) {
                this.datumRacuna = value;
            }

        }

    }

}
