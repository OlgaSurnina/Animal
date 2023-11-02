public abstract class Animal {

    public abstract void move();


    public  static class Cat extends Animal {

        @Override
        public void move() {
            System.out.println("Я побежал");
        }
    }

    public static class Fish extends Animal {

        @Override
        public void move() {
            System.out.println("Я поплыла");
        }
    }

    public static class Duck extends Animal {

        @Override
        public void move() {
            System.out.println("Я полетела");
        }
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        Fish fish = new Fish();
        Duck duck = new Duck();

        cat.move();
        fish.move();
        duck.move();
    }
}
