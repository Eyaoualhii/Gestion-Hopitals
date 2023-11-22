import java.util.HashMap;
import java.util.Map;

public class Hopital {

    public Map<Medecin,ListPatients> medecinPatiens;
    ListPatients patients;

    public Hopital(){
        medecinPatiens=new HashMap<>();

    }

    public void ajouterMedecin(Medecin m){
        medecinPatiens.put(m,patients);
    }

    public void ajouterPatient(Medecin m,Patient p){
        if(medecinPatiens.containsKey(m)){

         medecinPatiens.get(m).ajouterPatient(p);
        }else {
           ajouterMedecin(m);
        ajouterPatient(m,p);}
    }
    /*Avec l'api stream */
    public void afficherMap(){
       medecinPatiens.forEach((m,p)-> System.out.println("Medecin: " + m + "patients :" +p));
    }

    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedcinPatients (Medecin m){
        if (medecinPatiens.containsKey(m)) {
            System.out.println("Patients du médecin " + m.getNom() + ": ");
            patients.afficherPatients();
        } else {
            System.out.println("Médecin non trouvé");
        }
    }

}
