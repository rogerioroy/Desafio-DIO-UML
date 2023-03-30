package iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	

	private int numero; 
	
	public Iphone() {
	}

	public Iphone(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void ligar() {
		System.out.println("Ligando Iphone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Iphone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausado");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionado Musicas");
		
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}
	
}
