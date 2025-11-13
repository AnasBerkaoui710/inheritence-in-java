import java.util.ArrayList;

import java.util.Scanner;
import java.util.*;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Student> etudiants = new ArrayList<>();
    public static ArrayList<Instructeur> instructeurs = new ArrayList<>();
    public static ArrayList<Cour> cours = new ArrayList<>();
    ArrayList<Cour> coursInscrits = new ArrayList<>();


    public void main(String[] args){



        int choice;


    do {
    System.out.println("=============== E-learning Smart app ===============");
    System.out.println("1.Ajouter un étudiant");
    System.out.println("2.Ajouter un instructeur");
    System.out.println("3.Ajouter un cour");
    System.out.println("4.Inscrire un étudiant à un cour");
    System.out.println("5.Assigner un instructeur à un cour");
    System.out.println("6.Afficher les détails d’un cour");
    System.out.println("7.Quitter");

    System.out.print("entrer un choix: ");

    choice = scanner.nextInt();
    scanner.nextLine();

    switch(choice){
        case 1:
            addStudent();
            break;
        case 2:
            addInstructeur();
            break;
        case 3:
            addCour();
            break;
        case 4:

            break;
        case 5:

            break;
        case 6:

            break;
        default:
            System.out.println("Entrer une valeur entre 1<= et 7>=");



    }
}while(choice !=7);

}

    public static void addStudent(){
        System.out.print("Entrer l'id de l'étudiant :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrer le nom de l'étudiant :");
        String name=scanner.nextLine();

        System.out.print("Entrer l'Email de l'étudiant :");
        String email = scanner.nextLine();
        



        etudiants.add(new Student(id,name,email));
        System.out.println("Etudiant ajouté avec succés!!");



    }
    public static void addInstructeur(){
        System.out.print("Entrer l'id de l'instructeur :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Entrer le nom de l'instructeur :");
        String name=scanner.nextLine();

        System.out.print("Entrer la specialisation de l'instructeur :");
        String specialisation=scanner.nextLine();

        instructeurs.add(new Instructeur(id,name,specialisation));

        System.out.println("Instructeur ajouté avec succés!!");
    }

    public void addCour(){
        System.out.println("Entrer l'id du cour :");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Entrer le titre du cour :");
        String titre = scanner.nextLine();

        System.out.println("Entrer la description du cour :");
        String description = scanner.nextLine();

        cours.add(new Cour(id,titre,description));

        System.out.println("Cour ajouté avec succés!!");

    }

    public void inscrireEtudiant(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l’ID de l’étudiant :");
        int id = scanner.nextInt();

        System.out.print("Entrez l’ID du cours :");
        int idcour = scanner.nextInt();


        for(int i=0; i<etudiants.size(); i++){
            if (id == etudiants.get(i).idStudent) {
                for (int j=0;j<cours.size();j++){
                    if (idcour == cours.get(i).idCour){
                        //coursInscrits.add(new Cour());
                    }
                }
            }
        }



    }





}


