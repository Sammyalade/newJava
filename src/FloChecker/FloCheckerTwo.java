package FloChecker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FloCheckerTwo {

    public String checkMenstrualCircle(String startOfMenstrualCircle, int averageCycleLength, int lengthOfFlow) throws Exception {
        LocalDate dateOfMenstrualCircleStart = changeDateFormat(startOfMenstrualCircle);
        LocalDate nextPeriodDate = calculateNextPeriodDate(dateOfMenstrualCircleStart, averageCycleLength);
        LocalDate fertileWindowStart = calculateStartOfFertileWindow(dateOfMenstrualCircleStart, averageCycleLength);
        LocalDate fertileWindowEnds = calculateEndOfFertileWindow(dateOfMenstrualCircleStart, averageCycleLength);
        LocalDate safePeriodStarts = calculateStartOfSafePeriod(dateOfMenstrualCircleStart, lengthOfFlow);
        LocalDate safePeriodEnds = calculateEndOfSafePeriod(dateOfMenstrualCircleStart, lengthOfFlow);
        return displayDate(averageCycleLength, dateOfMenstrualCircleStart, nextPeriodDate, fertileWindowStart, fertileWindowEnds, safePeriodStarts, safePeriodEnds);

    }

    public LocalDate calculateNextPeriodDate(LocalDate startOfMenstrualCircle, int averageCircleLength) throws Exception{
        System.out.println(startOfMenstrualCircle.plusDays(averageCircleLength));
        return startOfMenstrualCircle.plusDays(averageCircleLength);
    }

    public LocalDate calculateStartOfFertileWindow(LocalDate dateOfMenstrualCircleStart, int averageCycleLength) throws Exception{
        return dateOfMenstrualCircleStart.plusDays(averageCycleLength-18);
    }

    public LocalDate calculateEndOfFertileWindow(LocalDate dateOfMenstrualCircleStart, int averageCycleLength) throws Exception{
        return dateOfMenstrualCircleStart.plusDays(averageCycleLength-13);
    }

    public LocalDate calculateStartOfSafePeriod(LocalDate dateOfMenstrualCircleStart, int lengthOfFlow) throws Exception{
        return dateOfMenstrualCircleStart.plusDays(lengthOfFlow+1);
    }

    public LocalDate calculateEndOfSafePeriod(LocalDate dateOfMenstrualCircleStart, int lengthOfFlow) throws Exception{
        return dateOfMenstrualCircleStart.plusDays(lengthOfFlow+5);
    }

    public LocalDate changeDateFormat(String dateInString) throws Exception {
        return LocalDate.parse(dateInString);
    }

    public String displayDate(int averageCycleLength, LocalDate dateOfMenstrualCircleStart, LocalDate fertileWindowStart, LocalDate nextPeriodDate, LocalDate fertileWindowEnds, LocalDate safePeriodStarts, LocalDate safePeriodEnds) {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMM d, yyyy");
        return String.format("""
                Your Menstrual Period starts from %s
                Your safe period starts from %s and ends on %s
                Your fertile window starts from %s and ends on %s
                Your next Menstrual circle will start on %s
                """, dateOfMenstrualCircleStart.format(formatDate), safePeriodStarts.format(formatDate), safePeriodEnds.format(formatDate), fertileWindowStart.format(formatDate), fertileWindowEnds.format(formatDate), nextPeriodDate.format(formatDate));
    }
}
