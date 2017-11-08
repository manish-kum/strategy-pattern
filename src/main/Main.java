package main;

import context.Encryptor;
import strategy.EncryptionStrategy;

public class Main {
 public static void main(String args[]) {
	 Encryptor encryptor =new Encryptor();
	 encryptor.setEncStrategy(EncryptionStrategy.aesEncryption);
	 encryptor.sendMessage("HELLO");
	 
 }
}
