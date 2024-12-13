import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.adicionarDisciplina(this); // Associa a disciplina ao aluno também
    }

    public void listarAlunos() {
        System.out.println("Alunos da disciplina " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}
