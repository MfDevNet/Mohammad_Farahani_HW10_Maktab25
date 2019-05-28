package hw10;

import hw10.uni.model.dao.student.Student;
import hw10.uni.model.dao.student.StudentDAO;
import hw10.uni.model.dao.student.StudentDaoImpl;
import hw10.uni.model.dao.teacher.Teacher;
import hw10.uni.model.dao.teacher.TeacherDAO;
import hw10.uni.model.dao.teacher.TeacherDaoImpl;

import java.util.List;

public class DataFilter {


    public static void main(String[] args) {

        StudentDAO st = new StudentDaoImpl();



        //Student live in tehran
//        System.out.println(st.addressFind("tehran"));
        System.out.println("*********** Student live in Tehran*************************************");
        studentShow(st.studentList("select s from Student s where s.address.city = 'tehran'"));
        System.out.println("*********** Student live in Tehran*************************************");


        TeacherDAO th = new TeacherDaoImpl();

        //Teacher live in tehran
        System.out.println("*********** Teacher live in Tehran*************************************");
        teacherShow(th.teacherList("select s from Teacher s where s.address.city = 'tehran'"));
        System.out.println("*********** Teacher mobile start with 0912 *****************************");
        teacherShow(th.teacherList("select th from Teacher th where th.address.number like '0912%'"));
        System.out.println("*********** Teacher mobile start with 0912 and live in tehran*****************************");
        teacherShow(th.teacherList("select th from Teacher th where th.address.number like '0912%' and th.address.city='tehran'"));

    }

     static void teacherShow(List<Teacher> teachers){
         System.out.println("---------------------------------------------------------------------------");
        System.out.printf("Teacher Show : ");
        for (Teacher teacher:teachers){
            System.out.println(teacher);
            System.out.println( "Fname "+teacher.getFirstName() + " : Lname "+teacher.getLastName());
            System.out.println("thCode "+teacher.getTeacherCode() + " : Salaray "+ teacher.getSalary());
            System.out.println("City "+teacher.getAddress().getCity() + " : PostalAddress " + teacher.getAddress().getPostalAddress()+ " : postalCode" + teacher.getAddress().getPostalCode());
            System.out.println("Stats  "+ " : " + teacher.getAddress().getState() + " : phone " + teacher.getAddress().getNumber());
            System.out.println("---------------------------------------------------------------------------");
        }
    }

    static void studentShow(List<Student> students){
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("Teacher Show : ");
        for (Student student:students){
            System.out.println(student);
            System.out.println( "Fname "+student.getFirstName() + " : Lname "+student.getLastName());
            System.out.println("City "+student.getAddress().getCity() + " : PostalAddress " + student.getAddress().getPostalAddress()+ " : postalCode" + student.getAddress().getPostalCode());
            System.out.println("Stats  "+ " : " + student.getAddress().getState() + " : phone " + student.getAddress().getNumber());
            System.out.println("---------------------------------------------------------------------------");
        }
    }



}
