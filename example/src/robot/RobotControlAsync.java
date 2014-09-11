package robot;

import java.util.concurrent.Future;

public interface RobotControlAsync {

    public Future<Void> commandAsync(Command command);
    
    public Future<Float> setSpeedAsync(float speed);
    
    public Future<Float> getSpeedAsync();
    
    public Future<RobotControl_getStatus_Out> getStatusAsync(Status status);
    
}
