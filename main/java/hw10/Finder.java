package hw10;

import hw10.uni.model.dao.student.Student;
import hw10.uni.model.dao.student.StudentDAO;
import hw10.uni.model.dao.student.StudentDaoImpl;
import hw10.uni.model.dao.teacher.Teacher;
import hw10.uni.model.dao.teacher.TeacherDAO;
import hw10.uni.model.dao.teacher.TeacherDaoImpl;

public class Finder {

    public static void main(String[] args) {


        StudentDAO st = new StudentDaoImpl();
        TeacherDAO th = new TeacherDaoImpl();

        Student st1 = st.find("1");
        System.out.println(st1);
        st.findAll("al", "");


        Teacher thf = th.find("davood", "imani");
        System.out.println(thf);
        th.findAll("ali", "");


    }
}
