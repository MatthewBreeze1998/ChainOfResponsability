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
public abstract class Vehical implements Chainable
{
   String location ; 
   Chainable next;
   
    /**
     *
     * @param next
     */
    @Override
    public void AddNext(Chainable next) 
    {
        this.next = next;
    }
   
}
