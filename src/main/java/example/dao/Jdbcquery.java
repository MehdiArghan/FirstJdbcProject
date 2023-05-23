package example.dao;

public class Jdbcquery {
    public static final String QUERY_ONE = "select * from student";
    public static final String QUERY_TWO = "select student_id, student_name, student_age," +
            " student_grade, student_dob from student where student_id=?";
    public static final String QUERY_THERE = "insert into student(student_id, student_name," +
            " student_age, student_grade, student_dob) values(?,?,?,?,?)";

}
