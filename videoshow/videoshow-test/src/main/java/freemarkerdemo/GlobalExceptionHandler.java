package freemarkerdemo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
//    public Map<String, Object> exceptionHandler() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("errorCode", "404");
//        map.put("errorMsg", "找不到页面!");
//        return map;
//    }

    @ExceptionHandler(RuntimeException.class)
    public String exceptionHandler() {
        return "error_404.html";
    }
}