package com;

import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by yangliu on 9/08/2017.
 */

@Data
public class People extends ResourceSupport {
    private String name;
    private int age;
    private String title;
}
