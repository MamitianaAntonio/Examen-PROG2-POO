package antonio.geek;

import java.time.LocalDate;

public class MatchOfficielle extends Match {
    public MatchOfficielle(String identifiant, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        super(identifiant, date, endroit, combattant1, combattant2);
    }
}
