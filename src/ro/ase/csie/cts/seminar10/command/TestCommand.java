package ro.ase.csie.cts.seminar10.command;

public class TestCommand {

	public static void main(String[] args) {
		TaskAsincron autoSave = new TaskToDo(new ModulAutosave(), "Autosave",5);
		TaskAsincron autoUpdate = new TaskToDo(new ModulUpdateClient(), "Update v2", 3);
		
		ManagerTaskuri manager = new ManagerTaskuri();
		manager.adaugaTask(autoSave);
		manager.adaugaTask(autoUpdate);
		
		System.out.println("Jocul este activ");
		
		manager.executaTask();
		manager.executaTask();
	}

}
