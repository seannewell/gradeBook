// Title:       gradeBook
//
// Author:      Sean Newell
//
// Description: This is a commandline program to input and keep track
//              of students' grades
//
//


public class Main {

    public static void main(String[] args){

        // Create interface
        UserInterface ui = new UserInterface();
        //ClassRoom cr = new ClassRoom();

        /////////////INTRO PROGRAM DEMO//////////////////////////////
        ui.welcomeScreen();
        ui.createNewClassroom();

        // First classroom created! Yay!
        ui.welcomeScreen2();

        ui.createNewStudent();
        /////////////////////////////////////////////////////////////
        

        ////////////////NORMAL PROGRAM///////////////////////////////




    }


}
