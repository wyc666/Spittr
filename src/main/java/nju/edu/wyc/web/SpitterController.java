package nju.edu.wyc.web;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import nju.edu.wyc.data.SpitterRepository;
import nju.edu.wyc.util.Status;
import nju.edu.wyc.vo.Spitter;
import nju.edu.wyc.vo.SpitterForm;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	private final SpitterRepository spitterRepository;

	@Autowired
	public SpitterController(SpitterRepository spitterRepository) {
		this.spitterRepository = spitterRepository;
	}

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("spitter", new Spitter());
		return "register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String processRegister(@Valid SpitterForm spitterForm, Errors errors) throws IllegalStateException, IOException  {
		if (errors.hasErrors()) {
			return "register";
		} else {
			Status status = spitterRepository.registerSpitter(spitterForm);
			if (status.equals(Status.SUCCCESS)) {
				return "redirect:/spitter/" + spitterForm.getPhone();
			} else
				return "register";
		}
	}

	@RequestMapping(value = "/{phone}", method = RequestMethod.GET)
	public String personalPage(Model model, @PathVariable String phone) {
		model.addAttribute("spitter", spitterRepository.getSpitterByPhone(phone));
		return "personalPage";
	}
}
