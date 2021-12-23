package ABC.Bank.ABCBank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AbcBankApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(AbcBankApplication.class, args);
		Customer customer1=context.getBean(Customer.class);
		Customer customer2=context.getBean(Customer.class);
		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		customer1.setDetails("Mydhili Murali","1234534562","9876452341","Vallachira");
		customer2.setDetails("Nimin Murali","1234534562","9234522345","Kunnamangalam");
		fundTransfer.fundTransfer(500,customer1,customer2);
	}

}
//	Create a Spring Boot application for ABC Bank. using this application,
//	the customers of the bank should be able to access their account details and transfer funds to the other accounts of the same bank.
//	This application should consist of the following entities:
//		Customer: To store information about the customers of the bank
//		Account:To store information about the existing accounts of the bank
//		FundTransfer: To store information about the funds that are transferred from one account to the other.
//		Create the application and inject dependencies in the entities.