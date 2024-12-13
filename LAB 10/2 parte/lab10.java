import java.util.ArrayList;

public class lab10 {
    public static void main(String[] args) {
        ArrayList<Pessoa> grupo = new ArrayList<Pessoa>();
        Pessoa r = new Pessoa("Ronald");
        Pessoa a = new Pessoa("Ana");
        Pessoa alguem = r;
        grupo.add(new Pessoa("Jose"));
        grupo.add(r);
        grupo.add(alguem);
        grupo.add(a);
        r = null;
        grupo.set(2, null);
        System.out.println("Grupo atual:");
        for (Pessoa p : grupo) {
            if (p == null)
                System.out.println("null ");
            else
                System.out.println(p.getNome());
        }
        grupo = null; //Quantos objetos e quantas variáveis ainda existirão aqui?
        // (Só sobrará Ana por ter variável referenciado o objeto, José deixará de existir pq sua unica
        // referência grupo.get(0) deixou de existir e Ronald deixou de existir pois a variável r e
        // grupo deixaram de referenciar o objeto
    }
}