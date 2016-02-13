package perfectcell.mock;

import perfectcell.model.User;
import perfectcell.repositories.ICrudRepository;

import java.util.ArrayList;

/**
 * Created by jjgha on 2016-02-13.
 */
public class MockUserRepository implements ICrudRepository<User> {
    ArrayList<User> usersList;
    ArrayList<String> needsList;


    public MockUserRepository() {
        needsList = new ArrayList<>();
        usersList = new ArrayList<User>();

        needsList.add("Besoin d'aide pour faire mes devoirs en INF111");
        needsList.add("Besoin de bénévoles pour l'AMC");
        needsList.add("All you need is love! :D");

        initialize();
    }

    private void initialize() {
        User user1 = new User();
        user1.setDescription(
                "Bacon ipsum dolor amet andouille corned beef beef ribs leberkas fatback." +
                        " Spare ribs salami turducken, turkey kielbasa t-bone chuck andouille." +
                        "Tongue kevin corned beef turducken pork loin cow drumstick doner jerky tail andouille pig." +
                        " Tenderloin biltong filet mignon beef ribs. Meatball kevin chuck boudin," +
                        " swine porchetta flank sirloin hamburger frankfurter sausage.");
        user1.setName("John Doe");
        user1.setTypeUsager("giver");
        user1.setNeeds(needsList);

        User user2 = new User();
        user2.setDescription(
                "Bacon ipsum dolor amet andouille corned beef beef ribs leberkas fatback." +
                        " Spare ribs salami turducken, turkey kielbasa t-bone chuck andouille." +
                        "Tongue kevin corned beef turducken pork loin cow drumstick doner jerky tail andouille pig." +
                        " Tenderloin biltong filet mignon beef ribs. Meatball kevin chuck boudin," +
                        " swine porchetta flank sirloin hamburger frankfurter sausage.");
        user2.setName("John Smith");
        user2.setTypeUsager("receiver");
        user2.setNeeds(needsList);

        User user3 = new User();
        user3.setDescription(
                "Bacon ipsum dolor amet andouille corned beef beef ribs leberkas fatback." +
                        " Spare ribs salami turducken, turkey kielbasa t-bone chuck andouille." +
                        "Tongue kevin corned beef turducken pork loin cow drumstick doner jerky tail andouille pig." +
                        " Tenderloin biltong filet mignon beef ribs. Meatball kevin chuck boudin," +
                        " swine porchetta flank sirloin hamburger frankfurter sausage.");
        user3.setName("John Williams");
        user3.setTypeUsager("giver");
        user3.setNeeds(needsList);

        User user4 = new User();
        user4.setDescription(
                "Bacon ipsum dolor amet andouille corned beef beef ribs leberkas fatback." +
                        " Spare ribs salami turducken, turkey kielbasa t-bone chuck andouille." +
                        "Tongue kevin corned beef turducken pork loin cow drumstick doner jerky tail andouille pig." +
                        " Tenderloin biltong filet mignon beef ribs. Meatball kevin chuck boudin," +
                        " swine porchetta flank sirloin hamburger frankfurter sausage.");
        user4.setName("John Travolta");
        user4.setTypeUsager("receiver");
        user4.setNeeds(needsList);

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);

    }


    @Override
    public User Add(User model) {
        usersList.add(model);
        return model;
    }

    @Override
    public User Edit(User model) {
        for (int i = 0; i < usersList.size(); ++i) {
            if (usersList.get(i).getName().equals(model.getName())) {
                usersList.remove(i);
                usersList.add(model);
                return model;
            }
        }
        return null;
    }

    @Override
    public boolean Delete(String name) {
        for (int i = 0; i < usersList.size(); ++i) {
            if (usersList.get(i).getName().equals(name)) {
                usersList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public User Get(String name) {
        for (User user:usersList) {
            if (user.getName().equals(name)){
             return user;
            }
        }
        return null;
    }

    @Override
    public ArrayList<User> List() {
        return usersList;
    }
}