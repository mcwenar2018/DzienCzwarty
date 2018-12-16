//plik 1 + 2 + 3 + 4
// modyfikatory dostepy
public class Sample {

    public static void main(String[] args) {
        A a = new A();
        a.setCounter(5);
        a.setName("Andrzej");
        a.setCounter(34);

        System.out.println(a.getCounter());

        WashingMachine  wm = new WashingMachine();
        wm.modeForSensitiveClothes();
        wm.showSettings();
        wm.modeForTowels();
        wm.showSettings();

        B b = new B();
        b.setCounter(12);
        System.out.println("Counter: " + b.getCounter());

        Rectangle rectangle = new Rectangle("Zielony",4,5);
        rectangle.show();



    }
}




class A { // dobra praktyka ustawiania gettera i settera do pracy, nie umozliwiamy pracy na danych
    protected int counter;
    protected String name;



    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter > 20){
            System.out.println("Przekroczyles zakres!");
        } else if (counter <0){
            System.out.println("Nie mozesz ustawic wartosci ujemnej");
        } else {
        this.counter = counter;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A{
    void show(){
        System.out.println("licznik: " + getCounter());
        System.out.printf("imie: " + getName());
    }


    public int getCounter() {
        System.out.println("Teraz uruchamiamy z klasy B");
        return counter;
    }
}