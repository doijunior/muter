package br.edu.ifpr.tcc.gamification;

import java.io.IOException;

import javax.swing.JFrame;

public class MainTest {
	public static void main (String[]args) throws IOException{
		JFrame window = new JFrame("Exemplo de aplicação utilizando o framework");
		window.setSize(500, 300);

		//RF01: O Framework deve permitir a criaçao de novos usuarios.
		//RF02: Um usuario possui apelido (nickname) e um avatar.
		//RF03: O avatar tem uma imagem.
		
		Avatar av = new Avatar("/home/gilson/Imagens/mario.jpg");
		User mii = new User("Mario", "Aquele que te comeu atrás do Armário", av);
	    //window.getContentPane().add(av);
		window.getContentPane().add(mii.getUserProfile());
		window.setVisible(true);
				
		//RF04: O Framework permite a criaçao de tipos de pontos. 
		// 		Esses pontos são usados para representar bens digitais do usuario, 
		//		como por exemplo, uma moeda corrente virtual; ou então como criterios 
		//		quantitativos de progressao do usuario em direçao ao cumprimentos das tarefas.
		//RF05: Um usuario pode possuir varias carteiras de pontos, uma carteira para cada tipo de ponto.
		
		Wallet money = new Wallet("Money", mii);
		System.out.println(money.getBallance());
		money.increasePoints(20);
		System.out.println(money.getBallance());

		Wallet mathPoints = new Wallet("Money", mii);
		System.out.println(mathPoints.getBallance());
		mathPoints.increasePoints(20);
		System.out.println(mathPoints.getBallance());

		//RF06: A partir de um subconjunto de carteiras de pontos referentes a habilidades é possível criar 
		//		um grafico de radar. Essa visualizaçao e interessante para representar, por exemplo, uma 
		//		visao quantitativa de graficos de habilidades
		
		//RF07: O Framework permite a criaçao de objetivos
		//RF08: Um objetivo é composto por uma regra de finalizaçao e uma regra de recompensa
		//RF09: A regra de finalizaçao do objetivo é baseada em uma funçao qualquer implementada em tempo de execuçao
		//RF10: A regra de recompensa atribui uma determinada quantidade de pontos a uma carteira de pontos do 
		//		usuario que completou o objetivo
		MyGoal test = new MyGoal();
		
		test.getPrize(mathPoints, money);
		System.out.println("Objetivo atingido?" + (test.achieved(mathPoints) ? "sim" : "não"));
		System.out.println(money.getBallance());
		mathPoints.increasePoints(100);
		test.getPrize(mathPoints, money);		
		System.out.println("Objetivo atingido?" + (test.achieved(mathPoints) ? "sim" : "não"));
		System.out.println(money.getBallance());
		
		//RF11: O Framework deve permitir a criaçao de insignias
		//RF12: Uma insigna tem nome, imagem, pode ter descrição
		
		//RF13: Um usuario possui uma lista de insignias
		
		//RF14: O Framework permite a criaçao de niveis
		//RF15: Um nivel é composto pela referencia a uma carteira de pontos de um usuario, a quantidade de pontos 
		//		que o usuario deve alcançar para completar o nivel e uma insignia de recompensa.
		
		//RF16: Ao alcançar o numero de pontos do nivel na carteira definida, o usuario recebe a insignia de recompensa

		//RF14: A de um nivel e de um usuario é possível criar a visualizaçao de uma barra de progresso do usuario, indicando qual a evoluçao do usuario em relaçao ao objetivo de pontos do nivel.
		//RF16: A partir de um conjunto de usuarios é possível gerar a visualizaçao de leaderboard que utiliza uma regra de classificaçao, que determina a cada par de usuarios, qual esta acima e qual esta abaixo (essa regra pode ser determinada atraves da quantidade de pontos de um determinada carteira para cada usuario, quantidade de insignias, quantidade de objetivos ou niveis cumpridos)

		
		/*		Avatar avatar = new Avatar ();
		User user = new User ("Krishna", avatar);
		// Teste Wallet
		user.setName("Krishna Campos");
		if (user.getName().equals("Krishna Campos")){
			System.out.println("setName Test = Sucefull!!!!! :D");
		}
		
		Wallet wallet = new Wallet ("GameficaducaXP", 0, user);
		wallet.increasePoint(45);
		if (wallet.getPoint()==45){
			System.out.println("increasePoint Test =Sucefull!!!!! *---------*");
		}
		
		wallet.increasePoint(45);
		if (wallet.getPoint()==90){
			System.out.println("increasePoint teste = Sucefull!!!!! XDDDD");
		}
		
		wallet.decrementPoint(90);
		if (wallet.getPoint()==0){
			System.out.println("decrementPoint test = Sucefull!!!!! *---------*");
		}
		
		User user1= new User ("Kewerson",avatar);
		Wallet wallet1 = new Wallet ("GameficaducaXP",45,user1);
		Leaderboard lead = new Leaderboard();
		System.out.println("aw");
		lead.addWallet(wallet);
		System.out.println("er");
		lead.addWallet(wallet1);
		ArrayList <Wallet> walletList=lead.getWalletList();
		for(Wallet c : walletList){
				    System.out.println("Usuário "+c.getOwner().getName()+" e ponto"+c.getPoint());
		}
		lead.organizeWallet();
		System.out.println("-------------");
		for(Wallet c : walletList){
		    System.out.println("Usuário "+c.getOwner().getName()+" e ponto"+c.getPoint());
		}
		wallet.increasePoint(67);
		wallet1.decrementPoint(23);
		lead.organizeWallet();
		System.out.println("-------------");

		for(Wallet c : walletList){
		    System.out.println("Usuário "+c.getOwner().getName()+" e ponto"+c.getPoint());
		}*/
	}
}
