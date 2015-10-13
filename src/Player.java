/**
 * Created by cameronoakley on 10/7/15.
 */
public class Player {
    Position p;
    //creating position for player

    public Player (Position pos){
        p = pos;//creating player with assigned position
    }
    public void movePosition(double newX, double newY){
        p.x = p.x + newX;
        p.y = p.y + newY;
    }
    public void printPosition(){
        System.out.println(p.x);
        System.out.println(p.y);
    }

}

