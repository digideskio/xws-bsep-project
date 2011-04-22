package team9.ws.zahtev_za_izvod.test;

import java.math.BigInteger;
import java.net.URL;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import team9.ws.zahtev_za_izvod.ZahtevZaIzvod;
import team9.ws.zahtev_za_izvod.ZahtevZaIzvodService;

public class ZahtevZaIzvodTest {
	public static void main(String[] args) {
		URL wsdlLocation = null;
		try {
			wsdlLocation = new URL("http://localhost:8080/team9/services/Zahtev_za_izvod?wsdl");
		} catch (Exception ex) {
			return;
		}
		QName serviceName = new QName("http://team9/ws/zahtev_za_izvod", "Zahtev_za_izvodService");
	//	QName portName = new QName("http://team9/ws/zahtev_za_izvod", "ZahtevZaIzvodPort");
		ZahtevZaIzvodService fs = new ZahtevZaIzvodService(wsdlLocation, serviceName);
		ZahtevZaIzvod zahtev_za_izvod = fs.getZahtevZaIzvodPort();
		
		
		String brojRacuna = "1234";
		XMLGregorianCalendar datum = null;
		BigInteger redniBrojPreseka = BigInteger.valueOf(5);
		zahtev_za_izvod.zahtevZaIzvod(brojRacuna, datum, redniBrojPreseka);
	}
}
