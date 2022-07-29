package entities;

import java.util.ArrayList;
import java.util.List;

public class BlackList {

    private final List<Applicant> applicants = new ArrayList<>();

    public BlackList() {
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }
}
