// Title:       gradeBook
//
// Author:      Sean Newell
//
// Description: This is a commandline program to input and keep track
//              of students' grades
//
//


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Create interface
        UserInterface ui = new UserInterface();
        // Create scanner
        Scanner sc = new Scanner(System.in);

        /////////////INTRO PROGRAM DEMO//////////////////////////////
        ui.welcomeScreen();
        ui.createNewClassroom();

        // First classroom created! Yay!
        ui.welcomeScreen2();
        ui.createNewStudent();
        /////////////////////////////////////////////////////////////



        ////////////////NORMAL PROGRAM///////////////////////////////
        int option = 8;
        while(option != 7) {
            ui.mainMenu(); // Lists options from 1 - 7
            option = sc.nextInt();
            switch (option) {
                case 1: ui.addGrade();
                    break;
                case 2: ui.createNewStudent();
                    break;
                case 3: ui.createNewClassroom();
                    break;
                case 4: ui.printStudentNames();
                    break;
                case 5: ui.printClassroomNames();
                    break;
                case 6: ui.getStudentInfo();
                    break;
                case 7:
                    break;
                default: option = 8;
                System.out.println("Please select a number within the range [1,7]");

            }
        }

        //////////////////////////////////////////////////////////////

    }


}
