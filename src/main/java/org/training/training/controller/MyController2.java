package org.training.training.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myController2")
public class MyController2 {
	
    static Logger logger = Logger.getLogger(MyController2.class);

//   @Autowired
//   ICommande commandeImpl;
//   
//   @Autowired
//   ICommande commandeImpl2;
   
   @GetMapping("/index")
   public String index(Model model) {
      model.addAttribute("message", "Hello Spring MVC 5!");
//      commandeImpl.showCommande();
      logger.debug("This is debug message");
      logger.info("This is info message");
      
      logger.warn("This is warn message");
      logger.fatal("This is fatal message");
      logger.error("This is error message");

      
      return "index";
   }
   
}