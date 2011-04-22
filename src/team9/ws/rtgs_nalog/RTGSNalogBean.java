package team9.ws.rtgs_nalog;


import java.math.BigDecimal;

import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(endpointInterface="team9.ws.rtgs_nalog.RTGSNalog",
		targetNamespace="http://team9/ws/RTGS_Nalog",
		name="RTGS_nalogService",
		portName="RTGS_nalogPort",
		serviceName="RTGS_nalogService")
@Interceptors(util.Logger.class)
public class RTGSNalogBean implements RTGSNalog {

	@Override
	public boolean rtgsNalog(Ucesnik duznikNalogodavac,
			Ucesnik primalacPoverilac, String svrha,
			XMLGregorianCalendar datumNaloga, XMLGregorianCalendar datumValute,
			PodaciOUplati zaduzenje, PodaciOUplati odobrenje, BigDecimal iznos) {
		// TODO Auto-generated method stub
		return false;
	}

}
