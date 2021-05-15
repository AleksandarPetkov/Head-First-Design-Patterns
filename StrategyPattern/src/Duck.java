public class Duck {
    private FlyableStrategy flyableStrategy;

    public Duck (){

    }

    // Inject FlyableStrategy in our constructor
    public Duck (FlyableStrategy flyableStrategy){
        this.flyableStrategy = flyableStrategy;
    }

    public String executeFlyableStrategy(){
        return this.flyableStrategy.fly();
    }
}
