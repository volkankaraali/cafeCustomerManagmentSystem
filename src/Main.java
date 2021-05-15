import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		//BaseCustomerManager customerManager= new NeroCustomerManager();
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer1=new Customer(1,"yusuf volkan","karaali",1997,"1235654865");
		
		customerManager.save(customer1);
	}

}
