package perfectcell;

import perfectcell.mock.MockUserRepository;

/**
 * Created by jjgha on 2016-02-13.
 */
public class DbPersistance {
    public MockUserRepository userRepository;
    private DbPersistance instance = null;
    public DbPersistance getInstance() {
        if (instance == null) {
            instance = new DbPersistance();
        }
        return instance;
    }
    public DbPersistance() {
        userRepository = new MockUserRepository();
    }
}
