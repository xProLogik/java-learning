package Clinic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс клиника
 */
public class Clinic {
  /**
   * список клиентов
   */
  private final ArrayList<Client> clients = new ArrayList<>();

  /**
   * заполнение клиники клиентами
   */
  public void addClients() {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Add new client? (yes/no): ");
      String exit=scan.next();
      while (exit.equals("yes")) {
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.println("What is your animal: ");
        String petName;
        TypeOfPet typeOfPet;
        int petAge;
          for (TypeOfPet pet : TypeOfPet.values()) {
            System.out.println(pet.ordinal() + 1 + ". " + pet.toString());
          }
          typeOfPet = TypeOfPet.getTypeOfPet(scan.nextInt());
          System.out.print("Enter name your Pet: ");
          petName = scan.next();
          System.out.print("Enter age your Pet: ");
          petAge = scan.nextInt();
        this.clients.add(new Client(name, new Pet(typeOfPet, petName, petAge)));
        System.out.print("Add new client? (yes/no): ");
        exit = scan.next();
      }
    }
  }

  /**
   * добавление одного клиента
   */

  public void addClient(final Client client) {
    this.clients.add(client);
  }

  /**
   * поиск по кличке питомца
   */
  public void findClientsByPetName(final String name) {
    this.clients.stream().filter(client -> client.getPet().getName().equals(name)).forEach(System.out::println);
  }
  /**
   * поиск по имени хозяина
   */
  public void findClientsByClientName(final String name) {
    this.clients.stream().filter(client -> client.getName().equals(name)).forEach(System.out::println);
  }
  /**
   * показывает всю базу клиники
   */
  public void showClinicBase() {
    this.clients.forEach(System.out::println);
  }

  /**
   * редактирование имени
    * @param name искомое имя
   * @param newName новое имя
   */
  public void changeNameClient(final String name,final String newName){
    for(Client client:this.clients){
      if (client.getName().equals(name)) client.setName(newName);
    }
  }
  /**
   * редактирование клички
   * @param name искомая кличка
   * @param newName новая кличка
   */
  public void changeNamePet(final String name,final String newName) {
    for (Client client : this.clients) {
      if (client.getPet().getName().equals(name)) client.getPet().setName(newName);
    }
  }
}
