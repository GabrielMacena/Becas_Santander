package apps;
public class MSNMensseger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    } 
}