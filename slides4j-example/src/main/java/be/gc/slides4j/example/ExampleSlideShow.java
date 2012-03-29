package be.gc.slides4j.example;

import be.gc.slides4j.api.SlideShowTemplate;
import be.gc.slides4j.slide.RetroSlide;
import be.gc.slides4j.slide.TitleSlide;

public class ExampleSlideShow extends SlideShowTemplate {

	public ExampleSlideShow() {
		slideShow.add(TitleSlide.constructWithScale("TEST", -1000, -1500, 6));
		
		RetroSlide agenda1 = RetroSlide.construct("agenda1", -1000, 200);
		agenda1.addRootItem("Part 1").addSubItem("1.1").addSubItem("1.2");
		agenda1.addRootItem("Part 2").addSubItem("2.1").addSubItem("2.2");
		slideShow.add(agenda1);
		
		RetroSlide agenda2 = RetroSlide.construct("agenda2", 0, 200);
		slideShow.add(agenda2);
		agenda2.addRootItem("Welcome!");
	}

	public String title() {
		return "Example";
	}

	public String description() {
		return "Description";
	}
}