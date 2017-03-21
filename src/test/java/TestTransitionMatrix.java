
import nl.edmi.NeuralNetwork.Cells.ProgrammedCell5;
import nl.edmi.NeuralNetwork.Cells.ProgrammedCell6;
import nl.edmi.NeuralNetwork.Cells.ProgrammedCell7;
import nl.edmi.NeuralNetwork.GameManager;
import nl.edmi.NeuralNetwork.ICell;
import nl.edmi.NeuralNetwork.MarkovChainManager;
import org.junit.Test;

/**
 * Created by Ivan on 10-3-2017.
 */
public class TestTransitionMatrix {
    @Test
    public void Test1(){
        ICell[] cells = {new ProgrammedCell5(),new ProgrammedCell6(),new ProgrammedCell7()};
        GameManager.printTable(MarkovChainManager.CalculateTransitionMatrix(cells),3);
    }
}
