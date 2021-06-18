package app;

import java.util.ArrayList;

import loja.Produto;
import loja.Relatorio;
// 2) Execute o c�digo no IDE Eclipse. Observe a sa�da gerada.

// 3) Refatore o c�digo, gerando:
// a) A inteface �InterfaceRelatorio�.
// b) A classe �Relatorio�.


/* 
 * 5) Aplique ao c�digo demais refatora��es poss�veis. Identifique e justifique as refatora��es
aplicadas
		Foram criadas as classes Relatorio e a interface, encapsulado os m�todos na classe Relatorio;

 */
public class Main {

	public static void main(String[] args) {
		Relatorio rel = new Relatorio();
		
		Produto p1 = new Produto ("Arroz", 5, 18.75);
		Produto p2 = new Produto ("Feij�o", 1, 4.95);
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
