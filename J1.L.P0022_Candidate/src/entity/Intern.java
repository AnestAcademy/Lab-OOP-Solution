package entity;

import util.IConstant;
import util.Validate;

import java.util.List;

public class Intern extends Candidate {

    private String major;
    private int semester;
    private String university;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type, String major, int semester, String university) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    /**
     * Create a intern.
     *
     * @param list the list to store candidate
     */
    public void create(List<Candidate> list) {
        super.create(list);
        this.major = Validate.getString("Enter major: ", "Invalid major.", IConstant.TEXT);
        this.semester = Validate.getInt("Enter semester: ", 1, 100);
        this.university = Validate.getString("Enter university: ", "Invalid university.", IConstant.TEXT);
        this.setType(2);
    }
}
