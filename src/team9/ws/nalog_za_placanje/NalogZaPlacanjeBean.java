package team9.ws.nalog_za_placanje;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.jws.WebService;

import team9.ws.nalog_za_placanje.NalogZaPlacanje_Type.Stavka;
import team9.ws.nalog_za_placanje.NalogZaPlacanje_Type.Zaglavlje;

@WebService(endpointInterface="team9.ws.nalog_za_placanje.NalogZaPlacanje",
		targetNamespace="http://team9/ws/nalog_za_placanje",
		name="Nalog_za_placanjeService",
		portName="Nalog_za_placanjePort",
		serviceName="Nalog_za_placanjeService")
@Interceptors(util.Logger.class)
public class NalogZaPlacanjeBean implements NalogZaPlacanje {

	@Override
	public boolean nalogZaPlacanje(Zaglavlje zaglavlje, List<Stavka> stavka) {
		// TODO Auto-generated method stub
		return false;
	}


}
