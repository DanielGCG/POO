public class Contato {
	private String nome;
	private String tel;

    //Metodo construtor:
	public Contato(String nome, String tel) {
        if (nome.equals("")){
            this.nome = "Anônimo";
        }
        else {
            this.nome = nome;
        }
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) { //Criaremos nossa definicão de "igualdade"
		if(obj == this) // comparacao de referencia!
			return false; //Isso mesmo, falso! Entende o motivo?
		if(!(obj instanceof Contato)) //"Se obj *não* é da classe Contato, então...
			return false; //...obviamente.

		Contato c = (Contato)obj; //Converte o objeto genérico obj para o tipo Contato.
 
        //A classe String tb herda de Object, daC- tb tem seu prC3prio "equals()"!
		return (this.nome.equals(c.getNome())&&this.tel.equals(c.getTel()));
	}

	public String getNome() {
		return nome; //O mesmo que "return this.nome"
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
