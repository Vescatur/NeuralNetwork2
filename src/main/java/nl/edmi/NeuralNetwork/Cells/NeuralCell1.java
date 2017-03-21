package nl.edmi.NeuralNetwork.Cells;

import nl.edmi.NeuralNetwork.BetAnswer;
import nl.edmi.NeuralNetwork.ICell;
import nl.edmi.NeuralNetwork.NeuralNet;

import java.util.ArrayList;

/**
 * Created by Ivan on 13-3-2017.
 */
public class NeuralCell1 implements ICell {

    private NeuralNet Net1;
    private NeuralNet Net2;
    private NeuralNet Net3;

    public NeuralCell1(){
        int[] Layers1 = {1,3,2,1};
        Net1 = new NeuralNet(Layers1);
        int[] Layers2 = {4,5,4,3,2,1};
        Net2 = new NeuralNet(Layers2);
        int[] Layers3 = {4,5,4,3,2,1};
        Net3 = new NeuralNet(Layers3);
    }

    public NeuralCell1(NeuralNet Net1,NeuralNet Net2,NeuralNet Net3){
        this.Net1 = Net1;
        this.Net2 = Net2;
        this.Net3 = Net3;
    }

    @Override
    public BetAnswer FirstMove(double random) {
        double[] input = {random};
        ArrayList<Double> answerList = Net1.CalculateOutput(input);
        BetAnswer answer = new BetAnswer(answerList.get(0));

        return answer;
    }

    @Override
    public BetAnswer SecondMove(double random, double hand, double inzet, double verlies) {
        double[] input = {random,hand,inzet,verlies};
        ArrayList<Double> answerList = Net2.CalculateOutput(input);
        BetAnswer answer = new BetAnswer(answerList.get(0));
        return answer;
    }

    @Override
    public BetAnswer ThirdMove(double random, double hand, double inzet, double verlies) {
        double[] input = {random,hand,inzet,verlies};
        ArrayList<Double> answerList = Net3.CalculateOutput(input);
        BetAnswer answer = new BetAnswer(answerList.get(0));
        return answer;
    }

    @Override
    public ICell Clone() {
        ICell Cell =  new NeuralCell1(Net1.Clone(),Net2.Clone(),Net3.Clone());
        return Cell;
    }
}
