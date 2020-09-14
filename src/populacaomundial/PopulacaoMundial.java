package populacaomundial;

import java.text.NumberFormat;
import java.util.Locale;

public class PopulacaoMundial {
    public static void main(String[] args) {
        long populacaoMundial = 7811802435L;
        final double TAXA_CRESCIMENTO = 0.0105;

        int anos = Integer.parseInt(args[0]);

        for (int i = 0; i < anos; i++) {
            populacaoMundial += populacaoMundial * TAXA_CRESCIMENTO;
        }

        System.out.printf("%,d pessoas", populacaoMundial);
    }
}
