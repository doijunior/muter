package br.edu.ifpr.tcc.gamification;

import java.util.ArrayList;
import java.util.Collections;

public class Leaderboard {
	private ArrayList <Wallet> walletList;
	public Leaderboard (){
		walletList=new ArrayList<Wallet>();
	}
	public void addWallet (Wallet wallet){
		this.walletList.add(wallet);
	}
	public ArrayList<Wallet> organizeWallet (){
		Collections.sort(this.walletList);
		return walletList;
	}
	public ArrayList<Wallet> getWalletList(){
		return walletList;
	}
}
