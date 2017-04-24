package com.rhapsoyman.grid;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.annotation.WebServlet;

import com.rhapsoyman.grid.service.PersonService;
import com.rhapsoyman.grid.service.PersonServiceImpl;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.HtmlRenderer;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		final VerticalLayout layout = new VerticalLayout();

		PersonService personService = new PersonServiceImpl();

		DataProvider<Person, Void> dataProvider = DataProvider.fromCallbacks(
				query -> {
					

					Map<String, Boolean> sortOrder = query.getSortOrders().stream()
							.collect(Collectors.toMap(
									sort -> sort.getSorted(),
									sort -> SortDirection.ASCENDING.equals(
											sort.getDirection())));


					int offset = query.getOffset();

					int limit = query.getLimit();
					List<Person> persons = personService.fetchPersons(offset, limit, sortOrder);
					return persons.stream();
				}, 
				query -> personService.getPersonCount());



		Grid<Person> grid = new Grid<>();
		grid.setDataProvider(dataProvider);

		// Grid<Person> grid = new Grid<>(Person.class);
		// grid.setItems(people);
		grid.setSizeFull();
		grid.addColumn(Person::isActive).setCaption("Active");
		grid.addColumn(Person::getName).setCaption("Name").setSortProperty("name");
		grid.addColumn(Person::getBirthYear).setCaption("Year of birth");
		
		
		layout.addComponent(grid);
		setContent(layout);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
