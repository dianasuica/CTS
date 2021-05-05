package ro.ase.csie.cts.seminar10.command;

public class TestCommand {

	public static void main(String[] args) {
		TaskAsincron autoSave = new TaskToDo(new ModulAutosave(), "Autosave",5);
		TaskAsincron autoUpdate = new TaskToDo(new ModulUpdateClient(), "Update v2", 3);
		
		autoSave.executaTask();
		autoUpdate.executaTask();
	}

}
