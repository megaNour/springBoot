package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UserRepository userRepo;
    
    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String paramName, @RequestParam String paramEmail) {
        User u = new User();
        u.setName(paramName);
        u.setEmail(paramEmail);
        userRepo.save(u);
        return "Saved";
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }
}
