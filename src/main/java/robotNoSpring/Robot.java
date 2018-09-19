package robotNoSpring;

import robotNoSpring.schemes.Hand;
import robotNoSpring.schemes.Head;
import robotNoSpring.schemes.Leg;


public class Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Robot() {

    }

    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
}
