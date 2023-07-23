package org.flowable.ui.task.application;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

@Component
public class AsyncPingRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //from("flowable:asyncPingProcess:serviceAsyncPing").delay(2000).to("flowable:asyncPingProcess:receiveAsyncPing");
        from("flowable:asyncPingProcess:serviceAsyncPing").to("seda:continueAsync");
        from("seda: continueAsync").to("flowable:asyncPingProcess: receiveAsyncPing");
    }
}