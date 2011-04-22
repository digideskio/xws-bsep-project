package team9.ws.nalog_za_placanje.test;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

import team9.ws.nalog_za_placanje.NalogZaPlacanje;
import team9.ws.nalog_za_placanje.NalogZaPlacanjeService;
import team9.ws.nalog_za_placanje.NalogZaPlacanje_Type.Zaglavlje;
import team9.ws.nalog_za_placanje.NalogZaPlacanje_Type.Stavka;

public class NalogZaPlacanjeTest {
	public static void main(String[] args) {
		URL wsdlLocation = null;
		try {
			wsdlLocation = new URL("http://localhost:8080/team9/services/Nalog_za_placanje?wsdl");
		} catch (Exception ex) {
			return;
		}
		QName serviceName = new QName("http://team9/ws/nalog_za_placanje", "Nalog_za_placanjeService");
	//	QName portName = new QName("http://team9/ws/nalog_za_placanje", "NalogZaPlacanjePort");
		NalogZaPlacanjeService fs = new NalogZaPlacanjeService(wsdlLocation, serviceName);
		NalogZaPlacanje nalog_za_placanje = fs.getNalogZaPlacanjePort();
		
		Zaglavlje zaglavlje = new Zaglavlje();
		
		/*Ucesnik dobavljac = new Ucesnik();
		dobavljac.setAdresa("Novi Sad 21000 Negde 99");
		dobavljac.setNaziv("Dobavljac 1");
		dobavljac.setPIB("1234567890123");
		zaglavlje.setDobavljac(dobavljac);
		
		Ucesnik kupac = new Ucesnik();
		kupac.setAdresa("Novi Sad 21000 Negde Drugde 21");
		kupac.setNaziv("Kupac 1");
		kupac.setPIB("4567890123456");
		zaglavlje.setKupac(kupac);
		
		Racun racun = new Racun();
		zaglavlje.setRacun(racun);
		*/
		
		List<Stavka> stavke = new LinkedList<Stavka>();
		
		nalog_za_placanje.nalogZaPlacanje(zaglavlje, stavke);
	}
}
