package dev.hanselwei.flowablecamelexample;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


//@ImportResource({"classpath:simple-camel-route.xml"})
@ImportResource({"classpath:myContext.xml"})
@SpringBootApplication(proxyBeanMethods = false, exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
public class FlowableCamelExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowableCamelExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final RepositoryService repositoryService,
								  final RuntimeService runtimeService,
								  final TaskService taskService) {

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				System.out.println("Number of process definitions : "
						+ repositoryService.createProcessDefinitionQuery().count());
				System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
				runtimeService.startProcessInstanceByKey("oneTaskProcess");
				System.out.println("Number of tasks after process start: "
						+ taskService.createTaskQuery().count());
			}
		};

	}
}
