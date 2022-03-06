package main.java.co.Patterns.Dekorator;

public class ForestDecorator extends TerrainDecorator{


    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 5;
    }
}
