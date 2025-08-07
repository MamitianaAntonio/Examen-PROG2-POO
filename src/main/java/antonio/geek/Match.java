package antonio.geek;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Match {
    private String identifiant;
    private LocalDate date;
    private String endroit;
    private Combattant combattant1;
    private Combattant combattant2;
}
