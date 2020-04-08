package blogposts.controller;

import blogposts.model.Post;
import blogposts.model.User;
import blogposts.service.blogservice;
import org.apache.jasper.util.UniqueAttributesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class userController {
    @Autowired
    blogservice test;

    @RequestMapping("user/login")
    public String login(){
        return "user/login";
    }
    @RequestMapping("user/registration")
    public String Registration(){
        return "user/registration";
    }
    @RequestMapping(value = "user/login",method = RequestMethod.POST)
    public String userLogin(User user){
        return "redirect:/posts";
    }
    @RequestMapping(value = "user/logout",method = RequestMethod.POST)
    public String userLogout(Model model){

        ArrayList<Post> posts=test.getAllposts();
        model.addAttribute("posts",posts);
        return "index";
    }
}
