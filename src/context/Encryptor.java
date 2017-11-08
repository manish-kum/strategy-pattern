package context;

import strategy.EncryptionStrategy;

public class Encryptor {
	private EncryptionStrategy encStrategy;
	
	public void  sendMessage(String message) {
		String encMessage = encStrategy.encrypt(message);
		send(encMessage);
		System.out.println(encMessage);
		
	}
	
	
	
	

	private void send(String message) {
		// TODO Auto-generated method stub
		
	}





	public EncryptionStrategy getEncStrategy() {
		return encStrategy;
	}

	public void setEncStrategy(EncryptionStrategy encStrategy) {
		this.encStrategy = encStrategy;
	}
	
	

}
