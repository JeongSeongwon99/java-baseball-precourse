package service;

import domain.ComputerNumber;

public class ComputerNumberService {
    public ComputerNumberService() {
    }

    public ComputerNumber create() {
        String numbers = RandomNumberGenerator.makeAnswer();
        return new ComputerNumber(numbers);
    }
}
