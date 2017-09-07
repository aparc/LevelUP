package Lesson3.MainPost;

import java.util.Date;

public class Post {
    private long postid;
    private String title;
    private String text;
    private Date postedAt;

    public Post(long postid, String title, String text, Date postedAt){
        this.postid = postid;
        this. title = title;
        this.text = text;
        //SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        this.postedAt = postedAt;
    }

    public void setPostid(long postid){
        this.postid = postid;
    }

    public long getPostid(){
        return postid;
    }

    public void setTitle(String title){
        this.title = title.isEmpty() ? this.title : title;
    }

    public String getTitle() {
        return title;
    }

    public void setText(String text){
        this.text = text.isEmpty() ? this.text : text;
    }

    public String getText() {
        return text;
    }

    public void setPostedAt(Date postedAt){
        this.postedAt = postedAt;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public static Post[] sort(Post[] array){
        Post[] temp = new Post[1];
        for (int i = 1; i < array.length; i++){
            for (int j = array.length - 1; j >= i; j--){
                if (array[j - 1].postid > array[j].postid){
                    temp[0] = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp[0];
                }
            }
        }
        return array;
    }




}
