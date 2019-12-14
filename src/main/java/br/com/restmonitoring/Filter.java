package br.com.restmonitoring;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Filter implements javax.servlet.Filter {

    private static Queue queue;

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if(res.getStatus() == 200) {

        }
    }

    public static Queue getQueue() {
        return queue;
    }
}
