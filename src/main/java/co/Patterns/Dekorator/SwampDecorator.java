package main.java.co.Patterns.Dekorator;

public class SwampDecorator extends TerrainDecorator{


    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 15;
    }
}
