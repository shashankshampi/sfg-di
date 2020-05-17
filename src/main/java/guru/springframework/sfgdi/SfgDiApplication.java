package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructionINjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

/*		System.out.println("constructor based spring controller---->");
		ConstructionINjectedController constructionINjectedController = (ConstructionINjectedController) ctx.getBean("constructionINjectedController");
		System.out.println(constructionINjectedController.getGreeting());*/

		System.out.println("setter based controller--->");
		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());
	}

}
