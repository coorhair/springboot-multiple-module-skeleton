package vn.com.rega.moduleb;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import vn.com.rega.modulec.LibC;

@Slf4j
public class Main {
    public static void main(String[] args) {
        LibC c = new LibC();
        c.setMessage("Hello world!");
        System.out.println(c.doJob());
        log.info(c.doJob());
        Runtime.getRuntime().addShutdownHook(new Thread(LogManager::shutdown));
    }
}