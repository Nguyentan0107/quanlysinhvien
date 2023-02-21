package views;

import controller.StudentManagement;
import model.Student;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public StudentManagement studentManagement = new StudentManagement();
    Scanner scanner =new Scanner(System.in);
    public void showMenu() {
        System.out.println("""
                CHƯƠNG TRÌNH QUẢN LÝ SINH VIEN
                Chọn chức năng theo số (để tiếp tục)
                1. Xem danh sách sinh viên
                2. Thêm mới
                3. Cập nhật
                4. Xóa
                5. Sắp xếp
                6. Đọc từ file
                7. Ghi vào file
                8. Thoát
                Chọn chức năng:
                """);

    }
    public void chooseNumber() throws IOException {
        int a = 0;
        while (true){
            try {
                showMenu();
                a = Integer.parseInt(scanner.nextLine());
                if (a >= 0 && a <= 8){
                    break;}
            }catch (Exception e){
                System.out.println("Vui lòng nhập lại");
            }
        }
        switch (a) {
            case 1:
                studentManagement.showStudent();
            case 2:
                displayInput();
            case 3:
                System.out.println("Vui lòng nhập lại");
                chooseNumber();
            case 4:
                deleteStudent ();
            case 5:
                System.out.println("Vui lòng nhập lại");
            case 6:
                System.out.println("Vui lòng nhập lại");
                chooseNumber();
            case 7:
                System.out.println("Vui lòng nhập lại");
                chooseNumber();
            case 8:
                System.out.println("Vui lòng nhập lại");
                chooseNumber();
            case 0:
                System.out.println("Vui lòng nhập lại");
                chooseNumber();
        }
    }
    public void displayInput(){
        System.out.println("Nhập mã sinh viên");
        String id = scanner.nextLine();
        System.out.println("Nhập họ tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = checkInt();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Điểm trung bình");
        double averageofsubject = checkDouble();
        Student student = new Student(id, name, age, gender, address, averageofsubject);
        try {
            studentManagement.addStudent(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public int checkInt(){
        while (true){
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public Double checkDouble(){
        while (true){
            try {
                return Double.parseDouble(scanner.nextLine());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void deleteStudent () {
        System.out.println("Nhâp mã sinh viên cần xóa");
        String string = scanner.nextLine();
        try {
            studentManagement.deleteSudentByID(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    public void fixS() {
//        System.out.println("Nhập mã sinh viên cần sủa");
//        String id = scanner.nextLine();
//        System.out.println("Nhập họ tên");
//        String name = scanner.nextLine();
//        System.out.println("Nhập tuổi");
//        int age = checkInt();
//        System.out.println("Giới tính");
//        String gender = scanner.nextLine();
//        System.out.println("Địa chỉ");
//        String address = scanner.nextLine();
//        System.out.println("Điểm trung bình");
//        double averageofsubject = checkDouble();
//        Student student = new Student(id, name, age, gender, address, averageofsubject);
//        try {
//            studentManagement.fixStuden(student);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }




}
