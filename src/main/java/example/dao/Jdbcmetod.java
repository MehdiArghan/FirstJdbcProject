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
                System.out.println("error");
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


    public Student getStudentById(int studentId) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Student student = new Student();

        try {

            connection = JdbcConnection.getConnection();
            if (connection == null) {
                System.out.println("error");
            }

            preparedStatement = connection.prepareStatement(Jdbcquery.QUERY_TWO);
            preparedStatement.setInt(1, studentId);
            /*preparedStatement.executeUpdate();*/
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                student.setStudent_id(resultSet.getInt("student_id"));
                student.setStudent_name(resultSet.getString("student_name"));
                student.setStudent_age(resultSet.getInt("student_age"));
                student.setStudent_grade(resultSet.getInt("student_grade"));
                student.setStudent_dob(resultSet.getDate("student_dob"));

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

        }
        return student;
    }


    public void deleteAllStudent() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JdbcConnection.getConnection();
            if (connection == null) {
                System.out.println("erro");
            }
            preparedStatement = connection.prepareStatement(Jdbcquery.QUERY_FOUR);
            preparedStatement.execute();

        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        } finally {
            try {
                JdbcConnection.closeConnection(connection);
                JdbcConnection.closePreparedStatement(preparedStatement);
            } catch (SQLException sqlException) {
                throw new RuntimeException(sqlException);
            }
        }
    }
}