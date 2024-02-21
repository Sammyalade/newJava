import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeChecker {

    public static int checkBirthDate(String dateOfBirth){
        LocalDate date = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return Period.between(date, LocalDate.now()).getYears();
    }

}
