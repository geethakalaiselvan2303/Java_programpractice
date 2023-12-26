package PublicSaipent;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DifferenceDate {

    public static void main(String[] args) {
	        // Input dates as strings
	        String startDateStr = "03/09/2003";
	        String endDateStr = "13/09/2013";

	        // Define the date format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        // Parse the input strings to LocalDate objects
	        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
	        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

	        // Calculate the period between the two dates
	        Period period = Period.between(startDate, endDate);

	        // Output the difference
	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        System.out.printf("The difference in years: %d years, %d months, %d days%n", years, months, days);
	    }
	}


