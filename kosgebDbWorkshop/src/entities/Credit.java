package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credit {
    private int id;
    private String name;
    private LocalDate dateStarted;
    private final List<Application> applications = new ArrayList<>();
    private final List<CreditFeatures> creditFeatures = new ArrayList<>();

    public Credit() {
    }

    public Credit(int id, String name, LocalDate dateStarted) {
        this.id = id;
        this.name = name;
        this.dateStarted = dateStarted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public List<CreditFeatures> getCreditFeatures() {
        return creditFeatures;
    }
}
