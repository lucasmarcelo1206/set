package convidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {

        convidadosSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;

            }

        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();

    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no set");

        conjuntoConvidados.adicionarConvidado("Lucas", 7);
        conjuntoConvidados.adicionarConvidado("Marcelo", 3);
        conjuntoConvidados.adicionarConvidado("Lima", 3);
        conjuntoConvidados.adicionarConvidado("Araujo", 9);

        System.out.println("Convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }
}
