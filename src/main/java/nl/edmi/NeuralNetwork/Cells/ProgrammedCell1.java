package nl.edmi.NeuralNetwork.Cells;

import nl.edmi.NeuralNetwork.BetAnswer;
import nl.edmi.NeuralNetwork.ICell;

/**
 * Created by Ivan on 8-3-2017.
 */
@SuppressWarnings("Duplicates")
public class ProgrammedCell1 implements ICell{

    @Override
    public BetAnswer FirstMove(double random) {
        if(random==0){
            return new BetAnswer(0.1);
        }else if(random==0.1) {
            return new BetAnswer(0);
        }else if(random==0.2) {
            return new BetAnswer(0.1);
        }else if(random==0.3) {
            return new BetAnswer(0.1);
        }else if(random==0.4) {
            return new BetAnswer(1);
        }else if(random==0.5) {
            return new BetAnswer(1);
        }else if(random==0.6) {
            return new BetAnswer(0.2);
        }else if(random==0.7) {
            return new BetAnswer(0.2);
        }else if(random==0.8) {
            return new BetAnswer(0.2);
        }else if(random==0.9) {
            return new BetAnswer(0.2);
        }else if(random==1) {
            return new BetAnswer(0.2);
        }
        return new BetAnswer(0.2);
    }

    @Override
    public BetAnswer SecondMove(double random, double hand, double inzet, double verlies) {
        if(random==0){
            return new BetAnswer(0.2);
        }else if(random==0.1) {
            return new BetAnswer(0.1);
        }else if(random==0.2) {
            return new BetAnswer(0);
        }else if(random==0.3) {
            return new BetAnswer(0.1);
        }else if(random==0.4) {
            return new BetAnswer(1);
        }else if(random==0.5) {
            return new BetAnswer(0.2);
        }else if(random==0.6) {
            return new BetAnswer(0.2);
        }else if(random==0.7) {
            return new BetAnswer(0.2);
        }else if(random==0.8) {
            return new BetAnswer(0.2);
        }else if(random==0.9) {
            return new BetAnswer(0.2);
        }else if(random==1) {
            return new BetAnswer(0.2);
        }
        return new BetAnswer(0.2);
    }

    @Override
    public BetAnswer ThirdMove(double random, double hand, double inzet, double verlies) {
        if(random==0){
            return new BetAnswer(0.2);
        }else if (random==0.1) {
            return new BetAnswer(0.1);
        }else if(random==0.2) {
            return new BetAnswer(0.1);
        }else if(random==0.3) {
            return new BetAnswer(0);
        }else if(random==0.4) {
            return new BetAnswer(1);
        }else if(random==0.5) {
            return new BetAnswer(0.2);
        }else if(random==0.6) {
            return new BetAnswer(0.2);
        }else if(random==0.7) {
            return new BetAnswer(0.2);
        }else if(random==0.8) {
            return new BetAnswer(0.2);
        }else if(random==0.9) {
            return new BetAnswer(0.2);
        }else if(random==1) {
            return new BetAnswer(0.2);
        }
        return new BetAnswer(0.2);
    }
}
