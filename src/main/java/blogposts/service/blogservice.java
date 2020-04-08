package blogposts.service;

import blogposts.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class blogservice {
    public ArrayList<Post> getAllposts(){
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("post1");
        post1.setBody("p1 body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("post2");
        post2.setBody("p2 body");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("post3");
        post3.setBody("p3 Body");
        post3.setDate(new Date());

        Post post4 = new Post();
        post4.setTitle("post4");
        post4.setBody("p4 Body");
        post4.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        return posts;
    }
    public ArrayList<Post> getOnePost(){
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("post1");
        post1.setBody("p1 body from posts");
        post1.setDate(new Date());
        posts.add(post1);
        return posts;
    }
}
