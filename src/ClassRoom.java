import java.util.*;


public class ClassRoom {


    List<Student> students = new ArrayList<>();

    String name = "";


    public ClassRoom(){
    }

    public ClassRoom(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addStudent(Student st){
        students.add(st);
    }


    public void printStudentNames(){
        System.out.println();
        int count = 1;
        for (Student student : students){
            System.out.println(count + ". " + student.getName());
            count++;
        }
    }

}
