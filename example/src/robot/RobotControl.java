package robot;

public interface RobotControl {

    public void command(Command command);
   
    public float setSpeed(float speed);
    
    public float getSpeed();
    
    public void getStatus(Status status);
    
}
