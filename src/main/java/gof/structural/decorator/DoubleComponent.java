package gof.structural.decorator;

public class DoubleComponent implements Component {
    @Override
    public double execute(double number) {
        return number * number;
    }
}
