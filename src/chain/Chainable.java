/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author t7077260
 */
public interface Chainable 
{
   
   public void processLoadingBay(LoadingBay plane);  
   public void setLoadingBayNextHandler(LoadingBay next);  
   
   
   
}
