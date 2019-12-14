package br.com.restmonitoring;

public class Request {

    private String body;
    private String httpMethod;
    private String params;
    private String path;

    public Request(String body, String httpMethod, String params, String path) {
        this.body = body;
        this.httpMethod = httpMethod;
        this.params = params;
        this.path = path;
    }

    public String getBody() {
        return body;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getParams() {
        return params;
    }

    public String getPath() {
        return path;
    }
}
