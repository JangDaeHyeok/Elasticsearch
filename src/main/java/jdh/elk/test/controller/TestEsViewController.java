package jdh.elk.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jdh.elk.test.elasticSearch.PdEsRepository;

@RestController
public class TestEsViewController {
	@Resource PdEsRepository pdEsRepository;
	
	@RequestMapping(value = "/es/test", method = RequestMethod.GET)
	public ModelAndView versionSelect(HttpServletRequest req, HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView("search");
		return mv;
	}
}
