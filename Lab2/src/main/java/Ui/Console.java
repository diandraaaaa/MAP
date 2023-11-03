package Ui;

import Repository.VolunteerRepo;

import java.util.Scanner;

public class Console {
    private VolunteerRepo volunteerManager;  // Assuming you have a VolunteerManager class to handle operations

    public Console() {
        // Initialize the VolunteerManager (you need to implement this class)
        this.volunteerManager = new VolunteerRepo();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("1. View volunteers");
            System.out.println("2. Add a volunteer");
            System.out.println("3. Delete a volunteer");
            System.out.println("4. Search a volunteer by an ID");
            System.out.println("5. View departments");
            System.out.println("6. Add a department");
            System.out.println("7. Delete a department");
            System.out.println("8. Search a department by an ID");
            System.out.println("9. View tasks");
            System.out.println("10. Add a task");
            System.out.println("11. Delete a task");
            System.out.println("12. Search a task by an ID");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewVolunteers();
                    break;
                case 2:
                    addVolunteer();
                    break;
                case 3:
                    deleteVolunteer();
                    break;
                case 4:
                    searchVolunteerById();
                    break;
                case 5:
                    viewDepartments();
                    break;
                case 6:
                    addDepartment();
                    break;
                case 7:
                    deleteDepartment();
                    break;
                case 8:
                    searchDepartmentById();
                    break;
                case 9:
                    viewTasks();
                    break;
                case 10:
                    addTask();
                    break;
                case 11:
                    deleteTask();
                    break;
                case 12:
                    searchTaskById();
                    break;
                case 0:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println("Goodbye!");
    }

    private void viewVolunteers() {
        // Implement logic to view volunteers
    }

    private void addVolunteer() {
        // Implement logic to add a volunteer
    }

    private void deleteVolunteer() {
        // Implement logic to delete a volunteer
    }

    private void searchVolunteerById() {
        // Implement logic to search for a volunteer by ID
    }

    private void viewDepartments() {
        // Implement logic to view departments
    }

    private void addDepartment() {
        // Implement logic to add a department
    }

    private void deleteDepartment() {
        // Implement logic to delete a department
    }

    private void searchDepartmentById() {
        // Implement logic to search for a department by ID
    }

    private void viewTasks() {
        // Implement logic to view tasks
    }

    private void addTask() {
        // Implement logic to add a task
    }

    private void deleteTask() {
        // Implement logic to delete a task
    }

    private void searchTaskById() {
        // Implement logic to search for a task by ID
    }

    public static void main(String[] args) {
        Console console = new Console();
        console.start();
    }
}
