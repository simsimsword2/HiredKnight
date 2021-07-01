package com.HN.HiredKnight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HiredKnightApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiredKnightApplication.class, args);
	}

	@GetMapping("/")
	public String make(@RequestParam(value = "equip", defaultValue = "man") String equip) {


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

		return String.format("Soldier: ", tempSoldier.getDescription());
	}

	public String delete(@RequestParam(value = "description") String description) {
		return String.format("deleted");
	}

}
