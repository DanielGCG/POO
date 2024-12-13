public class TestaAgregacao {
    public static void main(String[] args) {
        // Criação de alunos
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        // Criação de disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("Física");

        // Adicionar alunos às disciplinas
        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno2);

        // Listar alunos por disciplina
        disciplina1.listarAlunos();
        disciplina2.listarAlunos();

        // Listar disciplinas de cada aluno
        aluno1.listarDisciplinas();
        aluno2.listarDisciplinas();
    }
}

