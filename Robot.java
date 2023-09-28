/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robot;

/**
 *
 * @author egmck
 */
public class Robot {
    //Creates and initializes all the private variables. 3 basic good working ones and 2 that are unique to this class and project
    private String name;
    private int battery;
    private String color;
    private String cook;
    private String music;

    // The Default constructor for the whole project.
    public Robot() {
        name = "Roberto";
        battery = 100;
        color = "red";
        cook = "ramen";
        music = "Beethoven";
    }

    // This is the Constructor with parameters for all the variables and things in this project
    public Robot(String name, int battery, String color, String cook, String music) {
        this.name = name;
        this.battery = battery;
        this.color = color;
        this.cook = cook;
        this.music = music;
    }

    // The Getter methods for the name variable
    public String getName() {
        return name;
    }
// The Setter methods for the name variable
    public void setName(String name) {
        this.name = name;
    }

    //The Getter methods for  the Battery variable
    public int getBattery() {
        return battery;
    }
//The Setter methods for the Battery variable
    public void setBattery(int battery) {
        this.battery = battery;
    }

    //The Getter methods for the Color variable
    public String getColor() {
        return color;
    }
//The Setter methods for the Color variable
    public void setColor(String color) 
    {
        this.color = color;
    }
    //The Getter methods for the Cook variable
    public String getCook()
    {
        return cook;
    }
    //The Setter methods for the Cook variable
    public void SetCook(String cook)
    {
        this.cook = cook;
    }
    //The Getter methods for the Music variable
    public String getMusic()
    {
        return music;
    }
    //The Setter methods for the Music variable
    public void SetMusic(String music)
    {
        this.music = music;
    }
    /**
     *
     * @return
     */
    // The toString method to format object outputs to the user good.
    @Override
    public String toString() {
        return "This Robot's name is: " + name + ", their battery is currently at: " + battery + "%" + ", their color is: " + this.color + ". They can cook items like: " + this.cook + ", as well as play music, like: " + this.music + ".";
    }
//The public void method for the recharge unique method from battery method
    public void recharge(int amount) {
        battery += amount;
        System.out.println("The robot named: " + name + " is running low on battery, they have been recharged by " + amount + " volt units.");
    }
}
