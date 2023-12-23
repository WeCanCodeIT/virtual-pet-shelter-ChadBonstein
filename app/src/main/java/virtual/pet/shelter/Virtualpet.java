package virtual.pet.shelter;

public class Virtualpet{

        // Attributes
        private String name;
        private int hunger;
        private int thirst;
        private int boredom;
    
        public Virtualpet(String name) {
            this.name = name;
            this.hunger = 25;
            this.thirst = 25;
            this.boredom = 25;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getHunger() {
            return hunger;
        }
    
        public void setHunger(int hunger) {
            this.hunger = hunger;
        }
    
        public int getThirst() {
            return thirst;
        }
        public void setThirst(int thirst) {
            
                this.thirst = thirst;
            
             
        }
    
        public int getBoredom() {
            return boredom;
        }
    
        public void setBoredom(int boredom) {
            this.boredom = boredom;
        }

        // feed
        public void feed(){
            thirst +=3;
            hunger -=10;
            boredom +=3;
        }

        //thirst
         public void thirst(){
            thirst -=10;
            hunger +=3;
            boredom +=3;
        }


        //play

         public void play(){
            thirst +=3;
            hunger +=3;
            boredom -=10;
        }

        //tick
        public void tick(){
            thirst++;
            hunger++;
            boredom++;
        }
    
        public void display() {
            System.out.println("Name: " + name + " Hunger: " + hunger + " Thirst: " + thirst + " Boredom: " + boredom );
        }

        public String increaseHunger() {
            return null;
        }

        public void decreaseCleanliness() {
        }

        public void cleanDiaper() {
        }
    
    }

