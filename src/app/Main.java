package app;

import java.util.ArrayList;

import loja.Produto;
import loja.Relatorio;
// 2) Execute o código no IDE Eclipse. Observe a saída gerada.

// 3) Refatore o código, gerando:
// a) A inteface “InterfaceRelatorio”.
// b) A classe “Relatorio”.


/* 
 * 5) Aplique ao código demais refatorações possíveis. Identifique e justifique as refatorações
aplicadas
		Foram criadas as classes Relatorio e a interface, encapsulado os métodos na classe Relatorio;

 */
public class Main {

	public static void main(String[] args) {
		Relatorio rel = new Relatorio();
		
		Produto p1 = new Produto ("Arroz", 5, 18.75);
		Produto p2 = new Produto ("Feijão", 1, 4.95);
		Produto p3 = new Produto ("Leite", 1, 3.49);
		 ArrayList<Produto> produtos = new ArrayList();
		 produtos.add(p1);
		 produtos.add(p2);
		 produtos.add(p3);

		 rel.total(produtos);
		 rel.aplicaDesconto();
		 rel.taxaEntrega();
		
		 System.out.println(rel.getTotal()); 
	}

}
