package nl.edmi.NeuralNetwork;

/**
 * Created by Ivan on 8-3-2017.
 */
public interface ICell {
    BetAnswer FirstMove(double random);
    BetAnswer SecondMove(double random,double hand,double inzet,double verlies);
    BetAnswer ThirdMove(double random,double hand,double inzet,double verlies);
    ICell Clone();
}
