/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentinfo;

/**
 *
 * @author Gagandeep kooner
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Studentinfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        Student[] s2 = new Student[5];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <s2.length; i++){
            s2[i] = new Student();
            System.out.println("enter name of students: ");
            s2[i].setName(input.nextLine());
             
        }
        for(Student s : s2){
            System.out.println("names: "+s.getName());
           
        }
        
        
       
    }

}
