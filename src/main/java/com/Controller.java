package com;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangliu on 9/08/2017.
 */
@RestController
@RequestMapping(value="/api")
public class Controller {

    @RequestMapping(value = "people")
    public ResponseEntity<People> getPeople() {
        People people = new People();
        people.setAge(30);
        people.setName("kevin");
        people.setTitle("Mr");
        Link link = ControllerLinkBuilder.linkTo(Controller.class).slash("id").withSelfRel();
        //Link link = linkTo(methodOn(Controller.class).getPeople()).withSelfRel();
        people.add(link);
        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}
