import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpAndSkills {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Ishant Sharma", new Skills("Java", 5)));
		empList.add(new Employee(1, "Ishan Kishan", new Skills("Java", 6)));
		empList.add(new Employee(1, "Rohit Sharma", new Skills("Java", 7)));
		empList.add(new Employee(1, "Ravi Bishnoi", new Skills("Java", 2)));
		empList.add(new Employee(1, "Mohit Sharma", new Skills("Java", 1)));
		empList.add(new Employee(1, "Rajesh Sharma", new Skills("Java", 6)));
 empList.stream().filter(emp-> emp.getSkills().getSkillName().equals("Java") && 
				emp.getSkills().getYearOfExp()>=5).collect(Collectors.toList()).forEach(System.out::println);;
			}
}

class Employee{
	int empId;
	String empName;
	Skills skills;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public Employee(int empId, String empName, Skills skills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", skills=" + skills + "]";
	}
	
	
	
}
class Skills{
	String skillName;
	int yearOfExp;
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getYearOfExp() {
		return yearOfExp;
	}
	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	public Skills(String skillName, int yearOfExp) {
		super();
		this.skillName = skillName;
		this.yearOfExp = yearOfExp;
	}
	@Override
	public String toString() {
		return "Skills [skillName=" + skillName + ", yearOfExp=" + yearOfExp + "]";
	}
	
	
}