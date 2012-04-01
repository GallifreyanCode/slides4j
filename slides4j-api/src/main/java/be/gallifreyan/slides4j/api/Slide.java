package be.gallifreyan.slides4j.api;

import java.util.List;

import be.gallifreyan.slides4j.api.element.RootItem;

public interface Slide {
	String style();
	List<RootItem> items();
}
