package com.jaxb.manipulation;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.security.Security;


@SpringBootApplication
public class DisbursementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisbursementApplication.class, args);
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
	}

}
