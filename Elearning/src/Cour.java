import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cour {
    public int idCour;
    public String Title;
    public String Description;


    //public Instructeur instructeur;


    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Instructeur> instructeurs = new ArrayList<>();



    Cour(int idCour, String Title, String Description){
        this.idCour=idCour;
        this.Title=Title;
        this.Description=Description;
    }

    public void displayCour(){
        System.out.println("CourseId: "+idCour);
        System.out.println("Course Title: "+Title);
        System.out.println("Course description: "+Description);
    }


    public void inscrireInstructeur(Instructeur i){

    }

    public void addInstructeur(Instructeur i){

    }

    public void addStudent(Student s){
        students.add(s);

    }





}
