package HotelService.Model;

import java.time.LocalDate;
import java.time.Period;

public class Guest {

    private String name;
    private String lastName;
    private LocalDate dateOfBirth;


    public boolean isAdult(){
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears()>=18;
    }

}
