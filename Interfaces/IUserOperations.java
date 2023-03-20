package Interfaces;

import Classes.User;

public interface IUserOperations {
    boolean addNewUser(User user);
    boolean removeUser(String id);
    User searchUser(String id);
    void showAllUsers();
}
