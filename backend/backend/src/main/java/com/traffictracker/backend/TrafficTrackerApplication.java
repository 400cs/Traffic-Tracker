package com.traffictracker.backend;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;
//import org.springframework.web.client.RestTemplate;

//import com.traffictracker.backend.dto.MapBoxDirectionResponse;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TrafficTrackerApplication {

	//private static final Logger log = LoggerFactory.getLogger(TrafficTrackerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrafficTrackerApplication.class, args);
	}

	// @Bean
	// public RestTemplate restTemplate(RestTemplateBuilder builder) {
	// 	return builder.build();
	// }

	// @Bean
	// @Profile("!test")
	// public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	// 	return args -> {
	// 		MapBoxDirectionResponse directions = restTemplate.getForObject(
	// 			"https://api.mapbox.com/directions/v5/mapbox/driving-traffic/"
	// 			+ "-117.958249,33.666951;-117.823127,34.05703"
	// 			+ "?access_token=",
	// 			 MapBoxDirectionResponse.class);
	// 		log.info(directions.toString());
	// 	};
	// }

}
