package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Relatorio {
	
	double total;
	
	
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	// Calcula o somatório dos preços:
	public void total(List<Produto> produtos) {
	double total = 0.0;
	for (Produto produto : produtos) {
	total += produto.getPreco() * produto.getQuantidade();
	}
	setTotal(total);
	}
	
	// Aplica desconto:
	public void aplicaDesconto () {
			if (InterfaceRelatorio.clienteVIP) {
			this.total *= 0.90;
			} else {
			this.total *= 0.95;
			}
	}
	
	// Adiciona taxa de entrega:
	 
	public void taxaEntrega() {
	DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
	if (diaSemana == DayOfWeek.SUNDAY) {
	this.total += 10.00;
	} else {
	this.total += 5.00;
	}
	}
}
