public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
        System.out.println("APROVADO =)");

        else if (nota >= 5 && nota < 7)
        System.out.println("BEM-VINDO A RECUPERAÇÃO...");

        else
        System.out.println("REPROVADO =(");

        // Outra possibilidade utilizando menos código.
        String resultado = nota >= 7 ? "Aprovado =)" : nota >= 5 && nota <7 ? "Bem-vindo a Recuperação..." : "Reprovado =(";
    }
}
