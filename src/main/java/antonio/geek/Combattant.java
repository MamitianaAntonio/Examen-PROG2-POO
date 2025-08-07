package antonio.geek;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Combattant {
    private String identifiant;
    private String nom;
    private String prenom;
    private String nomDeCombatant;
    private double poids;
    private List<String> listeDeTitres;
}
