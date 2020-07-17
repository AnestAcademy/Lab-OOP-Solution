package main;

import bo.CandidateBo;
import mock.Data;
import util.Helper;
import util.IConstant;
import util.Validate;

public class CandidateManager {

    public static void main(String[] args) {

        // load list Candidate from mock data
        CandidateBo candidateBo = new CandidateBo(Data.listCandidate);

        boolean flag = true;
        do {
            Helper.menu();
            int choice = Validate.getInt("Enter your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    candidateBo.add(0);
                    break;
                case 2:
                    candidateBo.add(1);
                    break;
                case 3:
                    candidateBo.add(2);
                    break;
                case 4:
                    candidateBo.display();
                    String text = Validate.getString("\nInput Candidate name (First name or Last name): ", "Invalid name.", IConstant.NAME);
                    int type = Validate.getInt("Input type of candidate [0-2]: ", 0, 2);
                    candidateBo.displayResultSearch(candidateBo.search(text, type));
                    break;
                case 5:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
