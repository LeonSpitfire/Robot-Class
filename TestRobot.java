/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

import java.util.HashSet;
/**
 *
 * @author egmck
 */
public class TestRobot {
     public static void main(String[] args) {
        //Created and declared the robot objects(Set r1 to Roberto, r2 to Maria) and shows their names to the screen for the user
        Robot r1 = new Robot(); 
         System.out.println("The Robot's Name is: " + r1.getName() + " and their battery level currently is: " + r1.getBattery());
         
        Robot r2 = new Robot("Maria", 80, "silver", "noodles", "Taylor Swift");
        System.out.println("This Robot's name is: " + r2.getName() + ", their battery level is currently ar: " + r2.getBattery());
         
        //Declares and shows both to the screen at the same time with name,color,battery, music, cook.
        Robot r3 = new Robot();
         {
             System.out.println("This Robot's Name is: " + r1.getName() + " their battery level is currently: " + r1.getBattery() + "%" + ", their color is also: " + r1.getColor() + ", their cook style is " + r1.getCook() + ", and can play music by " + r1.getMusic());
             System.out.println("This other Robot's Name is: " + r2.getName() + ", their battery is at: " + r2.getBattery() + "%" + ", and the color of this robot is: " + r2.getColor() + ", their cook style is " + r2.getCook() + ", and can play music by " + r2.getMusic());
         }
         //Uses the toString method or function and shows them to the user
         Robot r4 = new Robot();
         {
            // System.out.println("Second r1 toString");
             System.out.println(r1.toString());
             //System.out.println("Third r2 toString");
             System.out.println(r2.toString());
             System.out.println("\n");
            
         }
         //Sets the battery and color methods of each robot to a different number and color and saves it to the toString obj and prints to screen
         // Shows the current toString obj method showing that nothing has changed in r5 and only r1 and r2.
         //Sets the cook option to a different food and shows it to the user.
         //Shows the music operator and sets it to a different artist and shows it to the user
         Robot r5 = new Robot();
         {
             r1.setBattery(56);
             r1.setColor("green");
             r1.SetCook("steak");
             r1.SetMusic("Ed Sheeren");
             System.out.println(r1.toString());
             
             r2.setBattery(41);
             r2.setColor("gold");
             r2.SetCook("TeddyBear Casserole");
             r2.SetMusic("Lauren Daigle");
             //r2.setColor(gold);
             System.out.println(r2.toString());
             
             System.out.println(r5.toString());
         }
         //Sets the first unique method and shows it to the user as the recharged battery levels
         //Sets the second unique method and shows it to the user as the cook method.
         //Sets the third unique method music and shows it to the user as the music method//
         //Sets both robots battery levels to better ones for reacharging. Shows the new battery levels to the user
         //Shows the user the name, new recharged battery levels and their new colors as well as cook and music
         Robot r6 = new Robot();
         {
             r2.recharge(45);
             r1.recharge(29);
             
             System.out.println("The New and recharged battery levels are below!\n");
             
             System.out.println("Robot: " + r1.getName() + " has a new,recharged battery of: " + r1.getBattery() + "% battery left.");
             System.out.println("Robot: " + r2.getName() + " has a new and better reacharged battery of: " + r2.getBattery() + "% left");
             //Should be 85% and 86%, r1 and r2.
             
             System.out.println("The new Music Choices for both robots are below too!");
             
             System.out.println("The Robot named: " + r1.getName() + " has the color of: " + r1.getColor() + ", can play music by artist: " + r1.getMusic() + ", while cooking: " + r1.getCook() + ", and lastly their battery level is at " + r1.getBattery()+ "%!");
             System.out.println("The Robot named: " + r2.getName() + " has the color of: " + r2.getColor() + ", can play music by artist: " + r2.getMusic() + ", while cooking: " + r2.getCook() + ", and lastly their battery level is at " + r2.getBattery()+ "%!");
             
             System.out.println("");
             System.out.println("The Robot named: " + r1.getName() + ", has a color of: " + r1.getColor() + ", this robot also has a newly recharged batter of: " + r1.getBattery() + "% battery left!");
             System.out.println("The other Robot named: " + r2.getName() + ", also has a battrey percent of: " + r2.getBattery() +"% , With a new color of: " + r2.getColor());
             
             //Final say and printing out to the screen for FULL FUNCTIONITY OF ALL THINGS WORKING AND UNIQUE!
             System.out.println("");
             System.out.println("The Robot named: " + r1.getName() + ", has a battery percent of: " + r1.getBattery() + "%, Also has the color: " + r1.getColor() + " on them, and can cook " + r1.getCook() + " for you when you get sick or whenever, while you listen to the music played by: " + r1.getMusic());
             System.out.println("The other Robot named: " + r2.getName() + ", has the color: " + r2.getColor() + " painted on them. They currently have " + r2.getBattery() + "% battery left and can cook " + r2.getCook() + " whenever you want while you listen to any of " + r2.getMusic() + " songs about life!");
         }
         
    }
}

