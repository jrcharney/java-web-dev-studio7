package org.launchcode.studio7;

/**
 * For BaseDisc:
 * 1. Create an abstract BaseDisc class and declare the fields used by both CD and DVD.
 * 2. Code the shared constructors, getters, setters, and custom methods.
 *
 * For CD and DVD:
 * 1. Extend the base class into the CD and DVD classes.
 * 2. Implement the interface in each class.
 * 3. Fill in the @Override code for each of the interface methods.
 */
abstract public class BaseDisc {
    private int year;
    private int storageCapacity;
    private String genre;
    BaseDisc(){}

    BaseDisc(int year, int storageCapacity){
        this();
        this.year = year;
        this.storageCapacity = storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    abstract void spinDisc();
}
