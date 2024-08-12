package org.springframework.samples.petclinic.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping
    public String getSampleResponse() {
        return "Updated Sample Response";
    }
}
