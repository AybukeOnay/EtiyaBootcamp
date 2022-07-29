package entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int id;
    private String name;
    private final List<BankUser> bankUsers = new ArrayList<>();

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<BankUser> getBankUsers() {
        return bankUsers;
    }
}
