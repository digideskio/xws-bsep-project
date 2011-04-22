package team9.ws.presek;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.jws.WebService;

import team9.ws.presek.Presek_Type.Stavka;
import team9.ws.presek.Presek_Type.Zaglavlje;

@WebService(endpointInterface="team9.ws.presek.Presek",
		targetNamespace="http://team9/ws/presek",
		name="PresekService",
		portName="PresekPort",
		serviceName="PresekService")
@Interceptors(util.Logger.class)
public class PresekBean implements Presek {


	@Override
	public boolean presek(Zaglavlje zaglavlje, List<Stavka> stavka) {
		// TODO Auto-generated method stub
		return false;
	}

}
