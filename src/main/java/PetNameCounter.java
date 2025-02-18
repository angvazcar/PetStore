
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Recibe lista de mascotas y cuenta cuántas veces aparece cada nombre
    public class PetNameCounter {
        private Map<String, Integer> nameCountMap;

        public PetNameCounter(List<Pet> pets) {
            this.nameCountMap = new HashMap<>();
            countNames(pets);
        }

        private void countNames(List<Pet> pets) {
           // System.out.println("Mascotas recibidas en PetNameCounter:");
           // for (Pet pet : pets) {
            //    System.out.println(pet.getName());
          //  }
            for (Pet pet : pets) {
                String name = pet.getName();
                nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
            }
        }

        public void printNameCounts() {
            System.out.println("Frecuencia de nombres de mascotas vendidas:");
            System.out.println(nameCountMap);
        }
    }


