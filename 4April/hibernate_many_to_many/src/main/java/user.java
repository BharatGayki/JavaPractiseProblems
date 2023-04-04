import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class user {
    @Id
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    Collection<vehicle> user_list = new ArrayList<vehicle>();

    public user() {
    }

    public user(int id, String name, Collection<vehicle> user_list) {
        this.id = id;
        this.name = name;
        this.user_list = user_list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<vehicle> getUser_list() {
        return user_list;
    }

    public void setUser_list(Collection<vehicle> user_list) {
        this.user_list = user_list;
    }
}
