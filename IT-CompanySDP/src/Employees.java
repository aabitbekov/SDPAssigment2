import java.util.ArrayList;
import java.util.List;

public class Employees {
 private List<Developer> Employees=new ArrayList<Developer>();
 
 public void addDeveloper(Developer developer) {
	 Employees.add(developer);
 }
 public void removeDeveloper(Developer developer) {
	 Employees.remove(developer);
 }
 public void createProject(BugTracker bugTracker) {
	 if(bugTracker.isActiveSprint()) {
	 System.out.println("Employees create  project");
	 for(Developer developer : Employees) {
		 developer.work();
	 }
	 System.out.println("Employees finished  project");
 }
	 else {
		 System.out.println("Developer sleep...");
	 }
 }
}
