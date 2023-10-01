package apps;
public abstract class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    //somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
