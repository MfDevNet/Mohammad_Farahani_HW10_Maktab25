package hw10;

import hw10.uni.model.dao.student.Student;
import hw10.uni.model.dao.student.StudentDAO;
import hw10.uni.model.dao.student.StudentDaoImpl;
import hw10.uni.model.dao.teacher.Teacher;
import hw10.uni.model.dao.teacher.TeacherDAO;
import hw10.uni.model.dao.teacher.TeacherDaoImpl;

public class Update {
    public static void main(String[] args) {

        StudentDAO st = new StudentDaoImpl();
        TeacherDAO th = new TeacherDaoImpl();


        st.update("1", new Student("ali", "rezaei"));
        th.update("130", new Teacher("alireza", "farahani", "130", 1400000, "1990-04-02"));


    }
}
