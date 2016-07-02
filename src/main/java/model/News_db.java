package model;

import javax.persistence.*;

/**
 * Created by ralex on 30.06.16.
 */
@Entity(name = "news_db")
@Table(name = "news_db")
public class News_db {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String post_title;

    @Column
    private String post_text;

    public int getId() {
        return id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }
}
