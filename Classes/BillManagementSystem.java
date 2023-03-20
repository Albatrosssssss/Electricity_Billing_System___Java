package Classes;

import Interfaces.IMeterOperations;
import Interfaces.IUserOperations;

public class BillManagementSystem implements IMeterOperations, IUserOperations {
    private User users[];
    private Meter meters[];
    public BillManagementSystem() {
        users = new User[100];
        meters = new Meter[100];
    }
    @Override
    public boolean addNewUser(User user) {
        // TODO Auto-generated method stub
        boolean flag = false;
        for(int i=0; i<users.length; i++) {
            if(users[i] == null) {
                users[i] = user;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean removeUser(String id) {
        // TODO Auto-generated method stub
        boolean flag = false;
        for(int i=0; i<users.length; i++) {
            if(users[i].getId().equals(id)) {
                users[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public User searchUser(String id) {
        // TODO Auto-generated method stub
        User flag = null;
        for(int i=0; i<users.length; i++) {
            if(users[i].getId().equals(id)) {
                flag = users[i];
                break;
            }
        }
        return flag;
    }
    @Override
    public void showAllUsers() {
        // TODO Auto-generated method stub
        for(int i=0; i<users.length; i++) {
            if(users[i] != null) {
                users[i].showDetails();
            }
        }
    }
    @Override
    public boolean addNewMeter(Meter Meter) {
        // TODO Auto-generated method stub
        boolean flag = false;
        for(int i=0; i<meters.length; i++) {
            if(meters[i] == null) {
                meters[i] = Meter;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean removeMeter(String no) {
        // TODO Auto-generated method stub
        boolean flag = false;
        for(int i=0; i<meters.length; i++) {
            if(meters[i].getMeterNo().equals(no)) {
                meters[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public Meter searchMeter(String id) {
        // TODO Auto-generated method stub
        Meter flag = null;
        for(int i=0; i<meters.length; i++) {
            if(meters[i].getMeterNo().equals(id)) {
                flag = meters[i];
                break;
            }
        }
        return flag;
    }
    @Override
    public void showAllMeters() {
        // TODO Auto-generated method stub
        for(int i=0; i<meters.length; i++) {
            if(meters[i] != null) {
                meters[i].showDetails();
            }
        }
    }
}