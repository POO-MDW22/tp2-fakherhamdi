public class testpersonne {
    public class TestPersonne {
        public static void main(String[] args) {
            Personne personne = new Personne();

            personne.setName("fakher");
            personne.setFirstName("hamdi");
            personne.setDateNaiss(18, 10, 2002);

            System.out.println("nom : " + personne.Name);
            System.out.println("Prenom : " + personne.firstName);
            System.out.println("Date de naissance : " + personne.dayNaiss + "/" + personne.monthNaiss + "/" + personne.yearNaiss);
            System.out.println("Age en 2023 : " + personne.ageEn2023() + " ans");
        }
    }
}
