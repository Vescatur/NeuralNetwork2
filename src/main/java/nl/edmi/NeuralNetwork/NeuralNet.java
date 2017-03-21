package nl.edmi.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by Ivan on 19/12/2016.
 */
public class NeuralNet {

    int inputLayer = 2;
    int hiddenLayer = 3;
    int outputLayer = 1;

    int[] Layers = {2,5,4,3,2,2};

    ArrayList<ArrayList<ArrayList<Double>>> synaps;
    // synaps[colum][nodeFrom][nodeTo]
    ArrayList<ArrayList<Double>> nodes;
    // nodes[colum][node]

    public NeuralNet(int[] TLayers){
        Layers = TLayers;
        nodes = new ArrayList<ArrayList<Double>>();
        for (int colum=0; colum < Layers.length; colum++) {
            nodes.add(new ArrayList<Double>());

            for (int nodeT=0; nodeT < Layers[colum]; nodeT++) {
                nodes.get(colum).add(0.0);
            }

        }
        //Arrays.toString(nodes);

        synaps = new ArrayList<ArrayList<ArrayList<Double>>>();
        for (int colum=0; colum < nodes.size()-1; colum++) {
            synaps.add(new ArrayList<ArrayList<Double>>());
            for (int nodeFrom=0; nodeFrom < nodes.get(colum).size(); nodeFrom++) {
                synaps.get(colum).add(new ArrayList<Double>());
                for (int nodeTo=0; nodeTo < nodes.get(colum+1).size(); nodeTo++) {
                    synaps.get(colum).get(nodeFrom).add(Math.random()*2-1);
                }
            }
        }
    }

    public static double sigmoid(double x) {
        return (1/( 1 + Math.pow(Math.E,(-1*x))));
    }

    private void CalculateColum(int colum) {
        for (int nodeTo=0; nodeTo < nodes.get(colum).size(); nodeTo++) {
            double sum = 0;
            for (int nodeFrom=0; nodeFrom < nodes.get(colum-1).size(); nodeFrom++) {
                sum += nodes.get(colum-1).get(nodeFrom) * synaps.get(colum-1).get(nodeFrom).get(nodeTo);
            }
            nodes.get(colum).set(nodeTo,sigmoid(sum));
            //nodes.get(colum).set(nodeTo,sum);
        }
    }

    public ArrayList<Double> CalculateOutput(double[] input){
        for(int node=0; node < nodes.get(0).size(); node++){
            nodes.get(0).set(node,input[node]);
        }

        for(int colum=1; colum < nodes.size(); colum++) {
            CalculateColum(colum);
        }
        return nodes.get(nodes.size()-1);
    }

    public NeuralNet Clone(){
        NeuralNet Net = new NeuralNet(Layers);
        for (int colum=0; colum < Net.nodes.size()-1; colum++) {
            for (int nodeFrom=0; nodeFrom < Net.nodes.get(colum).size(); nodeFrom++) {
                for (int nodeTo=0; nodeTo < Net.nodes.get(colum+1).size(); nodeTo++) {
                    Net.synaps.get(colum).get(nodeFrom).set(nodeTo,((Math.random()-0.5)/5)+this.synaps.get(colum).get(nodeFrom).get(nodeTo));
                }
            }
        }
        return  Net;
    }
}
