package br.edu.ifpr.tcc.gamification;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Avatar extends JComponent{
	private String imageLink;
	private int width;
	private int height;
	
	public Avatar(String imageLink){
		this.width = 100;
		this.height = 100;
		this.imageLink = imageLink;
	}

	public Avatar(String imageLink, int width, int height){
		this.width = width;
		this.height = height;
		this.imageLink = imageLink;		
	}

	public void paint(Graphics g) {
	    Graphics2D g2d = (Graphics2D) g;
	    //File inputFile = new File ("/home/gilson/Imagens/mario.jpg");
	    File imageFile = new File (imageLink);
	    BufferedImage image;
		try {
			image = ImageIO.read(imageFile);
    	    g2d.drawImage(image.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, this);
    	    g2d.finalize();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	public void repaint(Graphics g){
		paint(g);
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}