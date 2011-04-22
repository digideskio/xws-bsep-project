package team9.ws.zahtev_za_izvod;

import java.math.BigInteger;

import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(endpointInterface="team9.ws.zahtev_za_izvod.ZahtevZaIzvod",
		targetNamespace="http://team9/ws/zahtev_za_izvod",
		name="Zahtev_za_izvodService",
		portName="Zahtev_za_izvodPort",
		serviceName="Zahtev_za_izvodService")
@Interceptors(util.Logger.class)
public class ZahtevZaIzvodBean implements ZahtevZaIzvod {
	
	@Override
	public boolean zahtevZaIzvod(String brojRacuna, XMLGregorianCalendar datum,
			BigInteger redniBrojPreseka) {
		// TODO Auto-generated method stub
		return false;
	}

}
