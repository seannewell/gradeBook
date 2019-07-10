// Title:       gradeBook
//
// Author:      Sean Newell
//
// Description: This is a commandline system to input and keep track
//              of students' grades
//
//


public class Main {

    public static void main(String[] args){

        // Create interface
        UserInterface ui = new UserInterface();
        //ClassRoom cr = new ClassRoom();

        ui.welcomeScreen();
        ui.createNewClassroom();

        // First classroom created! Yay!
        ui.welcomeScreen2();

        ui.createNewClassroom();
        ui.createNewStudent();
        ui.createNewStudent();
        ui.listClassroomNames();


        //ui.listClassroomNames();  // Just used as a test for the list right now.



    }


}
