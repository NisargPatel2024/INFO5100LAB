/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author nisarg
 */
public class DatabaseConnector {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "my-secret-pw";

    // C - Create: Inserting data into the database
    public static void addPatient(Patient p1) throws SQLException {

        String query = "INSERT INTO patient(firstName, lastName, gender, patientType, age, email, message) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getFirstName());
            stmt.setString(2, p1.getLastName());
            stmt.setString(3, p1.getGender());
            stmt.setString(4, p1.getPatientType());
            stmt.setString(5, p1.getAge());
            stmt.setString(6, p1.getEmail());
            stmt.setString(7, p1.getMessage());

            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted " + rows);
            conn.close();
            
        } catch (SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // R - Read
    public static ArrayList<Patient> getPatients() {
        ArrayList<Patient> patients = new ArrayList();
        String query = "SELECT * FROM patient";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFirstName(rs.getString("firstName"));
                p1.setLastName(rs.getString("lastName"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patientType"));
                p1.setAge(rs.getString("age"));
                p1.setEmail(rs.getString("email"));
                p1.setMessage(rs.getString("message"));
                patients.add(p1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return patients;
    }

    public static void getPatientName() {
        String query = "SELECT firstName, lastName FROM patient";
    }

    // U - Update
    public static void updatePatient(Patient oldPatient, Patient newPatient) {
        String query = "UPDATE patient SET firstName = ?, lastName = ?,gender = ?, patientType = ?, age = ?, email = ?, message = ? WHERE id= ?;";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newPatient.getFirstName());
            stmt.setString(2, newPatient.getLastName());
            stmt.setString(3, newPatient.getGender());
            stmt.setString(4, newPatient.getPatientType());
            stmt.setString(5, newPatient.getAge());
            stmt.setString(6, newPatient.getEmail());
            stmt.setString(7, newPatient.getMessage());
            stmt.setInt(8, oldPatient.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated " + rows);

            conn.close();
        } catch (SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // D - Delete
    public static void deletePatient(Patient p1) {
        String query = "DELETE FROM patient WHERE id = ? ;";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted " + rows);
            conn.close();
        } catch (SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
