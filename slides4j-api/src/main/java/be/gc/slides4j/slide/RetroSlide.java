package be.gc.slides4j.slide;

import java.util.ArrayList;
import java.util.List;
import be.gc.slides4j.api.Slide;
import be.gc.slides4j.slide.element.RootItem;

public class RetroSlide implements Slide {
	public String name;
	public List<RootItem> rootItems = new ArrayList<RootItem>();
	public int x;
	public int y;
	public int scale;
	public boolean hasScale = false;
	
	private RetroSlide(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	private RetroSlide(String name, int x, int y, int scale) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.scale = scale;
		hasScale = true;
	}
	
	public String style() {
		return "step slide";
	}
	
	public RootItem addRootItem(String text) {
		RootItem rootItem = new RootItem(text);
		rootItems.add(rootItem);
		return rootItem;
	}
	
	public static RetroSlide construct(String name, int x, int y) {
		return new RetroSlide(name, x, y);
	}
	public static RetroSlide constructWithScale(String name, int x, int y, int scale) {
		return new RetroSlide(name, x, y, scale);
	}
}
