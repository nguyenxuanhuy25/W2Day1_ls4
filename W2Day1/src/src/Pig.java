
public class Pig extends Animals{
    public Pig(String location, double weight, String food, String noise) {
        super();
        }

    public Pig() {

    }

    @Override
        public void makeNoise() {
            System.out.println("Oink Oink");
        }
        @Override
        public void eat (String food) {
            System.out.println("Pig ate vegetable");
        }
    }

