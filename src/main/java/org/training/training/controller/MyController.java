package org.training.training.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.training.service.ICommande;

@Controller
@RequestMapping("/myController")
public class MyController {
	
    static Logger logger = Logger.getLogger(MyController.class);

   @Autowired
   ICommande commandeImpl;
   
//   @Autowired
//   Connection connection;
   
//   @Autowired
//   MyBean myBean;
   
   @ModelAttribute("myString")
   public String getString() {
	   return "myString .. 1";
   }

//   @Autowired
//   ICommande commandeImpl2;
   
   @GetMapping("/index")
   public String index(Model model) {
//	   myBean.setI(6000);
	  model.addAttribute("my", "my my");
//      model.addAttribute("message", "Hello Spring MVC 5!");
      String s = commandeImpl.showCommande();
      model.addAttribute("message", s);

      System.out.println(s);
//      System.out.println(connection);
      logger.debug("This is debug message");
      logger.info("This is info message");
      
      logger.warn("This is warn message");
      logger.fatal("This is fatal message");
      logger.error("This is error message");

      
      return "index";
   }
   
}