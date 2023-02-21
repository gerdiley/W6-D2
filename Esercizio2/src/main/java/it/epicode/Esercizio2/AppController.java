package it.epicode.Esercizio2;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
public class AppController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/get-string")
	public String m1() {

		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8080/app/data1";
		ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
		return "response: " + response.getBody() + "";

	}

	@GetMapping("/get-people")
	public String m2() {

		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8080/app/data3";
		String response = rt.getForObject(rtUrl, String.class);
		return "people list: " + response;

	}

	@GetMapping("/get-people-json")
	public Object m2Json() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8080/app/data3";
		Object response = rt.getForObject(rtUrl, Object.class);
		return response;

	}

}
