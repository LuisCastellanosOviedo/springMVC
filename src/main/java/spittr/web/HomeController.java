package spittr.web;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by luis on 4/24/2017.
 */

@Controller
@Component
public class HomeController {

    public HomeController() {
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

}
