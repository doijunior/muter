package br.edu.ifpr.tcc.gamification;

import javax.swing.JPanel;

public class Wallet implements Comparable<Wallet>{
	private String walletName; 
	private double points;
	private User owner;
	public Wallet (String name, User owner){
		this.walletName = name;
		this.owner = owner;
		this.points = 0;
	}
	
	public String getName() {
		return walletName;
	}
	
	public void setName(String name) {
		this.walletName = name;
	}

	public User getOwner() {
		return owner;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}

	public void decreaePoints(double point) {
		this.points -= point;
	}
	public void increasePoints(double point) {
		this.points += point;
	}

	public double getBallance(){
		return this.points;
	}
	
	//@TODO
	//public JPanel displayBallance(){
	//}
	
	public int compareTo(Wallet wallet) {
		if (this.points>wallet.points){
			return -1;
		}
		else if (this.points<wallet.points){
			return 1;
		}
        return this.owner.getName().compareToIgnoreCase(wallet.owner.getName());
	}
}