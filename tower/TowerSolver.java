package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(model.height(), 0, 2, 1);
        // Call the missing solve method (not this one)
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
private void solve(int numDisks, int initial, int destination, int temporary ){

if (numDisks==1){
model.move(initial, destination);
}
else  {

solve(numDisks-1, initial, temporary, destination); // move smaller stack of disks out of the way
model.move(initial, destination); // moves the  largest disk to a different location
solve(numDisks-1, temporary, destination, initial); // moves the  smaller stack of  disks back on the top
}


}
   

}
