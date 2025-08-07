package antonio.geek;

import java.time.LocalDate;

public class MatchOfficielle extends Match {
    private String titre;

    public MatchOfficielle(String identifiant, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2, String titre) {
        super(identifiant, date, endroit, combattant1, combattant2);
        this.titre = titre;
    }

    @Override
    public void terminer () {

    }
}
