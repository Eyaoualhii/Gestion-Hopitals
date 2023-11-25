import java.util.HashMap;
import java.util.Map;

public class Hopital {

    public Map<Medecin,ListPatients> medecinPatiens;


    public Hopital(){
        medecinPatiens=new HashMap<>();

    }

    public void ajouterMedecin(Medecin m){
        medecinPatiens.put(m,new ListPatients());
    }

    public void ajouterPatient(Medecin m,Patient p){
        if(medecinPatiens.containsKey(m)){

         medecinPatiens.get(m).ajouterPatient(p);
        }else {
            ajouterMedecin(m);
            medecinPatiens.get(m).ajouterPatient(p);
        }
    }
    /*Avec l'api stream */
    public void afficherMap(){
       medecinPatiens.entrySet().stream().forEach(entry -> { System.out.println("Medecin: " + entry.getKey());
           System.out.println("Patients:");
           entry.getValue().afficherPatients();        });
    }

    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedcinPatients (Medecin m){
        medecinPatiens.entrySet().stream().filter(entry -> entry.getKey().getNom().equals("mohamed")).forEach(entry -> {
            System.out.println("Medecin: " + entry.getKey());
            System.out.println("Patients:");
            entry.getValue().afficherPatients();        });
    }


}
