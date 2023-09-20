package com.fatec.produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}

}




//porque usar o solid? desaclopamento, diminuir aclopamento alto nivel nao depende de baixo nivel
//porque eu soldaria a roda do carro ? como seria a manutenção
// salvar imagem no banco de dados ou servidor? desempenho tem que testar
// imagem pequena pode guardar no banco.
// INVERÇÃO DE DEPENDENCIA