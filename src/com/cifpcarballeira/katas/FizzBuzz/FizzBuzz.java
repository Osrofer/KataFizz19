/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author daw121
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int i){
        if (i == 2 ){
            return "2";
        }else if(i%3 == 0){
        
            return "Fizz";
        }return "1";
    }
}
