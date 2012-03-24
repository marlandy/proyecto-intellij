package com.autentia.pruebaintellij;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: marlandy
 * Date: 24/03/12
 * Time: 12:28
 * To change this template use File | Settings | File Templates.
 */
public class Filtro implements Filter {

    private static final Log log = LogFactory.getLog(Filtro.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(saluda());
    }

    protected String saluda() {
        return "Hola soy un filtro y cambio el mensaje";
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }


    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
