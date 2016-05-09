package br.edu.ifpr.tcc.gamification;

public interface Goal {
	public void getPrize (Wallet parameterWallet, Wallet prizeWallet);
	public boolean achieved(Wallet wallet);
}
