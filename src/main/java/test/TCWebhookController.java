package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by apurv on 12-08-2018.
 */
@RestController
public class TCWebhookController {

    @Autowired
    private BuildReporterService buildReporterService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Demo(){
        return "I am awesome";
    }

    @RequestMapping(value = "/build/webhook", method = RequestMethod.GET)
    public String buildWebhook(){
        return "I am awesome in /build/webhook";
    }

    @RequestMapping(value = "/build/webhook", method = RequestMethod.POST,consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> handleTCWebhook(@RequestBody TCWebhookReqDto reqDto){
        System.out.println("Payload :: " + reqDto);
        buildReporterService.reportBuild(reqDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("I am awesome in /build/webhook POST");
    }
}
