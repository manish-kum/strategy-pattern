package strategy;
@FunctionalInterface
public interface EncryptionStrategy {
	public EncryptionStrategy aesEncryption = (message)->{return message.toLowerCase();};
	public EncryptionStrategy shaEncryption = (message)->{return message.toUpperCase();};
	public EncryptionStrategy customEncryption = (message)->{return message.trim();};

	public String encrypt(String message);

}
