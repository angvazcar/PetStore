import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Obtener la lista de mascotas vendidas
        List<Pet> soldPets = PetStore.getSoldPets();

        // Instanciar la clase que cuenta los nombres
        PetNameCounter counter = new PetNameCounter(soldPets);

        // Mostrar los resultados
        counter.printNameCounts();
    }
}
