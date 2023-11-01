package Repository;

import model.Volunteer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VolunteerRepo implements Repo{
    private List<Volunteer> volunteers = new ArrayList<>(); // Initialize ArrayList instead of List

    @Override
    public void save(Object entity) {
        volunteers.add((Volunteer) entity);
    }

    @Override
    public Volunteer findById(int id) {
        for (Volunteer volunteer : volunteers){
            if(volunteer.getVolunteer_id()==id)
                return volunteer;
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (Volunteer volunteer : volunteers){
            if(volunteer.getVolunteer_id()==id){
                volunteers.remove(volunteer);
            }
        }
    }

    @Override
    public List findAll() {
        return volunteers;
    }
}
