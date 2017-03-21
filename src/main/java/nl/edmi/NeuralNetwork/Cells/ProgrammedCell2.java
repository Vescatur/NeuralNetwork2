package nl.edmi.NeuralNetwork.Cells;

import nl.edmi.NeuralNetwork.BetAnswer;
import nl.edmi.NeuralNetwork.ICell;

/**
 * Created by Ivan on 8-3-2017.
 */
@SuppressWarnings("Duplicates")
public class ProgrammedCell2 implements ICell{

    @Override
    public BetAnswer FirstMove(double random) {
        return new BetAnswer(0.1);

    }

    @Override
    public BetAnswer SecondMove(double random, double hand, double inzet, double verlies) {
        return new BetAnswer(0.1);

    }

    @Override
    public BetAnswer ThirdMove(double random, double hand, double inzet, double verlies) {
        return new BetAnswer(0.1);
    }

    @Override
    public ICell Clone() {
        return new ProgrammedCell2();
    }
}
