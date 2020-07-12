package com.codeforgeyt.vauldemomvn;

import com.codeforgeyt.vauldemomvn.configuration.VaultConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VaulDemoMvnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaulDemoMvnApplication.class, args);
		VaultConfiguration vaultConfiguration = context.getBean(VaultConfiguration.class);
		System.out.println("Login: " + vaultConfiguration.getLogin());
		System.out.println("Password: " + vaultConfiguration.getPassword());
	}

}
