package com.demo.web;

import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class VaadinApplication extends com.vaadin.Application {
	
	public void init() {
		Window main = new Window("Main window");
		VerticalLayout verticalLayout = new VerticalLayout();
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		final TextField name = new TextField();
		name.setDebugId("debug_id_for_name");
		final Label answer = new Label();
		
		setMainWindow(main);
		main.addComponent(verticalLayout);
		
		verticalLayout.addComponent(horizontalLayout);
		verticalLayout.addComponent(answer);
		
		horizontalLayout.addComponent(new Label("Kerro nimesi: "));
		horizontalLayout.addComponent(name);
		horizontalLayout.addComponent(new Button("Lähetä", new Button.ClickListener() {
			@Override public void buttonClick(ClickEvent event) {
				answer.setValue("Terve: " + name.getValue());
			}
		}));
	}
}
