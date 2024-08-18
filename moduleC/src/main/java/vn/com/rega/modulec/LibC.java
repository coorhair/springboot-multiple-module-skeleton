package vn.com.rega.modulec;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class LibC {
    private String message;

    public LibC() {
        System.out.println("create libC instance");
    }

    public String doJob() {
        return StringUtils.isEmpty(getMessage()) ? "processed in libC" : getMessage();
    }
}