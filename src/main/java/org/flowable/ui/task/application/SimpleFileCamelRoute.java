package org.flowable.ui.task.application;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleFileCamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/tmp").to("jms:localhost");
    }
}
