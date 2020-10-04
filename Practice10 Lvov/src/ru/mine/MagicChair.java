package ru.mine;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("You've just sat on me");
    }

    @Override
    public String toString() {
        return " Magic Chair";
    }
}
