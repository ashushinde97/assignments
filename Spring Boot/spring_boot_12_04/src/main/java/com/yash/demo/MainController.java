package com.yash.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.demo.dao.AutherDAO;
import com.yash.demo.dao.BooktitleDAO;
import com.yash.demo.dao.PublisherDAO;
import com.yash.demo.model.Auther;
import com.yash.demo.model.Booktitle;
import com.yash.demo.model.Publisher;

@Controller
public class MainController {

	@Autowired
	AutherDAO objudao;

	@Autowired
	PublisherDAO pubdao;
	
	@Autowired
	BooktitleDAO bookdao;

	@RequestMapping("/")
	public String index() {
		// System.out.println("hello how are you ");
		return "index";
	}

	@RequestMapping("/auther")
	public String signupAuther() {
		return "auther";
	}

	@RequestMapping(value = "/saveauth", method = RequestMethod.POST)
	public ModelAndView saveauther(@ModelAttribute Auther objuser) {
		ModelAndView objmv = new ModelAndView();

		if (objudao.addauth(objuser) == 1) {
			objmv.setViewName("usersuccess.jsp");
			objmv.addObject("user", objuser);
			return objmv;
		} else {
			objmv.setViewName("auther");
			return objmv;
		}
	}

	@RequestMapping(value = "/showauth")
	public ModelAndView autherlist() {
		List<Auther> ulist = objudao.getAllAuther();
		// List<City> clist = cityobj.getAllCity();
		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);
		// objmv.addObject("citylist",clist);

		objmv.setViewName("authlist");
		return objmv;
	}

	@GetMapping("/editauth")
	public String editauther(@RequestParam String id, Model m) {
		Auther objuser = new Auther();
		m.addAttribute("objuser", objuser);
		return "editauth";
	}

	@RequestMapping("/updateauth")
	public String updateauth(@ModelAttribute("objuser") Auther objuser) {
		if (objudao.updateauth(objuser) == 1) {
			return "authlist";
		} else {
			return "index";
		}

	}

	@GetMapping("/delauth")
	public String delauth(@RequestParam String id, Model m) {
		objudao.deleteauth(id);
		return "redirect:showauth";
	}

	// publisher

	@RequestMapping("/publisher")
	public String signupPublisher() {
		return "publisher";
	}

	@RequestMapping(value = "/savepub", method = RequestMethod.POST)
	public ModelAndView savepub(@ModelAttribute Publisher objuser) {
		ModelAndView objmv = new ModelAndView();

		if (pubdao.addpublisher(objuser) == 1) {

			objmv.setViewName("pubsuccess");
			objmv.addObject("user", objuser);

			return objmv;
		} else {
			objmv.setViewName("publisher");
			return objmv;
		}
	}

	@RequestMapping(value = "/publist")
	public ModelAndView Publisherlist() {
		List<Publisher> ulist = pubdao.getAllPublisher();
		// List<City> clist = cityobj.getAllCity();
		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);
		// objmv.addObject("citylist",clist);

		objmv.setViewName("publist");
		return objmv;
	}

	@GetMapping("/editpub")
	public String editpublisher(@RequestParam String id, Model m) {
		Publisher objuser = new Publisher();
		m.addAttribute("objuser", objuser);
		return "editpub";
	}

	@RequestMapping("/updatepub")
	public String updatepublisher(@ModelAttribute("objuser") Publisher objuser) {
		if (pubdao.updatepub(objuser) == 1) {
			return "publist";
		} else {
			return "index";
		}

	}

	@GetMapping("/delpub")
	public String delpublisher(@RequestParam String id, Model m) {
		pubdao.deletepub(id);
		return "authlist";
	}
	
	
	
	//Booktitle
	
	
	@RequestMapping("/book")
	public String book() {
		return "bootitle";
	}

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ModelAndView addbook(@ModelAttribute Booktitle objuser) {
		ModelAndView objmv = new ModelAndView();
		if (bookdao.addbook(objuser)== 1) {
			objmv.setViewName("success");
			objmv.addObject("user", objuser);
			return objmv;
		} else {
			objmv.setViewName("bootitle");
			return objmv;
		}
	}
	
	@RequestMapping(value = "/booklist")
	public ModelAndView Booklist() {
		List<Booktitle> ulist = bookdao.getAllBook();
		// List<City> clist = cityobj.getAllCity();
		ModelAndView objmv = new ModelAndView();

		objmv.addObject("ulist", ulist);
		// objmv.addObject("citylist",clist);

		objmv.setViewName("booklist");
		return objmv;
	}
	
	@GetMapping("/delbook")
	public String delbook(@RequestParam String id, Model m) {
		bookdao.deletebook(id);
		return "redirect:booklist";
	}

}
