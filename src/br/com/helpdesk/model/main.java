package br.com.helpdesk.model;

//import br.com.helpdesk.view.LoginScreen;

public class main {

	public static void main(String[] args) {
		Tecnico t = new Tecnico(); 
		Usuario user = t;
		
		
		
		
		Tecnico a = new Tecnico();
		a.setNome("Tiquinho");
		Solicitante s = new  Solicitante();
		Chamado c = new Chamado();
		c.settitulo("Cabo de rede");
		c.setDescricao("falta cabo de rede no laboratorio");
		
		a.atenderChamado(c, "Atendido");
		s.responderChamado(c, "Ok! obrigado");
                s.responderChamado(c, "depois pesso mais coisas!!");
		a.listaChamadosAtendidos();
		//LoginScreen l = new LoginScreen();
		
	}
	

}