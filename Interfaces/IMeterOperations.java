package Interfaces;

import Classes.Meter;

public interface IMeterOperations {
    boolean addNewMeter(Meter meter);
    boolean removeMeter(String id);
    Meter searchMeter(String id);
    void showAllMeters();
}
