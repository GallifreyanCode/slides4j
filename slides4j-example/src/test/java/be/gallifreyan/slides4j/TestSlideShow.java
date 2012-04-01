package be.gallifreyan.slides4j;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import be.gallifreyan.slides4j.example.ExampleSlideShow;

public class TestSlideShow {
	
	@Test
	public void testGenericsWork(){
		CustomSlideShowCreator slideShowCreator = new CustomSlideShowCreator();
		assertNotNull(slideShowCreator);
		try {
			String result = slideShowCreator.createFromTemplate(ExampleSlideShow.class).toString();
			assertNotNull(result);
			assertTrue(result.contains("<!DOCTYPE html>"));
			assertTrue(result.contains("<h1>TEST</h1>"));
			assertTrue(result.contains("<h2>Part 1</h2>"));
			assertTrue(result.contains("<li>2.1</li>"));
			assertTrue(result.contains("</html>"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
