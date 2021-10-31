package com.mla.htd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class FeignController {

	@Autowired
	FeignProxy proxyService;

	@GetMapping("/feign")
	public List<Student> findme(){
		return proxyService.getAllStudents();

	}

}
