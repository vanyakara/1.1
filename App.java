/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        int[]years={2022,2023,2024};
        String status;
        int N=years.length;
        for(int i=0;i<N;i++){
            int year=years[i];
            if(isLeap(year)){
                status = "e visokosna";
            }
            else{
                status = "ne e visokosna";
            }
            String info=String.format("Godinata %d, %s", year, status);
            System.out.println(info);
        }
    }
    private static boolean isLeap(int year){
        boolean result = false;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            result = true;
        }
        return result;
    }
}
