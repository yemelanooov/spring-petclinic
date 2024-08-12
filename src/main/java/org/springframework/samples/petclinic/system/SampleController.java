package org.springframework.samples.petclinic.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/sample")
    public String getSampleResponse() {
        return "Sample Response";
    }
}
