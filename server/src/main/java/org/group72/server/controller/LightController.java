package org.group72.server.controller;

import org.group72.server.dao.LightRepository;
import org.group72.server.model.LightNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * This class defines the API for handling CRUD requests
 * of Lights.
 */
@Controller
@RequestMapping(path="/light")
public class LightController {
    @Autowired // This means to get the bean called lightRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private LightRepository lightRepository;

//    @PostMapping(path="/addLight") // Map ONLY POST Requests
//    public @ResponseBody
//    String addNewlight (@RequestParam String type, @RequestParam Properties property, @RequestParam Geometry geometry) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        LightNode l = new LightNode();
//        l.setType();
//        l.setProperty();
//        l.setGeometry();
//        lightRepository.save(l);
//        return "Saved light";
//    }

    @GetMapping(path="/allLights")
    public @ResponseBody Iterable<LightNode> getAllLights() {
        // This returns a JSON or XML with the users
        return lightRepository.findAll();
    }


}