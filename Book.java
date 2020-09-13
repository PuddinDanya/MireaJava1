package Kniga;

import java.lang.*;
public class Book {
    private String name;
    private int page;
    private String genre;
    public Book(String n, int a, String b){
        name = n;
        page = a;
        genre = b;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage(int page) {
        return page;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre(String genre){
        return genre;
    }
    public void pechat(){
        System.out.println("Name:"+name+", Page:"+page+", Genre:"+genre);
    }
}
