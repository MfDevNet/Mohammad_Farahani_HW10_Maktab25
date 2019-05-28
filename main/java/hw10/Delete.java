package hw10;

import hw10.uni.model.dao.student.StudentDAO;
import hw10.uni.model.dao.student.StudentDaoImpl;
import hw10.uni.model.dao.teacher.TeacherDAO;
import hw10.uni.model.dao.teacher.TeacherDaoImpl;

public class Delete {
    public static void main(String[] args) {

        StudentDAO st = new StudentDaoImpl();
        TeacherDAO th = new TeacherDaoImpl();

        st.delete("8");
        th.delete("130");

    }
}
