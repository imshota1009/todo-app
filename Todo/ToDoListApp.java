import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
    private static List<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    listTasks();
                    break;
                case "3":
                    completeTask();
                    break;
                case "4":
                    System.out.println("ToDoリストを終了します。");
                    return;
                default:
                    System.out.println("無効な入力です。もう一度お試しください。");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- ToDoリスト ---");
        System.out.println("1. タスクを追加");
        System.out.println("2. タスクを一覧表示");
        System.out.println("3. タスクを完了");
        System.out.println("4. 終了");
        System.out.print("番号を入力してください: ");
    }

    private static void addTask() {
        System.out.print("追加するタスクを入力してください: ");
        String taskName = scanner.nextLine();
        tasks.add(new Task(taskName));
        System.out.println("タスク「" + taskName + "」が追加されました。");
    }

    private static void listTasks() {
        System.out.println("\n--- 現在のタスク ---");
        if (tasks.isEmpty()) {
            System.out.println("タスクはありません。");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isCompleted() ? "[完了]" : "[未完了]";
                System.out.println((i + 1) + ". " + status + " " + task.getTask());
            }
        }
    }

    private static void completeTask() {
        listTasks();
        if (tasks.isEmpty()) {
            return;
        }
        System.out.print("完了したタスクの番号を入力してください: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.get(index).setCompleted(true);
                System.out.println("タスク「" + tasks.get(index).getTask() + "」が完了しました。");
            } else {
                System.out.println("無効な番号です。");
            }
        } catch (NumberFormatException e) {
            System.out.println("無効な入力です。数字を入力してください。");
        }
    }
}