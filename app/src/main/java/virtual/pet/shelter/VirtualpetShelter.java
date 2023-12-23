package virtual.pet.shelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualpetShelter {
     private Map<Integer, Virtualpet> petMap = new HashMap<>();

    private int petID;
    

    public void admitPet(Virtualpet pet) {
        petID++;
        petMap.put(petID, pet);
    }

    

    public void checkoutPet(int id) {
        petMap.remove(id);
    }

   

    public void playTime() {
        for (Map.Entry<Integer, Virtualpet> entry : petMap.entrySet()) {
            entry.getValue().play();
        }
    }

    public void feedTime() {
        for (Map.Entry<Integer, Virtualpet> entry : petMap.entrySet()) {
            entry.getValue().feed();
        }
    } 
    
    public void thirstTime() {
        for (Map.Entry<Integer, Virtualpet> entry : petMap.entrySet()) {
            entry.getValue().thirst();
        }
    }


   

   

        public void displayPets() {
        if (!petMap.isEmpty()) {

            System.out.println("\t Pets");
            for (Entry<Integer, Virtualpet> entry : petMap.entrySet()) {
                Virtualpet pet = entry.getValue();
                System.out.println(
                        "ID: " + entry.getKey() + " Name: " + pet.getName() + " Thirst: " + pet.getThirst()
                                + " Hunger: " + pet.getHunger() + " Boredom: "
                                + pet.getBoredom());
            }
        }

    }



        public Map<Integer, Virtualpet> getPetMap() {
            return petMap;
        }






}

