package webdevs.kyp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webdevs.kyp.entity.Mobiles;

import webdevs.kyp.service.Kypservice;

@CrossOrigin("*")
@RestController
@RequestMapping("/kyp")
public class Kypcontrol {
	@Autowired
	Kypservice mbser;
	
	@GetMapping("/getdata")
	public List<Mobiles> getmb() {
		return mbser.getall();
	}
	
	@PostMapping("/addmb")
	public Mobiles addmb(@RequestBody Mobiles mb) {
		return mbser.savedata(mb);
	}
	
}
