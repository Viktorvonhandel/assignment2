package main;

public class Hedgehog {
    private String name;
    private int age;
    
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String text) {
        if (text.isEmpty()) {
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        } else {
            System.out.println(name + ": " + text);
        }
    }

    public void run(int kerrat) {
        for (int i = 0; i < kerrat; i++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }
}

