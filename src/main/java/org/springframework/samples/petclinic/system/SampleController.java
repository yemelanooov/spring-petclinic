package org.springframework.samples.petclinic.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String getSampleResponse() {
        return "This is a sample response";
    }
}
