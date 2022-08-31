package site.metacoding.yellow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

	@GetMapping("/yellow")
	public String index() {
		return "index";
	}
	
}
