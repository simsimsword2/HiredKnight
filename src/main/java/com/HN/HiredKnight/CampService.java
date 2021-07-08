package com.HN.HiredKnight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CampService {

    @Autowired
    CampRepository campRepository;

    // if there is an entry in the database update quantity
    // otherwise save the new soldier
    protected void save(Camp newSoldier){

        if (campRepository.count() > 0) {

            Optional<Camp> databaseSoldier = campRepository.findById(newSoldier.getDescription());

            if (databaseSoldier.isPresent()) {
                newSoldier.setQuantity(newSoldier.getQuantity() + databaseSoldier.get().getQuantity());
            }
        }
        campRepository.save(newSoldier);
    }

    // deleting a soldier has two cases:
    // -soldier is deleted from de database
    // -quantity is reduced in the database
    protected void delete(Camp newSoldier){

        Optional<Camp> databaseSoldier = campRepository.findById(newSoldier.getDescription());

        if (databaseSoldier.isPresent()) {

            if (newSoldier.getQuantity() >= databaseSoldier.get().getQuantity()) {
                campRepository.deleteById(newSoldier.getDescription());
            } else {
                newSoldier.setQuantity(databaseSoldier.get().getQuantity() - newSoldier.getQuantity());
                campRepository.save(newSoldier);
            }
        }
    }

    // get data from database, convert to JSON, return as an array
    protected Response_createSoldier[] returnAll(){

        Response_createSoldier[] responseList = new Response_createSoldier[(int)campRepository.count()];

        if (campRepository.count() > 0) {
            Iterable<Camp> database = campRepository.findAll();

            int i = 0;
            for (Camp camp : database) {
                responseList[i++] = toJson(camp);
            }
        }

        return responseList;
    }

    // converts description, cost and quantity into a JSON
    private Response_createSoldier toJson(Camp soldier){

        Response_createSoldier response = new Response_createSoldier();
        response.soldier_description = soldier.getDescription();
        response.sodier_quantity = soldier.getQuantity();
        response.soldier_cost = soldier.getCost();

        return response;
    }
}
