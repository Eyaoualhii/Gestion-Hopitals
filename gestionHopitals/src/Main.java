public class Main {
    public static void main(String[] args) {
        
        Hopital h = new Hopital();
        Medecin m = new Medecin(1, "mohamed", "test", 1);
        h.ajouterPatient(m, new Patient(2, "test1", "test1", 1));
        h.ajouterPatient(new Medecin(1, "test2", "test2", 2), new Patient(2, "test1", "test1", 1));
        h.afficherMedcinPatients(m);
        h.afficherMap();
    }
}