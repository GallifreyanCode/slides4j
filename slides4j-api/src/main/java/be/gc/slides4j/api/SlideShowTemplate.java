package be.gc.slides4j.api;

import java.util.ArrayList;
import java.util.List;

public abstract class SlideShowTemplate implements SlideShow {
	public List<Slide> slideShow = new ArrayList<Slide>();
}
