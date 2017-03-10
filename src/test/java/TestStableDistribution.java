import nl.edmi.NeuralNetwork.MarkovChainManager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ivan on 10/03/2017.
 */
public class TestStableDistribution {

    @Test
    public void Test1(){
        double[][] transitionMatrix ={
                {0.0,0.5,0.5},
                {1.0,0.0,0.0},
                {0.5,0.5,0},
        };
        double[] stableDistribution = {0.444444444,0.333333333,0.222222222};
        Assert.assertArrayEquals(stableDistribution, MarkovChainManager.CalculateStableDistribution(transitionMatrix),0.000000001);
    }

    @Test
    public void Test2(){
        double[][] transitionMatrix ={
                {0.166666667,0.833333333},
                {0.4,0.6},
        };

        double[] stableDistribution = {0.324324324,0.675675675};
        Assert.assertArrayEquals(stableDistribution, MarkovChainManager.CalculateStableDistribution(transitionMatrix),0.000000001);
    }

    @Test
    public void Test3(){
        double[][] transitionMatrix ={
                {0.083333333,	0.166666667,	0.416666667,	0.333333333},
                {0.333333333,	0.200000000,	0.133333333,	0.333333333},
                {0.300000000,	0.200000000,	0.100000000,	0.400000000},
                {0.153846154,	0.076923077,	0.307692308,	0.461538462},
        };

        double[] stableDistribution = {0.202267712,	0.143824671,	0.252263907,	0.401643711};
        Assert.assertArrayEquals(stableDistribution, MarkovChainManager.CalculateStableDistribution(transitionMatrix),0.000000001);
    }
}
