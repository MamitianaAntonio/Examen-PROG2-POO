package antonio.geek;

import java.time.LocalDate;

public class MatchPourUnTitre extends Match {
    private String titre;

    public MatchPourUnTitre(String identifiant, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        super(identifiant, date, endroit, combattant1, combattant2);
        this.titre = titre;
    }

    @Override
    public void terminer () {

    }
}
