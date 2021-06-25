
package evolucao.da.confiança;

public class Cooperante {
    
    protected int round;
    protected int points;
    protected int number;
    protected boolean move;
    protected boolean opponentMove;
    
    public Cooperante(int number){
        this.number = number;
        this.move = true;
        resetValues();
    } 
    
    public boolean getMove(){
        this.round++;
        return move;
    }
    
    public void recieveMove(boolean move){
        printMove();
        this.opponentMove = move;
    }
    
    protected void printMove(){
        System.out.println(getName() + ": " 
            + this.points + " ponto(s)");
        if (move)
            System.out.println("Coloca uma moeda\n");
        else
            System.out.println("Nao coloca nada!!\n");
    }
    
    public String getName(){
        return (number + ". " 
            + getClass().getSimpleName());
    }
    
    public int getPoints(){
        return points;
    }
    
    public void addPoints(int points){
        this.points+=points;
    }
        
    public void resetValues(){
        this.round = 1;
        this.points = 1;
    }
}
