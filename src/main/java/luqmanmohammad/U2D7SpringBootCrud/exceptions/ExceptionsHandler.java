package luqmanmohammad.U2D7SpringBootCrud.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionsHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorsPayload> handleGeneric(Exception e) {
		System.out.println(e);
		ErrorsPayload payload = new ErrorsPayload("Errore Generico", new Date(), 500);

		return new ResponseEntity<ErrorsPayload>(payload, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
