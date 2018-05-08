package intf2;

public class TaskExecutor {
	public void execute(Runnable pTask) {
		// Class
		System.out.println("#### CLASA TASK:" + pTask.getClass().getName());
		System.out.println("#### SUPER CLASA TASK:" + pTask.getClass().getSuperclass().getName());

		System.out.println("######Inainte de executie task");
		pTask.run();
		System.out.println("######Dupa executie task");

	}
}
