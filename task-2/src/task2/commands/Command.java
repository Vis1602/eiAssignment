package task2.commands;

import task2.rover.Rover;

public interface Command {
    void execute(Rover rover);
}