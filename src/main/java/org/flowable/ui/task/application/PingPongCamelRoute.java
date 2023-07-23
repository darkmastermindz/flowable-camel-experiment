package org.flowable.ui.task.application;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PingPongCamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("flowable:PingPongProcess:ping").transform().simple("${property.input} World");
    }
}
