import java.util.ArrayList;
import java.util.List;


public class Student {
    public int idStudent;
    public String name;
    public String Email;
    public List<Cour> coursInscrits = new ArrayList<>();


    public ArrayList<String> students = new ArrayList<>();

    Student(int idStudent, String name,String Email){
        this.Email=Email;
        this.name=name;
        this.idStudent=idStudent;
    }
    public void inscrire(Cour c){
        coursInscrits.add(c);

    }

    public void afficherCours(){

    }




}
