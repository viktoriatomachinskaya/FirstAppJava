public class Main {
    public static void main(String[] args) {
        //полиморфизм подтипов(классический?)
        /*Forms xForms = new Forms();
        Forms xTriang = new Triang();
        Forms xCirc = new Circ();
        xForms.shapearea();
        xTriang.shapearea();
        xForms.shapearea();
        xCirc.shapearea();*/


        // ad-hoc полиморфизм
        /*System.out.println(sum(2,3));
        System.out.println(sum(2.7, 2.4));
        }
        static int sum(int x,int y){
        return x+y;
        }

        static double sum (double x, double y){
        return x+y;
        }*/


        //параметрический полиморфизм
        Username<String> firstUser = new Username<String>("User1234");
        String firstUserusername = firstUser.getusername();
        System.out.println(firstUserusername);

        Username<Integer> secondUser = new Username<Integer>(18948);
        Integer secondUserusername = secondUser.getusername();
        System.out.println(secondUserusername);


        //параметрический полиморфизм
        /*Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Dog();
        animal1.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();*/

    }
}