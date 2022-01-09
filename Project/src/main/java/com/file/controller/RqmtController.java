
package com.file.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.file.model.Requirement;
import com.file.service.RqmtService;

@RequestMapping("/api/v1")
@RestController
public class RqmtController {
	@Autowired
	private RqmtService rqmtservice;

	@PostMapping("/requirement")

	public String CreateTestcase(@RequestBody Requirement requirement) {
		rqmtservice.addRequirement(requirement);
		return ("Status Code : " + HttpStatus.OK + '\n' + "Status Message : Success " + '\n'
				+ "Description : Testcase created successfully ");
	}

	@GetMapping("/requirement")
	public List<Requirement> getrequirements() {
		return rqmtservice.viewRequirements();
	}


	@DeleteMapping("/requirement")
	public String deleteAllRequirements() {
		rqmtservice.deleteAllRequirements();
		return ("Status Code : " + HttpStatus.NO_CONTENT + '\n' + "Status Message : Success " + '\n'
				+ "Description : Project deleted successfully ");

	}
}
