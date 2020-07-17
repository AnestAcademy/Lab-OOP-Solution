package bo;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import util.Helper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Candidate Business Object
 */
public class CandidateBo {

    private List<Candidate> list;

    public CandidateBo() {
        this.list = new ArrayList<>();
    }

    public CandidateBo(List<Candidate> list) {
        this.list = list;
    }

    /**
     * Display list candidate.
     */
    public void display() {
        list.sort(Comparator.comparingInt(Candidate::getType));

        System.out.println("List of candidate:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        int i = 0;
        for (Candidate c : this.list) {
            if (c.getType() == 1 && i == 0) {
                System.out.println("=============FRESHER CANDIDATE=============");
                i++;
            }
            if (c.getType() == 2 && i == 1) {
                System.out.println("=============INTERN CANDIDATE==============");
                i++;
            }
            c.displayFullName();
        }
    }

    /**
     * Add candidate to list.
     *
     * @param type type of candidate
     */
    public void add(int type) {
        Candidate c = null;
        do {
            switch (type) {
                case 0:
                    c = new Experience();
                    break;
                case 1:
                    c = new Fresher();
                    break;
                case 2:
                    c = new Intern();
                    break;
            }
            c.create(list);
            list.add(c);
        } while (Helper.isContinue());
    }

    /**
     * Search candidate in the list.
     *
     * @param searchName name to search (first name or last name)
     * @param type       type of candidate
     * @return list result
     */
    public List<Candidate> search(String searchName, int type) {
        List<Candidate> list = new ArrayList<>();

        for (Candidate c : this.list) {
            String fullName = c.getFirstName() + " " + c.getLastName();
            if (fullName.toLowerCase().contains(searchName.toLowerCase()) && c.getType() == type) {
                list.add(c);
            }
        }
        return list;
    }

    /**
     * Display list result candidate.
     *
     * @param listResult list candidate to display
     */
    public void displayResultSearch(List<Candidate> listResult) {
        if (listResult.isEmpty()) {
            System.out.println("\nNot found.");
        } else {
            System.out.println("\nThe candidates found: ");
            listResult.forEach(System.out::println);
        }
    }

}
