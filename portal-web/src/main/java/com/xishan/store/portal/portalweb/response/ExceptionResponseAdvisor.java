package com.xishan.store.portal.portalweb.response;

import com.xishan.store.base.exception.RestException;
import com.xishan.store.base.util.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionResponseAdvisor {
    //运行时异常
    @ExceptionHandler(RestException.class)
    @ResponseBody
    public Response runtimeExceptionHandler(RuntimeException ex){
        return Response.fail(ex.getMessage(),Object.class);
    }
}
