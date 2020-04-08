package blogposts.controller;

import blogposts.model.Post;
import blogposts.service.blogservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class blogcontoller {
    @Autowired
    blogservice test;
    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<Post> posts=test.getAllposts();
        model.addAttribute("posts",posts);
//        ArrayList<Post> Posts=
        return "index";
    }
}
