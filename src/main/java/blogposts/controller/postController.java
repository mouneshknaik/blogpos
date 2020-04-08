package blogposts.controller;

import blogposts.model.Post;
import blogposts.service.blogservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class postController {
    @Autowired
    blogservice test;
    @RequestMapping("/posts")
    public String getUserPost(Model model){
        ArrayList<Post> onePost = test.getOnePost();
        model.addAttribute("posts",onePost);
        return "posts";
    }
}
