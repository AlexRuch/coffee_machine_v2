package interaction;


import model.Users_db;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by ralex on 30.06.16.
 */
@Stateless
public class Interaction_users_db {
    @PersistenceContext(unitName = "coffee_machine_v2")
    private EntityManager entityManager;

    public void createUser(Users_db users_db){
        entityManager.persist(users_db);
    }
}
