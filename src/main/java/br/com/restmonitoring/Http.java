package br.com.restmonitoring;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;
import static java.lang.System.getProperty;

public class Http {

    private String endpoint;
    private boolean enabled;
    private int percentage;

    public Http() {
        this.endpoint = getProperty("rest-monitoring.endpoint");
        this.enabled = parseBoolean(getProperty("rest-monitoring.enabled"));
        this.percentage = parseInt(getProperty("rest-monitoring.percentage"));
    }

    public Object request(Request request) {

        return null;
    }
}