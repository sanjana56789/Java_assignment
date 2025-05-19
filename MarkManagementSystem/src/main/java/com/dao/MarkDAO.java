package com.dao;

import com.model.StudentMark;
import java.sql.*;
import java.util.*;

public class MarkDAO {
    private Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/yourdbname"; // Replace with your DB name
        String user = "root";
        String password = "yourpassword"; // Replace with your MySQL password
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    public void addMark(StudentMark mark) throws Exception {
        Connection con = getConnection();
        String sql = "INSERT INTO StudentMarks VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, mark.getStudentID());
        ps.setString(2, mark.getStudentName());
        ps.setString(3, mark.getSubject());
        ps.setInt(4, mark.getMarks());
        ps.setDate(5, mark.getExamDate());
        ps.executeUpdate();
        con.close();
    }

    public void updateMark(StudentMark mark) throws Exception {
        Connection con = getConnection();
        String sql = "UPDATE StudentMarks SET StudentName=?, Subject=?, Marks=?, ExamDate=? WHERE StudentID=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, mark.getStudentName());
        ps.setString(2, mark.getSubject());
        ps.setInt(3, mark.getMarks());
        ps.setDate(4, mark.getExamDate());
        ps.setInt(5, mark.getStudentID());
        ps.executeUpdate();
        con.close();
    }

    public void deleteMark(int studentID) throws Exception {
        Connection con = getConnection();
        String sql = "DELETE FROM StudentMarks WHERE StudentID=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, studentID);
        ps.executeUpdate();
        con.close();
    }

    public List<StudentMark> getAllMarks() throws Exception {
        List<StudentMark> list = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM StudentMarks";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            StudentMark mark = new StudentMark();
            mark.setStudentID(rs.getInt("StudentID"));
            mark.setStudentName(rs.getString("StudentName"));
            mark.setSubject(rs.getString("Subject"));
            mark.setMarks(rs.getInt("Marks"));
            mark.setExamDate(rs.getDate("ExamDate"));
            list.add(mark);
        }
        con.close();
        return list;
    }

    public List<StudentMark> getTopNStudents(int n) throws Exception {
        List<StudentMark> list = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM StudentMarks ORDER BY Marks DESC LIMIT ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, n);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            StudentMark mark = new StudentMark();
            mark.setStudentID(rs.getInt("StudentID"));
            mark.setStudentName(rs.getString("StudentName"));
            mark.setSubject(rs.getString("Subject"));
            mark.setMarks(rs.getInt("Marks"));
            mark.setExamDate(rs.getDate("ExamDate"));
            list.add(mark);
        }
        con.close();
        return list;
    }

    public List<StudentMark> getMarksAboveThreshold(int threshold) throws Exception {
        List<StudentMark> list = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM StudentMarks WHERE Marks > ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, threshold);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            StudentMark mark = new StudentMark();
            mark.setStudentID(rs.getInt("StudentID"));
            mark.setStudentName(rs.getString("StudentName"));
            mark.setSubject(rs.getString("Subject"));
            mark.setMarks(rs.getInt("Marks"));
            mark.setExamDate(rs.getDate("ExamDate"));
            list.add(mark);
        }
        con.close();
        return list;
    }

    public List<StudentMark> getMarksBySubject(String subject) throws Exception {
        List<StudentMark> list = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM StudentMarks WHERE Subject = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, subject);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            StudentMark mark = new StudentMark();
            mark.setStudentID(rs.getInt("StudentID"));
            mark.setStudentName(rs.getString("StudentName"));
            mark.setSubject(rs.getString("Subject"));
            mark.setMarks(rs.getInt("Marks"));
            mark.setExamDate(rs.getDate("ExamDate"));
            list.add(mark);
        }
        con.close();
        return list;
    }
}
