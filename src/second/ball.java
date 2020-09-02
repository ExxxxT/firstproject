package second;
import java.lang.*;
public class ball {
    private String color;
    private String description;
    public ball(String c, String d){
        color = c;
        description = d;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getColor(String color){
        return color;
    }
    public String getDescription() {
        return description;
    }
    public String toString(){
        return this.color + ", " + this.description;
    }
}