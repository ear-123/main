package main;


public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public void speak(String text) {
        if(text == ""){
            System.out.println("Olen " + this.name+ " ja ikäni on " + this.age + " vuotta, mutta antaisitko sili syötteen?");
        }
        else {
            System.out.println(name + ": " + text);
        }
        
    }

    public void newHedgehog(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
    
    public void run(int laps) {
        int i = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println(this.name + " juoksee kovaa vauhtia!");
            i = i + 1;
            if (i >= laps) {
                exit = true;
            }
        
        }
    }
}

