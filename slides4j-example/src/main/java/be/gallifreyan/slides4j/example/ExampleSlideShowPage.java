package be.gallifreyan.slides4j.example;

import be.gallifreyan.slides4j.api.page.SlideShowPageTemplate;

public class ExampleSlideShowPage extends SlideShowPageTemplate<ExampleSlideShow> {
	private static final long serialVersionUID = -2567091372612817786L;

	public Class<ExampleSlideShow> getSlideShowType() {
		return ExampleSlideShow.class;
	}
}
