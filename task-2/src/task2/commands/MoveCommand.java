package task2.commands;

import task2.rover.Rover;

public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}