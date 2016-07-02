package controller;

import interaction.Interaction_news_db;
import interaction.Interaction_users_db;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;

/**
 * Created by ralex on 30.06.16.
 */
@ManagedBean
@RequestScoped
public class Work_with_welcomepage {
    public Work_with_welcomepage(){

    }

    private String post_title;
    private String post_text;
    Interaction_news_db interaction_news_db;

    public String addPost(){
        interaction_news_db = new Interaction_news_db();
        interaction_news_db.addPost(post_title, post_text);
        /*
        REFERENCE!
         */
        return "index";
    }

/*
------------------------------GETTERS AND SETTERS------------------------------
 */

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
