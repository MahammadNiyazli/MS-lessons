package org.example.strategy;

public class ExitStrategy implements AbstractCardStrategy{
    @Override
    public void process() {
        System.err.println("Sistemden cixis olunur ... ");
        System.exit(0);
    }
}
