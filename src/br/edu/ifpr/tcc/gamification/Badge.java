package br.edu.ifpr.tcc.gamification;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Badge {
	private String badgeName; 
	private BufferedImage badgeImage;
	private String badgeDescription;
	private String imageBadgeLink;
	private User owner;

	public Badge (String badgeName, String imageBadgeLink, User owner){
		this.badgeName = badgeName;
		this.imageBadgeLink =imageBadgeLink;
		this.owner = owner;
		addBadgeImage (imageBadgeLink);
	}
	public Badge (String badgeName, String imageBadgeLink, String badgeDescription, User owner){		
		this.badgeName = badgeName;
		this.badgeDescription = badgeDescription;
		this.imageBadgeLink =imageBadgeLink;
		this.owner = owner;
		addBadgeImage (imageBadgeLink);
	}
	public void alterBadgeImage (String imageBadgeLink){
		addBadgeImage(imageBadgeLink);
	}
	private void addBadgeImage (String imageBadgeLink){
		File inputFile = new File (imageBadgeLink);
		try {
			badgeImage = ImageIO.read(inputFile);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public String getBadgeName() {
		return badgeName;
	}
	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}
	public BufferedImage getBadgeImage() {
		return badgeImage;
	}
	public void setBadgeImage(BufferedImage badgeImage) {
		this.badgeImage = badgeImage;
	}
	public String getBadgeDescription() {
		return badgeDescription;
	}
	public void setBadgeDescription(String badgeDescription) {
		this.badgeDescription = badgeDescription;
	}
	public String getImageBadgeLink() {
		return imageBadgeLink;
	}
	public void setImageBadgeLink(String imageBadgeLink) {
		this.imageBadgeLink = imageBadgeLink;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
}