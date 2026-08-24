package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController {
	@GetMapping("/hash")
	public String getHash() throws NoSuchAlgorithmException {
		// Unique data string
		String data = "Hello, Check Sum here and I'd like to speak with you about your IDE's insurance - Spencer Reed";

		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(data.getBytes());

		// Converting to readable hexadecimal
		StringBuilder hex = new StringBuilder();
		for (byte b : digest) {
			hex.append(String.format("%02x", b));
		}

		return "<p>Name: Spencer Reed</p>" +
				"<p>Original Data: " + data + "</p>" +
				"<p>Algorithm: SHA-256</p>" +
				"<p>Checksum (hex): " + hex.toString() + "</p>";
	}
}