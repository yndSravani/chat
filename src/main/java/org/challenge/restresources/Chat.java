package org.challenge.restresources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sravz on 6/24/2017.
 */
@RestController
@RequestMapping("/chat")
public class Chat {

    @RequestMapping(path = "",method = RequestMethod.GET)
    public String getGreeting() {
        String result="Hello ";
        return result;
    }

}

