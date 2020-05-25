package training;

import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.training.training.bean.AppService;
import org.training.training.bean.AppServiceImpl;
import org.training.training.bean.GreetingsService;
import org.training.training.bean.GreetingsServiceImpl;
import org.training.training.bean.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/applicationContext.xml" })
public class GreetingsServiceTest {
	
	@Mock
    private UserService userService; // this class will be mocked
   
	//@Autowired
    @Spy
    private AppService appService = new AppServiceImpl(); // this class WON'T be mocked

//	@Autowired
    @InjectMocks
    GreetingsService greetingsService = new GreetingsServiceImpl();
	
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetGreetings_morning() throws Exception {
//    	userService = Mockito.mock(UserService.class);
//    	appService = Mockito.spy(new AppServiceImpl());
//    	greetingsService = new GreetingsService(userService, appService);
    	
        Mockito.when(userService.getFirstName(99)).thenReturn("John");
        Mockito.when(userService.getLastName(99)).thenReturn("Doe");
        Mockito.when(appService.getAppName()).thenReturn("holllaa");
        
    	
        String greetings = greetingsService.getGreetings(99, LocalTime.of(0, 45));

//        assertEquals("Failed to get greetings!", "Good Morning, John Doe! Welcome to The Amazing Application.", greetings);
    }

    @Test
    public void testGetGreetings_afternoon() throws Exception {
        // specify mocked behavior
//    	Mockito.when(userService.getFirstName(11)).thenReturn("Jane");
//    	Mockito.when(userService.getLastName(11)).thenReturn("Doe");
        // invoke method under test
//        String greetings = greetingsService.getGreetings(11, LocalTime.of(13, 15));
//        assertEquals("Failed to get greetings!", "Good Afternoon, Jane Doe! Welcome to The Amazing Application.", greetings);
    }
}