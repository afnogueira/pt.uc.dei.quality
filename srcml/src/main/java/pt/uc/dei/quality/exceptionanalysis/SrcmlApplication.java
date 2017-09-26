package pt.uc.dei.quality.exceptionanalysis;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.boot.CommandLineRunner; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import rest.Response;

@SpringBootApplication
public class SrcmlApplication implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(SrcmlApplication.class);
	public static void main(String[] args) {
		System.out.println("hello ;");
		SpringApplication.run(SrcmlApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		RestTemplate restTemplate = new RestTemplate(); 
		Response response = restTemplate.getForObject( "http://services.groupkt.com/country/get/iso2code/IN", Response.class); 
		log.info("==== RESTful API Response using Spring RESTTemplate START ======="); 
		log.info(response.toString()); 
		log.info("==== RESTful API Response using Spring RESTTemplate END =======");
		
	}
}
