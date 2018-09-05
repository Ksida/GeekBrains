package K3L1;

import K3L1.Obstrackes.*;
import K3L1.animals.Cat;
import K3L1.animals.Dog;
import K3L1.animals.Human;
import K3L1.animals.Participant;

public class Main {
    public static void main(String[] args) {
        Participant[] part = {new Cat("Barsik"),new Dog("Bobik")};
        Obstracle[] cross = {new Wall(80), new Cross(800)};


        for(Participant a: part){
            for(Obstracle o: cross){
                o.doIt(a);
                if(!a.isOnDistance()){
                    break;
                }
            }
        }
        for (Participant a : part) {
            a.info();
        }

        Course c = new Course(new Obstracle[] {new Wall(30), new Water(15), new Cross(300)}); // Создаем полосу препятствий
        Team team = new Team("x", new Human("Ivan"), new Cat("Barsik"), new Dog("Bobik")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
