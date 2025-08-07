package antonio.geek;

import java.time.LocalDate;

public class MatchAmicaux extends Match{
    public MatchAmicaux(String identifiant, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        super(identifiant, date, endroit, combattant1, combattant2);
    }
}
