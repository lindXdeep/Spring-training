package lindx.spring.core.beans;

public class Car {

    private int speed;
    
    private String mark;

    public Car() {
    }

    public Car(int speed, String mark) {
        this.speed = speed;
        this.mark = mark;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
