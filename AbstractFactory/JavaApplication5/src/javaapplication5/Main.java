/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new EuropenFactory();
        Train train = abstractFactory.createTrain();
        System.out.println(train.getClass());
    }
}
