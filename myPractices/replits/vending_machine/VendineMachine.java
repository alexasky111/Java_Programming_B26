package replits.vending_machine;

public abstract class VendineMachine {


        public abstract void select(int itemNumber);
        public abstract double pay(double money);
        public abstract double returnChange();
        public abstract void cancel();


}
