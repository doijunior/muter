package br.edu.ifpr.tcc.gamification;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class AbilytRadar {
	
	private ArrayList <Wallet>walletList = new ArrayList<Wallet>();
	private final static int MINIMUNNUMBERABILITY = 3;
	private int maximunNumberAbilyt = 8;
	private boolean isDrawable;
	private Graphics g=null;
	private int drawRectXY1=0;
	private int drawRectXY2=100;
	private int drawRectMiddle=drawRectXY2/2;
	
	
	public AbilytRadar(Graphics g){
		this.g=g;
	}
	public void addWallet (Wallet wallet){
		if (walletList.size()<this.maximunNumberAbilyt){
			walletList.add(wallet);		
		}
	}
	public Graphics2D drawRadar(){
		Graphics2D g2d = (Graphics2D) g;
		if (isDrawable()){	
			if(walletList.size()==3){
				g2d.drawLine(40,0,0,40);
				g2d.drawLine(40,0,80,40);
				g2d.drawLine(0,40,80,40);

			}

			if(walletList.size()==4){
				//Desenhando o quadrado
			    g2d.setPaint(Color.blue);
		        g2d.drawRect(drawRectXY1, drawRectXY1, drawRectXY2, drawRectXY2);
		        g2d.setPaint(Color.red);
		        int ability=0; 
		        int abilityLimit=0;
		        int abilityPercent=0;
		        int percent=0;
		        int percentRect=0;
		        
		        //Valor da habilidade do ponto 1
		        ability = (int) walletList.get(0).getPoint(); 
		        abilityLimit = walletList.get(0).getMaximunNumberPoint();
		        //Calculo da porcentagem da abilidade
		        abilityPercent=(ability*100)/abilityLimit;
		        //Calculo da porcentagem da distancia entre o ponto do retanculo e o meio
		        percent=drawRectXY1+(drawRectMiddle-((drawRectMiddle*abilityPercent)/100));
		        
		        //primeira quina do retangulo
		        percentRect=percent;
		        int drawLineHability1X=percentRect;
		        int drawLineHability1Y=percentRect;
		       

		        //segunda quina do retangulo
		        ability = (int) walletList.get(1).getPoint();
		        abilityLimit=walletList.get(1).getMaximunNumberPoint();
		        abilityPercent=(ability*100)/abilityLimit;
		        percent=drawRectMiddle-((drawRectMiddle*abilityPercent)/100);
		        percentRect=drawRectXY2-percent;
		            	            
		        int drawLineHability2X=drawRectXY1+percentRect;
		        int drawLineHability2Y=drawRectXY1+(percentRect-drawRectXY2)*-1;
		            
		        //terceira quina do retangulo
		        ability = (int) walletList.get(3).getPoint();
			    abilityLimit=walletList.get(3).getMaximunNumberPoint();
			    abilityPercent=(ability*100)/abilityLimit;
		        percentRect=drawRectXY1+(drawRectMiddle+((drawRectMiddle*abilityPercent)/100));

		        int drawLineHability3X=percentRect;
		        int drawLineHability3Y=percentRect;
		            
		        //quarta quina do retangulo
		        ability = (int) walletList.get(2).getPoint();
			    abilityLimit=walletList.get(2).getMaximunNumberPoint();
			    abilityPercent=(ability*100)/abilityLimit;
			    percent=drawRectMiddle-((drawRectMiddle*abilityPercent)/100);
		        percentRect=drawRectXY2-percent;

		        int drawLineHability4X=drawRectXY1+(percentRect-drawRectXY2)*-1;
		        int drawLineHability4Y=drawRectXY1+percentRect;

		        //desenhar o retangulo da habilidade
		        g2d.drawLine(drawLineHability1X, drawLineHability1Y, drawLineHability2X, drawLineHability2Y);
		        g2d.drawLine(drawLineHability2X, drawLineHability2Y, drawLineHability3X, drawLineHability3Y);
		        g2d.drawLine(drawLineHability3X, drawLineHability3Y, drawLineHability4X, drawLineHability4Y);
		        g2d.drawLine(drawLineHability4X, drawLineHability4Y, drawLineHability1X, drawLineHability1Y);      
			}
		}
		return g2d;
	}
	public ArrayList getWalletList() {
		return walletList;
	}
	public void setWalletList(ArrayList walletList) {
		this.walletList = walletList;
	}
	public int getMaximunNumberAbilyt() {
		return maximunNumberAbilyt;
	}
	public void setMaximunNumberAbilyt(int maximunNumberAbilyt) {
		this.maximunNumberAbilyt = maximunNumberAbilyt;
	}
	
	public int getDrawRectXY1() {
		return drawRectXY1;
	}
	public void setDrawRectXY1(int drawRectXY1) {
		this.drawRectXY1 = drawRectXY1;
	}
	public int getDrawRectXY2() {
		return drawRectXY2;
	}
	public void setDrawRectXY2(int drawRectXY2) {
		this.drawRectXY2 = drawRectXY2;
		this.drawRectMiddle=drawRectXY2/2;
	}
	public boolean isDrawable(){
		if (this.walletList.size()>=this.MINIMUNNUMBERABILITY){
			this.isDrawable=true;
		}else {
			this.isDrawable=false;
		}
		return this.isDrawable;
	}
}