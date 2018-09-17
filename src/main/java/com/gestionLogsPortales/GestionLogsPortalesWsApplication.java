package com.gestionLogsPortales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionLogsPortalesWsApplication {

	public static void main(String[] args) {
		
		for(int i=0; i< args.length; i++)
			System.out.println(args[i]);
		SpringApplication.run(GestionLogsPortalesWsApplication.class, args);
	}
}
