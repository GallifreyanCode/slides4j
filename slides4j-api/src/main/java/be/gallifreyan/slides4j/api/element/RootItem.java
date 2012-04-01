package be.gallifreyan.slides4j.api.element;

import java.util.ArrayList;
import java.util.List;

public class RootItem {
	public List<SubItem> subItems = new ArrayList<SubItem>();
	public String text;
	
	public RootItem(String text) {
		this.text = text;
	}
	
	public RootItem addSubItem(String text) {
		subItems.add(new SubItem(text));
		return this;
	}
}
