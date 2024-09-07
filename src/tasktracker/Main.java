package tasktracker;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Task task1 = new Task("Task 1", "Description 1", Status.NEW);
        Task task2 = new Task("Task 2", "Description 2", Status.IN_PROGRESS);
        manager.createTask(task1);
        manager.createTask(task2);

        Epic epic1 = new Epic("Epic 1", "Description for Epic 1");
        Subtask subtask1 = new Subtask("Subtask 1", "Description for Subtask 1", Status.NEW, epic1.getId());
        Subtask subtask2 = new Subtask("Subtask 2", "Description for Subtask 2", Status.DONE, epic1.getId());

        epic1.addSubtask(subtask1);
        epic1.addSubtask(subtask2);

        manager.createEpic(epic1);
        manager.createSubtask(subtask1);
        manager.createSubtask(subtask2);

        System.out.println(manager.getAllTasks());
        System.out.println(manager.getAllEpics());
        System.out.println(manager.getAllSubtasksByEpicId(epic1.getId()));
    }
}
