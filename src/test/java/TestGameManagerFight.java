import nl.edmi.NeuralNetwork.Cells.ProgrammedCell1;
import nl.edmi.NeuralNetwork.GameManager;
import nl.edmi.NeuralNetwork.ICell;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Ivan on 8-3-2017.
 */
public class TestGameManagerFight {

    @Test
    public void TestTest() {
        Assert.assertEquals(true,true);
    }

    @Test
    public void Test1_1Wins(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(6.25, GameManager.FightTwoCells(cell1,cell2,2,1,0,0),00000.1);
    }

    @Test
    public void Test2_2Wins(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(-6.25, GameManager.FightTwoCells(cell1,cell2,1,2,0,0),00000.1);
    }

    @Test
    public void Test3_Player1StopsRound1(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(0, GameManager.FightTwoCells(cell1,cell2,1,2,1,0),00000.1);
    }

    @Test
    public void Test3_Player1StopsRound2(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(-5, GameManager.FightTwoCells(cell1,cell2,1,2,2,0),00000.1);
    }

    @Test
    public void Test4_Player1StopsRound3(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(-5, GameManager.FightTwoCells(cell1,cell2,1,2,3,0),00000.1);
    }

    @Test
    public void Test5_Player2StopsRound1(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(0, GameManager.FightTwoCells(cell1,cell2,1,2,0,1),00000.1);
    }

    @Test
    public void Test6_Player2StopsRound2(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(5, GameManager.FightTwoCells(cell1,cell2,1,2,0,2),00000.1);
    }

    @Test
    public void Test7_Player2StopsRound3(){
        ICell cell1 = new ProgrammedCell1();
        ICell cell2 = new ProgrammedCell1();
        Assert.assertEquals(5, GameManager.FightTwoCells(cell1,cell2,1,2,0,3),00000.1);
    }
}
