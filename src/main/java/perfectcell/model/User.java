package perfectcell.model;

import org.codehaus.jackson.map.annotate.JsonCachable;
import perfectcell.repositories.DbPersistance;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by komlan on 12/02/16.
 */
@XmlRootElement
@JsonCachable
public class User {
    private String name;
    private String typeUsager;
    private String description;
    private ArrayList needs;

    public String getTypeUsager() {
        return typeUsager;
    }

    public void setTypeUsager(String typeUsager) {
        this.typeUsager = typeUsager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList getNeeds() {
        return needs;
    }

    public void setNeeds(ArrayList needs) {
        this.needs = needs;
    }
}
