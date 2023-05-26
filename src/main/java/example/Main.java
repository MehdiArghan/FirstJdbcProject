package example;

import example.dao.Jdbcmetod;
import example.entity.Student;
import org.postgresql.ssl.PGjdbcHostnameVerifier;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {
      /*
        for (Student student : jdbcmetod.getAllStudent()) {
            System.out.print(student.getStudent_name() + "\n");
        }*/




      /*  Jdbcmetod jdbcmetod = new Jdbcmetod();
        Student student = jdbcmetod.getStudentById(2);
        System.out.println(student.getStudent_name());*/


       /* Jdbcmetod jdbcmetod=new Jdbcmetod();
        jdbcmetod.deleteAllStudent();*/


      /*  Student studentOne = new Student(1, "mehdi", 25, 20, new Date());
        Student studentTwo = new Student(2, "erfan", 25, 20, new Date());
        Jdbcmetod jdbcmetod = new Jdbcmetod();
        jdbcmetod.insertStudent(studentOne);
        jdbcmetod.insertStudent(studentTwo);*/


        /* Jdbcmetod jdbcmetod=new Jdbcmetod();
         jdbcmetod.deleteStudent(1);*/



    }
}
