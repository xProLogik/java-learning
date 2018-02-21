package by.lesson.lessons.Clinic;

/**
 * Описание животных
 */
public class Pet {
  private String name;
  private final TypeOfPet typeOfPet;
  private final int age;

  Pet(TypeOfPet typeOfPet, String name, int age) {
    this.name = name;
    this.typeOfPet = typeOfPet;
    this.age = age;
  }
  void setName(final String name){
    this.name=name;
  }
  String getName() {
    return this.name;
  }
  public String toString() {
    return "Type of Pet: " + this.typeOfPet + " name of Pet:  " + this.name + " age: " + this.age;
  }
}
