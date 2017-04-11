package ch5.homework;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ThreadNameSpaceSupport extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("thread",new ThreadBeanDefinitorParse());
    }
}
