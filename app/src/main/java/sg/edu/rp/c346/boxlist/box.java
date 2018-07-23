package sg.edu.rp.c346.boxlist;

/**
 * Created by 16030820 on 23/7/2018.
 */

public class box {

    private String color;

    public box(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "box{" +
                "color='" + color + '\'' +
                '}';
    }
}
