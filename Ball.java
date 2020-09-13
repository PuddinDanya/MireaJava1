package Myachik;

import java.lang.*;
public class Ball {
    private String color;
    private int size;
    private String type;
    public Ball(String n, int a, String b){
        color = n;
        size = a;
        type = b;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getSize() {
        return size;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(String type){
        return type;
    }
    public void pechat(){
        System.out.println("Color:"+color+", Size:"+size+", Type:"+type);
    }
}
