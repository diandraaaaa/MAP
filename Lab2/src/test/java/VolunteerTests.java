import model.Department;
import model.Volunteer;
import Repository.VolunteerRepo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VolunteerTests {


    @Test
    void addTest() {
        Volunteer volunteer1 = new Volunteer( 1, "Oana", "oana@exemple.com", "0700000000");
        Volunteer volunteer2 = new Volunteer( 2, "Ana", "ana@exemple.com", "0700000001");
        
    }
}
