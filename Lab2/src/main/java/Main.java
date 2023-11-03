import Repository.VolunteerRepo;
import model.Volunteer;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the in-memory Volunteer repository
        VolunteerRepo volunteerRepository = new VolunteerRepo();

        // Add some sample Volunteers for testing
        volunteerRepository.save(new Volunteer(1, "Volunteer 1", "aaa@email.com", "077777777"));
        volunteerRepository.save(new Volunteer(2, "Volunteer 2", "aaa@email.com", "077777777"));

        // Retrieve and display all Volunteers
        List<Volunteer> allVolunteers = volunteerRepository.findAll();
        System.out.println("All Volunteers:");
        for (Volunteer Volunteer : allVolunteers) {
            System.out.println("Volunteer " + Volunteer.getVolunteer_id() + " " + Volunteer.getEmail() );
        }

        // You can add more interactions as needed
    }
}