package Clinic;

/**
 * виды животных
 */
public enum TypeOfPet {
  CAT,
  DOG,
  FISH,
  BIRD,
  HORSE,
  OTHER_PET;

  /**
   * выбор вида животного
   */
  public static TypeOfPet getTypeOfPet(int number){
    switch (number) {
      case 1: return CAT;
      case 2: return DOG;
      case 3: return FISH;
      case 4: return BIRD;
      case 5: return HORSE;
      default: return OTHER_PET;
    }
  }
}
