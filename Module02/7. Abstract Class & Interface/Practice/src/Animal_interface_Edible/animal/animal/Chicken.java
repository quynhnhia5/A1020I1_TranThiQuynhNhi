package Animal_interface_Edible.animal.animal;

import Animal_interface_Edible.animal.animal.Animal;
import Animal_interface_Edible.animal.edible.Edible;

public class Chicken extends Animal implements Edible {
  @Override
  public String makeSound() {
    return "Chicken: cluck-cluck!";
  }

  @Override
  public String howToEat() {
    return "could be fried";
  }
}
