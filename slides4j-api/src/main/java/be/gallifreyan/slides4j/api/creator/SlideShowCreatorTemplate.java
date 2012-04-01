package be.gallifreyan.slides4j.api.creator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import be.gallifreyan.slides4j.api.slideshow.SlideShowTemplate;

public class SlideShowCreatorTemplate<T extends SlideShowTemplate> implements SlideShowCreator<T> {
	private String templateLocation = "slideShow.mustache";
	
	public SlideShowCreatorTemplate(){}
	
	public ByteArrayOutputStream createFromTemplate(Class<T> t) throws IOException, Exception {
		MustacheFactory mf = new DefaultMustacheFactory();
		Mustache mustache = mf.compile(templateLocation);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		mustache.execute(new PrintWriter(outputStream), t.newInstance())
				.flush();
		return outputStream;
	}
}
