package nju.edu.wyc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import nju.edu.wyc.data.SpittleRepository;
import nju.edu.wyc.vo.Spittle;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository){
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute("spittleList", spittleRepository.findSpittleList());
		return "spittles";
	}
	
}
