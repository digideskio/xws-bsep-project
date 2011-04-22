package team9.ws.presek.test;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

import team9.ws.presek.Presek;
import team9.ws.presek.PresekService;
import team9.ws.presek.Presek_Type.Zaglavlje;
import team9.ws.presek.Presek_Type.Stavka;

public class PresekTest {
	public static void main(String[] args) {
		URL wsdlLocation = null;
		try {
			wsdlLocation = new URL("http://localhost:8080/team9/services/Presek?wsdl");
		} catch (Exception ex) {
			return;
		}
		QName serviceName = new QName("http://team9/ws/presek", "PresekService");
	//	QName portName = new QName("http://team9/ws/presek", "PresekPort");
		PresekService fs = new PresekService(wsdlLocation, serviceName);
		Presek presek = fs.getPresekPort();
		
		Zaglavlje zaglavlje = new Zaglavlje();		
		
		List<Stavka> stavke = new LinkedList<Stavka>();
		
		presek.presek(zaglavlje, stavke);
	}
}
