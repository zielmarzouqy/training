package training;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.training.training.controller.MyController;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:/spring/applicationContext.xml"})
public class ControllerTest {
	
	private MockMvc mockMvc;
	
//	@Autowired
//	private WebApplicationContext wac;
	@Autowired
	private MyController myController;
	
	 @Before
	 public void setUp() {
	        this.mockMvc = MockMvcBuilders.standaloneSetup(myController)
	                                 .setViewResolvers(viewResolver())
	                                 .build();		 
//	  this.mockMvc = MockMvcBuilders.standaloneSetup(myController).build();
//	  this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	 }
	 
	 @Test
	 public void testAccueil() throws Exception {
	  // Exécution de la requête HTTP
	  this.mockMvc
	   .perform(get("/myController/index"))
	   // Affichage des traces
	   .andDo(print())
	   // Vérification de l'objet du model passé à la vue
	   .andExpect(model().attribute("message", "Hello Spring MVC 5!"))
	   // Vérification de l'affichage de la vue en retour
	   .andExpect(view().name("index"))
	   // Vérification du statut la response HTTP (Code 200)
	   .andExpect(status().isOk());
	  } 
	 
	 private InternalResourceViewResolver viewResolver() {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//			viewResolver.setPrefix("classpath:/views/");
//			viewResolver.setSuffix(".html");
			return viewResolver;
	}

}