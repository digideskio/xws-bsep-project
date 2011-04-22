package team9.ws.faktura.test;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

import team9.ws.faktura.Faktura;
import team9.ws.faktura.FakturaService;
import team9.ws.faktura.Ucesnik;
import team9.ws.faktura.Faktura_Type.Stavka;
import team9.ws.faktura.Faktura_Type.Zaglavlje;
import team9.ws.faktura.Faktura_Type.Zaglavlje.Racun;

public class FakturaTest {
	public static void main(String[] args) {
		URL wsdlLocation = null;
		try {
			wsdlLocation = new URL("http://localhost:8080/team9/services/Faktura?wsdl");
		} catch (Exception ex) {
			return;
		}
		QName serviceName = new QName("http://team9/ws/faktura", "FakturaService");
	//	QName portName = new QName("http://team9/ws/faktura", "FakturaPort");
		FakturaService fs = new FakturaService(wsdlLocation, serviceName);
		Faktura faktura = fs.getFakturaPort();
		
		Zaglavlje zaglavlje = new Zaglavlje();
		
		Ucesnik dobavljac = new Ucesnik();
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
		
		List<Stavka> stavke = new LinkedList<Stavka>();
		
		faktura.faktura(zaglavlje, stavke);
	}
}
