package nl.edmi.NeuralNetwork.Cells;

import nl.edmi.NeuralNetwork.BetAnswer;
import nl.edmi.NeuralNetwork.ICell;

/**
 * Created by Ivan on 8-3-2017.
 */
@SuppressWarnings("Duplicates")
public class ProgrammedCell6 implements ICell{

    @Override
    public BetAnswer FirstMove(double random) {
            return new BetAnswer(0.8);
    }

    @Override
    public BetAnswer SecondMove(double random, double hand, double inzet, double verlies) {
            return new BetAnswer(0.1);

    }

    @Override
    public BetAnswer ThirdMove(double random, double hand, double inzet, double verlies) {
        if(inzet == 0.71875 & verlies == 0.5) {
            return new BetAnswer(0);
        }else{
            if(verlies<=hand) {
                return new BetAnswer(0.5);
            }else{
                return new BetAnswer(0);
            }
        }
    }
}
