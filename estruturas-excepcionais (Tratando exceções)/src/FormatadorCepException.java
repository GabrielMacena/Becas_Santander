public class FormatadorCepException {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("123478");
        } catch (CepInvalidoException e) {
           System.out.println("O CEP é inválido.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //Simulando CEP formatado
        return "23.765-064";
    }
}
