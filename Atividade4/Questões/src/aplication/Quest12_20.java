package aplication;

import entities.*;


public class Quest12_20 {
	public static void main(String[] args) {
		// Questão 12:
	    
	    Produto produto1 = new Produto("Geladeira", 1499.99);
	    Produto produto2 = new Produto("Fogao", 799.99);
	    Produto produto3 = new Produto("Microondas", 399.99);
	    Produto produto4 = new Produto("Televisão", 2599.99);
	    
	    Loja loja = new Loja();
	    loja.registrarProduto(produto1);
	    loja.registrarProduto(produto2);
	    loja.registrarProduto(produto3);
	    loja.registrarProduto(produto4);
	    
	    loja.exibirProdutos();
	    System.out.println("Total em estoque: " + loja.calcularEstoque() + "\n");
	
	
	    // Questão 13:
	    
	    Reserva reserva1 = new Reserva("Joao", "Paris - Franca", 123);
	    Reserva reserva2 = new Reserva("Davi", "Roma - Italia", 456);
	    Reserva reserva3 = new Reserva("Levi", "Lisboa - Portugal", 789);
	    
	    reserva1.exibirReserva();
	    reserva2.exibirReserva();
	    reserva3.exibirReserva();
	
	
	    // Questão 14:
	    
	    Livro livro1 = new Livro("Harry Potter", "J. K. Rowling");
	    Livro livro2 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien");
	    
	    livro1.emprestarLivro();
	    livro1.exibirLivro();
	    
	    livro2.emprestarLivro();
	    livro2.exibirLivro();
	    
	    livro1.devolverLivro();
	    livro1.exibirLivro();
	    
	    livro2.devolverLivro();
	    livro2.exibirLivro();
	
	
	    // Questão 15:
	    
	    Pedido pedido1 = new Pedido("Joao", "Cachorro-quente", 3);
	    Pedido pedido2 = new Pedido("Maria", "Hamburguer", 2);
	    Pedido pedido3 = new Pedido("Carlos", "Pizza", 1);
	    
	    pedido1.exibirPedido();
	    pedido2.exibirPedido();
	    pedido3.exibirPedido();
	
	
	    // Questão 16:
	    
	    ContaBancaria conta1 = new ContaBancaria(1234, "Joao", 1234.567);
	    ContaBancaria conta2 = new ContaBancaria(5678, "Maria", 5678.901);
	    
	    conta1.depositar(1000);
	    conta1.sacar(4000);
	    conta1.exibirSaldo();
	    
	    conta2.depositar(2000);
	    conta2.sacar(3000);
	    conta2.exibirSaldo();
	
	
	    // Questão 17:
	    
	    Veiculo veiculo1 = new Veiculo("ABC1234", "Fiat Uno");
	    Veiculo veiculo2 = new Veiculo("DEF5678", "Chevrolet Onix");
	    Veiculo veiculo3 = new Veiculo("GHI9012", "Ford Ka");
	    
	    veiculo1.alugar();
	    veiculo1.exibirDetalhes();
	    
	    veiculo2.alugar();
	    veiculo2.exibirDetalhes();
	    
	    veiculo3.exibirDetalhes();
	
	
	    // Questão 18:
	    
	    Quarto quarto1 = new Quarto(123, "simples");
	    Quarto quarto2 = new Quarto(456, "duplo");
	    
	    quarto1.reservar();
	    quarto1.exibirDetalhes();
	    
	    quarto2.reservar();
	    quarto2.exibirDetalhes();
	
	
	    // Questão 19:
	    
	    Evento evento1 = new Evento("Formatura", "Colégio", "23/12/2024");
	    Evento evento2 = new Evento("Casamento", "Igreja", "25/12/2024");
	    
	    evento1.alterarLocal("Universidade");
	    evento1.exibirDetalhes();
	    
	    evento2.alterarLocal("SItio");
	    evento2.exibirDetalhes();
	
	
	    // Questão 20:
	    SessaoCinema sessao1 = new SessaoCinema("Star Wars", "19:00", 30);
	    SessaoCinema sessao2 = new SessaoCinema("Vingadores", "21:00", 3);
	
	    sessao1.venderIngresso(4);
	    sessao1.exibirDetalhes();
	
	    sessao2.venderIngresso(5);
	    sessao2.exibirDetalhes();
	}
}
