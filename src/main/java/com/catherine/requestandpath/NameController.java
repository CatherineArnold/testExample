package com.catherine.requestandpath;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@RestController
public class NameController {
    @RequestMapping(value ="/name/{first}", method = RequestMethod.GET )
    @ResponseBody
    public Object getFirstName(
        @PathVariable(value ="first") String first, @RequestParam (value = "last", required=false) String last) {
            if(last == null)
                return new Car("BMW", 2015, Arrays.asList("AirCon", "AirBag", "Power Steering"));
            else
                return "First name is " + first + " last name is " + last;
        }

        @RequestMapping(value ="/car", method = RequestMethod.POST )
        @ResponseBody
        public Object createCar(@RequestBody Car newCar, @RequestParam String name){
            newCar.setType(name);
            System.out.println(newCar);
            return newCar;
        }
    }
