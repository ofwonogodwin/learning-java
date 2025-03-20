/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstjavaproject;

import java.util.Scanner;
public class FirstJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The code below just prints some few words
        System.out.println("Hello Java Devs");
        System.out.println("Am glad to be coding Java Today. Welcome All beginers");
        //Playing around with variables
        String name = "Ofwono";
        int myage = 22;
        //here lets Concantenate the variables. w use +
        System.out.println("My name is "+name+" and am "+myage+" years Old");
        
        //Copying Variable Values
        int herAge = myage;
        System.out.println("She is " +herAge+" years old");
        
        int temp = 40;
        System.out.println("The Temperature in Sudan is "+temp);
        
        int egyptTemp = temp;
        System.out.println("The Temperature in Egypt is "+egyptTemp+" Degrees Cell");
        
        //Variable Types In Java
        //bytes,short,it,long,float,double,char,bolean
        
        char grade = 'A';
        System.out.println(name+ " scored Grade'" +grade+"' In structured Programming");
        
        //longs
        long youTubeViews = 3_123_456_798L;
        String video = "Machine Learning";
        System.out.println(name+ " got " +youTubeViews+" in the "+video+ "on You Tube");
        
        //Booleans
        boolean isEligible = false;
        System.out.println(name+ "'s eligiblity for the Loan is "+isEligible);
        
        //Conantenating /joining strings
        String names = "Godwin"+" Ofwono";
        System.out.println("My names are "+ names);
        
        //Lets Play around with some methods
        String message = "Hello Guys";
        System.out.println(message.length());
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        
        //Dealing with Arrays
        //int[] numbers = {1,2,3,4,5,1,4};
        //System.out.println(numbers);
        //System.out.println(Arrays.tostring(numbers));
        
        //Reading Input In Java. The scanner Object is very essential here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age :");
        int maAge = scanner.nextInt();
        System.out.println("You are "+maAge+" years old");
        
        //Lets Try Another simple one That allows U to input full Names and gives Results.
        Scanner naming = new Scanner(System.in);
        System.out.print("Enter Your Full names Here :");
        String nam = naming.nextLine();
        System.out.println("Ur full  Names Are : "+nam);
                
    }
    
}
