package team9.ws.faktura;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.jws.WebService;

import team9.ws.faktura.Faktura_Type.Stavka;
import team9.ws.faktura.Faktura_Type.Zaglavlje;

@WebService(endpointInterface="team9.ws.faktura.Faktura",
		targetNamespace="http://team9/ws/faktura",
		name="FakturaService",
		portName="FakturaPort",
		serviceName="FakturaService")
@Interceptors(util.Logger.class)
public class FakturaBean implements Faktura {

	@Override
	public boolean faktura(Zaglavlje zagljavlje, List<Stavka> stavka) {
		// TODO Auto-generated method stub
		return false;
	}

}
