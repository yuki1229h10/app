package com.example.simple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ホームページを表示する
 * @author yuuki
 */
@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;

	/**
	 * ホームを表示する
	 * @param model spring.application.nameの値を保持する
	 * @return home.htmlを表示する 
	 */
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
}
