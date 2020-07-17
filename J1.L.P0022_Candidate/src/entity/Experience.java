package entity;

import util.IConstant;
import util.Validate;

import java.util.List;

public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    /**
     * Create a experience.
     *
     * @param list the list to store candidate
     */
    public void create(List<Candidate> list) {
        super.create(list);
        this.expInYear = Validate.getInt("Enter year of experience: ", 1, 100);
        this.proSkill = Validate.getString("Enter pro skill: ", "Invalid skill.", IConstant.TEXT);
        this.setType(0);
    }
}
