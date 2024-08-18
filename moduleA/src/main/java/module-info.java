module moduleA {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.web;

    requires com.fasterxml.jackson.databind;

    requires moduleC;

    requires org.slf4j;
    requires static org.apache.logging.log4j;
    requires static lombok;

    opens vn.com.rega.modulea;
    opens vn.com.rega.modulea.config;
    exports vn.com.rega.modulea;
}