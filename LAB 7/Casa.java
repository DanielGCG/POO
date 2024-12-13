public class Casa {
	private String endereco;
	private boolean donoEstaEmCasa = true;
	private Comodo[] meusComodos = new Comodo[2];

    //Innerclass comodo da casa
	private class Comodo {
		public String nome;
		public Camera minhaCamera;
		public Comodo(String nome) {
			this.nome = nome;
			minhaCamera = new Camera();
		}
	}
    
    //Construtor
	public Casa(String end) {
		endereco = end;
		meusComodos[0] = new Comodo("Sala");
		meusComodos[1] = new Comodo("Quarto");
	}

    public void setDonoEmCasa (boolean status) {
        this.donoEstaEmCasa = status;
    }

    public boolean getDonoEmCasa () {
        return this.donoEstaEmCasa;
    }

    //Função de movimentação
	public boolean movimentacao() {
		boolean algoSeMexeu = false;

        //Procura nos comodos se algo se mexeu
		for (int i = 0; i < meusComodos.length; i++) {
			if (meusComodos[i].minhaCamera.haMovimento())
				algoSeMexeu = true;

		}
		return algoSeMexeu;
	}
}
