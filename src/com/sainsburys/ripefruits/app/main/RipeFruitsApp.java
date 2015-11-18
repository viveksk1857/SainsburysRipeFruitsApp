package com.sainsburys.ripefruits.app.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sainsburys.ripefruits.app.facade.ProductFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * The Class RipeFruitsApp.
 */
@Component
public class RipeFruitsApp {

	/** The Constant CONFIG_PATH. */
	private static final String CONFIG_PATH = "classpath*:resource/application-config.xml";

	/** The product facade. */
	@Autowired
	ProductFacade productFacade;

	/**
	 * Say hello.
	 */
	public void getJson() {
		GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting()
        	    .disableHtmlEscaping()
        	    .create();

        builder.disableHtmlEscaping();
		System.out.println(gson.toJson(productFacade.getAllProductForThePage()));
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		final RipeFruitsApp minimalSpringApp = context.getBean(RipeFruitsApp.class);
		minimalSpringApp.getJson();
	}

}
