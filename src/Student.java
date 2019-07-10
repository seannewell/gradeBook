import java.util.*;
public class Student {


    List<Float> grades = new ArrayList<>();
    private String name = "";
    private String id = "";

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getId() {
        return id;
    }

    public void getInfo(){
        System.out.println();
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Student average: " + getAverage());
    }

    public float getAverage(){
        float total = 0;
        for (Float grade : grades){
            total = total + grade;
        }
        float average = total / grades.size();


        return average;
    }

    public void addGrade(float grade){
        grades.add(grade);
    }


}
