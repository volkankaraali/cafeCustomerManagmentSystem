package Adapter;

import java.util.Locale;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNaitonalityId()), customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
		
	}

}
