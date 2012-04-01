package be.gallifreyan.slides4j.api.creator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import be.gallifreyan.slides4j.api.slideshow.SlideShowTemplate;

public interface SlideShowCreator<T extends SlideShowTemplate> {
	public ByteArrayOutputStream createFromTemplate(Class<T> t) throws IOException, Exception;
}
