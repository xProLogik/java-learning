package by.lesson.lessons.Clinic;

/**
 * Класс клиент
 */
public class Client {
  private static int count = 0;
  private final int id;
  private String name;
  private final Pet pet;

  Client(String name, final Pet pet) {
    this.id = count++;
    this.name = name;
    this.pet = pet;
  }
  Pet getPet() {
    return pet;
  }
  String getName() {
    return this.name;
  }
  public int getId() {
    return this.id;
  }
  void setName(final String name) {
    this.name = name;
  }
  public String toString() {
    return "id[" + id + "] name: " + this.name + " " + this.pet;
  }
}