package at.sarah.oo.PhoneExercise;

import at.sarah.oo.Lamp.Glowelement;

import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private ArrayList<PhoneFile> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void safeFile(PhoneFile phoneFile) {
        this.phoneFiles.add(phoneFile);
    }

    public void getAllFiles() {
        for (int i = 0; i < phoneFiles.size(); i++) {
            System.out.println(phoneFiles.get(i).getAllInfo());
        }
    }

    public int getFreeSpace() {
        int sumOfMB = 0;
        for (int i = 0; i < phoneFiles.size(); i++) {
            sumOfMB += phoneFiles.get(i).getSizeInMB();
        }
        return capacity - sumOfMB;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<PhoneFile> getAllPhoneFiles() {
        return phoneFiles;
    }
}
