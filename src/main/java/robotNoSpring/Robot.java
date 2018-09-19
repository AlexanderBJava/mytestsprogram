package robotNoSpring;

import lombok.Data;
import robotNoSpring.schemes.Hand;
import robotNoSpring.schemes.Head;
import robotNoSpring.schemes.Leg;

@Data
public class Robot {
    private Head head;
    private Hand hand;
    private Leg leg;



    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
}
