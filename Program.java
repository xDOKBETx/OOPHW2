package HW2;

public class Program {

        public static void main(String[] args) {
        
        MyLog log = new MyLog();
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murka");
        Human man = new Human();
        log.append(man.callPet(cat1,"kis-kis"));
        log.append(cat1.listenHuman(man.callPet(cat1,"kis-kis")));
        log.append(man.callPet(cat1, "Hello, Barsik!"));
        log.append(cat1.listenHuman(man.callPet(cat1, "Hello, Barsik!")));
        log.append(man.touchAnimal(cat1));
        log.append(cat1.sayMur());
        man.addPet(cat1, cat2);
        log.append(man.callAllPets("Hey pets! Where are you?)"));
        man.delPet(cat1);
        log.append(man.callAllPets("Hey pets! Where are you?)"));
        Hamster hams = new Hamster("mr Homa");
        man.addPet(hams);
        log.append(man.callAllPets("Hey pets! Where are you?)"));
    
        log.viewEvents();
    }

}
