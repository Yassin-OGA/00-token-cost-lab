package lab;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingRegistry;
import com.knuddels.jtokkit.api.EncodingType;
import com.knuddels.jtokkit.api.IntArrayList;

import java.util.List;

public class TokenCostLab {

    // Prix en dollars pour 1 million de tokens.
    // ⚠️ Valeurs d'EXEMPLE : va chercher les vrais tarifs sur les pages officielles (OpenAI, Anthropic).
    record ModelPricing(String name, double inputPerMillion, double outputPerMillion) {}

    static final List<ModelPricing> MODELS = List.of(
            new ModelPricing("modele-economique", 0.15, 0.60),
            new ModelPricing("modele-standard", 2.50, 10.00)
    );

    public static void main(String[] args) {
        EncodingRegistry registry = Encodings.newDefaultEncodingRegistry();
        Encoding encoding = registry.getEncoding(EncodingType.O200K_BASE);

        String text = "Bonjour, je construis mon premier laboratoire de tokens !";

        // ÉTAPE 1 — Compter les tokens
        // TODO : utilise encoding.countTokens(text) et affiche le résultat

        // ÉTAPE 2 — Voir le découpage
        // TODO : encoding.encode(text) renvoie une IntArrayList d'identifiants.
        //        Pour chaque identifiant, affiche le morceau de texte correspondant.
        //        Indice : crée une IntArrayList d'un seul élément et utilise encoding.decode(...)

        // ÉTAPE 3 — Calculer le coût
        // TODO : écris la méthode cost(...) ci-dessous, puis affiche le coût d'une requête
        //        avec 'text' en entrée et 500 tokens en sortie, pour chaque modèle de MODELS.
    }

    // TODO ÉTAPE 3 : coût = (tokensEntree * prixEntree + tokensSortie * prixSortie) / 1 000 000
    static double cost(ModelPricing model, int inputTokens, int outputTokens) {
        throw new UnsupportedOperationException("À toi de jouer !");
    }
}
