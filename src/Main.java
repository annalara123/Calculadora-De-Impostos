import factory.ImpostoFactory;
import factory.TipoImposto;
import imposto.Imposto;
import model.Produto;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto 1", 100.0, true));
        produtos.add(new Produto("Produto 2", 200.0, false));
        produtos.add(new Produto("Servico 1", 300.0, false));
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome());

            Imposto icms = ImpostoFactory.criarImposto(TipoImposto.ICMS);
            System.out.println("ICMS: R$ " + icms.calcular(produto));

            Imposto ipi = ImpostoFactory.criarImposto(TipoImposto.IPI);
            System.out.println("IPI: R$ " + ipi.calcular(produto));

            Imposto iss = ImpostoFactory.criarImposto(TipoImposto.ISS);
            System.out.println("ISS: R$ " + iss.calcular(produto));

            Imposto cpis = ImpostoFactory.criarImposto(TipoImposto.PIS);
            System.out.println("CPIS: R$ " + cpis.calcular(produto));

            System.out.println();
        }
    }
}
