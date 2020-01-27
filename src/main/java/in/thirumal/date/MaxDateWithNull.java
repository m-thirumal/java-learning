package in.thirumal.date;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class MaxDateWithNull {

	public static void main(String[] args) {
		List<Employee> dates = List.of(new Employee(1, new Date()), new Employee(2, null));
		
		System.out.println(dates.stream().map(Employee::getDate).filter(d->d != null).max(Date::compareTo));
	}

	@Getter@Setter@AllArgsConstructor
	public static class Employee {
		private int id;
		private Date date;
	}
}
