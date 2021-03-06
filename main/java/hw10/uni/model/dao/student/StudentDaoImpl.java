package hw10.uni.model.dao.student;

import hw10.uni.model.dbconnector.DbConnector;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {
    Session session = DbConnector.getSession();


    @Override
    public void insert(Student student) {
        Session session = DbConnector.getSession();
        session.save(student);
        session.getTransaction();
        session.close();

    }

    @Override
    public void delete(String StudentId) {
        Session session = DbConnector.getSession();

        System.out.println(session.isOpen());
        Transaction transaction = session.beginTransaction();
        if (find(StudentId) != null) {
            try {
                session.createQuery("delete from Student where id=" + StudentId).executeUpdate();
                transaction.commit();
                session.close();


            } catch (Throwable t) {
                transaction.rollback();
                System.out.println("Can not Delete Student");
                session.close();
                throw t;

            }
        }


    }

    @Override
    public void update(String id, Student student) {
        Session session = DbConnector.getSession();

        Student st = find(id);
        Transaction transaction = session.beginTransaction();
        if (st != null) {
            try {
                session.createQuery("update Student set firstName = '" + student.getFirstName() + "', lastName =  '" + student.getLastName() + "' where id = " + id).executeUpdate();
                transaction.commit();
                session.close();


            } catch (Throwable t) {
                transaction.rollback();
                System.out.println("Can not Update Student" + st);
                session.close();
                throw t;

            }

        }


    }

    @Override
    public Student find(String... args) {

        Session session = DbConnector.getSession();
        Student st = null;
        System.out.println(args[0]);
        if (args.length == 1) {

            st = (Student) session.createQuery("select st from Student st where st.id=" + args[0]).getSingleResult();
            session.close();

            return st;
        } else if (args.length == 2) {
            st = (Student) session.createQuery("select st from Student st where firstName=" + args[0] + " and lastName =" + args[1]).getSingleResult();
            session.close();

            return st;
        }
        System.out.println("Not Found Student (return null)");
        session.close();

        return st;
    }

    //if arg[0] & arg[1] != "" out like first name and like last name execute
    // if arg[0] !="" and arg[1] ==""  out like first name execute
    //if arg[0] =="" and arg[1] !=""  out like last name execute
    //else out  all Student
    @Override
    public List<Student> findAll(String... args) {
        Session session = DbConnector.getSession();

        List<Student> studentList = new ArrayList<>();

        if (!args[0].equals("") && !args[1].equals("")) {
            studentList = session.createQuery("from Student st where st.firstName like '" + args[0] + "%' and st.lastName like '" + args[1] + "%'").list();
//            System.out.println(studentList);
            session.close();

            return studentList;

        } else if (!args[0].equals("")) {
            studentList = session.createQuery("from Student where firstName like '" + args[0] + "%'").list();
//            System.out.println(studentList);
            session.close();

            return studentList;

        } else if (!args[1].equals("")) {
            studentList = session.createQuery("from Student where lastName like '" + args[1] + "%'").list();
//            System.out.println(studentList);
            session.close();

            return studentList;

        } else {
            studentList = session.createQuery("from Student ").list();
//            System.out.println(studentList);
            session.close();

            return studentList;
        }
    }

    public List<Student> addressFind(String city) {
        Session session = DbConnector.getSession();

        List<Student> studentList = new ArrayList<>();
        studentList = session.createQuery("select s from Student s where s.address.city = 'tehran'").list();
//        studentList = session.createQuery("select s from Student s where s.address.city ='" + city+"'").list();
        session.close();

        return studentList;


    }

    @Override
    public List<Student> studentList(String query) {
        Session session = DbConnector.getSession();
        List<Student > students=new ArrayList<>();
        students=  session.createQuery(query).getResultList();
        return students;
    }
}

