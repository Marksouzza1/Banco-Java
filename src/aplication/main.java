package application;
import java.util.Random;
import java.util.Scanner;

import entities.cliente;
import entities.cliente_pj;
import entities.conta_pessoal;
import entities.investimento;
import entities.login;
import entities.movimentacao_bancaria;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		conta_pessoal numero_agencia = new conta_pessoal();
		cliente_pj conta_juridica = new cliente_pj();
		cliente pessoa_fisica = new cliente();
		investimento aplicacao = new investimento();
		login login = new login();
		movimentacao_bancaria movimentacao = new movimentacao_bancaria();
		Random random = new Random();

		
		int pj_pf = 0;
		int OP1 = 0;
		int op2 = 0;
		
// tela inicial
		
        System.out.println("BEM VINDO AO BANCO CAPITOL");
        System.out.println("Escolha o tipo de operação:");
        System.out.println("[1] - LOGAR");
        System.out.println("[2] - CADASTRAR");
        
        while(OP1 != 1 && OP1 != 2) {
        OP1 = sc.nextInt();
        
        if(OP1 == 1) {
//login	
            
            
    		System.out.println("insira seu email");
    		login.email = sc.next();
    		
    		
    		System.out.println("insira sua senha");
    		login.senha = sc.next();
    				
   
        }else if(OP1 == 2){
//cadastro  pf e pj
    		
    		System.out.println("Se for Pessoa Juridica(PJ), digite [1], pessoa física digite [2]");
    		
    		while(pj_pf !=1 && pj_pf !=2) {
    			pj_pf = sc.nextInt();
    					
    			if(pj_pf == 1) {
    				
    				System.out.println("Digite o seu CNPJ");
    				conta_juridica.CNPJ = sc.nextInt();
    				System.out.println("Digite o nome da empresa");
    				conta_juridica.razao_social = sc.next();
    				System.out.println("Digite o seu endereço");
    				conta_juridica.endereco = sc.next();
    				System.out.println("seu número de conta é");
    				int numero1 = random.nextInt(100)*999;
    				numero_agencia.numero = numero1;
    				System.out.println(numero1);
    				System.out.println("A agencia é");
    				System.out.println("01");
    				
    			}else if(pj_pf == 2) {
    				
    				System.out.println("Digite o seu nome");
    				pessoa_fisica.nome = sc.next();
    				System.out.println("Digite o nome do bairro");
    				pessoa_fisica.endereco_bairro = sc.next();
    				System.out.println("Digite o nome da rua");
    				pessoa_fisica.endereco_rua = sc.next();
    				System.out.println("Digite o numero da casa");
    				pessoa_fisica.endereco_numero = sc.next();
    				System.out.println("Digite o seu CPF");
    				pessoa_fisica.CPF = sc.nextInt();
    				System.out.println("Digite a sua profissão");
    				pessoa_fisica.profissao = sc.next();
    				System.out.println("qual a sua renda?");
    				pessoa_fisica.renda = sc.nextInt();
    				System.out.println("seu número de conta é");
    				int numero1 = random.nextInt(100)*999;
    				numero_agencia.numero = numero1;
    				System.out.println(numero1);
    				System.out.println("A agencia é");
    				System.out.println("01");
    				
    				
    			}else {
    				System.out.println("digite [1] ou [2]");
    			}
        	
    		}
    		}else {
    		System.out.println("digite [1] ou [2]");
    	}   
     }    
    
        
     
    System.out.println("//////////////////////////////////////////////");
    System.out.println("Escolha o tipo de operação:");
    System.out.println("[1] - VER O SALDO");
    System.out.println("[2] - RECEBER/DEPOSITAR");
    System.out.println("[3] - TRANSFERIR");
    System.out.println("[4] - MEUS DADOS");
    System.out.println("[5] - APLICAÇÃO MENSAL");
    
    while(op2 >= 4 || op2 < 1) {
    op2 = sc.nextInt();
    
    if(op2 == 1) {
    	System.out.println("Seu saldo é de" + movimentacao.saldo);
		
    }
    else if(op2 == 2) {
		System.out.println("Quanto você deseja receber?");
		movimentacao.receber= sc.nextFloat();
    }
    else if(op2 == 3) {
		System.out.println("Quanto você deseja transferir?");
		movimentacao.transferir= sc.nextFloat();
    }	
    else if(op2 == 4) {
		System.out.println("sua conta bancária é " + numero_agencia.numero);
		System.out.println("O número do banco é " + 01);
    	
    }else if(op2 == 5) {
    	System.out.println("quanto deseja investir por mês?");
		aplicacao.pacote_investimento = sc.nextFloat();
    	
    }
    else {
		System.out.println("digite [1], [2],[3],[4] ou [5]");
	}
  }
		
	
		sc.close();
	}
}
