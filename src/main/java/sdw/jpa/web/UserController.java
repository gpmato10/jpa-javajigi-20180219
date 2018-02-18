package sdw.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sdw.jpa.domain.User;
import sdw.jpa.domain.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private List<User> users = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public String create(User user) {
        System.out.println("user : " + user);
        userRepository.save(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }
}
