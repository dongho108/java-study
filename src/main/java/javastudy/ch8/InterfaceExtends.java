package javastudy.ch8;


interface Movable {
    void move(int x, int y);
}

interface Attackable {
//    void attack(Unit u);
}

interface Fightable extends Movable, Attackable {}


public class InterfaceExtends {

}
