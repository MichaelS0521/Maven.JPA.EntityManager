package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cd {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int cd_Id;

    private String title;
    private String description;
    private int year;
    private String artist;
    private float price;

    public Cd(int cd_Id, String title, String description, int year, String artist, float price) {
        this.cd_Id = cd_Id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.artist = artist;
        this.price = price;
    }

    public int getCd_Id() {
        return cd_Id;
    }

    public void setCd_Id(int cd_Id) {
        this.cd_Id = cd_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
