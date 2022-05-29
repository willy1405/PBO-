/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ball;

/**
 *
 * @author Willy
 */

public class Ball {

    public static void onCollisionWithBall(Ball ball){
        if(ball.isBlade == true ){
           getDestroyed();
        }
        else{
            deflectBall();
            
           
        }
        
    }
    
}