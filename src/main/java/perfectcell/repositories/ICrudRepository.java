package perfectcell.repositories;

import java.util.ArrayList;

/**
 * Created by jjgha on 2016-02-13.
 */
public interface ICrudRepository<T> {
    T Add(T model);
    T Edit(T model);
    boolean Delete(T model);
    T Get(String name);
    ArrayList<T> List();
}
