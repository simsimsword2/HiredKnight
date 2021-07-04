package com.HN.HiredKnight;

import ch.qos.logback.core.spi.PreSerializationTransformer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class HiredKnightApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiredKnightApplication.class, args);
	}

	@GetMapping("/make")
	public Response_createSoldier create_soldier(@RequestParam(value = "equip") String equip, @RequestParam(value = "number", defaultValue = "1") int number) {

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

		// in Datenbank

		//JSON
		Response_createSoldier response = new Response_createSoldier();
		response.soldier_description = tempSoldier.getDescription();
		response.sodier_quantity = number;
		response.soldier_cost = tempSoldier.getCost();

		return response;
	}

	@DeleteMapping("/DELETE")
	public String delete(@RequestParam(value = "description") String description) {
		System.out.println(description);
		return "deleted " + description;
	}

}
