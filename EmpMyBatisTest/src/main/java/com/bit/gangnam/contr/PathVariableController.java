package com.bit.gangnam.contr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	@RequestMapping("/path/view/{id}") //{}와 @PathVariable value와 일치시키기
	public String getPath(@PathVariable String id) { //@PathVariable : URL 경로에 변수를 설정하여 주는 것
		return "path/pathView"+id;
	}
	@RequestMapping("/path/view/{id}/{v2}/{v3}")
	public String getPath2(@PathVariable String id,@PathVariable String v2,@PathVariable String v3) {
		System.out.println(id+" "+v2+" "+v3);
		return "path/pathView"+id;
	}
	
	@RequestMapping("/path/{name}") // /path/kim
	public String home(@PathVariable String name, Model model) {
		model.addAttribute("name","Hello, "+name);
		return "pathHome";
	}
	
	@RequestMapping("/path") // /path?name=kim
	public String home2(String name, Model model) {
		model.addAttribute("name","Hello, "+name);
		return "pathHome";
	}
}
