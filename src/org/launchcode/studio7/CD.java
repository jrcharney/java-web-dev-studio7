package org.launchcode.studio7;

public class CD extends BaseDisc /*implements Spinnable*/ {
    public String artist;
    public String album;
    public CD(){
        super();
    }

    public CD(String artist, String album, String genre, int year, int storageCapacity){
        this();
        this.artist = artist;
        this.album = album;
        this.setGenre(genre);
        this.setYear(year);
        this.setStorageCapacity(storageCapacity);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void spinDisc() {
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Album: " + this.getAlbum());
        System.out.println("Genre:" + this.getGenre());
        System.out.println("Year: " + this.getYear());
        System.out.println("Capacity:" + this.getStorageCapacity() + "MB");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
