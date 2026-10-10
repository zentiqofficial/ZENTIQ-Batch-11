package com.zentiq.CustomException;

class NotEligibleForVoteException extends Exception {

    public NotEligibleForVoteException(String message) {
        super(message);
    }
}

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkVotingEligibility() throws NotEligibleForVoteException {

        if (age < 18) {
            throw new NotEligibleForVoteException(
                name + " is NOT eligible to vote. Age: " + age
            );
        }

        System.out.println(name + " is eligible to vote.");
    }
}

public class Main2 {

    public static void main(String[] args) {

        Person p1 = new Person("Anil", 17);
        Person p2 = new Person("Ravi", 20);

        try {
            p1.checkVotingEligibility();
        } catch (NotEligibleForVoteException e) {
            System.out.println("Catch: " + e.getMessage());
        }

        try {
            p2.checkVotingEligibility();
        } catch (NotEligibleForVoteException e) {
            System.out.println("Catch: " + e.getMessage());
        }
    }
}