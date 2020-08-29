/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raman
 */
class NegativeValueException extends Exception{
    public NegativeValueException(){
        super();
        System.out.println("Please enter non-negative values");
    }
}
