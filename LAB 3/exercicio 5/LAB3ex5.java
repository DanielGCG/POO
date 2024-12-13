public class LAB3ex5{
    public static void main(String[] args) {
        Agenda ag = new Agenda();
        Contato c1 = new Contato("João", "+55 21 99999-9999");
        Contato c2 = new Contato("João", "+55 21 92222-2222");
        Contato c3 = new Contato("Maria", "+55 21 98888-8888");
        Contato c4 = new Contato("José", "+55 21 97777-7777");
        Contato c5 = new Contato("", "+55 21 91111-1111");
        Contato c6 = new Contato("Daniel", "+55 21 00000-0000");
        Contato c7 = new Contato("Daniel", "+55 21 00000-0000");

        ag.adicionarContato(c1);
        ag.adicionarContato(c2);
        ag.adicionarContato(c3);
        ag.adicionarContato(c4);
        ag.adicionarContato(c5);
        ag.adicionarContato(c6);
        ag.adicionarContato(c7);
        ag.listarContatos();
        String d = (ag.ehDuplicado(c1)) ? "" : " NÃO ";
        System.out.println("\nO contato " + c1.getNome() + d + " é duplicado.");
        String e = (ag.ehDuplicado(c7)) ? "" : " NÃO ";
        System.out.println("\nO contato " + c7.getNome() + e + " é duplicado.\n");
        System.out.println("Novo número para c2 <- +55 21 01010-0101\n");
        c2.setTel ("+55 21 01010-0101");
        System.out.println("Telefone do c2 é: " + c2.getTel() + "\n\n");
        ag.removerContato(c2);
        System.out.println("Removi contato 2\n");
        ag.listarContatos();
    }
}



