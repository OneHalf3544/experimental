package ru.onehalf.testprogram.web;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* <p/>
* <p/>
* Created: 08.10.12 23:04
* <p/>
*
* @author OneHalf
*/
public class ProfileNotFoundExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof ProfileNotFoundException) {

        }
        return null;
    }
}
