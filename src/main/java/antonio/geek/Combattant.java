package antonio.geek;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Combattant {
    private String identifiant;
    private String nom;
    private String prenom;
    private String nomDeCombatant;
    private double poids;
    private List<String> listeDeTitres;

    public Combattant(String identifiant, String nom, String prenom, String nomDeCombatant, double poids) {
       this.identifiant = identifiant;
       this.nom = nom;
       this.prenom = prenom;
       this.nomDeCombatant = nomDeCombatant;
       this.poids = poids;
       this.listeDeTitres = new ArrayList<>();
    }
}
