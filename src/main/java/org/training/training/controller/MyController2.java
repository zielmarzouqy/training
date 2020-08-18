//package org.training.training.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.log4j.Logger;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.support.SessionStatus;
//
//@Controller
//@RequestMapping("/myController2")
//@SessionAttributes({"myString2", "scopedTarget.myBean", "myString","tata"})
//public class MyController2 {
//	
//    static Logger logger = Logger.getLogger(MyController2.class);
//
////   @Autowired
////   ICommande commandeImpl;
////   
////   @Autowired
////   ICommande commandeImpl2;
//    public String getString() {
// 	   return "myString .. 2";
//    }
//    
//    @ModelAttribute("myString2")
//    public String getString2() {
// 	   return "myString ..";
//    }
//   
//   @GetMapping("/index")
//   public String index(Model model, SessionStatus status, HttpSession ses, HttpServletRequest request) {
////	   MyBean y = (MyBean) ses.getAttribute("scopedTarget.myBean");
////	   model.addAttribute("myString", getString());
//      model.addAttribute("message", "Hello Spring MVC 5!");
////      commandeImpl.showCommande();
//      logger.debug("This is debug message");
//      logger.info("This is info message");
//      
//      logger.warn("This is warn message");
//      logger.fatal("This is fatal message");
//      logger.error("This is error message");
//
//      
//      return "index";
//   }
//   @GetMapping("/end")
//   public String end(Model model, SessionStatus status, HttpSession ses) {
//	  status.setComplete();  
//	  logger.debug("This is debug message");
//      logger.info("This is info message");
//      
//      logger.warn("This is warn message");
//      logger.fatal("This is fatal message");
//      logger.error("This is error message");
//      return "index";
//   }
//   
//}