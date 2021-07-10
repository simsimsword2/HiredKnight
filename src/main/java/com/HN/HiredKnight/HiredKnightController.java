package com.HN.HiredKnight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HiredKnightController {


    @Autowired
    CampService campService;


    @GetMapping()
    public Response_createSoldier[] showCamp(){
        return campService.returnAll();
    }


    @PutMapping()
    public Response_createSoldier[] addToCamp(@RequestParam(value = "equip") String equip
                         ,@RequestParam(value = "number", defaultValue = "1") int number) {


        // decorator
        Soldier tempSoldier = new NakedSoldier();

        if (equip.contains("axe")) {
            tempSoldier = new Axe(tempSoldier);
        } else if (equip.contains("sword")) {
            tempSoldier = new Sword(tempSoldier);
        } else if (equip.contains("lance")) {
            tempSoldier = new Lance(tempSoldier);
        }

        if (equip.contains("heavyarmour")) {
            tempSoldier = new HeavyArmour(tempSoldier);
        } else if (equip.contains("lightarmour")) {
            tempSoldier = new LightArmour(tempSoldier);
        }

        if (equip.contains("horse")) {
            tempSoldier = new Horse(tempSoldier);
        }

        // database
        Camp newSoldier = new Camp();
        newSoldier.setDescription(tempSoldier.getDescription());
        newSoldier.setCost(tempSoldier.getCost());
        newSoldier.setQuantity(number);

        // save into database
        campService.save(newSoldier);

        // get all data from database
        return showCamp();
    }


    @DeleteMapping()
    public Response_createSoldier[] demobilize(@RequestParam(value = "description") String description, @RequestParam(value = "number", defaultValue = "1") int number) {
        campService.delete(description, number);
        return showCamp();
    }

}
