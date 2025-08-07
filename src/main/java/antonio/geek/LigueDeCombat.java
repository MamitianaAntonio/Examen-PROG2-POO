package antonio.geek;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class LigueDeCombat {
    private String nom;
    private List<Combattant> combatants;
    private List<Match> matches;
}
