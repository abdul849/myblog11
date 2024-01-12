package myblog.myblog.exception;
import myblog.myblog.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
public class GlobleExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerResourceNotFoundException(ResourceNotFoundException e, WebRequest w, boolean includeClientInfo, ErrorDetails ErrorDetails){

        ErrorDetails errorDetails=new ErrorDetails(e.getMessage(),new Date(),w.getDescription(includeClientInfo));
        return new ResponseEntity<>(ErrorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
