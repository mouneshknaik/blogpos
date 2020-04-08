package blogposts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class blogpost {
    public static void main(String[] args) {

        SpringApplication.run(blogpost.class,args);
    }
}
