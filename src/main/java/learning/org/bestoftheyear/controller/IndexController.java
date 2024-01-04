package learning.org.bestoftheyear.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")

public class IndexController {
    public String home (Model model) {
        model.addAttribute("anno", 2023);
        model.addAttribute("nome", "Luigi");
        return "home";
    }
}
