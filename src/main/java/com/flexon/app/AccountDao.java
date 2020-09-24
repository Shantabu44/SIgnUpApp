package com.flexon.app;

import java.util.ArrayList;

public class AccountDao {

	private ArrayList<User> accountList = new ArrayList<>();

    public void addAccount(User user) {
        accountList.add(user);
    }

    public void removeAccount(String email) {
        accountList.removeIf(t -> t.getEmail() == email);
        System.out.println("Deleted : " + email);
    }

    public void printAccounts() {
        for (User contact : accountList)
            System.out.println(contact.getName() + " " + contact.getEmail() + " " + contact.getDob() + " " + contact.getGender());
    }

    public void updateAccount(User account, String name, String email, String dob) {
        account.setEmail(email);
        account.setName(name);
        account.setDob(dob);

    }
}
