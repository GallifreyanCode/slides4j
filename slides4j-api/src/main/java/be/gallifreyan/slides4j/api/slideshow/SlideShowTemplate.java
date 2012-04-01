package be.gallifreyan.slides4j.api.slideshow;

import java.util.ArrayList;
import java.util.List;

import be.gallifreyan.slides4j.api.Slide;

public abstract class SlideShowTemplate implements SlideShow {
	public List<Slide> slideShow = new ArrayList<Slide>();
}
