package ru.juliaM.SpringSecurityApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.juliaM.SpringSecurityApp.Model.User;
import ru.juliaM.SpringSecurityApp.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String userProfile(Authentication authentication, Model model) {
        String username = authentication.getName();
        User user = userService.getUserByUsername(username);
        if (user != null) {
            model.addAttribute("user", user);
            return "user-profile";
        } else {
            return "redirect:/login";
        }
    }
}