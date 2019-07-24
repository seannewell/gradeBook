// This class interacts with the user
import java.util.*;


public class UserInterface {

    int classNumber = 0;
    List<ClassRoom> classrooms = new ArrayList<>();

    // Create a scanner object
    Scanner sc = new Scanner(System.in);


    // Welcome the new user to the database
    public void welcomeScreen(){
        System.out.println();
        System.out.println("Welcome to your new Grade Book database system!");
        System.out.println("Let's get started by creating your first classroom.");
    }

    // Continue to guide the user
    public void welcomeScreen2(){
        System.out.println();
        System.out.println("Great! Next let's enter the names of the students " +
                "in this class.");
    }

    // Create a new classroom and add it a list
    public void createNewClassroom(){
        System.out.println();
        System.out.println("What would you like to name this class?");
        System.out.print("Class Name: ");
        String className = sc.nextLine();


        ClassRoom cr = new ClassRoom(className);
        classrooms.add(cr);
    }

    // Create a new student and add it to a list
    public void createNewStudent(){
        System.out.println();
        System.out.println("Which class is this student in? (enter a number)");
        printClassroomNames(); // Allow the user to see all of the classes
        System.out.println("Class number: ");
        classNumber = sc.nextInt();
        String addAnother = "yes";
        while (addAnother.contains("es")) {
            System.out.print("Student Name: ");
            String studentName = sc.next();
            System.out.println();
            System.out.print("Student ID: ");
            String studentId = sc.next();
            Student st = new Student(studentName, studentId);
            classrooms.get(classNumber-1).addStudent(st); // Add student to the appropriate class.
            System.out.println(st.getName() + " was added to " + classrooms.get(classNumber-1).getName() + ".");
            System.out.println("Do you wish to add another student to this class? (yes/no)");
            addAnother = sc.next();
        }

    }


    // Print out the names of each class
    public void printClassroomNames(){
        System.out.println();
        int count = 1;
        for (ClassRoom classRoom : classrooms){
            System.out.println(count + ". " + classRoom.getName());
            count++;
        }
    }

    public void mainMenu(){
        System.out.println();
        System.out.println("What do you wish to do?");
        System.out.println("1. Add a grade");
        System.out.println("2. Add a student");
        System.out.println("3. Add a class");
        System.out.println("4. List all students");
        System.out.println("5. List all classes");
        System.out.println("6. Get Student Info");
        System.out.println("7. Quit");
    }

    public void addGrade(){
        System.out.println();
        System.out.println("Which class is the student in? (enter a number)");
        printClassroomNames();
        System.out.println("Class number: ");
        int classNum = sc.nextInt();
        System.out.println("Which student do you wish to add a grade? (enter a number)");
        printStudentNames();
        System.out.println("Student number: ");
        int studentNum = sc.nextInt();
        System.out.println("Grade (percentage): ");
        float grade = sc.nextFloat();
        classrooms.get(classNum-1).addGrade(studentNum-1,grade);
    }

    public void printStudentNames(){
        for (ClassRoom classRoom : classrooms){
            System.out.println("  -- " + classRoom.getName()+ " --");
            classRoom.printStudentNames();
        }
    }

    public void getStudentInfo(){
        System.out.println();
        System.out.println("Which class is the student in? (enter a number)");
        printClassroomNames();
        System.out.println("Class number: ");
        int classNum = sc.nextInt();
        System.out.println("Which student's information do you wish to have?");
        printStudentNames();
        System.out.println("Student number: ");
        int studentNum = sc.nextInt();
        classrooms.get(classNum-1).students.get(studentNum-1).getInfo();
    }

}
