package hw10;

import hw10.uni.model.dao.address.Address;
import hw10.uni.model.dao.student.Student;
import hw10.uni.model.dao.student.StudentDAO;
import hw10.uni.model.dao.student.StudentDaoImpl;
import hw10.uni.model.dao.teacher.Teacher;
import hw10.uni.model.dao.teacher.TeacherDAO;
import hw10.uni.model.dao.teacher.TeacherDaoImpl;

/**
 * Hello world!
 */
public class AddData {

    public static void main(final String[] args) throws Exception {


        StudentDAO st = new StudentDaoImpl();


        Address address1 = new Address("tehran", "markazi", "1717", "17", "091243");
        Address address2 = new Address("tehran", "markazi", "1818", "18", "091950");
        Address address3 = new Address("ahvaz", "markazi", "2525", "25", "091220");
        Student student1 = new Student("mohammad", "farahani");
        Student student2 = new Student("alireza", "daei");
        Student student3 = new Student("amirmahdi", "farahani");

        student1.setAddress(address1);
        student2.setAddress(address2);
        student3.setAddress(address3);

        st.insert(student1);
        st.insert(student2);
        st.insert(student3);


        TeacherDAO th = new TeacherDaoImpl();

        Teacher th1 = new Teacher("ali", "farahani", "130", 1500000, "1983-04-02");
        Teacher th4 = new Teacher("reza", "asgari", "131", 1200000, "1990-02-05");
        Teacher th5 = new Teacher("xaniar", "farahani", "134", 1300000, "1998-07-07");
        Teacher th2 = new Teacher("raha", "javid", "127", 2000000, "2000-11-10");
        Teacher th3 = new Teacher("davood", "imani", "129", 5000000, "2018-01-11");


        Address address4 = new Address("tehran", "markazi", "1919", "19", "091225");
        Address address5 = new Address("tehran", "markazi", "2020", "20", "091920");
        Address address6 = new Address("arak", "markazi", "2626", "26", "093765");
        Address address7 = new Address("arak", "markazi", "2626", "26", "091221");
        Address address8 = new Address("tehran", "markazi", "2727", "27", "091230");

        th1.setAddress(address4);
        th2.setAddress(address5);
        th3.setAddress(address6);
        th4.setAddress(address7);
        th5.setAddress(address8);


        th.insert(th1);
        th.insert(th4);
        th.insert(th5);
        th.insert(th2);
        th.insert(th3);
    }
}
