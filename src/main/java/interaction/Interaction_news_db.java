package interaction;

import model.News_db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ralex on 30.06.16.
 */
public class Interaction_news_db {

    public Interaction_news_db(){}
    @PersistenceContext(unitName = "coffee_machine_v2")
    private static EntityManager entityManager;

    News_db news_db;

    public void addPost(String title, String text){
        entityManager.getTransaction().begin();
        news_db = new News_db();
        news_db.setPost_title(title);
        news_db.setPost_text(text);
        entityManager.persist(news_db);
        entityManager.getTransaction().commit();
    }

}
