package nl.edmi.NeuralNetwork;

import com.sun.org.apache.bcel.internal.generic.NEW;
import nl.edmi.NeuralNetwork.Cells.*;

import java.util.*;

/**
 * Created by Ivan on 12-3-2017.
 */
public class Evolution {
    private int Loop = 1;
    private int Turn = 1;
    static final Random rand = new Random();

    public void startEvolution(){
        ArrayList<ICell> baseCells = new ArrayList<>();
        baseCells.add(new ProgrammedCell8());
        baseCells.add(new NeuralCell1());
        //baseCells.add(new NeuralCell1());

        while(true){
            ICell[] arrayBaseCells = baseCells.toArray(new ICell[baseCells.size()]);
            double[] StableDistribution = MarkovChainManager.CalculateStableDistribution(arrayBaseCells);
            double[][] print2 = {StableDistribution};
            GameManager.printTable(print2,7);
            ICell NewCell = loopEvolution(baseCells,StableDistribution);
            Loop++;
            Turn = 0;

            System.out.println("Please enter a number");
            while(true) {
                int input = Communication.GetNextInt();
                System.out.println(input);
                if (input == 1) {
                    break;
                } else if (input == 2) {
                    for (int i = 0; i < baseCells.size(); i++) {
                        System.out.println(i);
                        GameManager.RoundTwoCells(NewCell, baseCells.get(i), true);
                    }
                } else if (input == 3) {
                    ArrayList<ICell> tempBaseCells = new ArrayList<>(baseCells);
                    tempBaseCells.add(NewCell);
                    ICell[] tempArrayBaseCells = tempBaseCells.toArray(new ICell[tempBaseCells.size()]);
                    GameManager.printTable(MarkovChainManager.CalculateTransitionMatrix(tempArrayBaseCells),7);
                }
            }

            baseCells.add(NewCell);
        }
    }

    private ICell loopEvolution(ArrayList<ICell> baseCells, double[] StableDistribution) {
        ArrayList<HostCell> evolutionCells = new ArrayList<>();
        for(int i = 0; i<50;i++){
            evolutionCells.add(new HostCell(new NeuralCell1()));
        }

        while(true){
            evolutionCells = turnEvolution(evolutionCells,baseCells,StableDistribution);
            for (int i =0; i <evolutionCells.size(); i += 10) {
                System.out.println(evolutionCells.get(i).getScore());
            }
            if(evolutionCells.get(0).getScore()>=-10000){
//                System.out.println("Please enter a number");
//                int input = Communication.GetNextInt();
//                System.out.println(input);
//                if(input == 1){
//                    System.out.println("a");
//                    break;
//                }else if(input == 2){
//                    System.out.println("b");
//                    //doe niks
//                }else if(input == 3){
//                    System.out.println("c");
//                    for (int i =0; i <evolutionCells.size(); i += 10) {
//                        System.out.println(evolutionCells.get(i).getScore());
//                    }
//                }
                return evolutionCells.get(0).getCell();
            }
        }
    }

    private ArrayList<HostCell> turnEvolution(ArrayList<HostCell> evolutionCells,ArrayList<ICell> baseCells, double[] StableDistribution) {
        System.out.println("loop " + Loop + " Turn " + Turn);
        Turn++;
        int NumberOfCells = evolutionCells.size();

        for (int i = NumberOfCells/2; i <NumberOfCells; i++) {
            evolutionCells.set(i,evolutionCells.get(rand.nextInt(NumberOfCells)).Clone());
        }

        for (int i=NumberOfCells/2; i < NumberOfCells; i++) {
            evolutionCells.get(i).setScore(GameManager.CalculateScore(evolutionCells.get(i).getCell(),baseCells,StableDistribution));
        }

        Collections.sort(evolutionCells);

        return evolutionCells;
    }


}
