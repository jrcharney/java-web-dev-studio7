package org.launchcode.studio7;

public class DVD extends BaseDisc /*implements Spinnable*/ {
    private String title;
    public DVD(){
        super();
    }
    public DVD(String title, String genre, int year, int storageCapacity){
        this();
        this.title = title;
        this.setGenre(genre);
        this.setYear(year);
        this.setStorageCapacity(storageCapacity);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void spinDisc() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Genre:" + this.getGenre());
        System.out.println("Year: " + this.getYear());
        System.out.println("Capacity:" + this.getStorageCapacity() + "MB");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
