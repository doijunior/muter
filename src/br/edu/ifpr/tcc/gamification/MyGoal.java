package br.edu.ifpr.tcc.gamification;

public class MyGoal implements Goal{
	public void getPrize(Wallet parameterWallet, Wallet prizeWallet){
		if(this.achieved(parameterWallet))
			prizeWallet.increasePoints(10);
	}
	public boolean achieved(Wallet pontuacao){
		if(pontuacao.getBallance() > 100)
			return true;
		return false;
	}
}
