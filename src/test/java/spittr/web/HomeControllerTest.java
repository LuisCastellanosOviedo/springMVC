package spittr.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;
import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static
        org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
/**
 * Created by luis on 4/24/2017.
 */
@ComponentScan(basePackageClasses = HomeController.class)
public class HomeControllerTest {



    @Test
    public void testHomePage() throws  Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();


        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
