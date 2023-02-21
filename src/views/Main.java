package views;

import controller.StudentManagement;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.chooseNumber();

    }
}