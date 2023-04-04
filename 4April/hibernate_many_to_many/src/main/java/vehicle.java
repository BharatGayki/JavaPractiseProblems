import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Entity
public class vehicle {
    @Id
    private int veh_id;
    private String veh_name;
    @ManyToMany()
    Collection<user> veh_list = new ArrayList<>();

    public vehicle() {
    }

    public vehicle(int veh_id, String veh_name, Collection<user> veh_list) {
        this.veh_id = veh_id;
        this.veh_name = veh_name;
        this.veh_list = veh_list;
    }

    public int getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(int veh_id) {
        this.veh_id = veh_id;
    }

    public String getVeh_name() {
        return veh_name;
    }

    public void setVeh_name(String veh_name) {
        this.veh_name = veh_name;
    }

    public Collection<user> getVeh_list() {
        return veh_list;
    }

    public void setVeh_list(Collection<user> veh_list) {
        this.veh_list = veh_list;
    }
}
