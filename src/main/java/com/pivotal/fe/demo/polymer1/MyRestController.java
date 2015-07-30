package com.pivotal.fe.demo.polymer1;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping("/random")
	public Map<String, String> token(HttpSession session) {
		return Collections.singletonMap("id", UUID.randomUUID().toString());
	}
}
