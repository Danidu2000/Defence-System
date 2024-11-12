/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defence.system;

/**
 *
 * @author danid
 */
public interface Observer {
    public void update(boolean areaClear,String commanMsg);
    
    public void update(String[] subInfoArray);
    
    public void update(String[] heliInfoArray,int a);
    
    public void update(String[] tankInfoArray,int a,int b);
    
    public void update(String subMassage);
    
    public void update(String heliMassage,double a);
    
    public void update(String tankMassage,double a,double b);
    
    public void update(int position);
    
    public void update(String subText,int a,double b);
    
    public void update(String tankText,int a,int c,double b);
    
    public void update(String heliText,int a,int c,int d,double b);
}
