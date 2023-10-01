import apps.FacebookMensseger;
import apps.MSNMensseger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorUser {
     public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;
      /*NÃO SE SABE QUAL APP O USER ESCOLHERÁ,
       MAS QUALQUER UM DEVE ENVIAR E RECEBER MESSAGEM.

       */
      String appEscolhido = "tlg";
      if(appEscolhido.equals("msn"))
        smi = new MSNMensseger();
      else if(appEscolhido.equals("face"))
        smi = new FacebookMensseger();
      else if(appEscolhido.equals("tlg"))
        smi = new Telegram();

    smi.enviarMensagem();
    smi.receberMensagem();
     }
}
