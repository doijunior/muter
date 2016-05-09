package br.edu.ifpr.tcc.gamification;

import javax.swing.JProgressBar;

public class ProgressBar {
	private JProgressBar progressBar;
	private int progressCompleteValue;
	public ProgressBar(){	
		progressCompleteValue = 100;
		progressBar = new JProgressBar(0, progressCompleteValue);
	}
	public void addProgressLimit(int progressComplete){
		this.progressCompleteValue = progressComplete;
		progressBar.setMaximum(this.progressCompleteValue);
	}
	public JProgressBar getProgressBar() {
		return progressBar;
	}
	public void setProgressBar(JProgressBar progressBar) {
		this.progressBar = progressBar;
	}
	public int getProgressCompleteValue() {
		return progressCompleteValue;
	}
	public void setProgressCompleteValue(int progressCompleteValue) {
		this.progressCompleteValue = progressCompleteValue;
	}
}
