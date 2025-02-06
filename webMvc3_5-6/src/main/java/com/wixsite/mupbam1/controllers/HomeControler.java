package com.wixsite.mupbam1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {
	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("message", "Timur");
		return "home_page";
	}

}
