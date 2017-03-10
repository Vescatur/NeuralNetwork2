package nl.edmi.NeuralNetwork;

/**
 * Created by Ivan on 10/03/2017.
 */
public class MarkovChainManager {

    public static double[][] CalculateTransitionMatrix(ICell cells){
        return null;
    }



    public static double[] CalculateStableDistribution(double[][] TransitionMatrix){
        double[] oldDistribution = new double[TransitionMatrix.length];
        for(int i = 0; i<oldDistribution.length;i++) {
            oldDistribution[i] = 1.0/oldDistribution.length;
        }
        printTable(oldDistribution);

        for(int i =0;i<100;i++){
            double[] newDistribution = new double[TransitionMatrix.length];
            for(int x = 0; x<TransitionMatrix.length;x++){
                for(int y = 0; y<TransitionMatrix.length;y++) {
                    newDistribution[y] += oldDistribution[x]*TransitionMatrix[x][y];
                }
            }
            oldDistribution = newDistribution;
            printTable(oldDistribution);
        }
        return oldDistribution;
    }

    public static void printTable(double[] twoDm){
            for (double i : twoDm) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
    }
}
