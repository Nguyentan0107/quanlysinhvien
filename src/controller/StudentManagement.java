package controller;

import model.Student;
import storage.ReadWriteFile;

import java.io.IOException;
import java.util.List;

public class StudentManagement {
    List<Student> studentList = ReadWriteFile.readFile();

    public StudentManagement(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentManagement() {

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    //Thêm sản sinh viên
    public void addStudent(Student student) throws IOException {
        this.studentList.add(student);
        ReadWriteFile.writeFile(studentList);
    }
    public void showStudent (){
        for (Student o: studentList) {
            System.out.println(o);
        }
    }
    public void deleteSudentByID(String id) throws IOException {
        for (Student o : studentList) {
            if (id.equals(o.getId())) {
                System.out.println(o);
                studentList.remove(o);
                ReadWriteFile.writeFile(studentList);
                break;
            }
        }
    }
    public void fixStuden(String id,Student student) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if(id.equals(studentList.get(i).getId())){
                System.out.println(i);
                studentList.set(i,student);
                System.out.println(i);

            }

        }
        ReadWriteFile.writeFile(studentList);
    }

}
