package be.gallifreyan.slides4j.api.page;

import be.gallifreyan.slides4j.api.slideshow.SlideShowTemplate;

public interface SlideShowPage<T extends SlideShowTemplate> {
	Class<T> getSlideShowType();
}
