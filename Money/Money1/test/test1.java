import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.Repo.WalletRepoImpl;
import com.capgemini.exceptions.DuplicatePhoneNumberException;
import com.capgemini.exceptions.DuplicatePhoneNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.PhoneNumberDoesNotExistException;
import com.capgemini.exceptions.PhoneNumberDoesNotExistException;
import com.capgemini.Service.WalletService;
import com.capgemini.Service.WalletServiceImpl;

public class test1
{
	WalletService walletservice;
	
	@Before
			public void setUp() throws Exception
			{
	 walletservice = new WalletServiceImpl(new WalletRepoImpl());	
		
			}
		

			@Test(expected = com.capgemini.exceptions.PhoneNumberDoesNotExistException.class)
			public void test() throws DuplicatePhoneNumberException, PhoneNumberDoesNotExistException {
				walletservice.createAccount("krishan", "78456", new BigDecimal("14"));
				//walletservice.createAccount("ravi", "7689", new BigDecimal("600.78"));
			}

//			@Test(expected = com.capgemini.exceptions.InsufficientBalanceException.class)
//			public void test1() throws DuplicatePhoneNumberException, InsufficientBalanceException, PhoneNumberDoesNotExistException {
//				walletservice.createAccount("krishan", "7893424589", new BigDecimal("11"));
//				walletservice.createAccount("ravi", "7895634521", new BigDecimal("456.89"));						}
//			
			@Test(expected = com.capgemini.exceptions.PhoneNumberDoesNotExistException.class)
			public void test2() throws DuplicatePhoneNumberException, InsufficientBalanceException, PhoneNumberDoesNotExistException {
				walletservice.createAccount("krishan", "7500725707", new BigDecimal("132"));
				walletservice.Withdraw("7500725707", new BigDecimal("500.75"));
			}
			

		}
