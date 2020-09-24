package com.flexon.app;

public class AccountUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao accountList = new AccountDao();

        User user1 = new User("Shan", "shan@smu.edu", "12/08/1994", "M", "1234567");
        User user2 = new User("Shan1", "shan1@smu.edu", "12/08/1996", "M", "12345678");
        User user3 = new User("Shan2", "shan2@smu.edu", "12/08/1996", "M", "12345678");
        User user4 = new User("Shan3", "shan3@smu.edu", "12/08/1996", "M", "12345678");
        accountList.addAccount(user1);
        accountList.addAccount(user2);
        accountList.addAccount(user3);
        accountList.addAccount(user4);
        accountList.printAccounts();
        accountList.removeAccount("shan1@smu.edu");
        accountList.printAccounts();
        accountList.updateAccount(user3, "Vibhu Grover", "test@smu.edu", "12/08/1998");
        accountList.printAccounts();

    }
	

}
