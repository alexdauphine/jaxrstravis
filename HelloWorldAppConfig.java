package com.ibm.jaxrs.sample;

public class HelloWorldAppConfig extends javax.ws.rs.core.Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(com.ibm.jaxrs.sample.HelloWorldResource.class);
        return classes;
    }
}
