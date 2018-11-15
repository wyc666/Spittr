package nju.edu.wyc.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {

	@RequestMapping(method = GET)
	public String home() {
		return "home";
	}
}
