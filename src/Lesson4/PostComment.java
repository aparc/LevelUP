package Lesson4;

import Lesson3.MainPost.Post;

public class PostComment extends Message{


    Post post;

    PostComment(){

    }

    public PostComment(Post post) {
        this.post = post;
    }
}



