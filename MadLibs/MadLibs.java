import java.util.Scanner;

public class MadLibs {
  /*
    This program generates a mad libbed story.
    Author: Olly
    Date: 12/6/2024
  */
      public static void main(String[] args){

      Scanner obj = new Scanner(System.in);

      System.out.println("Enter a name: ");
      String name1 = obj.nextLine();
      System.out.println("Enter another name: ");
      String name2 = obj.nextLine();

      System.out.println("Enter a number: ");
      int number = obj.nextInt();
      obj.nextLine();

      String stringNumber = Integer.toString(number);

      System.out.println("Enter a verb: ");
      String verb = obj.nextLine();

      System.out.println("Enter a adjective: ");
      String adjective1 = obj.nextLine();
      System.out.println("Enter a second adjective: ");
      String adjective2 = obj.nextLine();
      System.out.println("Enter a third adjective: ");
      String adjective3 = obj.nextLine();

      System.out.println("Enter a noun: ");
      String noun1 = obj.nextLine();
      System.out.println("Enter a second noun: ");
      String noun2 = obj.nextLine();
      System.out.println("Enter a third noun: ");
      String noun3 = obj.nextLine();
      System.out.println("Enter a fourth noun: ");
      String noun4 = obj.nextLine();
      System.out.println("Enter a fifth noun: ");
      String noun5 = obj.nextLine();
      System.out.println("Enter a sixth noun: ");
      String noun6 = obj.nextLine();

      System.out.println("Enter a placename: ");
      String place = obj.nextLine();
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}