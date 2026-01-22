package slay.ds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

    @GetMapping("/store/home")
    public String home() {
        return "home";   // loads home.html
    }
}
