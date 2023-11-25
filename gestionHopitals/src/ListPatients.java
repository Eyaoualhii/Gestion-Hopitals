import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListPatients implements InterfacePatient{


    private List<Patient> listP;

    public ListPatients(){
     listP=new ArrayList<>();
    }


    public List<Patient> getListP() {
        return listP;
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        return listP.stream().anyMatch(p2->p2.equals(p));
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
    return  listP.stream().anyMatch(p2->p2.getCin()==cin);
    }
    /* Avec l’api Stream */
    public void afficherPatients() {
       listP.stream().forEach(p-> System.out.println(p));
    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {
    listP.stream().sorted(Comparator.comparing(Patient::getNom)).forEach(p-> System.out.println(p));
    }
    /* Avec l'api stream */
    public void PatientSansRedondance(){
       listP.stream().distinct().forEach(p-> System.out.println(p));
    }


}
