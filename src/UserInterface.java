// This class interacts with the user
import java.util.*;


public class UserInterface {

    int classNumber = 0;
    List<ClassRoom> classrooms = new ArrayList<>();

    // Create a scanner object
    Scanner sc = new Scanner(System.in);


    public void welcomeScreen(){

        System.out.println();
        System.out.println("Welcome to your new Grade Book database system!");
        System.out.println("Let's get started by creating your first classroom.");

    }

    public void welcomeScreen2(){
        System.out.println();
        System.out.println("Great! Next let's enter the names of the students " +
                "in this class.");
    }

    public void createNewClassroom(){
        System.out.println();
        System.out.println("What would you like to name this class?");
        System.out.print("Class Name: ");
        String className = sc.nextLine();


        ClassRoom cr = new ClassRoom(className);
        classrooms.add(cr);
    }

    public void createNewStudent(){
        System.out.println();
        System.out.println("Which class is this student in?");
        classNumber = sc.nextInt();
        System.out.print("Student Name: ");
        String studentName = sc.next();
        System.out.println();
        System.out.print("Student ID: ");
        String studentId = sc.next();
        Student st = new Student(studentName,studentId);
        classrooms.get(classNumber).addStudent(st); // Add student to the appropriate class.
    }



    public void listClassroomNames(){
        System.out.println();
        for (ClassRoom classRoom : classrooms){
            System.out.println(classRoom.getName());
        }
    }

    public void mainMenu(){

    }



}
