package entity;

import util.Helper;
import util.IConstant;
import util.Validate;

import java.util.List;

public class Fresher extends Candidate {

    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    /**
     * Returns graduation rank.
     *
     * @return the string value
     */
    private String getSelectGraduationRank() {
        System.out.println(" 1. Excellence");
        System.out.println(" 2. Good");
        System.out.println(" 3. Fair");
        System.out.println(" 4. Poor");

        int choice = Validate.getInt("Select graduation rank: ", 1, 4);

        switch (choice) {
            case 1:
                return "Excellence";
            case 2:
                return "Good";
            case 3:
                return "Fair";
            case 4:
                return "Poor";
        }
        return "none";
    }

    /**
     * Create a fresher.
     *
     * @param list the list to store candidate
     */
    public void create(List<Candidate> list) {
        super.create(list);
        this.graduationDate = Validate.getInt("Enter graduation time: ", 1900, Helper.getCurrentYear());
        this.graduationRank = getSelectGraduationRank();
        this.education = Validate.getString("Enter education: ", "Invalid education.", IConstant.TEXT);
        this.setType(1);
    }
}
