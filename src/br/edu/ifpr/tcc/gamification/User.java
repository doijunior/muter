package br.edu.ifpr.tcc.gamification;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class User {
	private String name;
	private String nickName;
	private Avatar avatar;
	
	public User(String name, String nickName, Avatar avatar) {
		this.name = name;
		this.nickName = nickName;
		this.avatar = avatar;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}	

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	
	public Avatar getAvatar() {
		return avatar;
	}
	
	public JPanel getUserProfile(){
		JPanel profile = new JPanel();
		profile.setLayout(new BoxLayout(profile, BoxLayout.Y_AXIS));
		profile.add(this.avatar);
		JLabel name = new JLabel(this.name);
		name.setLocation(0, avatar.getHeight());
		profile.add(name);
		JLabel nickName = new JLabel(this.nickName);
		nickName.setLocation(0, avatar.getHeight());
		profile.add(nickName);
		return profile;
	}
}