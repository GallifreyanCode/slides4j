package be.gc.slides4j.slide;

import be.gc.slides4j.api.Slide;

public class TitleSlide implements Slide {
	public String name;
	public int x;
	public int y;
	public int scale;
	public String title;
	public boolean hasScale = false;
	
	private TitleSlide(String name, int x, int y, int scale) {
		this.name = "title";
		this.title = name;
		this.x = x;
		this.y = y;
		this.scale = scale;
		hasScale = true;
	}
	
	public String style() {
		return "step title";
	}
	
	public static TitleSlide constructWithScale(String name, int x, int y, int scale) {
		return new TitleSlide(name, x, y, scale);
	}
}
