package Lesson3.MainPost;

import java.util.Date;

public class MainPost {
    public static void main(String[] args) {
        Post[] post = new Post[5];

        post[0] = new Post(458618, "java.rmi", "Provides the RMI package.", new Date());
        post[1] = new Post(168957, "java.awt.color", "Provides classes for color spaces.", new Date());
        post[2] = new Post(136592, "java.time.zone", "Support for time-zones and their rules.", new Date());
        post[3] = new Post(256389, "javax.imageio", "The main package of the Java Image I/O API.", new Date());
        post[4] = new Post(146537, "javax.net", "Provides classes for networking applications.", new Date());

        post = Post.sort(post);
        for(int i = 0; i < post.length; i++){
            System.out.println(post[i].getPostid() + " " + post[i].getTitle() + " " + post[i].getText() + " " + post[i].getPostedAt());
        }
    }

}
