package team9.ws.rtgs_nalog.test;

import java.math.BigDecimal;
import java.net.URL;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import team9.ws.rtgs_nalog.PodaciOUplati;
import team9.ws.rtgs_nalog.RTGSNalog;
import team9.ws.rtgs_nalog.RTGSNalogService;
import team9.ws.rtgs_nalog.Ucesnik;

public class RTGSNalogTest {
	public static void main(String[] args) {
		URL wsdlLocation = null;
		try {
			wsdlLocation = new URL("http://localhost:8080/team9/services/RTGS_nalog?wsdl");
		} catch (Exception ex) {
			return;
		}
		QName serviceName = new QName("http://team9/ws/RTGS_nalog", "RTGS_nalogService");
	//	QName portName = new QName("http://team9/ws/rtgs_nalog", "RTGSNalogPort");
		RTGSNalogService fs = new RTGSNalogService(wsdlLocation, serviceName);
		RTGSNalog rtgs_nalog = fs.getRTGSNalogPort();
		
		
		XMLGregorianCalendar datumNaloga = null;
		PodaciOUplati odobrenje = new PodaciOUplati();
		Ucesnik duznikNalogodavac = new Ucesnik();
		Ucesnik primalacPoverilac = new Ucesnik();
		XMLGregorianCalendar datumValute = null;
		BigDecimal iznos = BigDecimal.valueOf(1234); 
		String svrha = "abc";
		PodaciOUplati zaduzenje = new PodaciOUplati();
		rtgs_nalog.rtgsNalog(duznikNalogodavac, primalacPoverilac, svrha, datumNaloga, datumValute, zaduzenje, odobrenje, iznos);
	}
}
