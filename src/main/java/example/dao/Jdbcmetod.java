package example.dao;

import example.constant.JdbcConnection;
import example.constant.Jdbcconstant;
import example.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Jdbcmetod {


    public List<Student> getAllStudent() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Student> students = new ArrayList<>();


        try {

            connection = JdbcConnection.getConnection();
            if (connection == null) {
                System.out.println("erro");
                return students;

            }

            preparedStatement = connection.prepareStatement(Jdbcquery.QUERY_ONE);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setStudent_id(resultSet.getInt("student_id"));
                student.setStudent_name(resultSet.getString("student_name"));
                student.setStudent_age(resultSet.getInt("student_age"));
                student.setStudent_grade(resultSet.getInt("student_grade"));
                student.setStudent_dob(resultSet.getDate("student_dob"));
                students.add(student);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                JdbcConnection.closeConnection(connection);
                JdbcConnection.closePreparedStatement(preparedStatement);
                JdbcConnection.closeResultSet(resultSet);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return students;
        }
    }
}