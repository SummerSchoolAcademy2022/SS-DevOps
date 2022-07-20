package no.kantega.springandreact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @GetMapping("/api/items")
    public List<String> getItems() {
        String a[] = new String[] { "Item1", "Item2", "Item3", "Item4" };
        return Arrays.asList(a);
    }
}
