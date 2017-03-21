package nl.edmi.NeuralNetwork;

import nl.edmi.NeuralNetwork.Cells.ProgrammedCell1;

import java.util.Comparator;

/**
 * Created by Ivan on 13-3-2017.
 */
public class HostCell implements Comparable<HostCell>{
    private ICell cell;
    private double score;

    public HostCell(ICell iCell) {
        this.cell = iCell;
        score = -100000;
    }

    public HostCell Clone(){
        return new HostCell(cell.Clone());
    }



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ICell getCell() {
        return cell;
    }

    public void setCell(ICell cell) {
        this.cell = cell;
    }


    @Override
    public int compareTo(HostCell o) {
        if(score == o.getScore()){
            return 0;
        }else{
            if(score> o.getScore()){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
