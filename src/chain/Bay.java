/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author Matty
 */
public abstract class Bay implements Chainable 
{
    Chainable next;
    
    @Override
    public void AddNext(Chainable next) 
    {
        this.next = next;
    }
}
