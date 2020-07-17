package com.epam.logging;



public class costcalculation {
	float materialtype(int choice, float housearea) {
		float totalconstructioncost = 0;
		if (choice == 1) {
			int standardmaterialcostpersquarefeet = 1200;
			totalconstructioncost = standardmaterialcostpersquarefeet * housearea;
		} else if (choice == 2) {
			int abovestandardmaterialcostpersquarefeet = 1500;
			totalconstructioncost = abovestandardmaterialcostpersquarefeet * housearea;
		} else if (choice == 3) {
			int highstandardmaterialcostpersquarefeet = 1800;
			totalconstructioncost = highstandardmaterialcostpersquarefeet * housearea;
		} else if (choice == 4) {
			int highstandardmaterialandfullyautomatedcostpersquarefeet = 2500;
			totalconstructioncost = highstandardmaterialandfullyautomatedcostpersquarefeet * housearea;
		} else {
			System.out.format("select valid option from given type of materials(1 To 4)\n");
		}
		return totalconstructioncost;
	}
}