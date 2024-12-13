public class Agenda {
	private Contato[] meusContatos;
	private final int MAX = 100;
	private int total = 0;

    //Construtor:
	public Agenda() {
		meusContatos = new Contato[MAX];
	}

	public boolean ehDuplicado(Contato c) {
		for (int i = 0; i < total; ++i) {
			if (c.equals(meusContatos[i])) { //Chama o nosso "equals()"!
				return true;
			}
		}
		return false;
	}

	public void listarContatos() {
		for (int i = 0; i < total; ++i) {
			System.out.println(meusContatos[i].getNome());
		}
		System.out.println("Total de " + total + " contatos listados.");
	}

	public boolean adicionarContato(Contato c) {
		if(total == MAX) //Agenda lotada?
			return false;
		if (ehDuplicado(c)){ //Item duplicado
			return  false;
		}
		meusContatos[total] = c;
		++total;
		return true;
	}

	public boolean removerContato(Contato c) {
		for (int i = 0 ; i < total ; i++){
			if (meusContatos[i] == c){
				meusContatos[i] = meusContatos[total-1];
				total = total -1;
				return true;
			}
		}
		return false;
	}
}
