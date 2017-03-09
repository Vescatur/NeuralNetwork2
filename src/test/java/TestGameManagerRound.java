import nl.edmi.NeuralNetwork.Cells.ProgrammedCell1;
import nl.edmi.NeuralNetwork.Cells.ProgrammedCell2;
import nl.edmi.NeuralNetwork.Cells.ProgrammedCell3;
import nl.edmi.NeuralNetwork.GameManager;
import nl.edmi.NeuralNetwork.ICell;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ivan on 9-3-2017.
 */
public class TestGameManagerRound {

    @Test
    public void Test1_AlwaysBid5(){
        ICell cell1 = new ProgrammedCell2();
        ICell cell2 = new ProgrammedCell2();
        Assert.assertEquals(0, GameManager.RoundTwoCells(cell1,cell2,false),00000.1);
    }

    @Test
    public void Test1_BiddingWhenHave10(){
        ICell cell1 = new ProgrammedCell2();
        ICell cell2 = new ProgrammedCell3();
        Assert.assertEquals(-12100, GameManager.RoundTwoCells(cell1,cell2,true),00000.1);
    }
}
