import nl.edmi.NeuralNetwork.BetAnswer;
import nl.edmi.NeuralNetwork.Cells.ProgrammedCell1;
import nl.edmi.NeuralNetwork.GameManager;
import nl.edmi.NeuralNetwork.ICell;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ivan on 9-3-2017.
 */
public class TestBetAwnser {

    @Test
    public void TestTest() {
        Assert.assertEquals(true,true);
    }

    @Test
    public void Test0(){
        BetAnswer betAnswer = new BetAnswer(0);
        Assert.assertSame(true,betAnswer.getStoppen());
        Assert.assertEquals(0.0,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test1(){
        BetAnswer betAnswer = new BetAnswer(0.1);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(0.0,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test2(){
        BetAnswer betAnswer = new BetAnswer(0.2);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(1.25,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test3(){
        BetAnswer betAnswer = new BetAnswer(0.3);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(2.5,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test4(){
        BetAnswer betAnswer = new BetAnswer(0.4);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(3.75,betAnswer.getInzet(),0.00001);
    }
    @Test
    public void Test5(){
        BetAnswer betAnswer = new BetAnswer(0.5);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(5,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test6(){
        BetAnswer betAnswer = new BetAnswer(0.6);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(6.25,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test7(){
        BetAnswer betAnswer = new BetAnswer(0.7);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(7.5,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test8(){
        BetAnswer betAnswer = new BetAnswer(0.8);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(8.75,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test9(){
        BetAnswer betAnswer = new BetAnswer(0.9);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(10,betAnswer.getInzet(),0.0);
    }
    @Test
    public void Test10(){
        BetAnswer betAnswer = new BetAnswer(1);
        Assert.assertSame(false,betAnswer.getStoppen());
        Assert.assertEquals(10,betAnswer.getInzet(),0.0);
    }



}
