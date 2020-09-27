
public class WorkPlace {
	Employees employee=new Employees();
	BugTracker bugTracker = new BugTracker();
	Developer FrontendDeveloper = new FrontendDeveloper();
	Developer BackEndDeveloper = new BackEndDeveloper();
	
	
	public void Project() {
	bugTracker.startSprint();
	employee.addDeveloper(FrontendDeveloper);
	employee.addDeveloper(BackEndDeveloper);
	employee.createProject(bugTracker);
	bugTracker.finishSprint();
	employee.createProject(bugTracker);
	}
}
