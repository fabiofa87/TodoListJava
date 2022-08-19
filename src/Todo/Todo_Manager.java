package Todo;
import java.util.Scanner;

public class Todo_Manager {

    public static void main(String[] args) {
        System.out.println("This is a TodoList Manager! Welcome!\n");
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!\n");

        String choice;
        String[] tasks = new String[10];
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. View all tasks");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextLine();
            switch(choice) {
                case "1":
                    System.out.println("\nEnter Your Task: ");
                    String task = input.nextLine();
                    for(int i = 0; i < tasks.length; i++) {
                        if(tasks[i] == null) {
                            tasks[i] = task;
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("\nEnter the number of the task you want to remove: ");
                    int taskNumber = input.nextInt();
                    System.out.println("\n Are you sure you want to remove task " + taskNumber + "?\n");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    if(input.nextInt() == 1) {
                        for(int i = 0; i < tasks.length - 1; i++ ) {
                            tasks[i] = tasks[i + 1];
                        }
                    }
                    break;
                case "3":
                    System.out.println("\nHere is a list of all your tasks: ");
                    for(int i = 0; i < tasks.length; i++) {
                        if(tasks[i] != null) {
                            System.out.println(i + ": " + tasks[i]);
                        }
                    }
                    break;
                case "4":
                    System.out.println("\nGoodbye!");
                    break;
                default:

            }
        }
        while(!choice.equals("4"));
    }
}
