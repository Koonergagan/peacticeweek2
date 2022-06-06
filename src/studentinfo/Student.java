/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package studentinfo;

/**
 *
 * @author Gagandeep kooner
 */
public class Student {
    private String name;
    private String program;
    public Student(){
        
    }
    public Student(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    

}
