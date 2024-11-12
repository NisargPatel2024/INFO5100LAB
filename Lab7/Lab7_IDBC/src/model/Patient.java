package model;

//import javax.swing.ImageIcon;
/**
 *
 * @author nisarg
 */
public class Patient {
    
    private int id;
    private String firstName;
    private String lastName;
    
    private String gender;
    private String patientType;
    
    private String age;
    private String email;
    
    private String message;
    
    
//    private ImageIcon profilePicture;
    
    public int getId() {
        return id;
    }

//    Methods public
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

//    public ImageIcon getProfilePicture() {
//        return profilePicture;
//    }
//
//    public void setProfilePicture(ImageIcon profilePicture) {
//        this.profilePicture = profilePicture;
//    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}