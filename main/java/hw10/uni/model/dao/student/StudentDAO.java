package hw10.uni.model.dao.student;

import java.util.List;

public interface StudentDAO {

    public void insert(Student student);
    public void delete(String StudentId);
    public void update(String id, Student student);
    public Student find(String... args);
    public List<Student> findAll(String... args);
    public List<Student> addressFind(String args);
    public List<Student> studentList(String query);




    }
