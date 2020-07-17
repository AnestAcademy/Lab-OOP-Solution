package mock;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock initial data.
 */
public class Data {
    
    public static List<Candidate> listCandidate = new ArrayList<Candidate>() {
        {
            add(new Experience(1, "Aguirre", "Eva", 1990, "Sao paulo", "0973444555", "eva@asante.com", 0, 4, "Java, SQL"));
            add(new Intern(2, "Maria", "Madeleine", 1998, "Paris", "0972333121", "madeleine@asante.com", 2, "SE", 4, "FPT University"));
            add(new Intern(3, "Joana", "Filipa", 1999, "Chicago", "0972333000", "filipa@asante.com", 2, "SE", 2, "Harvard University"));
            add(new Intern(4, "Mai", "Nguyen", 1999, "Vietnam", "0961123455", "mai-nguyen@gmail.com", 2, "SE", 5, "FPT University"));
            add(new Fresher(5, "Calderon", "Cuevas", 1990, "San francisco", "0923449898", "cuevas@outlook.com", 1, 2012, "Good", "Harvard University"));
            add(new Experience(6, "Ahlgren", "Maria", 1988, "Sao paulo", "0909678876", "maria@asante.com", 0, 7, "Java, C#"));
            add(new Fresher(7, "Cabrera", "Cornide", 1997, "San francisco", "0933449800", "cornide@gmail.com", 1, 2012, "Excellence", "Harvard University"));
        }
    };
}
