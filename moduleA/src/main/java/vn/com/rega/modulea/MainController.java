package vn.com.rega.modulea;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.rega.modulec.LibC;

@Slf4j
@RestController
public class MainController {

    @Autowired
    private LibC libC;

    @GetMapping("dojob")
    public ResponseEntity<String> doJob(@RequestParam("msg") String message) {
        log.info("receive request doJob msg={}", message);
        libC.setMessage(message);
        String result = libC.doJob() + " done";

        return ResponseEntity.ok(result);
    }
}
