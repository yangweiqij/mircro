package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	@Autowired DiscoveryClient client;
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		System.out.println("sentens");
	  return 
	    getWord("config-client") + ". "+  getWord("client") + ". "
	     
	    ;
	}
	@GetMapping("/hello")
	public @ResponseBody String hi() {
		System.out.println("sentens");
	  return"hello";
	}
	public String getWord(String service) {
	  List<ServiceInstance> list = client.getInstances(service);
	  if (list != null && list.size() > 0 ) {
		 
	    URI uri = list.get(0).getUri(); System.out.println("uri==>"+uri);
	if (uri !=null ) {
	  return (new RestTemplate()).getForObject(uri,String.class);
	}
	  }
	  return null;
	}
}
