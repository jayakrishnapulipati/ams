/**
 * 
 */
package com.jk.ams.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jk.ams.models.Persons;
import com.jk.ams.services.PersonsService;
import com.jk.ams.utils.Constants;

/**
 * @author Jayakrishna Handles Request for user registration.
 */

@RestController
public class PersonsController {

	@Autowired
	private PersonsService personsService;

	@RequestMapping(value = "/register", method = RequestMethod.POST/* } */)
	public Object userRegister(@RequestBody Persons person) {

		System.out.println("user registration controller method " + person);

		Map<String, String> map = new HashMap<String, String>();
		try {
			personsService.addPerson(person);
			map.put("success", Constants.personSuccess);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("error", Constants.personError);
		}

		return map;

	}
}
