package Clinic;

/**
 * Работа Клиники
 */
public class ClinicRunner {
  public static void main(String[] args) {
    final Clinic clinic = new Clinic();
    //добавление клиентов с клавы
    clinic.addClients();
    // прописанные изначально клиенты
    clinic.addClient(new Client("John", new Pet(TypeOfPet.DOG, "Dug", 15)));
    clinic.addClient(new Client("Merry", new Pet(TypeOfPet.CAT, "Bunny", 9)));
    clinic.addClient(new Client("Kate", new Pet(TypeOfPet.FISH, "Betty" , 2)));
    //показать базу клиники
    clinic.showClinicBase();
    //поиски по имени клиента и кличке животного
    clinic.findClientsByPetName("Dug");
    clinic.findClientsByClientName("Merry");
    //редактирование имени человека и клички животного
    clinic.changeNameClient("John","Bob");
    clinic.changeNamePet("Bunny","Hallo");

    clinic.showClinicBase();
  }
}