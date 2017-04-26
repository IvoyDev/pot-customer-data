package hello;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MockDatabase {
	private Map <String, CustomerDataResponse> database;
	public MockDatabase(){
		database = new HashMap<String, CustomerDataResponse>();
	}
	
	public CustomerDataResponse GetResponse(CustomerDataRequest request){
		String userName = request.getUsername();
		CustomerDataResponse currentResponse = database.get(userName);
		CustomerDataResponse futureResponse;
		if (currentResponse==null){
			currentResponse = new CustomerDataResponse(mockCanon(), mockShare(),mockTime(),0L,mockSize());
		}
		futureResponse = new CustomerDataResponse(currentResponse);
		futureResponse.setLastModified(mockTime());
		database.put(userName,futureResponse);
		return currentResponse;
	}
	

	private static final SecureRandom random = new SecureRandom();
	
	private Long mockTime(){
		return new Date().getTime();
	}
	
	private String mockCanon() {
	    return new BigInteger(130, random).toString(32);
	}
	
	private String mockShare() {
	    return new BigInteger(130, random).toString(32);
	}
	
	private Long mockSize() {
	    return random.nextLong();
	}

}
