package com.epam.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.logging.App;

import java.util.*;

public class Houseconstructioncost {
	private static final Logger LOGGER = LogManager.getLogger(Houseconstructioncost.class);
	public static void main(String[] args) {
		LOGGER.info("\nVarious type of construction materials:\n\n");
		System.out.format("\n1.Standard materials \n2.Above Standard materials \n3.High Standard material \n4.High Standard material and fully automated home\n\n");
		Scanner sc = new Scanner(System.in);
		costcalculation c = new costcalculation();
		System.out.format("\nSelect the standard of material used for constructing house:");
		int choice = sc.nextInt();
		System.out.format("\nEnter the total area of house in square feet:\n");
		float housearea = sc.nextFloat();
		float totalamount = c.materialtype(choice, housearea);
		System.out.format("House construction cost,based on selected type of material:\n" + totalamount + "INR");

	}

}


