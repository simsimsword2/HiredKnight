package com.HN.HiredKnight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiredKnightController {


    @Autowired
    CampService campService;


    @GetMapping("/make")
    public Response_createSoldier[] camp(@RequestParam(value = "equip") String equip, @RequestParam(value = "number", defaultValue = "1") int number) {

        Soldier tempSoldier = new NakedSoldier();

        if (equip.contains("axe")) {
            tempSoldier = new Axe(tempSoldier);
        } else if (equip.contains("sword")) {
            tempSoldier = new Sword(tempSoldier);
        } else if (equip.contains("lance")) {
            tempSoldier = new Lance(tempSoldier);
        }

        if (equip.contains("heavy_ armour")) {
            tempSoldier = new HeavyArmour(tempSoldier);
        } else if (equip.contains("lightarmour")) {
            tempSoldier = new LightArmour(tempSoldier);
        }

        if (equip.contains("horse")) {
            tempSoldier = new Horse(tempSoldier);
        }

        // database
        //CampService campService = new CampService();
        Camp newSoldier = new Camp();

        newSoldier.setDescription(tempSoldier.getDescription());
        newSoldier.setCost(tempSoldier.getCost());
        newSoldier.setQuantity(number);

        // save into database
        campService.save(newSoldier);


        // get all data from database
        Response_createSoldier[] response;
        response = campService.returnAll();


        return response;
    }

    //todo
    @DeleteMapping("/DELETE")
    public Response_createSoldier[] delete(@RequestParam(value = "description") String description, @RequestParam(value = "number", defaultValue = "1") int number) {
        campService.delete(description, number);
        return campService.returnAll();
    }

}
